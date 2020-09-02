package com.test1_POO.model;

public class Morcego extends Mamiferos implements Voo{
    protected double altitudeVooo;

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
        this.altitudeVooo = altitude;
    }

    public double getAltitudeVooo() {
        return altitudeVooo;
    }

    @Override
    public String toString() {
        return "Morcego:\n" +
                "\tcorDoPelo='" + corDoPelo + "\n" +
                "\tidade=" + idade + " anos\n" +
                "\ttamanho=" + tamanho + "m\n" +
                "\taltitudeVooo=" + altitudeVooo + "m";
    }
}
