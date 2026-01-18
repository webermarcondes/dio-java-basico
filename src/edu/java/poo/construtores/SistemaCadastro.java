package edu.java.poo.construtores;

/*
Classe criada para melhor compreensão do conteudo de construtores do curso.

Material do próprio curso para referência:

https://felipe-aguiar.gitbook.io/dio-java/gitbook/programacao-orientada-a-objetos/construtores

 */

class SistemaCadastro {

    static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Carlos", "123.456.789-10", "Rua das Marias");
        Pessoa pessoa2 = new Pessoa("Jorge", "023.579.384-28", "Rua 123 de Oliveira 4");

        System.out.println(pessoa);
        System.out.println();
        System.out.println(pessoa2);
    }
}
