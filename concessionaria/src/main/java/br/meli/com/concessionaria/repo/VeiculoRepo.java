package br.meli.com.concessionaria.repo;

import java.io.File;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.meli.com.concessionaria.exceptions.EmptyListException;
import br.meli.com.concessionaria.exceptions.VehicleNotFoundException;
import br.meli.com.concessionaria.model.Veiculo;

@Repository
public class VeiculoRepo implements IVeiculoRepo{

	private List<Veiculo> database;
	
	public VeiculoRepo() {
		System.out.println("DEBUG - Inicializando repositorio de veiculos");
		try {
			File f = ResourceUtils.getFile("classpath:veiculos.json");
			ObjectMapper mapper = new ObjectMapper();
			
			this.database = mapper.readValue(f, new TypeReference<List<Veiculo>>() {});
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	@Override
	public Veiculo save(Veiculo v) {
		// TODO Auto-generated method stub
		this.database.add(v);
		return v;
	}

	@Override
	public List<Veiculo> findAll() {
		// TODO Auto-generated method stub
		if (this.database.isEmpty()) {
			throw new EmptyListException("Nao encontrei veiculos no criterio selecionado");
		}
		return this.database;
	}

	@Override
	public Veiculo findById(Integer id) {
		// TODO Auto-generated method stub
		return this.database.stream()
				            .filter(v -> v.getId().equals(id))
				            .findFirst()
				            .orElseThrow(() -> new VehicleNotFoundException("Veiculo de ID "+id+" nao encontrado"));
	}
	@Override
	public List<Veiculo> findByMarca(String marca) {
		// TODO Auto-generated method stub
		List<Veiculo> res = database.stream().filter(v -> v.getMarca().equalsIgnoreCase(marca)).toList();
		if (res.isEmpty()) {
			throw new EmptyListException("Nao ha veiculos com este criterio");
		}
		return res;
	}
	@Override
	public List<Veiculo> findByYearBetween(Integer start, Integer end) {
		// TODO Auto-generated method stub
		return database.stream().filter(v-> v.getAno()>= start && v.getAno() <= end).toList();
	}
	@Override
	public List<Veiculo> findByCor(String cor) {
		// TODO Auto-generated method stub
		return database.stream().filter(v -> v.getCor().equalsIgnoreCase(cor)).toList();
	}
	@Override
	public Double findPrecoMedioPorMarca(String marca) {
		// TODO Auto-generated method stub
		return database.stream().filter(v -> v.getMarca().equalsIgnoreCase(marca)).mapToDouble(Veiculo::getPreco).average().orElse(0.0);
	}

}
