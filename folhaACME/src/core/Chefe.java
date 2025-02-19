package core;

public class Chefe extends Funcionario {
	
	private double salarioBase;
	private double adicionalFuncao;
	private double beneficioTerno;
	
	public Chefe(int numeroRegistro, String nome, double salarioBase, double adicionalFuncao, double beneficioTerno) {
		super(numeroRegistro, nome);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}
	
	@Override
	public double calcularSalario() {
		return salarioBase + salarioBase*adicionalFuncao/100 + beneficioTerno;
	}
	
	
	

}
