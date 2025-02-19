package br.com.banco.conta.service;

import java.util.List;
import java.util.stream.Collectors;

import br.com.banco.conta.dominio.Conta;
import br.com.banco.conta.dominio.dtos.ContaDTO;
import br.com.banco.conta.portas.entrada.ContaPortaEntrada;
import br.com.banco.conta.portas.saida.ContaPortaSaida;

public class ContaService implements ContaPortaEntrada {
	
	private final ContaPortaSaida contaRepo;
	
	public ContaService (ContaPortaSaida contaRepo) {
		this.contaRepo = contaRepo;
	}
	
	public List<ContaDTO> listarContas() {
		List<Conta> conta = this.contaRepo.buscarTodas();
		List<ContaDTO> contaDTO = conta.stream().map(Conta::toContaDTO).collect(Collectors.toList());
		return contaDTO;
	}

	public void criarConta(ContaDTO contaDTO) {
		Conta conta = new Conta (contaDTO);
		this.contaRepo.salvar(conta);
	}	

}
