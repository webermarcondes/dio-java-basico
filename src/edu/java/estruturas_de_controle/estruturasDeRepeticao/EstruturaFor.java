package edu.java.estruturas_de_controle.estruturasDeRepeticao;


/*
Referência:

https://felipe-aguiar.gitbook.io/dio-java/gitbook/controle-de-fluxo/estruturas-de-repeticao#for

 */
public class EstruturaFor {

    static void main(String[] args) {
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){

            if (carneirinhos < 10) {
                System.out.println(carneirinhos + "º Carneirinho");
            }

            else {
                System.out.println(carneirinhos + "º Carneirinhos");
            }

        }

        System.out.println("\n\nFim.. Joãozinho pegou no Sono....Zzzzzz");
    }

    /*

       Para incremento/decremento da variável contadora com valor diferente de 1 deve-se usar
       a seguinte sintaxe:

       varContadora += valor  (é o mesmo que varContadora = varContadora + valor)
       varContadora -= valor  (é o mesmo que varContadora = varContadora - valor)

       Ex.:

            for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos += 5)

            Resultado: a váriavel contadora carneirinhos é incrementada de 5 em 5, ao inves
                       de 1.
     */
}
