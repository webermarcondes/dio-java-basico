package edu.java.estruturas_de_controle.TratamentoDeExcecoes;

/*
Referênciais sobre a aula de exceções customizadas

https://felipe-aguiar.gitbook.io/dio-java/gitbook/controle-de-fluxo/estruturas-excepcionais#excecoes-customizadas


Obs.:

- Exceções que dão extends da Classe Exception devem obrigatoriamente ser tratadas em alguma parte
  do código.

- Exceções que dão extends da Classe RuntimeException não precisam ser obrigatoriamente tratadas,
  pois são consideradas Exceções não checadas, geradas por erros internos como falha de lógica,
  erro de construção do código e etc...
*/

public class CepInvalidoException extends Exception {
    public CepInvalidoException() {

        super("Erro, o cep informado é invalido, tente novamente");
    }
}
