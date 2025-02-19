package main;

import core.ContaBancaria;
import core.ContaEspecial;

public class Banco {
	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria(1235,"Josineidson");
				//new ContaEspecial(1234,"Isidro",1000.0);
		
		c1.creditar(1000.0);
		
		if (c1.debitar(1500.0)) {
			System.out.println("Debito autorizado");
		}
		else {
			System.out.println("Debito negado");
		}
		
		System.out.println(c1);
		
		
	}
}
