package com.test1_POO.model;

/*
**********************************************************
Programa: DesafioPoo
Autor: Iago H. Nunes
Criado em 02/09/2020
Descricao:
  Essa classe e a base para criações dos animais na fazenda,
ela leva em seu corpo tudo aquilo que e de semelhante entre 
eles.
***********************************************************
*/

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
