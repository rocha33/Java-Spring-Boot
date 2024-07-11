package com.example.vendas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.vendas.model.Produto;
import com.example.vendas.service.ProdutoService;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

	@Autowired
	ProdutoService produtoService;

	@PostMapping
	public Produto salvarProduto(Produto produto) {
		return produtoService.salvarProduto(produto);
	}

	@PutMapping
	public Produto atualizarProduto(Produto produto) {
		return produtoService.salvarProduto(produto);
	}

	@GetMapping
	public ResponseEntity<Page<Produto>> obtterProdutos(
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "50") int size) {	

		Page<Produto> produtos = produtoService.obterProdutoPage(page, size);

		if (produtos.isEmpty()) {
			ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(produtos);
	}

	/*@GetMapping
	public ResponseEntity<List<Produto>> obterProdutos() {
		List<Produto> produtos = produtoRepositorio.findAll();

		if (produtos.isEmpty()) {
			return ResponseEntity.noContent().build();

		}
		return ResponseEntity.ok(produtos);
	}*/

	@GetMapping(path = "/{id}")
	public ResponseEntity<Produto> obterPorId(@PathVariable int id) {
		Optional<Produto> produto =  produtoService.obterProdutoId(id);
		
		if (produto.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(produto.get());
	}

	@GetMapping(path = "/descricao/{descricao}")
	public ResponseEntity<List<Produto>> obterPorParteDescrcao(@PathVariable String descricao) {
		List<Produto> produtos = produtoService.obterProdutoDescricao(descricao);

		if (produtos.isEmpty()) {
			return ResponseEntity.noContent().build();

		}
		return ResponseEntity.ok(produtos);
	}

	@DeleteMapping(path = "{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoService.deletarProduto(id);
	}

}
