package br.com.meli.teste_com_banco.repo;

import org.springframework.data.repository.CrudRepository;

import br.com.meli.teste_com_banco.model.Usuario;

public interface UsuarioRepo extends CrudRepository<Usuario, Integer>{
	public Usuario findByEmail(String email);
	public Usuario findByTelefone(String telefone);
}
