package br.com.isiflix.contah.ports.input;

import java.util.List;

import br.com.isiflix.contah.adapters.input.ContaInputDTO;

public interface ContaInputPort {
	public void adicionarNovaConta(ContaInputDTO contaInput);
	public List<ContaInputDTO> recuperarContas();
}
