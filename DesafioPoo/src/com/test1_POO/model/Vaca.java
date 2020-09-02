package com.test1_POO.model;

/*
**********************************************************
Programa: DesafioPoo
Autor: Iago H. Nunes
Criado em 02/09/2020
Descricao:
  Essa classe extende os atributos de Mamiferos que também extende 
de Animais, assim adquirindo todos os atributos e métodos
necessários para instanciar uma vaca no sistema.
  Nela também e definido um contrutor para esta instanciando
ela junto as seus atributos iniciais.
  E como herana de Animais e necessário sobreescrever o 
método "somEmitido()" definindo qual o tipo de som a vaca
emite.
***********************************************************
*/

public class Vaca extends Mamiferos{

    public Vaca(int idade,double tamanho,String corPelo){
        this.setIdade(idade);
        this.setTamanho(tamanho);
        this.setCorDoPelo(corPelo);
    }

    @Override
    public void somEmitido() {
        System.out.println("O som emitido é o mugido.");
    }

    @Override
    public String toString() {
        return "Vaca:\n" +
                "\tcorDoPelo='" + corDoPelo + "\n" +
                "\tidade=" + idade + " anos\n" +
                "\ttamanho=" + tamanho + "m";
    }
}
