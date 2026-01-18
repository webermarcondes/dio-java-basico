package edu.java.poo.enums;

/*
Classe criada na aula de Enums do Curso, para praticar e entender melhor
o conceito de Enums.

link do material da aula: https://felipe-aguiar.gitbook.io/dio-java/gitbook/programacao-orientada-a-objetos/enums

*/

public class main {


    static void main(String[] args) {

        /*
        //Lógica feita para praticar o uso de Enum.

        EstadoBrasileiroEnum[] estadosBrasileiros = new EstadoBrasileiroEnum[4];

        estadosBrasileiros[0] = EstadoBrasileiroEnum.SAO_PAULO;
        estadosBrasileiros[1] = EstadoBrasileiroEnum.RIO_JANEIRO;
        estadosBrasileiros[2] = EstadoBrasileiroEnum.MARANHAO;
        estadosBrasileiros[3] = EstadoBrasileiroEnum.PIAUI;

        for(EstadoBrasileiroEnum estado: estadosBrasileiros) {

            System.out.println("Estado " + estado);
            System.out.println("Nome: " + estado.getNome());
            System.out.println("Nome maiusculo: " + estado.getNomeMaiusculo());
            System.out.println("Sigla: " + estado.getSigla());
            System.out.print("----------\n");

        }

        System.out.print("\n\n");
        */


        //Replicação da lógica acima, só que com menos linhas de código
        for(EstadoBrasileiroEnum estadoBrasileiro: EstadoBrasileiroEnum.values()) {

            System.out.println("Estado " + estadoBrasileiro);
            System.out.println("----------");
            System.out.println("Nome: " + estadoBrasileiro.getNome());
            System.out.println("Nome maiusculo: " + estadoBrasileiro.getNomeMaiusculo());
            System.out.println("Sigla: " + estadoBrasileiro.getSigla());
            System.out.println("Código do Ibge: " + estadoBrasileiro.getIbge());
            System.out.println("----------\n");

        }
    }
}
