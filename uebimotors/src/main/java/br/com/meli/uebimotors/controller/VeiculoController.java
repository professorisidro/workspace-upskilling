package br.com.meli.uebimotors.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.uebimotors.model.Veiculo;
import br.com.meli.uebimotors.service.IVeiculoService;

@RestController
public class VeiculoController {
	
	@Autowired
	private IVeiculoService service;
	
	
	
	@PostMapping("/veiculos")
	public ResponseEntity<Veiculo> addNew(@RequestBody Veiculo v){
		return ResponseEntity.status(201).body(service.addNew(v));
	}
	
	@GetMapping("/veiculos/{id}")
	public ResponseEntity<Veiculo> findById(@PathVariable Integer id){
		return ResponseEntity.ok(service.findById(id));
	}

}
