package com.formulario.concessionaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
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
	public String getVersao() {
		return versao;
	}
	public void setVersao(String versao) {
		this.versao = versao;
	}
	
	private int ano;
	@Size(max = 100)
	private String marca;
	@Size(max = 100)
	private String modelo;
	@Size(max = 100)
	private String versao;

	public Veiculo(int id, int ano, String marca, String modelo, String versao) {
		super();
		this.id = id;
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
		this.versao = versao;
	}
	

}
