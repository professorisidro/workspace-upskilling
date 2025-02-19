package br.com.isiflix.dependencyinversion.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("logo")
@Component
public class MensagemLogo implements IMensagem {

	@Override
	public String exibirMensagem() {
		// TODO Auto-generated method stub
		return "IsiFLIX - Hello World!";
	}

}
