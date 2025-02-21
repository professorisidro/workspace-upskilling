package br.com.meli.testeh2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.testeh2.model.Categoria;
import br.com.meli.testeh2.service.ICategoriaService;

@RestController
public class CategoriaController {
	
	private final ICategoriaService service;
	
	public CategoriaController(ICategoriaService service) {
		this.service = service;
	}
	
	@PostMapping("/categorias")
	public Categoria addNew(@RequestBody Categoria c) {
		return service.save(c);
	}
	
	@GetMapping("/categorias")
	public List<Categoria> getAll(){
		return service.findAll();		
	}
	
	@GetMapping("/categorias/{id}")
	public Categoria getById(@PathVariable Integer id) {
		return service.findById(id);
	}
	
	@DeleteMapping("/categorias/{id}")
	public String deleteById(@PathVariable Integer id) {
		service.deleteById(id);
		return "Ok";
	}

}
