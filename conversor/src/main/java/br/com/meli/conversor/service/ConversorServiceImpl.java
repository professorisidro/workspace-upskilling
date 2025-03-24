package br.com.meli.conversor.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meli.conversor.dto.ConversaoDTO;
import br.com.meli.conversor.dto.CurrencyDTO;
import br.com.meli.conversor.exceptions.CurrencyConflictException;
import br.com.meli.conversor.exceptions.CurrencyNotFoundException;
import br.com.meli.conversor.model.Currency;
import br.com.meli.conversor.repo.CurrencyRepo;

@Service
public class ConversorServiceImpl implements IConversorService {
	private ArrayList<ConversaoDTO> lastConversions = new ArrayList<>();
	
	@Autowired
	private CurrencyRepo repo;

	@Override
	public ConversaoDTO converter(Double montante, String moedaOrigem, String moedaDestino) {
		Currency origem = repo.findByName(moedaOrigem);
		Currency destino = repo.findByName(moedaDestino);
		Double newValue = montante * origem.getRate() / destino.getRate();
		ConversaoDTO dto = new ConversaoDTO(moedaOrigem,moedaDestino, montante, newValue);
		lastConversions.add(dto);
		return dto; 
	}

	@Override
	public Currency addNew(CurrencyDTO currency) {
		// TODO Auto-generated method stub
		try {
			Currency c = repo.findByName(currency.name());
			throw new CurrencyConflictException("Currency "+currency.name()+ " already exists");
		}
		catch(CurrencyNotFoundException ex) {
			Currency c = new Currency();
			c.setName(currency.name());
			c.setRate(1.0/currency.dolarValue());
			return repo.save(c);
		}
		
	}

	@Override
	public List<ConversaoDTO> getHistory() {
		// TODO Auto-generated method stub
		if (lastConversions.isEmpty()) {
			throw new CurrencyNotFoundException("Não há historico de conversoes");
		}
		int begin = lastConversions.size() > 5 ? lastConversions.size()-5: 0;
		int end = lastConversions.size();
		return lastConversions.subList(begin, end);
	}
	
	

}
