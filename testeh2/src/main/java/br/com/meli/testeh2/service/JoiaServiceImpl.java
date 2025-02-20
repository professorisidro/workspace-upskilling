package br.com.meli.testeh2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.meli.testeh2.model.Joia;
import br.com.meli.testeh2.repo.IJoiaRepo;

@Service
public class JoiaServiceImpl implements IJoiaService{

	private final IJoiaRepo repo;
	
	public JoiaServiceImpl(IJoiaRepo repo) {
		this.repo = repo;
	}
	
	@Override
	public Joia save(Joia s) {
		// TODO Auto-generated method stub
		return repo.save(s);
	}

	@Override
	public List<Joia> findAll() {
		// TODO Auto-generated method stub
		return (List<Joia>)repo.findAll();
	}

	@Override
	public Joia findById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

}
