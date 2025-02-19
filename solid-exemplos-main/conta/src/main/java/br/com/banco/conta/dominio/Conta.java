package br.com.banco.conta.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.banco.conta.dominio.dtos.ContaDTO; 

@Entity
@Table(name = "conta")
public class Conta {
   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    private String nome;
    private String cpf;
    private double saldo;

    public Conta(int id, String nome, String cpf, double saldo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }
    
    public Conta () {   	
    }
    
    public Conta(Conta conta) {
        this.id = conta.getId();
        this.nome = conta.getNome();
        this.cpf = conta.getCpf();
        this.saldo = conta.getSaldo();
    }
    
    public Conta(ContaDTO contaDTO) {
        this.nome = contaDTO.getNome();
        this.cpf = contaDTO.getCpf();
        this.saldo = contaDTO.getSaldo();
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

	public void depositar(double valor) {
	}
	
	public void sacar(double valor) {
	}
	
	public Conta toConta() {
		return new Conta (this.id, this.nome, this.cpf, this.saldo);
	}
	
	public ContaDTO toContaDTO() {
		return new ContaDTO (this.nome, this.cpf, this.saldo);
	}
	
	@Override
	public String toString() {
		return "Conta [id=" + id + ", saldo=" + saldo + "]";
	}
	
}
