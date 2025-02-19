package br.meli.com.concessionaria.repo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

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
		return this.database;
	}

	@Override
	public Optional<Veiculo> findById(Integer id) {
		// TODO Auto-generated method stub
		return this.database.stream().filter(v -> v.getId().equals(id)).findFirst();
	}

}
