package br.meli.com.concessionaria.exceptions;

public class VehicleNotFoundException extends RuntimeException {
	public VehicleNotFoundException(String msg) {
		super(msg);
	}
}
