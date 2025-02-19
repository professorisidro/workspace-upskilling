package main;

import builder.CasaBuilder;
import core.Casa;

public class MainClass {
	public static void main(String[] args) {
		
		
		Casa c1, c2, c3;
		CasaBuilder builder = new CasaBuilder();
		
		c1 = builder.definirBanheiros(4)
				    .definirQuartos(4)
				    .definirTipoCozinha("Americana")
				    .definirChurrasqueira(3)
				    .definirPiscina("pequena")
				    .definirGaragem(3)
				    .build();
		
		System.out.println(c1);
		
		builder.reset();
		
		c2 = builder.definirBanheiros(1)
				    .definirQuartos(2)
				    .definirTipoCozinha("Comum")
				    .definirGaragem(1)
				    .build();
		
		System.out.println(c2);
		
		
		builder.reset();
		
		c3 = builder.definirBanheiros(2)
					.definirQuartos(2)
					.definirTipoCozinha("Comum")
					.build();
		
		System.out.println(c3);
	}
}
