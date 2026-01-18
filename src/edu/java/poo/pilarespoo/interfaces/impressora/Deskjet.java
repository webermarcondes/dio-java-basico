package edu.java.poo.pilarespoo.interfaces.impressora;

/*

Classe criada para exemplificação do conceito de Interface, apresentado no curso de Java
da DIO

Material externo ao conteudo da aula para consulta e entendimento do conceito:
https://www.devmedia.com.br/entendendo-interfaces-em-java/25502

* */

public class Deskjet implements Impressora {
    @Override
    public void imprimir() {
        System.out.println("Impressão realizada conforme solicitado via Impressora Deskjet");
    }
}
