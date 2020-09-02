package com.test1_POO;

/*
**********************************************************
Programa: DesafioPoo
Autor: Iago H. Nunes
Criado em 02/09/2020
Descricao:
  Essa é a classe principal do programa, e aqui onde e 
instanciado os animais e impresso sua características logo
após.
***********************************************************
*/

import com.test1_POO.model.*;

public class AppMain {

	public static void main(String[] args) {
		//Instanciando os animais
		Galinha galinha = new Galinha(5,0.30,"Amarela");
		Pato pato = new Pato(2,0.30,"Branco",80);
		Morcego morcego = new Morcego(3,0.15,"Preto",20);
		Vaca vaca = new Vaca(7,1.27,"Malhada");
		
		//Imprimindo informações
		System.out.println(galinha);
		galinha.somEmitido();
		System.out.println("\n"+pato);
		pato.somEmitido();
		System.out.println("\n"+morcego);
		morcego.somEmitido();
		System.out.println("\n"+vaca);
		vaca.somEmitido();
	}

}
