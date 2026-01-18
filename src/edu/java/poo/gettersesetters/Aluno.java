package edu.java.poo.gettersesetters;

/*
Classe criada para ilustrar os conceitos da aula de Getters e Setters do Curso

Material do próprio curso para referência:

https://felipe-aguiar.gitbook.io/dio-java/gitbook/programacao-orientada-a-objetos/getters-e-setters

*/

class Aluno {

    private String nome;
    private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
