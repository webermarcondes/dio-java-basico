package edu.java.estruturas_de_controle.TratamentoDeExcecoes;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    static void main(String[] args) throws ParseException {
        Number valor = 0;

        //Tratamento da exceção NumberFormatException, gerada pelo método valueOf()
        try {
            valor = Double.valueOf("a1.75");

        }
        catch(NumberFormatException n) {

            System.out.println(n.toString());
        }


        //Tratamento da exceção ParseException, gerada pelo método .parse()
        try {
            NumberFormat.getInstance().parse("a1.75");
        }

        catch (ParseException p) {

            System.out.println(p.toString());

        }

        /*
        Foram criados 2 blocos try/catch pois quando uma exceção ocorre no try ela já é lançada
        e o bloco é finalizado, não sendo possível executar nenhum outro código que esteja abaixo,
        e que no caso acima geraria uma 2º exceção.
         */

        System.out.println(valor);

    }
}