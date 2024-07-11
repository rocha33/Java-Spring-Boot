package com.example.vendas.entities;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.vendas.model.Pessoa;

public interface PessoaRepositorio extends JpaRepository<Pessoa, Integer> {
	
	public List<Pessoa> findByNomeContaining(String nome);

}
