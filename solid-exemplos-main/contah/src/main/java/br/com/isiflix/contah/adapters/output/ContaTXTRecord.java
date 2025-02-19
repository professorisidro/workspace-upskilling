package br.com.isiflix.contah.adapters.output;

import br.com.isiflix.contah.domain.Conta;

public class ContaTXTRecord {
	private Integer txtNumeroConta;
	private String  txtCpfTitular;
	private String  txtNomeTitular;
	private Double  txtSaldo;
	
	public Integer getTxtNumeroConta() {
		return txtNumeroConta;
	}
	public void setTxtNumeroConta(Integer txtNumeroConta) {
		this.txtNumeroConta = txtNumeroConta;
	}
	public String getTxtCpfTitular() {
		return txtCpfTitular;
	}
	public void setTxtCpfTitular(String txtCpfTitular) {
		this.txtCpfTitular = txtCpfTitular;
	}
	public String getTxtNomeTitular() {
		return txtNomeTitular;
	}
	public void setTxtNomeTitular(String txtNomeTitular) {
		this.txtNomeTitular = txtNomeTitular;
	}
	public Double getTxtSaldo() {
		return txtSaldo;
	}
	public void setTxtSaldo(Double txtSaldo) {
		this.txtSaldo = txtSaldo;
	}
	
	public Conta fromContaTXTRecord(ContaTXTRecord txtRecord) {
		Conta conta = new Conta();
		conta.setNumeroConta(txtRecord.getTxtNumeroConta());
		conta.setCpfTitular(txtRecord.getTxtCpfTitular());
		conta.setNomeTitular(txtRecord.getTxtNomeTitular());
		conta.setSaldo(txtRecord.getTxtSaldo());
		return conta;
	}
	
	public ContaTXTRecord toContaTxtRecord(Conta conta) {
		ContaTXTRecord txtRec = new ContaTXTRecord();
		txtRec.setTxtNumeroConta(conta.getNumeroConta());
		txtRec.setTxtCpfTitular(conta.getCpfTitular());
		txtRec.setTxtNomeTitular(conta.getNomeTitular());
		txtRec.setTxtSaldo(conta.getSaldo());
		return txtRec;
	}
	
	public String toString() {
		return this.txtNumeroConta+";"+this.txtCpfTitular+";"+this.txtNomeTitular+";"+this.txtSaldo;
	}

}
