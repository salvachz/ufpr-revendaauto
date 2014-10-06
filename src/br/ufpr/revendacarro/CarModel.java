package br.ufpr.revendacarro;

import java.io.Serializable;

public class CarModel implements Serializable {
	
	private String modelo;
	private int foto;
	private String fabricante;
	private String cor;
	private Double  preco;
	
	public CarModel( String modelo, int foto, String fabricante ,String cor, Double preco) {
		super();
		this.modelo = modelo;
		this.foto = foto;
		this.fabricante = fabricante;
		this.cor = cor;
		this.preco = preco;
	}

	

	public Integer getFoto() {
		return foto;
	}
	public void setFoto(Integer foto) {
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
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
}
