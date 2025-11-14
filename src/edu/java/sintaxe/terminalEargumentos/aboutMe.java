package edu.java.terminalEargumentos;

/*
Referência: https://felipe-aguiar.gitbook.io/dio-java/gitbook/sintaxe/terminal-e-argumentos

Classe criada na Aula para exemplificar como executar classes via Terminal passando argumentos.
*/

public class aboutMe {

    static void main(String[] args) {

        String nome = args[0];
        String sobrenome = args[1];
        Integer idade = Integer.valueOf(args[2]);

        System.out.println("Me chamo " + nome + " " + sobrenome + ", e tenho "
        + idade + " anos");
    }
}
