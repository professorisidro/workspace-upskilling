package br.com.banco.conta.configuracao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.banco.conta.portas.entrada.ContaPortaEntrada;
import br.com.banco.conta.portas.saida.ContaPortaSaida;
import br.com.banco.conta.service.ContaService;

@Configuration
public class ContaConfBean {
	
	@Bean
	ContaPortaEntrada contaService(ContaPortaSaida contaRepo) {
		return new ContaService (contaRepo);
	}

}
