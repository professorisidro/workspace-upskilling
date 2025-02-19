package br.com.isiflix.contah.adapters.output;

import br.com.isiflix.contah.domain.Conta;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_conta")
public class ContaEntity {

	@Id
	@Column(name = "col_num_conta")
	private Integer entityNumConta;
	@Column(name = "col_cpf_tit", length = 20)
	private String entityCpfTitular;
	@Column(name = "col_nome_tit", length = 100)
	private String entityNomeTitular;
	@Column(name = "col_saldo")
	private Double entitySaldo;
	
	
	public Integer getEntityNumConta() {
		return entityNumConta;
	}
	public void setEntityNumConta(Integer entityNumConta) {
		this.entityNumConta = entityNumConta;
	}
	public String getEntityCpfTitular() {
		return entityCpfTitular;
	}
	public void setEntityCpfTitular(String entityCpfTitular) {
		this.entityCpfTitular = entityCpfTitular;
	}
	public String getEntityNomeTitular() {
		return entityNomeTitular;
	}
	public void setEntityNomeTitular(String entityNomeTitular) {
		this.entityNomeTitular = entityNomeTitular;
	}
	public Double getEntitySaldo() {
		return entitySaldo;
	}
	public void setEntitySaldo(Double entitySaldo) {
		this.entitySaldo = entitySaldo;
	}
	
	public Conta toConta() {
		Conta c = new Conta();
		c.setNumeroConta(entityNumConta);
		c.setCpfTitular(entityCpfTitular);
		c.setNomeTitular(entityNomeTitular);
		c.setSaldo(entitySaldo);
		return c;
	}
	
	public ContaEntity fromConta(Conta c) {
		ContaEntity entity = new ContaEntity();
		entity.entityNumConta = c.getNumeroConta();
		entity.entityCpfTitular = c.getCpfTitular();
		entity.entityNomeTitular = c.getNomeTitular();
		entity.entitySaldo = c.getSaldo();
		return entity;
	}
}
