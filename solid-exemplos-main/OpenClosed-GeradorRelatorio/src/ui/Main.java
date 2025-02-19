package ui;

import java.util.ArrayList;

import core.RegistroVendas;
import generator.GeradorHTML;
import generator.GeradorRelatorios;

public class Main {
	public static void main(String[] args) {
		// 2 passos
		// 1 - simular a recuperacao dos dados do banco
		ArrayList<RegistroVendas> vendas = new ArrayList<RegistroVendas>();
		vendas.add(new RegistroVendas("14/04/2023","Teclado",100));
		vendas.add(new RegistroVendas("15/04/2023","Microondas",500));
		vendas.add(new RegistroVendas("16/04/2023","Televisao",2500));
		vendas.add(new RegistroVendas("17/04/2023","Batedeira",350));
		vendas.add(new RegistroVendas("18/04/2023","Liquidificador",150));
		vendas.add(new RegistroVendas("19/04/2023","Computador",1500));
		
		
		// 2 - gerar o relatorio
		
//		GeradorRelatorios gerador = new GeradorRelatorios(vendas);
		GeradorRelatorios gerador = new GeradorHTML(vendas);
		gerador.gerarRelatorio();
		
		
	}
}
