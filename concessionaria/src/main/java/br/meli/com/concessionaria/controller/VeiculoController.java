package br.meli.com.concessionaria.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.meli.com.concessionaria.model.Veiculo;
import br.meli.com.concessionaria.service.IVeiculoService;

@RestController
public class VeiculoController {

	private IVeiculoService service;

	public VeiculoController(IVeiculoService service) {
		System.out.println("Inicializando controller");
		this.service = service;
	}

	@GetMapping("/veiculos")
	public List<Veiculo> recuperarTodos() {
		return service.getAll();
	}

	@GetMapping("/veiculos/{id}")
	public ResponseEntity<Veiculo> recuperarPeloId(@PathVariable Integer id) {
		Veiculo v = service.getById(id);
		if (v != null) {
			return ResponseEntity.ok(v);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping("/veiculos")
	public ResponseEntity<Veiculo> cadastrarNovo(@RequestBody Veiculo novo){
		return ResponseEntity.status(201).body(service.addNewVeiculo(novo));
	}
}
