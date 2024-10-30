package com.formulario.concessionaria.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Vendedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	
	@Column(nullable = false)
	private long id;
	
	@Column(nullable = false)
	private int  localId;
	
	@NotBlank
	@Size(max = 150)
	private String Nome;
	
	@Enumerated(EnumType.STRING)
    private Sexo Sexo;
	
    private int IdadeAproximada;
    @Size(max = 50)
    private String CorDoCabelo;
    
	public Vendedor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vendedor(long id, int localId, String Nome, Sexo Sexo, int IdadeAproximada,
			String CorDoCabelo) {
		super();
		this.id = id;
		this.localId = localId;
		this.Nome = Nome;
		this.Sexo = Sexo;
		this.IdadeAproximada = IdadeAproximada;
		this.CorDoCabelo = CorDoCabelo;
	} 
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getlocalId() {
		return localId;
	}
	public void setlocalId(int localId) {
		this.localId = localId;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	public Sexo getSexo() {
		return Sexo;
	}
	public void setSexo(Sexo Sexo) {
		this.Sexo = Sexo;
	}
	public int getIdadeAproximada() {
		return IdadeAproximada;
	}
	public void setIdadeAproximada(int IdadeAproximada) {
		this.IdadeAproximada = IdadeAproximada;
	}
	public String getCorDoCabelo() {
		return CorDoCabelo;
	}
	public void setCorDoCabelo(String CorDoCabelo) {
		this.CorDoCabelo = CorDoCabelo;
	} 
    

}
