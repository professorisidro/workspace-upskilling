package core;

public class JetSki extends Veiculo {
	private String categoria;

	public JetSki(String modelo, double preco, String categoria) {
		super(modelo, preco);
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "JetSki [categoria=" + categoria + ", modelo=" + modelo + ", preco=" + preco + "]";
	}

	@Override
	public double calcularImposto() {
		// TODO Auto-generated method stub
		return super.preco * 0.35;
	}
	
	
}
