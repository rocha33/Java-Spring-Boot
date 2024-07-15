package com.valdecir.valdecir_teste.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Cartorio {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @Size(max = 150)
    private String nome;

    @Size(max = 250)
    private String observacao;

    @NotNull
    private String situacao;

    @OneToMany
   @JoinColumn(name = "cartorio_id")
    private List<Atribuicao> atribuicoes;	
	
	public Cartorio(int id, @NotBlank @Size(max = 150) String nome, @Size(max = 250) String observacao,
			@NotNull String situacao, List<Atribuicao> atribuicoes) {
		super();
		this.id = id;
		this.nome = nome;
		this.observacao = observacao;
		this.situacao = situacao;
		this.atribuicoes = atribuicoes;
	}

	public Cartorio() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public List<Atribuicao> getAtribuicoes() {
		return atribuicoes;
	}

	public void setAtribuicoes(List<Atribuicao> atribuicoes) {
		this.atribuicoes = atribuicoes;
	}
    
    

}
