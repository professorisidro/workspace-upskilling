package br.com.meli.testeh2.service;

import java.util.List;

import br.com.meli.testeh2.model.Categoria;

public interface ICategoriaService {
	public Categoria save(Categoria c);
	public List<Categoria> findAll();
	public Categoria findById(Integer id);
	public void deleteById(Integer id);
}
