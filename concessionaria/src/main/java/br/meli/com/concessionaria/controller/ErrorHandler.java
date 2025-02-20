package br.meli.com.concessionaria.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.meli.com.concessionaria.dto.ErrorMessageDTO;
import br.meli.com.concessionaria.exceptions.EmptyListException;
import br.meli.com.concessionaria.exceptions.VehicleNotFoundException;
import br.meli.com.concessionaria.exceptions.VehicleValidationException;

@ControllerAdvice
public class ErrorHandler {
	
	@ExceptionHandler(VehicleNotFoundException.class)
	public ResponseEntity<ErrorMessageDTO> handleNotFound(VehicleNotFoundException e){
		return ResponseEntity.status(404).body(new ErrorMessageDTO(e.getMessage()));
	}
	
	@ExceptionHandler(EmptyListException.class)
	public ResponseEntity<ErrorMessageDTO> handleEmptyList(EmptyListException e){
		return ResponseEntity.status(404).body(new ErrorMessageDTO(e.getMessage()));
	}

	@ExceptionHandler(VehicleValidationException.class)
	public ResponseEntity<ErrorMessageDTO> handleVehicleValidation(VehicleValidationException e){
		return ResponseEntity.status(400).body(new ErrorMessageDTO(e.getMessage()));
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorMessageDTO> handleGeneric(Exception e){
		return ResponseEntity.status(500).body(new ErrorMessageDTO("erro desconhecido - "+e.getMessage()));
	}
}
