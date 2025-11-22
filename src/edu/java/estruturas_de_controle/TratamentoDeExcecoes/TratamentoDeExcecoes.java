package edu.java.estruturas_de_controle.TratamentoDeExcecoes;

/*
Um erro é algo irreparável, a aplicação trava ou é encerrada drasticamente.

Já exceções é um fluxo inesperado da nossa aplicação, exemplos:

- Querer dividir um valor por zero;
- Querer abrir um arquivo que não existe;
- Abrir uma conexão de banco com usuário ou senha inválida;

Todos estes cenários e os demais não são erros, mas sim fluxos não previstos
pela aplicação.


Referências:

https://felipe-aguiar.gitbook.io/dio-java/gitbook/controle-de-fluxo/estruturas-excepcionais#tratamento-de-excecoes
*/

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TratamentoDeExcecoes {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nome = "";
        int idade = 0;
        double altura = 0.0;


        System.out.println("Qual seu nome?: ");
        nome = scanner.nextLine();

        do {

            try {
                System.out.println("Qual sua Idade?: ");
                idade = scanner.nextInt();

                System.out.println("Qual sua Altura?: ");
                altura = scanner.nextDouble();
            }

            catch (InputMismatchException e) {

                System.out.println("\nERRO!!!!. O dado informado não está no padrão aceitado pelo sistema");

                System.out.println("\nCampo Idade -> Deve-se Informar inteiros como 15, 18, 30, 55\n" +
                    "Campo Altura -> Informar valores com ponto flutuante como 1.75, 1.80 ou inteiros como 2, 3, 5");

                idade = 0;
                altura = 0.0;

                scanner.next(); //Limpa o Buffer de entrada, descartando valores inválidos

                System.out.println("\nTente Novamente!!\n");

            }
        } while (idade == 0 && altura == 0.0);


        System.out.println("\nSeu nome é " + nome + ", você tem " + idade +
                           " anos e " + altura + "cm de Altura");


    }
}
