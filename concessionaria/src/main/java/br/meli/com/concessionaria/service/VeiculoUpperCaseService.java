package br.meli.com.concessionaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import br.meli.com.concessionaria.dto.AveragePriceByBrand;
import br.meli.com.concessionaria.model.Veiculo;
import br.meli.com.concessionaria.repo.IVeiculoRepo;

@Service
@Qualifier("uppercase")
public class VeiculoUpperCaseService implements IVeiculoService {

	private IVeiculoRepo repo;
	
	public VeiculoUpperCaseService(IVeiculoRepo repo) {
		this.repo = repo;
	}
	
	@Override
	public Veiculo addNewVeiculo(Veiculo v) {
		// TODO Auto-generated method stub
		return repo.save(v);
	}

	@Override
	public List<Veiculo> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll().stream().map(v -> toUpperCase(v)).toList();
	}

	@Override
	public Veiculo getById(Integer id) {
		// TODO Auto-generated method stub
		Veiculo res = repo.findById(id);
		return res == null ? res : toUpperCase(res);
	}

	@Override
	public List<Veiculo> getByMarca(String marca) {
		// TODO Auto-generated method stub
		return repo.findByMarca(marca).stream().map(v -> toUpperCase(v)).toList();
	}

	@Override
	public List<Veiculo> getByIntervaloAnos(Integer ini, Integer fim) {
		// TODO Auto-generated method stub
		return repo.findByYearBetween(ini, fim).stream().map(v->toUpperCase(v)).toList();
	}

	@Override
	public List<Veiculo> getByCor(String cor) {
		// TODO Auto-generated method stub
		return repo.findByCor(cor).stream().map(v -> toUpperCase(v)).toList();
	}

	@Override
	public AveragePriceByBrand getPrecoMedioPorMarca(String marca) {
		// TODO Auto-generated method stub
		return new AveragePriceByBrand(marca.toUpperCase(), repo.findPrecoMedioPorMarca(marca));
	}

	private Veiculo toUpperCase(Veiculo v) {
		Veiculo res = new Veiculo();
		res.setId(v.getId());
		res.setAno(v.getAno());
		res.setPreco(v.getPreco());
		res.setPotencia(v.getPotencia());
		res.setCor(v.getCor().toUpperCase());
		res.setMarca(v.getMarca().toUpperCase());
		res.setModelo(v.getModelo().toUpperCase());
		return res;
	}
}
