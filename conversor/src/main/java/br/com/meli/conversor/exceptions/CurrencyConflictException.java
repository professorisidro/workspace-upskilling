package br.com.meli.conversor.exceptions;

public class CurrencyConflictException extends RuntimeException {
	public CurrencyConflictException(String msg) {
		super(msg);
	}
}
