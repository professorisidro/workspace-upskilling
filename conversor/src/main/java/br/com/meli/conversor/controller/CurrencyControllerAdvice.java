package br.com.meli.conversor.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.meli.conversor.dto.ErrorDTO;
import br.com.meli.conversor.exceptions.CurrencyNotFoundException;

@ControllerAdvice
public class CurrencyControllerAdvice {
	
	@ExceptionHandler(CurrencyNotFoundException.class)
	public ResponseEntity<?> handleNotFound(CurrencyNotFoundException ex){
		return ResponseEntity.status(404).body(new ErrorDTO(ex.getMessage()));
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleBadRequest(MethodArgumentNotValidException ex){
		return ResponseEntity.status(400).body(new ErrorDTO(ex.getMessage()));
	}
}
