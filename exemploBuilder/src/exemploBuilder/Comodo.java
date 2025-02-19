package exemploBuilder;

public class Comodo {
	private String nome;
	private int largura;
	private int profundidade;
	public Comodo(String nome, int largura, int profundidade) {
		super();
		this.nome = nome;
		this.largura = largura;
		this.profundidade = profundidade;
	}
	@Override
	public String toString() {
		return "Comodo [nome=" + nome + ", largura=" + largura + ", profundidade=" + profundidade + "]\n";
	}
	
	

}
