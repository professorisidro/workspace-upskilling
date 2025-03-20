package br.com.meli.uebimotors.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.meli.uebimotors.dto.ErroDTO;
import br.com.meli.uebimotors.exceptions.ConflictException;
import br.com.meli.uebimotors.exceptions.MalformedVehicleException;
import br.com.meli.uebimotors.exceptions.NotFoundException;

@ControllerAdvice
public class VeiculoControlerAdvice {
	
	@ExceptionHandler(ConflictException.class)
	public ResponseEntity<ErroDTO> handleDuplicatedSign(ConflictException ex){
		return ResponseEntity.status(409).body(new ErroDTO(ex.getMessage()));
	}
	
	@ExceptionHandler(MalformedVehicleException.class)
	public ResponseEntity<ErroDTO> handleInvalidYear(MalformedVehicleException ex){
		return ResponseEntity.status(400).body(new ErroDTO(ex.getMessage()));
	}
	
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<ErroDTO> handleNotfound(NotFoundException ex){
		return ResponseEntity.status(404).body(new ErroDTO(ex.getMessage()));
	}
}
