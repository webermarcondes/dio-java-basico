package edu.java.sintaxe.javaDoc;

/*
 A classe em questão é um exemplo de como utilizar as anotações de documentação de código
 fornecidas oficialmente pela linguagem java. Caso queira entender melhor só dar uma olhada
 no arquivo "referencias-javadoc"

 O diretório "calculadora-doc" contem a documentação da classe gerada via terminal, com comandos
 javadoc.
 */


/**
 * <h1>Calculadora</h1>
 * A Calculadora realiza operações matemáticas entre números inteiros
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classes
 * para desfrutar dos recursos oferecidos pelo autor
 *
 * @author  Gleyson Sampaio
 * @version 1.0
 * @since   01/01/2022
 */
public class Calculadora {
    /**
     * Este método é utilizado para somar dois números inteiros
     * @param numeroUm este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste método é a soma dos dois números.
     */
    public int somar(int numeroUm, int numeroDois) {
        return  numeroUm + numeroDois;
    }
}

