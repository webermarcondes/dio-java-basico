package edu.java.poo.pilarespoo;

/*
Classe criada para exemplificação dos conceitos dos 04 Pilares de POO(Programação
Orientada a objetos) em Java.

"extends Veiculo" -> Uso de herança (com extends) da Classe Veiculo, que obriga a classe
                     a definir uma implementação do Método ligar() da classe Veiculo



*/

public class Carro extends Veiculo {

    public void ligar() {

        /* Exemplo de encapsulamento:

            os métodos executados abaixo fazem parte da lógica implementada
            para ligar o Carro, estão como private em sua criação e não tem sua lógica
            apresentada ao usuário porque não é necessário

        */
        confereCombustivel();
        confereCambio();

        //#####

        System.out.println("Carro Ligado");

    }

    private void confereCombustivel() {
        System.out.println("Conferindo combustivel");
    }

    private void confereCambio() {
        System.out.println("Conferindo se o cambio está em P");
    }
}
