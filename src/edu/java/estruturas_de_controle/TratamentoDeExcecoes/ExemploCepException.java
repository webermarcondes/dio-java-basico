package edu.java.estruturas_de_controle.TratamentoDeExcecoes;



/*
Bloco try/catch -> Trata a exceção lançada no código, evitando que ela se propague para outras
                   partes da aplicação

Comando throws -> Indica que o método X ira lançar a exceção Y, e que o tratamento desta
                  exceção lançada deve ser feito quando o método for chamado.


Referênciais sobre a aula de exceções customizadas

https://felipe-aguiar.gitbook.io/dio-java/gitbook/controle-de-fluxo/estruturas-excepcionais#excecoes-customizadas

 */
public class ExemploCepException {

    static void main(String[] args) {

        try {
            System.out.println(formatarCep("123456"));
        }
        catch (CepInvalidoException e) {
            System.out.println(e);
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

            //"throw new" faz o lançamento da exceção "CepInvalidoException"
            //para indicar ao programador que houve um erro de Cep invalido

        //simulando um cep formatado
        return "23.765-064";
    }
}
