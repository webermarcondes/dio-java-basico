package edu.java.poo.pilarespoo.interfaces;

/*

Classe criada para exemplificação dos conceitos apresentados na aula
de Interfaces do Curso de Java

Material externo ao conteudo da aula para consulta e entendimento do conceito:
https://www.devmedia.com.br/entendendo-interfaces-em-java/25502

*/


import edu.java.poo.pilarespoo.interfaces.copiadora.Copiadora;
import edu.java.poo.pilarespoo.interfaces.digitalizadora.Digitalizadora;
import edu.java.poo.pilarespoo.interfaces.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora
{

    @Override
    public void copiar() {
        System.out.println("Arquivo Copiado via Equipamento Multifuncional conforme solicitado....");
    }

    @Override
    public void digitalizar() {
        System.out.println("Arquivo digitalizado via Equipamento Multifuncional conforme  solicitado");
    }

    @Override
    public void imprimir() {
        System.out.println("Arquivo imprimido via Equipamento Multifuncional conforme solicitado");

    }
}
