package edu.java.metodos;

/*
Referência: https://felipe-aguiar.gitbook.io/dio-java/gitbook/sintaxe/metodos
 */


public class Metodos {

    //Abaixo seguem exemplos de métodos definidos na aula para ilustrar.

    //Os exemplos são apenas de definição estrutural dos métodos. Os que tem linhas de código
    //foram definidas para evitar erros de sintaxe disparados pelo interpretador da linguagem

    public double somar(int num1, int num2){

        return num1+num2 ;
    }

    public void imprimir(String texto){

        //AQUI NÃO PRECISA DO RETURN
        //POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
    }


    // throws Exception : indica que o método ao ser utilizado
    // poderá gerar uma exceção
    public double dividir(int dividendo, int divisor) throws Exception{

        return dividendo / divisor;
    }

    // este método não pode ser visto por outras classes no projeto
    private void metodoPrivado(){}

    //alguns equívocos estruturais
    public void validar(){
        //este método deveria retornar algum valor
        //no caso boolean (true ou false)
    }
    public void calcularEnviar(){
        //um método deve representar uma única responsabilidade
    }
    public void gravarCliente(String nome, String cpf, Integer telefone){
        //este método tem a finalidade de gravar
        //informações de um cliente, por que não criar
        //um objeto cliente e passar como parâmetro ?
        //veja abaixo
    }

    /*
    public void gravarCliente(Cliente cliente){}
    //ou
    public void gravar(Cliente cliente){}*/
}
