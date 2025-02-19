package main;

import telas.TelaConfig;
import telas.TelaExibicao;

public class MainClass {
	
	public static void main(String[] args) {
		
		TelaExibicao telaEx =  new TelaExibicao();
		TelaConfig telaCfg = new TelaConfig();
		
		System.out.println("*** 1 - Configuracao Original");
		telaEx.exibirConfiguracao();
		System.out.println("****** NOVA CONFIGURACAO *****");
		telaCfg.configurar();
		System.out.println("*** 2 - Configuracao Atual");
		telaEx.exibirConfiguracao();
		
	}

}
