package br.com.meli.conversor.service;

import java.util.List;

import br.com.meli.conversor.dto.ConversaoDTO;
import br.com.meli.conversor.dto.CurrencyDTO;
import br.com.meli.conversor.model.Currency;

public interface IConversorService {
	public ConversaoDTO converter(Double montante, String moedaOrigem, String moedaDestino);
	public Currency addNew(CurrencyDTO currency);
	public List<ConversaoDTO> getHistory();
}
