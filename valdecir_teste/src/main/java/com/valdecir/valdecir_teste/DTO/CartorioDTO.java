package com.valdecir.valdecir_teste.DTO;

import java.util.ArrayList;
import java.util.List;

public class CartorioDTO {	

    private int id;
    
    private String nome;
   
    private String observacao; 
    
    private String situacao;
 
    private List<AtribuicaoDTO> atribuicoes = new ArrayList<AtribuicaoDTO>();    
    
    
    private String mensagemErro; 	
	

	public CartorioDTO(int id, String nome, String observacao, String situacao, List<AtribuicaoDTO> atribuicoes) {
		super();
		this.id = id;
		this.nome = nome;
		this.observacao = observacao;
		this.situacao = situacao;
		this.atribuicoes = atribuicoes;
	}

	public CartorioDTO() {
		
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

	public List<AtribuicaoDTO> getAtribuicoes() {
		return atribuicoes;
	}

	public void setAtribuicoes(List<AtribuicaoDTO> list) {
		this.atribuicoes = list;
	}
	
	public String getMensagemErro() {
		return mensagemErro;
	}

	public void setMensagemErro(String mensagemErro) {
		this.mensagemErro = mensagemErro;
	}
    
    

}
