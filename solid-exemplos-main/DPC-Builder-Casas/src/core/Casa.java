package core;

import java.util.ArrayList;
import java.util.List;

public class Casa {
	
	private int numQuartos;
	private int numBanheiros;
	private String tipoCozinha;
	private List<Item> itensAdicionais;
	
	
	public Casa() {
		super();
		itensAdicionais = new ArrayList<Item>();
	}
	public int getNumQuartos() {
		return numQuartos;
	}
	public void setNumQuartos(int numQuartos) {
		this.numQuartos = numQuartos;
	}
	public int getNumBanheiros() {
		return numBanheiros;
	}
	public void setNumBanheiros(int numBanheiros) {
		this.numBanheiros = numBanheiros;
	}
	public String getTipoCozinha() {
		return tipoCozinha;
	}
	public void setTipoCozinha(String tipoCozinha) {
		this.tipoCozinha = tipoCozinha;
	}
	public List<Item> getItensAdicionais() {
		return itensAdicionais;
	}
	public void setItensAdicionais(List<Item> itensAdicionais) {
		this.itensAdicionais = itensAdicionais;
	}
	@Override
	public String toString() {
		return "Casa [numQuartos=" + numQuartos + ", numBanheiros=" + numBanheiros + ", tipoCozinha=" + tipoCozinha
				+ ", itensAdicionais=" + itensAdicionais + "]";
	}

	
	
}
