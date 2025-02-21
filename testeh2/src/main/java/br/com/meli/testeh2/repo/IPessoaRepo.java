package br.com.meli.testeh2.repo;

import org.springframework.data.repository.CrudRepository;

import br.com.meli.testeh2.model.Pessoa;
import br.com.meli.testeh2.model.PessoaID;

public interface IPessoaRepo extends CrudRepository<Pessoa, PessoaID>{

}
