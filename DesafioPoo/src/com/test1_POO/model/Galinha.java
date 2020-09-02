package com.test1_POO.model;

/*
**********************************************************
Programa: DesafioPoo
Autor: Iago H. Nunes
Criado em 02/09/2020
Descricao:
  Essa classe extende os atributos de Aves que também extende 
de Animais, assim adquirindo todos os atributos e métodos
necessários para instanciar uma galinha no sistema.
  Nela também e definido um contrutor para esta instanciando
ela junto as seus atributos iniciais.
***********************************************************
*/

public class Galinha extends Aves{

    public Galinha(int idade,double tamanho,String corPena){
        this.setIdade(idade);
        this.setTamanho(tamanho);
        this.setCorDasPenas(corPena);
    }

    @Override
    public String toString() {
        return "Galinha:\n" +
                "\tcorDasPenas = " + corDasPenas + '\n' +
                "\tidade = " + idade + " anos\n" +
                "\ttamanho = " + tamanho + "m";
    }

	@Override
	public void somEmitido() {
		System.out.println("O som emitido é um cacarejo");
		
	}

}
