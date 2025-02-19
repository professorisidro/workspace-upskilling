package exemploBuilder;

public class CasaBuilder {
	
	private Casa casa;
	
	public CasaBuilder() {
		this.casa = new Casa();
	}
	public CasaBuilder addComodo(Comodo comodo) {
		this.casa.getListaComodos().add(comodo);
		return this;
	}
	public CasaBuilder setPiscina(Piscina piscina) {
		this.casa.setPiscina(piscina);
		return this;
	}
	public Casa build() {
		return this.casa;
	}

}
