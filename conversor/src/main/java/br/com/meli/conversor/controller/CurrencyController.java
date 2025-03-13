package br.com.meli.conversor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.conversor.dto.ConversaoDTO;
import br.com.meli.conversor.dto.CurrencyDTO;
import br.com.meli.conversor.model.Currency;
import br.com.meli.conversor.service.IConversorService;
import jakarta.validation.Valid;

@RestController
public class CurrencyController {
	
	@Autowired
	private IConversorService service;
	
	@GetMapping("/convert/{montante}/{origem}/{destino}")
	public ResponseEntity<ConversaoDTO> realizarConversao(@PathVariable Double montante,
			                                              @PathVariable String origem,
			                                              @PathVariable String destino){
		return ResponseEntity.ok(service.converter(montante, origem, destino));
	}

	
	
	@PostMapping("/tax")
	public ResponseEntity<Currency> addNewTax(@RequestBody @Valid CurrencyDTO dto){
		return ResponseEntity.status(201).body(service.addNew(dto));
	}
	
	@GetMapping("/convertions")
	public ResponseEntity<List<ConversaoDTO>> getHistory(){
		return ResponseEntity.ok(service.getHistory()); 
	}
}
