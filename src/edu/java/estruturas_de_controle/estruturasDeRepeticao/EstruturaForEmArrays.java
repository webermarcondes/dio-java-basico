package edu.java.estruturas_de_controle.estruturasDeRepeticao;

/*
Referência:

https://felipe-aguiar.gitbook.io/dio-java/gitbook/controle-de-fluxo/estruturas-de-repeticao#for-each

https://www.alura.com.br/artigos/foreach-java?utm_term=&utm_campaign=&utm_source=google&utm_medium=cpc&campaign_id=23137788902__&utm_id=23137788902__&hsa_acc=7964138385&hsa_cam=&hsa_grp=&hsa_ad=&hsa_src=x&hsa_tgt=&hsa_kw=&hsa_mt=&hsa_net=google&hsa_ver=3&gad_source=1&gad_campaignid=23132128725&gclid=EAIaIQobChMI7az6l-v3kAMVjFpIAB2uIioNEAAYASAAEgLRrPD_BwE

--> Referência da Alura explica a forma não abreviada de definição do for-each, e traz exemplos
    de como ela pode ser escrita e utilizada.


*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EstruturaForEmArrays {

    static void main(String[] args) {

        String[] alunos = {"JOÃO", "FELIPE", "JONAS", "MARCOS", "MARIA"};


        //Forma abreviada (Definição de For-each como um loop for tradicional)
        for(String aluno: alunos) {
            System.out.println("Aluno(a) " + aluno);
        }


        System.out.println("\n\n\n");
        //Forma literal de como usar o forEach:
        //No exemplo, o forEach é usado para remover elementos do Array(Lista) animaisVet

        List<String> animaisVet = new ArrayList<>(Arrays.asList("gatinhos", "gato", "peixinhos", "peixe"));
        animaisVet.removeIf(animal -> animal.length() > 6);
        animaisVet.forEach(System.out::println);

        /*
        No trecho "animaisVet.forEach(System.out::println)" o System.out::println é uma referência
        ao método println.

        Definir "animaisVet.forEach(System.out::println)" tem o mesmo efeito que escrever
        animaisVet.forEach(animal -> System.out.println(animal)). Nesse caso a referência ao método
        entra como uma forma de escrita de código mais resumida.


        Referência para consulta posterior (se necessário):
        https://stackoverflow.com/questions/48991294/how-to-write-system-out-println-as-a-method-reference
         */

    }
}
