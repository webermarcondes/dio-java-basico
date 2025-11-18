package edu.java.estruturas_de_controle.estruturasDeRepeticao;

/*
Referência:

https://felipe-aguiar.gitbook.io/dio-java/gitbook/controle-de-fluxo/estruturas-de-repeticao#do-while
*/

import java.util.Random;

public class EstruturaDoWhile {

    static void main(String[] args) {
        System.out.println("Discando...");

        do {
            //executando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");

        }while(tocando());

        System.out.println("Alô !!!");
    }
    private static boolean tocando() {
        int num = new Random().nextInt(3);
        boolean atendeu = num==1;

        System.out.println("\nAtendeu? " + (atendeu==true ? "Sim" : "Não"));


        //negando o ato de continuar tocando para finalização da instrução do While
        //Caso o valor de atendeu seja true
        
        return ! atendeu;
    }
}
