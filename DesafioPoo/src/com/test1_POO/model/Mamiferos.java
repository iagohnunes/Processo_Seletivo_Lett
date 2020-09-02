package com.test1_POO.model;

/*
**********************************************************
Programa: DesafioPoo
Autor: Iago H. Nunes
Criado em 02/09/2020
Descricao:
  Essa classe extende os atributos de Animal e implementa 
os atributos necessários que os mamiferos da fazenda precisa para
ser registradas no sistema.
  junto aos atributos, também e definida as ações que 
apenas os mamiferos são capazes de realizar, como amamentar.
***********************************************************
*/

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
