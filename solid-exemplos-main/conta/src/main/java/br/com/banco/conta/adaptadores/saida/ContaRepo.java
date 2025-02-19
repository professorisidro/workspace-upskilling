package br.com.banco.conta.adaptadores.saida;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import br.com.banco.conta.dominio.Conta;
import br.com.banco.conta.portas.saida.ContaPortaSaida;

@Repository
public class ContaRepo implements ContaPortaSaida {

	private final ContaRepoSpring contarepospring;
	
	public ContaRepo (ContaRepoSpring contarepospring) {
		this.contarepospring = contarepospring;
	}

	@Override
	public List<Conta> buscarTodas() {
		List<Conta> conta = this.contarepospring.findAll();
		return conta.stream().map(Conta::toConta).collect(Collectors.toList());
	}

	@Override
	public Conta buscarPeloId(int id) {
		Optional<Conta> conta = this.contarepospring.findById(id);
		if (conta.isPresent())
			return conta.get().toConta();
		
		throw new RuntimeException("Conta não existe");
	}

	@Override
	public void salvar(Conta conta) {
		this.contarepospring.save(conta);
	}
	
	
}
