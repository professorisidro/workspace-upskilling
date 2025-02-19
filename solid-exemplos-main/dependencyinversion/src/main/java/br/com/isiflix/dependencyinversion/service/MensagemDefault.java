package br.com.isiflix.dependencyinversion.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Qualifier("default")
@Component
public class MensagemDefault implements IMensagem{

	@Override
	public String exibirMensagem() {
		// TODO Auto-generated method stub
		return "Hello World";
	}

}
