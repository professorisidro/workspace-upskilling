package br.meli.com.concessionaria.service;

import java.util.List;

import br.meli.com.concessionaria.dto.AveragePriceByBrand;
import br.meli.com.concessionaria.model.Veiculo;

public interface IVeiculoService {
	public Veiculo addNewVeiculo(Veiculo v);
	public List<Veiculo> getAll();
	public Veiculo getById(Integer id);
	public List<Veiculo> getByMarca(String marca);
	public List<Veiculo> getByIntervaloAnos(Integer ini, Integer fim);
	public List<Veiculo> getByCor(String cor);
	public AveragePriceByBrand getPrecoMedioPorMarca(String marca);
}
