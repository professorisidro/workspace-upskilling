package br.com.banco.conta.dominio.dtos;

public class ContaDTO {

    private String nome;
    private String cpf;
    private double saldo;
    
    public ContaDTO (String nome, String cpf, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public double getSaldo() {
		return saldo;
	}
  
    
}
