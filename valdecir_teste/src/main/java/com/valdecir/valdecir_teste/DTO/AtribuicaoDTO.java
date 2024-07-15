package com.valdecir.valdecir_teste.DTO;

import com.valdecir.valdecir_teste.model.Cartorio;

public class AtribuicaoDTO {

	private String id;
	private String nome;
	private Boolean situacao = true;
	private String mensagemErro;
	private int cartorioId;
	

	
	public AtribuicaoDTO(String id, String nome, Boolean situacao, int cartorioId, String mensagemErro) {
		super();
		this.id = id;
		this.nome = nome;
		this.situacao = situacao;
		this.cartorioId = cartorioId;
		this.mensagemErro = mensagemErro;
	}

	public AtribuicaoDTO() {

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

	public String getMensagemErro() {
		return mensagemErro;
	}

	public void setMensagemErro(String mensagemErro) {
		this.mensagemErro = mensagemErro;
	}
	
	public int getCartorioId() {
		return cartorioId;
	}

	public void setCartorioId(int cartorioId) {
		this.cartorioId = cartorioId;
	}


}
