package br.com.isiflix.contah.adapters.output;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.isiflix.contah.domain.Conta;
import br.com.isiflix.contah.ports.output.ContaOutputPort;

@Repository
public class ContaH2Output implements ContaOutputPort{

	@Autowired
	private ContaH2Repo repo;
	
	@Override
	public List<Conta> buscarTodas() {
		// TODO Auto-generated method stub
		List<ContaEntity> lista = (List<ContaEntity>)repo.findAll();
		List<Conta> res = new ArrayList<Conta>();
		for (ContaEntity e: lista) {
			res.add(e.toConta());
		}
		return res;
	}

	@Override
	public void gravar(Conta conta) {
		// TODO Auto-generated method stub
		ContaEntity entity = new ContaEntity();
		repo.save(entity.fromConta(conta));		
	}

}
