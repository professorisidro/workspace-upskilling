package br.com.meli.uebimotors.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meli.uebimotors.exceptions.ConflictException;
import br.com.meli.uebimotors.exceptions.MalformedVehicleException;
import br.com.meli.uebimotors.exceptions.NotFoundException;
import br.com.meli.uebimotors.model.Veiculo;
import br.com.meli.uebimotors.repo.VeiculoRepo;

@Service
public class VeiculoServiceImpl implements IVeiculoService{

	@Autowired
	private VeiculoRepo repo;
	
	@Override
	public Veiculo addNew(Veiculo v) {
		// TODO Auto-generated method stub
		if (v.getAno() > LocalDate.now().getYear()) {
			throw new MalformedVehicleException("Invalid Year :"+v.getAno());
		}
		if (repo.findByPlaca(v.getPlaca()).isPresent()) {
			throw new ConflictException("Existing vehicle "+v.getPlaca());
		}
		return repo.save(v);
	}

	@Override
	public Veiculo findById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow(() -> new NotFoundException("Vehicle "+id+" not found"));
	}
}
