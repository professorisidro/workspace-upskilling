package br.com.meli.conversor.dto;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record CurrencyDTO(@NotNull(message = "Nome da moeda nao pode ser nulo") 
                          @NotEmpty(message = "Nome da moeda nao pode estar vazio") 
						  @Length(min = 3,max=3, message = "Nome da moeda obrigatoriamente com 3 caracteres") String name, 
		                  @NotNull @Positive(message = "valor da cotacao deve ser positivo") Double dolarValue) {

}
