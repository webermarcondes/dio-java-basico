package edu.java.estruturas_de_controle.estruturasDeRepeticao;

import java.util.concurrent.ThreadLocalRandom;
import java.text.NumberFormat;
import java.util.Locale;

/*
Referência:

https://felipe-aguiar.gitbook.io/dio-java/gitbook/controle-de-fluxo/estruturas-de-repeticao#while
 */

public class EstruturaWhile {

    static void main(String[] args) {
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        double mesada = 50.00;

        int contadorDoce = 0;
        while (mesada > 0) {
            double valorDoce = valorAleatorio();

            if (valorDoce > mesada) {
                System.out.println("\nO valor do doce é maior que o dinheiro da mesada.\n");
                break;
            }
            contadorDoce++;

            System.out.println(
                    (contadorDoce < 10 ? "0" : "") +
                    contadorDoce +"º Doce: " + formatoMoeda.format(valorDoce));

            mesada -= valorDoce;
        }

        if(mesada > 0) {
            System.out.println("Valor restante de mesada: " + formatoMoeda.format(mesada));
        }

        else {
            System.out.println("Não sobrou nada da mesada, Joãozinho gastou tudo em doce!!!!!");
        }

        System.out.println("Doces comprados: " + contadorDoce);



    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
