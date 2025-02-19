package core;

public abstract class Veiculo {

	protected String modelo;
	protected double preco;
	
	public Veiculo(String modelo, double preco) {
		super();
		this.modelo = modelo;
		this.preco = preco;
	}

	public abstract double calcularImposto();
}
