package com.example.aula2303carro.model;

public class Carro{
	
	private int id;
	private String placa;
	private String marca;
	private String modelo;
	private String ano;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public Carro(int id, String placa, String marca, String modelo, String ano) {
		this.id = id;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Carro [ano=" + ano + ", id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", placa=" + placa
				+ "]";
	}
}
	