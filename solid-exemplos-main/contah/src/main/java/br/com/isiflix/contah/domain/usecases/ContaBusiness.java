package br.com.isiflix.contah.domain.usecases;

import java.util.ArrayList;
import java.util.List;

import br.com.isiflix.contah.adapters.input.ContaInputDTO;
import br.com.isiflix.contah.domain.Conta;
import br.com.isiflix.contah.ports.input.ContaInputPort;
import br.com.isiflix.contah.ports.output.ContaOutputPort;

public class ContaBusiness implements ContaInputPort{

	private ContaOutputPort portaSaida;	
	
	public ContaBusiness(ContaOutputPort portaSaida) {
		this.portaSaida = portaSaida;
	}
	
	@Override
	public void adicionarNovaConta(ContaInputDTO contaInput) {
		
		portaSaida.gravar(contaInput.toConta(contaInput));
	}

	@Override
	public List<ContaInputDTO> recuperarContas() {
		// TODO Auto-generated method stub
		List<Conta> lista = portaSaida.buscarTodas();
		List<ContaInputDTO> resultado = new ArrayList<ContaInputDTO>();
		for (Conta c: lista) {
			ContaInputDTO input = new ContaInputDTO();		
			resultado.add(input.fromConta(c));
		}
		return resultado;
	}
}
