package edu.java.terminalEargumentos;

/*
Referência: https://felipe-aguiar.gitbook.io/dio-java/gitbook/sintaxe/terminal-e-argumentos
 */

import java.util.Locale;
import java.util.Scanner;

public class ClasseScanner {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu primeiro nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade  = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Sou " + nome + " " + sobrenome + ". Tenho " + idade + " anos e " + altura
        + "cm de altura;");
    }
}
