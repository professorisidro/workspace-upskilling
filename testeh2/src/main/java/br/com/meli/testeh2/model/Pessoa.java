package br.com.meli.testeh2.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_pessoa")
public class Pessoa {
	
	@EmbeddedId
	private PessoaID id;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "telefone", length = 20, nullable = false)
	private String telefone;


	public PessoaID getId() {
		return id;
	}

	public void setId(PessoaID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	

}
