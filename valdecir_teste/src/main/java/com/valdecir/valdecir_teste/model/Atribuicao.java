package com.valdecir.valdecir_teste.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Atribuicao {	
	
	@Id  
    @Column(length = 20, nullable = false)
    private String id;

    @Column(length = 50, nullable = false)
    private String nome;

    @Column(nullable = false)
    private Boolean situacao = true;    

	
	public Atribuicao(String id, String nome, Boolean situacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.situacao = situacao;
	}
	
	public Atribuicao() {
		
	}

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

	public Boolean getSituacao() {
		return situacao;
	}

	public void setSituacao(Boolean situacao) {
		this.situacao = situacao;
	} 
	


    

}
