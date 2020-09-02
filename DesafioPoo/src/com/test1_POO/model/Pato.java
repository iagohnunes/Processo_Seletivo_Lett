package com.test1_POO.model;

public class Pato extends Aves implements Voo{
    protected double altitudeVooo;

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
        this.altitudeVooo = altitude;
    }

    public double getAltitudeVooo() {
        return altitudeVooo;
    }

    @Override
    public String toString() {
        return "Pato:\n" +
                "\tcorDasPenas = " + corDasPenas + '\n' +
                "\tidade = " + idade + " anos\n" +
                "\ttamanho = " + tamanho + "m\n" +
                "\tAltura de voo = " + altitudeVooo + "m";
    }
}
