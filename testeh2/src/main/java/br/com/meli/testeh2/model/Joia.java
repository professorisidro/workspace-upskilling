package br.com.meli.testeh2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_joia")
public class Joia {

	@Id
	@Column(name = "id_joia")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "nome", length = 100)
	private String nome;
	@Column(name = "material")
	private String material;
	@Column(name = "peso")
	private Integer peso;
	@Column(name = "particularidade")
	private String particularidade;
	@Column(name = "tem_pedra")
	private Boolean temPedra;
	@Column(name = "valido")
	private Boolean valido;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	public String getParticularidade() {
		return particularidade;
	}
	public void setParticularidade(String particularidade) {
		this.particularidade = particularidade;
	}
	public Boolean getTemPedra() {
		return temPedra;
	}
	public void setTemPedra(Boolean temPedra) {
		this.temPedra = temPedra;
	}
	public Boolean getValido() {
		return valido;
	}
	public void setValido(Boolean valido) {
		this.valido = valido;
	}
}
