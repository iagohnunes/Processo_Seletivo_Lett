package com.test1_POO.model;

/*
**********************************************************
Programa: DesafioPoo
Autor: Iago H. Nunes
Criado em 02/09/2020
Descricao:
  Essa classe extende os atributos de Animal e implementa 
os atributos necessários que as aves da fazenda precisa para
ser registradas no sistema.
  junto aos atributos, também e definida as ações que 
apenas as aves são capazes de realizar.
***********************************************************
*/

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
