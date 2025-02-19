package br.meli.com.concessionaria.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.meli.com.concessionaria.model.Veiculo;
import br.meli.com.concessionaria.repo.IVeiculoRepo;

@Service
public class VeiculoServiceImpl  implements IVeiculoService {
	
	private final IVeiculoRepo repo;
	
	public VeiculoServiceImpl(IVeiculoRepo repo) {
		System.out.println("Inicializando Servico");
		this.repo = repo;
	}
	
	@Override
	public Veiculo addNewVeiculo(Veiculo v) {
		// TODO Auto-generated method stub
		return repo.save(v);
	}

	@Override
	public List<Veiculo> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Veiculo getById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

}
