package br.com.meli.uebimotors.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import br.com.meli.uebimotors.model.Veiculo;

public interface VeiculoRepo extends CrudRepository<Veiculo, Integer>{
	public Optional<Veiculo> findByPlaca(String placa);
}
