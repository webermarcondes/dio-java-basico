package edu.java.operadores;

/*
Referência: https://felipe-aguiar.gitbook.io/dio-java/gitbook/sintaxe/operadores
 */

public class OperadoresUnarios {

    static void main(String[] args) {

        int num1 = 5;

        System.out.println(-num1);
        System.out.println(+num1);
        System.out.println(num1++);
        System.out.println(num1--);

        int num2 = --num1;
        System.out.println(num2);
        ++num2;

        boolean num1MaiorQueNum2 = num1 > num2;

        System.out.println(num1MaiorQueNum2);
        System.out.println(!num1MaiorQueNum2);

        /*
        Os operadores de incremento(++) e decremento(--) podem ser usados de duas
        formas nas variáveis

        operador variavel

        Ou

        variavel operador

        Ex:

            ++ num1
            num1 ++

            -- num2
            num2 --

         Usar estes operadores no lado esquerdo faz com que o número que está dentro
         da variável seja alterado por eles, antes de ser utilizado.

         Usa-los do lado direito faz com que incrementem ou decrementem o valor da
         variável somente após serem utilizados, abaixo segue mais um exemplo
         para melhor entendimento do uso no lado direito.

         Ex:

         num3 = 2
         System.out.println(num3 --);

         No exemplo acima, o println ira mostrar 2, e somente após isso o valor da variável será
         decrementado.
         */

    }
}
