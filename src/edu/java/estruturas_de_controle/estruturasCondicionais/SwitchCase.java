package edu.java.estruturas_de_controle.estruturasCondicionais;

/*
Referências:

https://felipe-aguiar.gitbook.io/dio-java/gitbook/controle-de-fluxo/estruturas-condicionais#switch-case

http://www.bosontreinamentos.com.br/java/estrutura-de-decisao-condicional-switch-em-java/#:~:text=O%20condicional%20switch%20testa%20o,representados%20pela%20palavra%20reservada%20case.&text=A%20estrutura%20switch%20compara%20o,o%20c%C3%B3digo%20associado%20ao%20caso.

 */

public class SwitchCase {

    static void main(String[] args) {
        /*
        P -> Pequeno
        M -> Médio
        G -> Grande
        */

        String sigla = "M";

        switch (sigla.toUpperCase()) {
            case "P": {
                System.out.println("TAMANHO PEQUENO");
                break;
            }
            case "M": {
                System.out.println("TAMANHO MÉDIO");
                break;
            }
            case "G": {
                System.out.println("TAMANHO GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }
    }
}
