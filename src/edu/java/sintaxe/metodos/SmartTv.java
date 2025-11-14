package edu.java.metodos;

/*
Referência: https://felipe-aguiar.gitbook.io/dio-java/gitbook/sintaxe/metodos

A classe em questão foi de um exercicio proposto na aula do Tema metodos do curso de java.

*/

/*
Exercicio proposto:

Vamos criar um exemplo de uma classe para representar uma SmartTV onde:

Ela tenha as características: ligada (boolean), canal (int) e volume (int)

-Nossa TV poderá ligar e desligar e assim mudar o estado ligada

-Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1

-Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente

 */
public class SmartTv {

    Boolean ligada = false;
    Integer canal = 1;
    Integer volume = 25;


    public Boolean consultarLigada() {
        return ligada;
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }


    public Integer consultarVolume(){
        return volume;
    }

    public void aumentarVolumeUmaUnidade(){
        ++volume;
    }

    public void reduzirVolumeUmaUnidade(){
        --volume;
    }

    public Integer consultarCanal() {
        return canal;
    }

    public void aumentarCanalUmaUnidade(){
        ++canal;
    }

    public void reduzirCanalUmaUnidade(){
        --canal;
    }

    public void definirCanal(Integer canal) {
        this.canal = canal;
    }
}
