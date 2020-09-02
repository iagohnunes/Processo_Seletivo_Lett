package com.test1_POO.model;

public abstract class Mamiferos extends Animal{
    protected String corDoPelo;

    void amamentar(){
        System.out.println("Amamentando...");
    };

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }
}
