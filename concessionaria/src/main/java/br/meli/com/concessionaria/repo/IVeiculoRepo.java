package br.meli.com.concessionaria.repo;

import java.util.List;
import java.util.Optional;

import br.meli.com.concessionaria.model.Veiculo;

public interface IVeiculoRepo {
	public Veiculo save(Veiculo v);
	public List<Veiculo> findAll();
	public Veiculo findById(Integer id);
	public List<Veiculo> findByMarca(String marca);
	public List<Veiculo> findByYearBetween(Integer start, Integer end);
	public List<Veiculo> findByCor(String cor);
	public Double findPrecoMedioPorMarca(String marca);
}
