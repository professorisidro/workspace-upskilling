package br.meli.com.concessionaria.service;

import java.util.List;

import br.meli.com.concessionaria.model.Veiculo;

public interface IVeiculoService {
	public Veiculo addNewVeiculo(Veiculo v);
	public List<Veiculo> getAll();
	public Veiculo getById(Integer id);
}
