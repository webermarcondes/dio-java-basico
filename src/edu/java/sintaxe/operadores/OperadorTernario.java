package edu.java.sintaxe.operadores;

/*
Referência: https://felipe-aguiar.gitbook.io/dio-java/gitbook/sintaxe/operadores
 */

/*
O operador ternário é representado pelos símbolos ? e : utilizados na seguinte estrutura
de sintaxe:

"<Expressão Condicional>`` ?``<Caso condição seja true>``: ``<Caso condição seja false>
 */


public class OperadorTernario {

    static void main(String[] args) {

        int num1 = 9;
        int num2 = 10;

        /*Bloco de expressão condicional para comparação dos valores de num1 e num2
          Feito com If normal:
        */
        if(num1 < num2) {
            System.out.println("Número 1 é Menor que número 2");
        }
        else {
            System.out.println("Número 1 não é menor que número 2");
        }

        //comparação utilizando operador ternário:
        System.out.println(num1 < num2 ? "Número 1 é Menor que número 2" : "Número 1 não é menor que número 2");

    }
}
