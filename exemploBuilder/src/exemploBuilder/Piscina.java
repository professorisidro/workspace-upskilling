package exemploBuilder;

public class Piscina {
	private int larg;
	private int comp;
	private int alt;
	public Piscina(int larg, int comp, int alt) {
		super();
		this.larg = larg;
		this.comp = comp;
		this.alt = alt;
	}
	@Override
	public String toString() {
		return "Piscina [larg=" + larg + ", comp=" + comp + ", alt=" + alt + "]";
	}
}
