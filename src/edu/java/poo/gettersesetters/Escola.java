package edu.java.poo.gettersesetters;

/*
Classe criada para ilustrar os conceitos da aula de Getters e Setters do Curso

Material do próprio curso para referência:

https://felipe-aguiar.gitbook.io/dio-java/gitbook/programacao-orientada-a-objetos/getters-e-setters

*/

class Escola {

    static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Felipe");
        aluno.setIdade(8);

        System.out.println("O aluno " + aluno.getNome() + " tem " + aluno.getIdade() + " anos de idade");

    }
}


