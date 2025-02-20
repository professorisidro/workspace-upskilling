package br.com.meli.testeh2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.testeh2.model.Joia;
import br.com.meli.testeh2.service.IJoiaService;

@RestController
public class JoiaController {
	
	private final IJoiaService service;
	
	public JoiaController(IJoiaService service) {
		this.service = service;
	}
	
	
	@PostMapping("/joias")
	public Joia addNew(@RequestBody Joia joia) {
		return service.save(joia);
	}

	@GetMapping("/joias")
	public List<Joia> getAll(){
		return service.findAll();
	}
	
	@GetMapping("/joias/{id}")
	public Joia getById(@PathVariable Integer id) {
		return service.findById(id);
	}
}
