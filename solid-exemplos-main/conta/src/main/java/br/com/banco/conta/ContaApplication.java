package br.com.banco.conta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.banco.conta.adaptadores.saida.ContaRepoSpring;


@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = ContaRepoSpring.class)
public class ContaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContaApplication.class, args);
	}
	

}
