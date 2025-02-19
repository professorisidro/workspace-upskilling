package main;

import core.Veiculo;
import factory.FabricaDeCarros;
import factory.FabricaDeJetSki;
import factory.FabricaDeMotos;
import factory.FabricaDeVeiculos;

public class MainClass {
	public static void main(String[] args) {
		
		
		Veiculo v1, v2, v3;
		
		FabricaDeVeiculos f1, f2, f3;
		
		f1 = new FabricaDeCarros();
		f2 = new FabricaDeMotos();
		f3 = new FabricaDeJetSki();
		
		v1 = f1.criarVeiculo();
		v2 = f2.criarVeiculo();
		v3 = f3.criarVeiculo();
		
		System.out.println(v1 + " Imposto = "+v1.calcularImposto());
		System.out.println(v2 + " Imposto = "+v2.calcularImposto());
		System.out.println(v3 + " Imposto = "+v3.calcularImposto());
	}
}
