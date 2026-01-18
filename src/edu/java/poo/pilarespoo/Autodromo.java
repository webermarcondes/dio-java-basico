package edu.java.poo.pilarespoo;

/*
Classe criada para exemplificação dos conceitos dos 04 Pilares de POO(Programação
Orientada a objetos) em Java.
*/
public class Autodromo {

    static void main(String[] args) {

        Carro jeep = new Carro();
        //jeep.ligar();
        jeep.setChassi("12345678-Ab#0");

        System.out.println(jeep.getChassi());


        Moto z400 = new Moto();
        //z400.ligar();
        z400.setChassi("89789");
        System.out.println(z400.getChassi());

        /*
        Os objetos jeep (criado da classe Carro) e z400 (da classe Moto) rodarem um método
        ligar com lógicas diferentes é um exemplo do conceito de Polimorfismo.
         */



        //Mais um exemplo de polimorfismo:

        Veiculo coringa = jeep;
        coringa.ligar();

        /*
        O exemplo acima ilustra que variáveis de um tipo genérico (Classe veiculo) podem
        receber como valor objetos instanciados de uma classe mais especifica (Carro ou Moto).

        Nesse caso, o que define os métodos executados pela variável(Objeto) de tipo genérico é
        o objeto recebido.
         */
    }
}
