package edu.java.operadores;

/*
Referência: https://felipe-aguiar.gitbook.io/dio-java/gitbook/sintaxe/operadores
 */

public class OperadoresAritmeticos {

    static void main(String[] args) {

        /*
        Operadores Aritmeticos

        Soma: +
        Subtração: -
        Multiplicação: *
        Divisão: /
        Módulo: %  (Para calculo de resto de divisão de dois números)

         */

        System.out.println("10 + 5 = " + (10 + 5));
        System.out.println("10 - 5 = " + (10 - 5));
        System.out.println("10 x 5 = " + (10 * 5));
        System.out.println("10 por módulo de 5 = " + (10 % 5));
        System.out.println("10 divido por 5 = " + (10 / 5));

        /*
        O uso dos () faz com que as contas acima sejam executadas primeiro.
        Se o () não for usado o interpretador entende que os códigos acima tem
        apenas conteudo a ser concatenado(juntado), e não textos e contas a serem feitas.

        */

        System.out.println("(10 + 2) x (7 - 2) = " + ((10 + 2) * (7-2)));

        /*

        No trecho de código acima da conta "(10 + 2) * (7-2)" o uso de () redefine
        a prioridade de execução das operações, fazendo com que tudo que esteja entre ()
        seja executado primeiro, e o que está fora é executado na sequência.

        Isso vale para qualquer operação aritmetica onde está incluso o (), pois o que estiver
        nele é executado sempre 1º
        */

    }
}
