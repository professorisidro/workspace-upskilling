package br.com.meli.conversor.repo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.com.meli.conversor.exceptions.CurrencyNotFoundException;
import br.com.meli.conversor.model.Currency;

@Repository
public class CurrencyRepo {

	private Map<String, Currency> currencyMap;
	
	public CurrencyRepo() {
		this.currencyMap = new HashMap<>();
		Currency currency = new Currency();
		currency.setName("USD");
		currency.setRate(1.0);
		this.currencyMap.put(currency.getName(), currency);
	}
	
	public Currency save(Currency currency) {
		this.currencyMap.put(currency.getName(), currency);
		return currency;
	}
	
	public Currency findByName(String name) {
		Currency c = this.currencyMap.get(name);
		if (c == null) {
			throw new CurrencyNotFoundException("Moeda "+name+" inexistente");
		}
		return c;
	}	
}
