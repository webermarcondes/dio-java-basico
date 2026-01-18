package edu.java.poo.enums;

/*
Classe criada na aula de Enums do Curso, para praticar e entender melhor
o conceito de Enums.

link do material da aula: https://felipe-aguiar.gitbook.io/dio-java/gitbook/programacao-orientada-a-objetos/enums
*/

enum EstadoBrasileiroEnum {

    SAO_PAULO("SP", "São Paulo", 10),
    RIO_JANEIRO("RJ", "Rio de Janeiro", 11),
    PIAUI("PI", "Piauí", 12),
    MARANHAO("MA", "Maranhão", 13);

    private final String nome;
    private final String sigla;
    private final Integer ibge;

    EstadoBrasileiroEnum(String sigla, String nome, Integer ibge) {
        this.nome = nome;
        this.sigla = sigla;
        this.ibge = ibge;
    }
    /*  Sem modificador de acesso. No material da aula o construtor é private,
        mas ao defini-lo no código a IDE intellij retornou que o uso de private para construtor
        de enum é reduntante*/


    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

    public Integer getIbge() {
        return ibge;
    }
}
