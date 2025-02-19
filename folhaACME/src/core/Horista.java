package core;

public class Horista extends Funcionario{
	private int numHoras;
	private double valorHora;
	
	public Horista(int numeroRegistro, String nome, int numHoras, double valorHora) {
		super(numeroRegistro, nome);
		this.numHoras = numHoras;
		this.valorHora = valorHora;
	}

	@Override
	public double calcularSalario() {
		return numHoras* valorHora;
				
	}
	
	

}
