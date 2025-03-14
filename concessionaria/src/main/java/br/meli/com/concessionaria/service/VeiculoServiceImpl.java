package br.meli.com.concessionaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.meli.com.concessionaria.dto.AveragePriceByBrand;
import br.meli.com.concessionaria.exceptions.VehicleValidationException;
import br.meli.com.concessionaria.model.Veiculo;
import br.meli.com.concessionaria.repo.IVeiculoRepo;

@Service
@Qualifier("common")
public class VeiculoServiceImpl  implements IVeiculoService {
	
	private final IVeiculoRepo repo;
	
	public VeiculoServiceImpl(IVeiculoRepo repo) {
		System.out.println("Inicializando Servico");
		this.repo = repo;
	}
	
	@Override
	public Veiculo addNewVeiculo(Veiculo v) {
		// TODO Auto-generated method stub
		if (v.getMarca() == null || v.getCor() == null || v.getModelo() == null ||
			v.getPotencia() == null || v.getPotencia()<=0 || v.getPreco() == null ||
			v.getPreco()<=0 || v.getAno() == null || v.getAno() > 2025) {
			throw new VehicleValidationException("veiculo com dados invalidos - verifique");
		}
		return repo.save(v);
	}

	@Override
	public List<Veiculo> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Veiculo getById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public List<Veiculo> getByMarca(String marca) {
		// TODO Auto-generated method stub
		return repo.findByMarca(marca);
	}

	@Override
	public List<Veiculo> getByIntervaloAnos(Integer ini, Integer fim) {
		// TODO Auto-generated method stub
		return repo.findByYearBetween(ini, fim);
	}

	@Override
	public List<Veiculo> getByCor(String cor) {
		// TODO Auto-generated method stub
		return repo.findByCor(cor);
	}

	@Override
	public AveragePriceByBrand getPrecoMedioPorMarca(String marca) {
		// TODO Auto-generated method stub
		return new AveragePriceByBrand(marca, repo.findPrecoMedioPorMarca(marca));
	}

}
