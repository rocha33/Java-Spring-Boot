package com.valdecir.valdecir_teste.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Situacao {

	@Id
	@Column(length = 20, nullable = false)
	private String id;

	@Column(length = 50, nullable = false)
	private String nome;

	// Getters e Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
