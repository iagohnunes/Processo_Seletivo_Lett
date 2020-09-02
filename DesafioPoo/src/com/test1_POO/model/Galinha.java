package com.test1_POO.model;

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
