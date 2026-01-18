package edu.java.poo.pilarespoo;

/*
Classe criada para exemplificação dos conceitos dos 04 Pilares de POO(Programação
Orientada a objetos) em Java.


"public abstract class Veiculo" -> Define Veiculo como uma classe abstrata

"public abstract void ligar()" -> Cria um método abstrato de nome ligar, sem lógica definida
                                  de como um veiculo deve ligar. A lógica de ligação
                                  do veiculo deve ser definida em cada implementação
                                  do método
*/

public abstract class Veiculo{

    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public abstract void ligar();
}
