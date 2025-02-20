package br.meli.com.concessionaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.meli.com.concessionaria.dto.AveragePriceByBrand;
import br.meli.com.concessionaria.exceptions.VehicleNotFoundException;
import br.meli.com.concessionaria.model.Veiculo;
import br.meli.com.concessionaria.service.IVeiculoService;

@RestController
public class VeiculoController {

	private IVeiculoService service;

	public VeiculoController(@Qualifier("common") IVeiculoService service) {
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
		return ResponseEntity.ok(v);		
	}

	@PostMapping("/veiculos")
	public ResponseEntity<Veiculo> cadastrarNovo(@RequestBody Veiculo novo) {
		return ResponseEntity.status(201).body(service.addNewVeiculo(novo));
	}

	@GetMapping("/veiculos/search/brand/{marca}")
	public List<Veiculo> recuperarPorMarca(@PathVariable String marca) {
		return service.getByMarca(marca);
	}

	@GetMapping("/veiculos/search/year")
	public List<Veiculo> recuperarPorIntervalo(@RequestParam(name = "start") Integer start,
			@RequestParam(name = "end") Integer end) {
		return service.getByIntervaloAnos(start, end);
	}

	@GetMapping("/veiculos/search/color/{cor}")
	public List<Veiculo> recuperarPorCor(@PathVariable String cor) {
		return service.getByCor(cor);
	}

	@GetMapping("/veiculos/stats/{marca}")
	public AveragePriceByBrand recuperarPrecoMedioPorMarca(@PathVariable String marca) {
		return service.getPrecoMedioPorMarca(marca);
	}
}
