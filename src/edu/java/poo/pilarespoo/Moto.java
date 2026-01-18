package edu.java.poo.pilarespoo;

/*
Classe criada para exemplificação dos conceitos dos 04 Pilares de POO(Programação
Orientada a objetos) em Java.


"extends Veiculo" -> Uso de herança (com extends) da Classe Veiculo, que obriga a classe
                     a definir uma implementação do Método ligar() da classe Veiculo
*/

public class Moto extends Veiculo {

    public void ligar() {
        System.out.println("Moto Ligada");
    }

}
