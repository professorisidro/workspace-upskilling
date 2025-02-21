package br.com.meli.testeh2.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.meli.testeh2.model.Joia;

public interface IJoiaRepo extends CrudRepository<Joia, Integer>{
	
	@Query("")
	public List<Joia> findByNomeContaining(String nome);
	public List<Joia> findByValidoTrue();
	public List<Joia> findByOrderByNomeAsc();

	
	
}
