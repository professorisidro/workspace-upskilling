package exemploBuilder;

import java.util.ArrayList;
import java.util.List;

public class Casa {
	private List<Comodo> listaComodos;
	private Piscina piscina;
	public Casa() {
		this.listaComodos = new ArrayList<>();
	}
	public List<Comodo> getListaComodos() {
		return listaComodos;
	}
	public void setListaComodos(List<Comodo> listaComodos) {
		this.listaComodos = listaComodos;
	}
	public Piscina getPiscina() {
		return piscina;
	}
	public void setPiscina(Piscina piscina) {
		this.piscina = piscina;
	}
	public String toString() {
		return "Casa:\n"
				+ " Comodos: "+listaComodos+"\n"
				+ " Piscina: "+ ((piscina==null)?"nao tera":piscina);
	}
	
}
