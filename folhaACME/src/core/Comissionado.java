package core;

public class Comissionado extends Funcionario{
	private double salarioBase;
	private double comissao;
	public Comissionado(int numeroRegistro, String nome, double salarioBase, double comissao) {
		super(numeroRegistro, nome);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}
	
	@Override
	public double calcularSalario() {
		return salarioBase + salarioBase*comissao/100;
	}

}
