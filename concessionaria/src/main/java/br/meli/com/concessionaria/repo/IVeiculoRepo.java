package br.meli.com.concessionaria.repo;

import java.util.List;
import java.util.Optional;

import br.meli.com.concessionaria.model.Veiculo;

public interface IVeiculoRepo {
	public Veiculo save(Veiculo v);
	public List<Veiculo> findAll();
	public Optional<Veiculo> findById(Integer id);
}
