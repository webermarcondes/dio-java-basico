package edu.java.operadores;

/*
Referência: https://felipe-aguiar.gitbook.io/dio-java/gitbook/sintaxe/operadores#logicos

Os operadores lógicos representam o recurso que nos permite criar expressões lógicas
maiores a partir da junção de duas ou mais expressões.

& -> Operador Lógico "E"

| -> Operador Lógico "OU"


Sintaxe para definição dos operadores como Operadores Abreviados:

&& -> Operador Lógico "E" Abreviado

|| -> Operador Lógico "OU Abreviado

 */

public class OperadoresLogicos {

    static void main(String[] args) {
        boolean condicao1 = false;
        boolean condicao2 = false;

        if(condicao1 && condicao2) {
            System.out.println("Ambas as condições são Verdadeiras");
        }

        else if(condicao1 || condicao2) {
            System.out.println("Apenas uma das condições fornecidas é verdadeira");
        }

        else {
            System.out.println("Nenhuma das condições fornecidas é verdadeira");
        }
    }
}
