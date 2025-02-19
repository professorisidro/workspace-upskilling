package core;

public class Configuracao {
	
	// atributos da configuracao
	private int   tamanhoTela;
	private float frequencia;
	private int   pxHorizontal;
	private int   pxVertical;
	
	// elemento para eu gerenciar a configuração
	private static Configuracao instance;

	
	private Configuracao() {
		super();
		this.frequencia = 30;
		this.tamanhoTela = 14;
		this.pxHorizontal = 720;
		this.pxVertical = 600;
	}
	
	public static Configuracao getInstance() {
		if (instance == null) {
			instance = new Configuracao();
		}		
		return instance;
	}
	// getters e setters
	public int getTamanhoTela() {
		return tamanhoTela;
	}

	public void setTamanhoTela(int tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}

	public float getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(float frequencia) {
		this.frequencia = frequencia;
	}

	public int getPxHorizontal() {
		return pxHorizontal;
	}

	public void setPxHorizontal(int pxHorizontal) {
		this.pxHorizontal = pxHorizontal;
	}

	public int getPxVertical() {
		return pxVertical;
	}

	public void setPxVertical(int pxVertical) {
		this.pxVertical = pxVertical;
	}

	@Override
	public String toString() {
		return "Configuracao [tamanhoTela=" + tamanhoTela + ", frequencia=" + frequencia + ", pxHorizontal="
				+ pxHorizontal + ", pxVertical=" + pxVertical + "]";
	}	
}
