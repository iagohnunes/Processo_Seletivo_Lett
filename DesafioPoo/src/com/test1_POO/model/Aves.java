package com.test1_POO.model;

public abstract class Aves extends Animal {
    protected String corDasPenas;

    void botarOvos(){
        System.out.println("Eclodindo ovos.");
    };

    public String getCorDasPenas() {
        return corDasPenas;
    }

    public void setCorDasPenas(String corDasPenas) {
        this.corDasPenas = corDasPenas;
    }
}
