package core;

public class Produto {
	private Integer codigo;
	private String nome;
	private Double preco;
	private Boolean disponivel;
	
	public Produto(int codigo, String nome, double preco, boolean disponivel) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.disponivel = disponivel;
	}
	public Produto(int codigo, String nome, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.disponivel = true;
	}	
	public Produto() {
		super();
	}
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public Integer getCodigo(){
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}		
}
