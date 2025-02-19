package br.com.isiflix.contah.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.isiflix.contah.domain.usecases.ContaBusiness;
import br.com.isiflix.contah.ports.input.ContaInputPort;
import br.com.isiflix.contah.ports.output.ContaOutputPort;

@Configuration
public class BeanConfiguration {

	@Bean
	ContaInputPort contaBusiness(ContaOutputPort contaPorta) {
		return new ContaBusiness(contaPorta);
	}
}
