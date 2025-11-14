package edu.java.sintaxe.operadores;


/*
Referência: https://felipe-aguiar.gitbook.io/dio-java/gitbook/sintaxe/operadores#relacionais

Os operadores relacionais avaliam a relação entre duas variáveis ou expressões.
Neste caso, mais precisamente, definem se o operando à esquerda é igual,
diferente, menor, menor ou igual, maior ou maior ou igual ao da direita,
retornando um valor booleano como resultado.


Operador ==  -> Usado Quando desejamos verificar se uma variável é IGUAL A outra.

Operador !=  -> Usado Quando desejamos verificar se uma variável é DIFERENTE da outra.

Operador >   -> Usado Quando desejamos verificar se uma variável é MAIOR QUE a outra.

Operador >=  -> Usado Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.

Operador <   -> Usado Quando desejamos verificar se uma variável é MENOR QUE outra.

Operador <=  -> Usado Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.

 */

public class OperadoresRelacionais {

    static void main(String[] args) {

        int num1 = 5;
        int num2 = 6;

        System.out.println(num1 + " é igual a " + num2 + "?  " + (num1 == num2));

        System.out.println(num1 + " é diferente de " + num2 + "?  " + (num1 != num2));

        System.out.println(num1 + " é maior que " + num2 + "?  " + (num1 > num2));

        System.out.println(num1 + " é maior ou igual a " + num2 + "?  " + (num1 >= num2));

        System.out.println(num1 + " é menor que " + num2 + "?  " + (num1 < num2));

        System.out.println(num1 + " é menor ou igual a " + num2 + "?  " + (num1 <= num2));
    }
}
