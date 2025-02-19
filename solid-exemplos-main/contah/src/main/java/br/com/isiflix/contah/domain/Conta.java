package br.com.isiflix.contah.domain;

public class Conta {
	private Integer numeroConta;
	private String  cpfTitular;
	private String  nomeTitular;
	private Double  saldo;
	public Conta(Integer numeroConta, String cpfTitular, String nomeTitular, Double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.cpfTitular = cpfTitular;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}
	public Conta() {
		super();
	}
	public Integer getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getCpfTitular() {
		return cpfTitular;
	}
	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
}
