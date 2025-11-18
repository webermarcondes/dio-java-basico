package edu.java.estruturas_de_controle.estruturasDeRepeticao;

/*
Referência:

https://felipe-aguiar.gitbook.io/dio-java/gitbook/controle-de-fluxo/estruturas-de-repeticao#break-e-continue
 */

public class ComandosBreakEContinue {

    static void main(String[] args) {

        for (int x=1; x <= 5; x++) {
            System.out.println("Número " + x + "º");

            if (x == 3) {
                System.out.println("\nUso do Continue\n");
                continue;
            }

            else if(x == 4) {
                System.out.println("\nUso do Break para interromper");
                break;
            }

            System.out.println("\nFim.. Carregando próxima execução\n");
        }

        //O laço acima não imprime o número 5, pois a iteração é interrompida quando X tem o valor
        // 4
    }
}
