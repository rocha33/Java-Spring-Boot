package com.valdecir.valdecir_teste.DTO;

public class SituacaoDTO {
	
	private String id;
    private String nome;
    private String mensagemErro;   

	public SituacaoDTO(String id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
    
    public SituacaoDTO () {
    	
    }

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
    
    
    public String getMensagemErro() {
		return mensagemErro;
	}

	public void setMensagemErro(String mensagemErro) {
		this.mensagemErro = mensagemErro;
	}

}
