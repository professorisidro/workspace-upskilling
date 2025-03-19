package br.com.meli.uebimotors.integration;

import java.time.LocalDate;

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

import br.com.meli.uebimotors.model.Veiculo;
import br.com.meli.uebimotors.repo.VeiculoRepo;

@SpringBootTest
@AutoConfigureMockMvc
public class VeiculoIntegrationTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	@DisplayName("Veiculo sendo inserido com sucesso")
	public void shouldAddNewVeiculoAndReturnStatusCreated() throws Exception {
		Veiculo v = new Veiculo();
		v.setAno(2025);
		v.setMarca("Porsche");
		v.setModelo("Cayenne");
		v.setCor("Chumbo Bandida!");
		v.setPlaca("XYZ1237");
		v.setPreco(2500000.0);
		ObjectMapper mapper = new ObjectMapper();

		mockMvc.perform(MockMvcRequestBuilders.post("/veiculos").contentType(MediaType.APPLICATION_JSON)
				.content(mapper.writeValueAsBytes(v))).andExpect(MockMvcResultMatchers.status().is(201));
	}
	
	@Test
	@DisplayName("Nao aceita veiculo com placa existente - retorna 409")
	public void shouldNotAddExistingVehicleAndReturnStatusConflict() throws Exception{
		
		Veiculo v = new Veiculo();
		v.setAno(2025);
		v.setMarca("Xevrolé");
		v.setModelo("Corsinha");
		v.setCor("Bordô com detalhes em branco no capô");
		v.setPlaca("ABC1234");
		v.setPreco(2000.0);
		ObjectMapper mapper = new ObjectMapper();
		mockMvc.perform(MockMvcRequestBuilders.post("/veiculos")
				                              .contentType(MediaType.APPLICATION_JSON)
				                              .content(mapper.writeValueAsBytes(v)))
			   .andExpect(MockMvcResultMatchers.status().is(409));
	}
	
	@Test
	@DisplayName("Nao aceita veiculo com ano posterior ao atual")
	public void shouldNotAcceptVehicleNewerThanCurrentYear() throws Exception {
		Veiculo v = new Veiculo();
		v.setAno(LocalDate.now().getYear()+1);
		v.setMarca("Xevrolé");
		v.setModelo("Corsinha");
		v.setCor("Bordô com detalhes em branco no capô");
		v.setPlaca("ABC1234");
		v.setPreco(2000.0);
		ObjectMapper mapper = new ObjectMapper();
		
		mockMvc.perform(MockMvcRequestBuilders.post("/veiculos")
											  .contentType(MediaType.APPLICATION_JSON)
											  .content(mapper.writeValueAsBytes(v)))
			   .andExpect(MockMvcResultMatchers.status().is(400));
			
	}

}
