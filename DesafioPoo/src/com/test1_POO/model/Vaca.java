package com.test1_POO.model;

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
