package br.com.meli.testeh2.service;

import java.util.List;

import br.com.meli.testeh2.model.Joia;

public interface IJoiaService {

	public Joia save(Joia s);
	public List<Joia> findAll();
	public Joia findById(Integer id);
}
