package main;

import core.Produto;

public class MainClass {
	public static void main(String[] args) {
		int a = 3;
		Produto p = new Produto(1, "Computador", 1500.0, true);
		
		System.out.println(p.getCodigo()+"/"+p.getNome()+"/"+p.getPreco()+"/"+p.isDisponivel());
		
		Produto p2 = p;
		p2.setPreco(1200.0);
		p2.setDisponivel(false);
	
		System.out.println(p.getCodigo()+"/"+p.getNome()+"/"+p.getPreco()+"/"+p.isDisponivel());
		
		
		Produto p3 = new Produto();
		System.out.println(p3.getCodigo()+"/"+p3.getNome()+"/"+p3.getPreco()+"/"+p3.isDisponivel());
		
		Produto p4 = new Produto(5,"Mouse",50, false);
		System.out.println(p4.getCodigo()+"/"+p4.getNome()+"/"+p4.getPreco()+"/"+p4.isDisponivel());
	}
}
