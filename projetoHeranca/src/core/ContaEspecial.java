package core;

public class ContaEspecial extends ContaBancaria{
	
	private Double limite;
	
	public ContaEspecial(Integer numero, String titular, Double limite) {
		super(numero, titular);
		this.limite = limite;
	}
	
	@Override
	public boolean debitar(Double valor) {
		if (super.saldo + this.limite >= valor) {
			super.saldo -= valor;
			return true;
		}
		return false;	
	}

	@Override
	public String toString() {
		return "Conta Especial:"+super.numero+" ("+super.titular+") R$ "+super.saldo+" / R$ "+this.limite;
	}
}
