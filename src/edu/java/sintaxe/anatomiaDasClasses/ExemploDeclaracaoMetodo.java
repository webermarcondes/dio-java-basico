package edu.java.sintaxe.anatomiaDasClasses;

public class ExemploDeclaracaoMetodo {

    public static void main(String[] args) {

        String primeiroNome = "Weber";
        String segundoNome = "Marcondes";

        System.out.println(nomeCompleto(primeiroNome, segundoNome));
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome + " " + segundoNome;
    }

    //será visto sobre public e static  futuramente. Considerar este como um exemplo
    //de declaração de métodos.

    //Como diferenciar variáveis de métodos? Todo método tem os seus parametros
}

