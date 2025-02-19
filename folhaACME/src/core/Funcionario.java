package core;

public abstract class Funcionario {
	protected int numeroRegistro;
	protected String nome;
	
	public Funcionario(int numeroRegistro, String nome) {
		super();
		this.numeroRegistro = numeroRegistro;
		this.nome = nome;
	}

	public abstract double calcularSalario();
	
	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return String.format("%5d - %-30s R$ %8.2f", numeroRegistro, nome, calcularSalario());
	}

}
