package com.example.vendas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.vendas.entities.ProdutoRepositorio;
import com.example.vendas.model.Produto;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepositorio produtoRepositorio;

	public Produto salvarProduto(Produto produto) {
		return produtoRepositorio.save(produto);
	}

	public Page<Produto> obterProdutoPage(int page, int size) {

		Pageable pageable = PageRequest.of(page, size);

		return produtoRepositorio.findAll(pageable);

	}

	public List<Produto> obterProdutoDescricao(String descricao) {
		return produtoRepositorio.findByDescricaoContaining(descricao);
	}

	public Optional<Produto> obterProdutoId(int id) {
		return produtoRepositorio.findById(id);
	}

	public void deletarProduto(int id) {
		produtoRepositorio.deleteById(id);
	}

}
