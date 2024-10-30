package com.formulario.concessionaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Local {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	private String localNome;
	
	private String descricaoEstacionamento;
    private int facilidadeEstacionamento;
    private String condicoesExternasPredio;
    private String condicoesInternasPredio;
    private String condicoesExternasTerreno;    
    
	
	public Local(int id, String localNome, String descricaoEstacionamento, int facilidadeEstacionamento,
			String condicoesExternasPredio, String condicoesInternasPredio, String condicoesExternasTerreno) {
		super();
		this.id = id;
		this.localNome = localNome;
		this.descricaoEstacionamento = descricaoEstacionamento;
		this.facilidadeEstacionamento = facilidadeEstacionamento;
		this.condicoesExternasPredio = condicoesExternasPredio;
		this.condicoesInternasPredio = condicoesInternasPredio;
		this.condicoesExternasTerreno = condicoesExternasTerreno;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocalNome() {
		return localNome;
	}
	public void setLocalNome(String localNome) {
		this.localNome = localNome;
	}
	public String getDescricaoEstacionamento() {
		return descricaoEstacionamento;
	}
	public void setDescricaoEstacionamento(String descricaoEstacionamento) {
		this.descricaoEstacionamento = descricaoEstacionamento;
	}
	public int getFacilidadeEstacionamento() {
		return facilidadeEstacionamento;
	}
	public void setFacilidadeEstacionamento(int facilidadeEstacionamento) {
		this.facilidadeEstacionamento = facilidadeEstacionamento;
	}
	public String getCondicoesExternasPredio() {
		return condicoesExternasPredio;
	}
	public void setCondicoesExternasPredio(String condicoesExternasPredio) {
		this.condicoesExternasPredio = condicoesExternasPredio;
	}
	public String getCondicoesInternasPredio() {
		return condicoesInternasPredio;
	}
	public void setCondicoesInternasPredio(String condicoesInternasPredio) {
		this.condicoesInternasPredio = condicoesInternasPredio;
	}
	public String getCondicoesExternasTerreno() {
		return condicoesExternasTerreno;
	}
	public void setCondicoesExternasTerreno(String condicoesExternasTerreno) {
		this.condicoesExternasTerreno = condicoesExternasTerreno;
	}
	
    
}
