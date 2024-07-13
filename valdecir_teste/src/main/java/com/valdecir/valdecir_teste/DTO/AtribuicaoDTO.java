package com.valdecir.valdecir_teste.DTO;

public class AtribuicaoDTO {

	private String id;
	private String nome;
	private Boolean situacao = true;
	private String mensagemErro;

	public AtribuicaoDTO(String id, String nome, Boolean situacao, String mensagemErro) {
		super();
		this.id = id;
		this.nome = nome;
		this.situacao = situacao;
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

}
