package br.com.meli.conversor.dto;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record CurrencyDTO(@NotNull @NotEmpty @Length(min = 3,max=3) String name, 
		                  @NotNull @Positive Double dolarValue) {

}
