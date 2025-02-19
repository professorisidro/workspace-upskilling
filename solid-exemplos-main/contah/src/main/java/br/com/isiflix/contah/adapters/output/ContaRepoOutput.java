package br.com.isiflix.contah.adapters.output;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.isiflix.contah.domain.Conta;
import br.com.isiflix.contah.ports.output.ContaOutputPort;

//@Repository
public class ContaRepoOutput implements ContaOutputPort {
	
	private ContaTXTRepo repo = new ContaTXTRepo();

	@Override
	public List<Conta> buscarTodas() {
		// TODO Auto-generated method stub
		List<ContaTXTRecord> lista = repo.readAllFromFile();
		List<Conta> resultado = new ArrayList<Conta>();
		for (ContaTXTRecord rec: lista) {
			resultado.add(rec.fromContaTXTRecord(rec));			
		}
		return resultado;
	}

	@Override
	public void gravar(Conta conta) {
		// TODO Auto-generated method stub
		repo.persistContaInFile(new ContaTXTRecord().toContaTxtRecord(conta));
	}

}
