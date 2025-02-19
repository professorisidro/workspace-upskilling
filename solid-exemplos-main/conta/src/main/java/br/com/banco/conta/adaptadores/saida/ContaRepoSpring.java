package br.com.banco.conta.adaptadores.saida;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.banco.conta.dominio.Conta;

public interface ContaRepoSpring extends JpaRepository<Conta, Integer>{
	Optional <Conta> findById(int id);

	List<Conta> findAll();

}
