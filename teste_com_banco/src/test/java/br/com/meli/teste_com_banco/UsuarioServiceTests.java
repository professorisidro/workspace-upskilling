package br.com.meli.teste_com_banco;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.meli.teste_com_banco.exceptions.ConflictException;
import br.com.meli.teste_com_banco.model.Usuario;
import br.com.meli.teste_com_banco.repo.UsuarioRepo;
import br.com.meli.teste_com_banco.service.UsuarioServiceImpl;

@SpringBootTest
public class UsuarioServiceTests {
	
	@InjectMocks
	private UsuarioServiceImpl service;
	
	@Mock
	private UsuarioRepo repo;
	
	@BeforeEach
	public void setup() {
		System.out.println("Executando antes do teste");
	}
	
	@Test
	public void shouldAddNewUser() {
		Usuario u = new Usuario();
		u.setEmail("isidro@isidro.com");
		u.setNome("Professor Isidro");
		u.setTelefone("11987654321");
		
		Usuario res = new Usuario();
		res.setEmail(u.getEmail());
		res.setNome(u.getNome());
		res.setTelefone(u.getTelefone());
		res.setId(1);
		
		Mockito.when(repo.save(u)).thenReturn(res);
		
		assertNotNull(service.addNew(u).getId());			
	}
	
	@Test
	public void shoudThrowExceptionCausedByExistingEmail() {
		Usuario u = new Usuario();
		u.setEmail("existing@existing.com");
		u.setNome("Existing user");
		u.setTelefone("11912345678");
		
		Mockito.when(repo.findByEmail(u.getEmail())).thenReturn(new Usuario());
		
		assertThrows(ConflictException.class, () -> {
			service.addNew(u);
		});
	}
	
	@Test
	public void shouldThrowExceptionCausedByExistingPhoneNumber() {
		Usuario u = new Usuario();
		u.setEmail("existing@existing.com");
		u.setNome("Existing user");
		u.setTelefone("11912345678");
		Mockito.when(repo.findByTelefone(u.getTelefone())).thenReturn(new Usuario());
		
		assertThrows(ConflictException.class, () -> {
			service.addNew(u);
		});
			
	}

}
