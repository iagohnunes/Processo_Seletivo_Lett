package com.test1_POO.model;

/*
**********************************************************
Programa: DesafioPoo
Autor: Iago H. Nunes
Criado em 02/09/2020
Descricao:
  Essa classe extende os atributos de Aves que também extende 
de Animais, para obter os atributos e os métodos necessários.
  Essa classe também implementa um contrato com a interface
Voo para que seja necessário implementar um método que 
atribua valor a altitudeVoo.
***********************************************************
*/

public class Pato extends Aves implements Voo{
    protected double altitudeVoo;

    public Pato(int idade,double tamanho,String corPena,double altura){
        this.setIdade(idade);
        this.setTamanho(tamanho);
        this.setCorDasPenas(corPena);
        this.setAltitudeDeVoo(altura);
    }

    @Override
    public void somEmitido() {
        System.out.println(" O som emitido é um grasnido.");
    }

    @Override
    public void setAltitudeDeVoo(double altitude) {
        this.altitudeVoo = altitude;
    }

    public double getAltitudeVoo() {
        return altitudeVoo;
    }

    @Override
    public String toString() {
        return "Pato:\n" +
                "\tcorDasPenas = " + corDasPenas + '\n' +
                "\tidade = " + idade + " anos\n" +
                "\ttamanho = " + tamanho + "m\n" +
                "\tAltura de voo = " + altitudeVoo + "m";
    }
}
