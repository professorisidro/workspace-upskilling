package br.com.meli.uebimotors.unity;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.meli.uebimotors.exceptions.ConflictException;
import br.com.meli.uebimotors.exceptions.MalformedVehicleException;
import br.com.meli.uebimotors.exceptions.NotFoundException;
import br.com.meli.uebimotors.model.Veiculo;
import br.com.meli.uebimotors.repo.VeiculoRepo;
import br.com.meli.uebimotors.service.VeiculoServiceImpl;

@SpringBootTest
public class VeiculoServiceTest {
	
	@InjectMocks
	private VeiculoServiceImpl service;
	
	@Mock
	private VeiculoRepo repo;

	
	@Test
	@DisplayName("Teste adicionando veiculo com sucesso!")
	public void shouldAddNewVehicle() {
		Veiculo v = new Veiculo();
		v.setMarca("Porxe");
		v.setModelo("Caieny");
		v.setAno(2025);
		v.setPreco(2000000.0);
		v.setCor("Chumbo");
		v.setPlaca("ABC1234");
		
		Veiculo res = new Veiculo();
		res.setId(1);
		res.setAno(v.getAno());
		res.setMarca(v.getMarca());
		res.setModelo(v.getModelo());
		res.setPlaca(v.getPlaca());
		res.setPreco(v.getPreco());
		res.setCor(v.getCor());
		
		Mockito.when(repo.save(v)).thenReturn(res);
		
		assertNotNull(service.addNew(v));
	}
	
	@Test
	@DisplayName("Veiculo com placa duplicada nao pode existir")
	public void shouldNotAddVehicleWithExistingSign() {
		Veiculo v = new Veiculo();
		v.setMarca("Porxe");
		v.setModelo("Caieny");
		v.setAno(2025);
		v.setPreco(2000000.0);
		v.setCor("Chumbo");
		v.setPlaca("ABC1234");
		Mockito.when(repo.findByPlaca("ABC1234")).thenReturn(Optional.of(new Veiculo()));
		
		
		
		assertThrows(ConflictException.class, ()->{
			service.addNew(v);
		});
	}
	
	@Test
	@DisplayName("Veiculo com ano posterior ao atual nao pode ser inserido")
	public void shouldNotAddVehicleWithYearGreaterThenCurrent() {
		Veiculo v = new Veiculo();
		v.setMarca("Porxe");
		v.setModelo("Caieny");
		v.setPreco(2000000.0);
		v.setCor("Chumbo");
		v.setPlaca("ABC1234");
		v.setAno(LocalDate.now().getYear() + 1);
		Mockito.when(repo.save(v)).thenReturn(v);
		
		assertThrows(MalformedVehicleException.class, ()->{
			service.addNew(v);
		});
	}
	
	@Test
	@DisplayName("Sucesso ao recuperar um veiculo existente")
	public void shouldRetrieveValidVehicle() {
		Veiculo v = new Veiculo();
		v.setId(123);
		v.setMarca("Chevrolet");
		v.setModelo("Corsa");
		v.setAno(1996);
		v.setPreco(4999.0);
		v.setPlaca("AAA9876");
		v.setCor("Bordeaux com detalhes em branco no capô");
		
		Mockito.when(repo.findById(123)).thenReturn(Optional.of(v));
		
		assertNotNull(service.findById(123));
	}
	
	@Test
	@DisplayName("Falha a o recuperar um veiculo inexistente")
	public void shouldNotRetrieveInvalidVehicle() {
		Mockito.when(repo.findById(1000)).thenReturn(Optional.ofNullable(null));
		
		assertThrows(NotFoundException.class, () -> {
			service.findById(1000);
		});
	}
	
}
