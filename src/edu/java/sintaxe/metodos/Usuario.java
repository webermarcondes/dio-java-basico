package edu.java.metodos;

/*
Classe criada no exercicio da SmartTv para ilustração de como usar os métodos definidos
e consultar os atributos

* */
public class Usuario {

    static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada?: " + (smartTv.ligada ? "Sim" : "Não"));
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("\n\n");

        smartTv.ligar();
        smartTv.aumentarVolumeUmaUnidade();
        smartTv.aumentarCanalUmaUnidade();
        System.out.println("TV Ligada?: " + (smartTv.consultarLigada() ? "Sim" : "Não"));
        System.out.println("Canal Atual: " + smartTv.consultarCanal());
        System.out.println("Volume Atual: " + smartTv.consultarVolume());



        System.out.println("\n\n");

        smartTv.desligar();
        smartTv.reduzirVolumeUmaUnidade();
        smartTv.reduzirCanalUmaUnidade();
        System.out.println("TV Ligada?: " + (smartTv.ligada ? "Sim" : "Não"));
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);


        System.out.println("\n\n");

        smartTv.definirCanal(25);
        System.out.println("Canal Atual: " + smartTv.canal);
    }
}
