package com.test1_POO.model;

/*
**********************************************************
Programa: DesafioPoo
Autor: Iago H. Nunes
Criado em 02/09/2020
Descricao:
  Essa classe extende os atributos de Mamiferos que também extende 
de Animais, assim adquirindo todos os atributos e métodos
necessários para instanciar uma morcego no sistema.
  Nela também e definido um contrutor para esta instanciando
ela junto as seus atributos iniciais.
  E como herana de Animais e necessário sobreescrever o 
método "somEmitido()" definindo qual o tipo de som a morcego
emite.
  Essa classe implementa a interface Voo, sendo assim 
necessário sobreescrever o método que define a altuda de voo
desse animal.
***********************************************************
*/

public class Morcego extends Mamiferos implements Voo{
    protected double altitudeVoo;

    public Morcego(int idade,double tamanho,String corPelo,double altura){
        this.setIdade(idade);
        this.setTamanho(tamanho);
        this.setCorDoPelo(corPelo);
        this.setAltitudeDeVoo(altura);
    }

    @Override
    public void somEmitido() {
        System.out.println("O som emitido é um farfalho.");
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
        return "Morcego:\n" +
                "\tcorDoPelo='" + corDoPelo + "\n" +
                "\tidade=" + idade + " anos\n" +
                "\ttamanho=" + tamanho + "m\n" +
                "\taltitudeVoo=" + altitudeVoo + "m";
    }
}
