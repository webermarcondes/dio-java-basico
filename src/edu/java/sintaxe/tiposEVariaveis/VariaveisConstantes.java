package edu.java.tiposEVariaveis;


/*
Variáveis constantes são espaços em memória que armazenam valores fixos (que não podem
ser alterados.

Ex.: Valor do PI

Sintaxe de definição de constantes

final tipoVariavel NOMEVARIAVEL = valor;

Obs.:

1º - Em constantes a palavra reservada final sempre deve estar
     presente na definição da váriavel;

2º - o nome de variáveis constantes deve sempre ser definido em Caixa alta por padrão.
 */
public class VariaveisConstantes {

    static void main(String[] args) {
        final double VALOR_PI = 3.14;

        System.out.println(VALOR_PI);

        /*VALOR_PI = 3.15;

          Tentar atribuir valor a váriaveis constantes não é
          possível conforme já mencionado. Ao fazer isso é gerado o erro abaixo

          "Cannot assign a value to final variable 'VALOR_PI'"
        */
    }
}
