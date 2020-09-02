package com.test1_POO.model;

public abstract class Animal {
    protected int idade;
    protected double tamanho;

    public abstract void somEmitido();

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}
