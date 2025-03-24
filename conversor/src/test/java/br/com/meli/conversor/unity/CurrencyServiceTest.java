package br.com.meli.conversor.unity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.meli.conversor.dto.ConversaoDTO;
import br.com.meli.conversor.dto.CurrencyDTO;
import br.com.meli.conversor.exceptions.CurrencyConflictException;
import br.com.meli.conversor.exceptions.CurrencyNotFoundException;
import br.com.meli.conversor.model.Currency;
import br.com.meli.conversor.service.IConversorService;

@SpringBootTest
public class CurrencyServiceTest {
	
	@Autowired
	private IConversorService service;
	
	@Test
	@DisplayName("sucesso ao criar nova moeda")
	public void shouldAllowCreateNewCurrency() {
		CurrencyDTO currency = new CurrencyDTO("BRL", 5.70);		
		assertNotNull(service.addNew(currency));
	}
	
	@Test
	@DisplayName("nao deveria permitir recriar uma moeda")
	public void shouldNotAllowCreateExistingCurrency() {
		CurrencyDTO currency = new CurrencyDTO("USD", 2.0);
		
		assertThrows(CurrencyConflictException.class, () -> {
			service.addNew(currency);
		});
	}
	
	@Test
	@DisplayName("conversao efetuada com sucesso")
	public void shouldExecuteConversionSuccesfully() {
		Currency res = service.addNew(new CurrencyDTO("XYZ", 2.00));
		ConversaoDTO dto = service.converter(10.00, "USD", "XYZ");		
		assertEquals(dto.valorConvertido(), 20.0);
	}
	
	@Test
	@DisplayName("Conversao inversa com sucesso")
	public void shouldExceuteInverseConversionSuccesfully() {
		Currency res = service.addNew(new CurrencyDTO("ZYX", 2.00));
		ConversaoDTO dto = service.converter(10.0, "ZYX", "USD");
		assertEquals(dto.valorConvertido(), 5.00);
	}
	
	
	@Test
	@DisplayName("moeda nao econtrada")
	public void shouldThrowCurrencyNotFoundException() {
		assertThrows(CurrencyNotFoundException.class, () -> {
			service.converter(10.0, "AAA", "USD");
		});
	}
}
