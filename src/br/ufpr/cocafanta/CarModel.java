package br.ufpr.cocafanta;

public class CarModel {
	
	private String nome;
	private String foto;
	private String modelo;
	private String fabricante;
	private String cor;
	private Float  preco;
	
	public CarModel(String nome, String foto, String modelo, String fabricante,
			String cor, Float preco) {
		super();
		this.nome = nome;
		this.foto = foto;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.cor = cor;
		this.preco = preco;
	}

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Float getPreco() {
		return preco;
	}
	public void setPreco(Float preco) {
		this.preco = preco;
	}
	
	
}
