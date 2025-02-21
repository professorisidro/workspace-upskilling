package br.com.meli.testeh2.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.meli.testeh2.model.Categoria;

public interface ICategoriaRepo extends CrudRepository<Categoria, Integer>{

	@Query("SELECT c FROM Categoria c JOIN FETCH c.joias")
	public List<Categoria> recuperarTodas();
}
