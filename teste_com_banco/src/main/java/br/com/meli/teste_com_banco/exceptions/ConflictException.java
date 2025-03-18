package br.com.meli.teste_com_banco.exceptions;

public class ConflictException extends RuntimeException {
	public ConflictException(String msg) {
		super(msg);
	}
}
