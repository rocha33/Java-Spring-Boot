package com.example.vendas.entities;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.example.vendas.model.Produto;


public interface ProdutoRepositorio extends JpaRepository<Produto, Integer> {
	
	public List<Produto> findByDescricaoContaining(String descricao);

}
