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
import com.example.vendas.model.Pessoa;
import com.example.vendas.service.PessoaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {	
	
	@Autowired
	private PessoaService pessoaSevice;
	
	@PostMapping
	public Pessoa salvarPessoa(@Valid Pessoa pessoa) {
		return pessoaSevice.salvarPessoa(pessoa);
	}
	
	@PutMapping
	public Pessoa atualizarPessoa(@Valid Pessoa pessoa) {
		return pessoaSevice.salvarPessoa(pessoa);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Pessoa> obterPessoaId(@PathVariable int id){
		Optional<Pessoa> pessoas = pessoaSevice.obterpessoaId(id);
		
		if (pessoas.isEmpty()) {
			return ResponseEntity.noContent().build();			
		}
		
		return ResponseEntity.ok(pessoas.get());
				
	}
	
	@GetMapping(path = "/nome/{nome}")
	public ResponseEntity<List<Pessoa>> obterPorParteNome(@PathVariable String nome){
	  List<Pessoa> pessoas = pessoaSevice.obterPessoaParteNome(nome);
	  
	  if (pessoas.isEmpty()) {
		  return ResponseEntity.noContent().build();
	  }
	  return ResponseEntity.ok(pessoas);
	}	

	
	@GetMapping
	public ResponseEntity<Page<Pessoa>> obterPessoas(
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "50") int size){	
		
		Page<Pessoa> pessoas = pessoaSevice.obterPessoaPage(page, size);
		
		if(pessoas.isEmpty()) {
			return ResponseEntity.noContent().build();
			
		}
		return ResponseEntity.ok(pessoas);
	}
	
	
	@DeleteMapping(path = "/{id}")
	public void deletarPessoa(@PathVariable int id) {
		pessoaSevice.deletarPessoa(id);
	}

}
