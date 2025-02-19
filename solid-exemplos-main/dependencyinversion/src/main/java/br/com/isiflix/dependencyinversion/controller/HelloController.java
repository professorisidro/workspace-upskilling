package br.com.isiflix.dependencyinversion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isiflix.dependencyinversion.service.IMensagem;

@RestController
public class HelloController {

	@Qualifier("logo")
	@Autowired
	private IMensagem service;
	
	@GetMapping("/hello")
	public String sayHello() {
		return service.exibirMensagem();
	}

}
