package telas;

import java.util.Scanner;

import core.Configuracao;

public class TelaConfig {
	public void configurar() {
		Scanner teclado = new Scanner(System.in);
		
		int pxH, pxV, tt;
		float fr;
		
		System.out.println("Qual o tamanho da tela?");
		tt = teclado.nextInt();
		System.out.println("Qual a frequencia?");
		fr = teclado.nextFloat();
		System.out.println("Quantos pixels horizontais?");
		pxH = teclado.nextInt();
		System.out.println("Quantos pixels verticais?");
		pxV = teclado.nextInt();
		
		Configuracao.getInstance().setTamanhoTela(tt);
		Configuracao.getInstance().setFrequencia(fr);
		Configuracao.getInstance().setPxHorizontal(pxH);
		Configuracao.getInstance().setPxVertical(pxV);
		
		teclado.close();
	}

}
