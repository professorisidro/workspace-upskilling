package core;

public class Empreiteiro extends Funcionario {
	private double valorEmpreita;

	public Empreiteiro(int numeroRegistro, String nome, double valorEmpreita) {
		super(numeroRegistro, nome);
		this.valorEmpreita = valorEmpreita;
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return valorEmpreita;
	}
	
	

}
