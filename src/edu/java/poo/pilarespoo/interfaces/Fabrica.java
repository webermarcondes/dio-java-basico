package edu.java.poo.pilarespoo.interfaces;


/*

Classe criada para exemplificação do conceito de Interface, apresentado no curso de Java
da DIO

Material externo ao conteudo da aula para consulta e entendimento do conceito:
https://www.devmedia.com.br/entendendo-interfaces-em-java/25502

* */


import edu.java.poo.pilarespoo.interfaces.copiadora.Copiadora;
import edu.java.poo.pilarespoo.interfaces.impressora.Deskjet;
import edu.java.poo.pilarespoo.interfaces.impressora.Impressora;

public class Fabrica {

    static void main(String[] args) {
        EquipamentoMultifuncional multifuncional = new EquipamentoMultifuncional();

        multifuncional.copiar();
        multifuncional.digitalizar();
        multifuncional.imprimir();

        //exemplo de polimorfismo com interfaces.

        Impressora impressora = new Deskjet();

        impressora.imprimir();

    }
}
