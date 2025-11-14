package edu.java.anatomiaDasClasses;

//Classe criada na Aula Anatomia Classes 4 para exemplificar o que é Indentação no
//Código

/*O que é indentação?:

é uma forma de organizar o código em hierarquias, separando cada pedaço de códigos em blocos

bloco 01
    bloco 02
        bloco 03
            bloco 04

Essa organização, no exemplo acima serve para deixar explicito que o bloco 04
está incluso dentro do 03, que está dentro do 02, e por fim do 01. Isso faz com que o código
fique mais fácil de ser entendido.

Obs.: Indentação em java não afeta o Funcionamento do Código, é apenas uma forma de
      Organização.
*/

public class ExemploIndentacao {

    public static void main(String[] args) {
        int mediaFinal = 7;

        if(mediaFinal < 6) {
            System.out.println("Reprovado");
        }

        else if(mediaFinal == 6) {
            System.out.println("Prova Minerva");
        }

        else{
            System.out.println("Aprovado");
        }
    }
}
