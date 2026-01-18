package edu.java.poo.pilarespoo.interfaces.digitalizadora;

/*

Classe criada para exemplificação do conceito de Interface, apresentado no curso de Java
da DIO

Material externo ao conteudo da aula para consulta e entendimento do conceito:
https://www.devmedia.com.br/entendendo-interfaces-em-java/25502

* */

public class Scanner implements Digitalizadora {
    @Override
    public void digitalizar() {
        System.out.println("Digitalização realizada via equipamento Scanner conforme solicitado");
    }
}
