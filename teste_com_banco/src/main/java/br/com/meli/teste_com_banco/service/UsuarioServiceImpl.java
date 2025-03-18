package br.com.meli.teste_com_banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meli.teste_com_banco.exceptions.ConflictException;
import br.com.meli.teste_com_banco.model.Usuario;
import br.com.meli.teste_com_banco.repo.UsuarioRepo;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	private UsuarioRepo repo;
	
	@Override
	public Usuario addNew(Usuario novo) {
		// TODO Auto-generated method stub
		// tratar fluxo alternativo 1 - conflito de email
		if (repo.findByEmail(novo.getEmail()) != null) {
			throw new ConflictException("Email exists - "+novo.getEmail());
		}
		if (repo.findByTelefone(novo.getTelefone()) != null) {
			throw new ConflictException("Phone Number Exists- "+novo.getTelefone());
		}
		return repo.save(novo);
	}

}
