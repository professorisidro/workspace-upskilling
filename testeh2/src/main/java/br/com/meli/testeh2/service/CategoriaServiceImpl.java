package br.com.meli.testeh2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.meli.testeh2.model.Categoria;
import br.com.meli.testeh2.repo.ICategoriaRepo;

@Service
public class CategoriaServiceImpl implements ICategoriaService {
	
	private final ICategoriaRepo repo;
	
	public CategoriaServiceImpl(ICategoriaRepo repo) {
		this.repo = repo;
	}

	@Override
	public Categoria save(Categoria c) {
		// TODO Auto-generated method stub
		return repo.save(c);
	}

	@Override
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
//		return (List<Categoria>)repo.findAll();
		return repo.recuperarTodas();
	}

	@Override
	public Categoria findById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
	
	
	

}
