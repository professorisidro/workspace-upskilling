package core;

public class ContaBancaria {
	protected Integer numero;
	protected String titular;
	protected Double saldo;
	public ContaBancaria(Integer numero, String titular) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = 0.0;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Double getSaldo() {
		return saldo;
	}
	
	public void creditar(Double valor) {
		this.saldo += valor;
	}
	public boolean debitar(Double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		 return "Conta Bancaria:"+numero+" ("+titular+")  R$ "+saldo;
	}
}
