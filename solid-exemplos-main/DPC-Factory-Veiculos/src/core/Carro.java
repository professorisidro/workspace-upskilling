package core;

public class Carro extends Veiculo{

	private int lugares;

	public Carro(String modelo, double preco, int lugares) {
		super(modelo, preco);
		this.lugares = lugares;
	}

	@Override
	public String toString() {
		return "Carro [lugares=" + lugares + ", modelo=" + modelo + ", preco=" + preco + "]";
	}

	@Override
	public double calcularImposto() {
		// TODO Auto-generated method stub
		return super.preco * 0.14;
	}
	
}
