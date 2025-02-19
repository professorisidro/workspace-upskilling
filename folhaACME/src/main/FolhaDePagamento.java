package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import core.Chefe;
import core.Comissionado;
import core.Empreiteiro;
import core.Funcionario;
import core.FuncionarioFactory;
import core.Horista;

public class FolhaDePagamento {
	public static void main(String[] args) {
		ArrayList<Funcionario> lista = new ArrayList<Funcionario>(150);
		FuncionarioFactory fabrica = new FuncionarioFactory();
		
		//Funcionario lista[] = new Funcionario[7];
		lista.add(fabrica.createChefe(1234,"Marcelo",10000.0, 22.0, 750.0));
		lista.add(fabrica.createComissionado(1235, "Vitor", 6200, 15.0));
		lista.add(fabrica.createComissionado(1236, "Rafaela", 7200, 12.0));
		lista.add(fabrica.createHorista(1237, "Gustavo", 30, 100.0));
		lista.add(fabrica.createHorista(1238, "Filipe", 45, 110.0));
		lista.add(fabrica.createEmpreiteiro(1239, "Leandro", 4900.0));
		lista.add(fabrica.createEmpreiteiro(1240, "Lucia", 5210.0));
		
		List<Funcionario> ordenada = lista.stream()
				 						.sorted(Comparator.comparing(Funcionario::getNome))
				 						.collect(Collectors.toList());
		
		System.out.println(ordenada);
		ordenada.add(new Empreiteiro(1241,"Teste",1000.0));
		System.out.println(ordenada);
		
		// média dos salários dos funcionários que começam com a letra L
		double media = lista.stream().filter(f -> f.getNome().startsWith("L"))
				                     .mapToDouble(f->f.calcularSalario())
				                     .average().getAsDouble();
		
		System.out.println("Media dos salarios " +  media);
	}
}
