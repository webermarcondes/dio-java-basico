package edu.java.poo.construtores;

/*
Classe criada na aula de construtores do curso.

Material do próprio curso para referência:

https://felipe-aguiar.gitbook.io/dio-java/gitbook/programacao-orientada-a-objetos/construtores

Fiz algumas personalizações na classe como a adição do Endereço no constrututor, os setters
faltantes e o método toString().

* */

class Pessoa {

    private String nome;
    private String cpf;
    private String endereco;

    public Pessoa(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
