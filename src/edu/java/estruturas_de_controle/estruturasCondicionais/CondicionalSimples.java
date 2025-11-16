package edu.java.estruturas_de_controle.estruturasCondicionais;

/*
Referência:

https://felipe-aguiar.gitbook.io/dio-java/gitbook/controle-de-fluxo/estruturas-condicionais#condicionais-simples
 */

public class CondicionalSimples {

    static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
        }

        System.out.println(saldo);
    }
}
