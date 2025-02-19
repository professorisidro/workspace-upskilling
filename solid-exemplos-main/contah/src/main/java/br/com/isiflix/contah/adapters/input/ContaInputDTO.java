package br.com.isiflix.contah.adapters.input;

import br.com.isiflix.contah.domain.Conta;

public class ContaInputDTO {
	private Integer dtoNumConta;
	private String  dtoCpfTitular;
	private String  dtoNomeTitular;
	private Double  dtoSaldo;
	public Integer getDtoNumConta() {
		return dtoNumConta;
	}
	public void setDtoNumConta(Integer dtoNumConta) {
		this.dtoNumConta = dtoNumConta;
	}
	public String getDtoCpfTitular() {
		return dtoCpfTitular;
	}
	public void setDtoCpfTitular(String dtoCpfTitular) {
		this.dtoCpfTitular = dtoCpfTitular;
	}
	public String getDtoNomeTitular() {
		return dtoNomeTitular;
	}
	public void setDtoNomeTitular(String dtoNomeTitular) {
		this.dtoNomeTitular = dtoNomeTitular;
	}
	public Double getDtoSaldo() {
		return dtoSaldo;
	}
	public void setDtoSaldo(Double dtoSaldo) {
		this.dtoSaldo = dtoSaldo;
	}

	
	public Conta toConta(ContaInputDTO dto) {
		Conta conta = new Conta();
		conta.setNumeroConta(dto.getDtoNumConta());
		conta.setCpfTitular(dto.getDtoCpfTitular());
		conta.setNomeTitular(dto.getDtoNomeTitular());
		conta.setSaldo(dto.getDtoSaldo());
		return conta;
	}
	public ContaInputDTO fromConta(Conta conta) {
		ContaInputDTO dto = new ContaInputDTO();
		dto.setDtoNumConta(conta.getNumeroConta());
		dto.setDtoCpfTitular(conta.getCpfTitular());
		dto.setDtoNomeTitular(conta.getNomeTitular());
		dto.setDtoSaldo(conta.getSaldo());
		return dto;
	}
}
