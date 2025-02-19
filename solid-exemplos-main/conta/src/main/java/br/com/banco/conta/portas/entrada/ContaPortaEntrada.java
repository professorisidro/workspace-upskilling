package br.com.banco.conta.portas.entrada;

import java.util.List;

import br.com.banco.conta.dominio.dtos.ContaDTO;

public interface ContaPortaEntrada {

	void criarConta (ContaDTO contaDTO);
	
	List<ContaDTO> listarContas();
	
	
}
