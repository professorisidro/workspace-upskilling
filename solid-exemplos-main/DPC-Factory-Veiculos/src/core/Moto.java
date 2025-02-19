package core;

public class Moto extends Veiculo {

	private int cilindrada;

	public Moto(String modelo, double preco, int cilindrada) {
		super(modelo, preco);
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + ", modelo=" + modelo + ", preco=" + preco + "]";
	}

	@Override
	public double calcularImposto() {
		// TODO Auto-generated method stub
		return super.preco * 0.22;
	}
	
}
