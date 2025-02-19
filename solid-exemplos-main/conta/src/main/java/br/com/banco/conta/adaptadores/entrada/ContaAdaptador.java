package br.com.banco.conta.adaptadores.entrada;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.conta.dominio.dtos.ContaDTO;
import br.com.banco.conta.portas.entrada.ContaPortaEntrada;

@RestController
public class ContaAdaptador {

	private final ContaPortaEntrada contaporta;
	
	public ContaAdaptador (ContaPortaEntrada contaporta) {
		this.contaporta = contaporta;
	}
	
	@PostMapping("/conta")
	void criarConta (@RequestBody ContaDTO contaDTO) {
		contaporta.criarConta(contaDTO);
	}
	
	@GetMapping("/contas")
	List<ContaDTO> getContas() {
		return contaporta.listarContas();
	}
}
