package br.com.meli.conversor.integration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;

import br.com.meli.conversor.dto.CurrencyDTO;
import br.com.meli.conversor.service.IConversorService;

@SpringBootTest
@AutoConfigureMockMvc
public class CurrencyAPITest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private IConversorService service;
	
	@Test
	@DisplayName("Sucesso ao cadastrar nova moeda via API")
	public void shouldAllowCreateNewCurrency() throws Exception{
		ObjectMapper mapper = new ObjectMapper();
		CurrencyDTO dto = new CurrencyDTO("YYY", 5.0);
		
		mockMvc.perform(MockMvcRequestBuilders.post("/tax")
				         .contentType(MediaType.APPLICATION_JSON)
				         .content(mapper.writeValueAsString(dto)))
		  	.andExpect(MockMvcResultMatchers.status().is(201));
	}
	
	@Test
	@DisplayName("nao aceita moeda com identificacao nula")
	public void shouldNotAcceptNullName() throws Exception{
		ObjectMapper mapper = new ObjectMapper();
		CurrencyDTO dto = new CurrencyDTO(null, 5.0);
		
		mockMvc.perform(MockMvcRequestBuilders.post("/tax")
				         .contentType(MediaType.APPLICATION_JSON)
				         .content(mapper.writeValueAsString(dto)))
		  	.andExpect(MockMvcResultMatchers.status().is(400));
	}
	
	
	@Test
	@DisplayName("conversao feita com sucesso")
	public void shouldReturnStatus200BecauseConversionWasSuccessfull() throws Exception{
		service.addNew(new CurrencyDTO("BBB",4.0));
		
		mockMvc.perform(MockMvcRequestBuilders.get("/convert/30.0/USD/BBB"))
				.andExpect(MockMvcResultMatchers.status().is(200)).andReturn();
		
	}
	
	@Test
	@DisplayName("conversao invalida porque moeda nao existe")
	public void shouldReturnStatus404BecauseCurrencyDoesNotExist() throws Exception{
	
		mockMvc.perform(MockMvcRequestBuilders.get("/convert/30.0/USD/CCC"))
				.andExpect(MockMvcResultMatchers.status().is(404)).andReturn();
		
	}
	
}
