package edu.java.estruturas_de_controle.estruturasCondicionais;

/*
Referência:

https://felipe-aguiar.gitbook.io/dio-java/gitbook/controle-de-fluxo/estruturas-condicionais#condicao-ternaria


 */

public class CondicionalTernaria {

    static void main(String[] args) {

        int nota = 4;

        String resultado = nota >= 7 ? "Aprovado" :
                           nota >= 5 && nota < 7 ? "Em recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
