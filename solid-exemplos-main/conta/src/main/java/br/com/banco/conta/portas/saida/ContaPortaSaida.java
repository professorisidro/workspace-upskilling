package br.com.banco.conta.portas.saida;

import java.util.List;

import br.com.banco.conta.dominio.Conta;

public interface ContaPortaSaida {

	List<Conta> buscarTodas();
	
	Conta buscarPeloId(int id);
	
	void salvar(Conta conta);
	
}
