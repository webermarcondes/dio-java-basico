package edu.java.tiposEVariaveis;

/*
Os oito tipos primitivos em Java são:

int, byte, short, long, float, double, boolean e char

Esses tipos não são considerados objetos, e portanto representam valores brutos.
Eles são armazenados diretamente na pilha de memória. (Memory stack)

Referência: https://felipe-aguiar.gitbook.io/dio-java/gitbook/sintaxe/variaveis
 */

/*
A estrutura padrão para se declarar uma variável sempre é:

<Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>

Observações:

1º- Em Java, variáveis locais (dentro de métodos) devem ser iniciadas
    antes de serem usadas, senão o código não compila.

2º- Variáveis de instância (fora de métodos, dentro de classes) recebem valores padrão
    se não forem iniciadas (por exemplo, 0 para int, null para objetos).
 */

public class TiposEVariaveis {

     static void main(String[] args) {

        int idade; //Tipo "int", nome "idade", com nenhum valor atribuído manualmente

        int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
        double salarioMinimo = 2500.00; //tipo "double", nome "salarioMinimo", valor 2.500.

         //System.out.print(salarioMinimo);

         float pi = 3.14F; //se não por F no final o número informado é interpretado como Double

         long cpf = 12345678910L; //Se não por L no final o número informado é interpretado como int
         /*Obs.: Se o número for maior que o limite suportado pelo tipo int ocorre um erro de que
                 o int informado é muito grande.
         */

         short n1 = 3;
         int n2 = n1;
         /* short n3 = n2;

            Fazer a reatribuição do tipo int para a váriavel short gera o seguinte erro:

            "Incompatible types. Found: 'int', required: 'short'"

            Obs.: uma forma de resolver isso é fazer a conversão manual do tipo.

            Ex.: short n3 = (short) n2;

            Esse erro ocorre devido a Linguagem Java ser Fortemente Tipada.

         */
         System.out.print(n2);

         char nome = 'W'; //Aceita só um caractere, que devem ser informado entre aspas simples
         /*
            nome = 'Weber';

            Erro que ocorre ao fazer isso:

            Too many characters in character literal
          */

         boolean verdadeiro = true;
         verdadeiro = false;

         /*true e false são os valores padrões de váriaveis booleanas.

           true -> verdadeiro
           false -> falso
          */
     }
}
