package br.com.meli.conversor.exceptions;

public class CurrencyNotFoundException extends RuntimeException {
	public CurrencyNotFoundException(String msg) {
		super(msg);
	}
}
