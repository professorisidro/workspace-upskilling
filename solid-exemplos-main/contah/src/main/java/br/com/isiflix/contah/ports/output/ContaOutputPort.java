package br.com.isiflix.contah.ports.output;

import java.util.List;

import br.com.isiflix.contah.domain.Conta;

public interface ContaOutputPort {
	
	public List<Conta> buscarTodas();
	public void gravar(Conta conta);

}
