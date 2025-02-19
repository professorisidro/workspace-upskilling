package br.com.isiflix.contah.adapters.input;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.isiflix.contah.ports.input.ContaInputPort;

@RestController
@CrossOrigin("*")
public class ContaController {

	private final ContaInputPort contaBusiness;
	
	public ContaController(ContaInputPort inputPort) {
		this.contaBusiness = inputPort;
	}
	
	@PostMapping("/contas")
	public String addNewConta(@RequestBody ContaInputDTO conta) {
		contaBusiness.adicionarNovaConta(conta);
		return "ok";
	}
	
	@GetMapping("/contas")
	public List<ContaInputDTO> recuperarTodas(){
		return contaBusiness.recuperarContas();
	}
}
