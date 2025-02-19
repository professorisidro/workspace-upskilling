package builder;

import core.Casa;
import core.Item;

public class CasaBuilder {
	private Casa casa;
	
	public CasaBuilder() {
		this.reset();
	}
	
	public CasaBuilder definirQuartos(int qtde) {
		this.casa.setNumQuartos(qtde);
		return this;
	}
	
	
	public CasaBuilder definirBanheiros(int qtd) {
		this.casa.setNumBanheiros(qtd);
		return this;
	}
	
	public CasaBuilder definirTipoCozinha(String tipo) {
		this.casa.setTipoCozinha(tipo);
		return this;
	}
	public CasaBuilder definirGaragem(int carros) {
		this.casa.getItensAdicionais().add(new Item("Garagem para "+carros+" carros"));
		return this;
	}
	public CasaBuilder definirPiscina(String tipoPiscina) {
		this.casa.getItensAdicionais().add(new Item("Piscina "+tipoPiscina));
		return this;
	}
	public CasaBuilder definirChurrasqueira(int pessoas) {
		this.casa.getItensAdicionais().add(new Item("Churrasqueira para "+pessoas+" Pessoas"));
		return this;
	}
	public void reset() {
		this.casa = new Casa();
	}
	
	public Casa build() {
		return this.casa;
	}
	
	
	

}
