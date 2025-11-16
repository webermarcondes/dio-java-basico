package edu.java.estruturas_de_controle.estruturasCondicionais;

/*
Referência:

https://felipe-aguiar.gitbook.io/dio-java/gitbook/controle-de-fluxo/estruturas-condicionais#condicionais-encadeadas

*/

public class CondicionalEncadeada {

    static void main(String[] args) {

        int nota = 8;

        if (nota >= 7) {
            System.out.println("APROVADO;");
        }

        else if(nota >= 5) {
            System.out.println("EM RECUPERAÇÃO;");
        }

        else {
            System.out.println("REPROVADO;");
        }

    }
}
