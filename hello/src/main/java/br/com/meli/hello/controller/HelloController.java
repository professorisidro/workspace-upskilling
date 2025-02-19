package br.com.meli.hello.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.hello.model.Produto;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello world from Springboot";
	}

	@GetMapping(path = "/produtos")
	public ResponseEntity<Produto> exibirProduto() {
		return ResponseEntity.status(409).body(new Produto(1234,"Computador",2500.0));
	}
}
