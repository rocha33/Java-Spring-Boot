package com.valdecir.valdecir_teste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.valdecir.valdecir_teste.DTO.CartorioDTO;
import com.valdecir.valdecir_teste.service.CartorioService;
import com.valdecir.valdecir_teste.util.DuplicateNameException;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/cartorios")
public class CartorioController {
	
	
	@Autowired
	private CartorioService cartorioService;
	
	@PostMapping
	public ResponseEntity<CartorioDTO> salvarCartorio(@Valid @RequestBody CartorioDTO cartorioDTO) {

		try {
			CartorioDTO novoCartorio = cartorioService.salvarCartorio(cartorioDTO);
			
			
			return ResponseEntity.ok(novoCartorio);
		} catch (DuplicateNameException  e) {
			
			CartorioDTO erroSituacao = new CartorioDTO(); 
			erroSituacao.setMensagemErro(e.getMessage());  
	        return ResponseEntity.status(HttpStatus.CONFLICT).body(erroSituacao); 
		}

	}
	
	@PutMapping
	public ResponseEntity<CartorioDTO> alterarCartorio(@Valid @RequestBody CartorioDTO cartorioDTO) {
		CartorioDTO novoCartorio = cartorioService.alterarCartorio(cartorioDTO);
		return ResponseEntity.ok(novoCartorio);
	}
	
	@GetMapping
	public ResponseEntity<Page<CartorioDTO>> obterSituacaoPage(
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "10") int size) {

		Page<CartorioDTO> situacao = cartorioService.obterCartorioPage(page, size);

		if (situacao.isEmpty()) {
			return ResponseEntity.noContent().build();

		}
		return ResponseEntity.ok(situacao);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<CartorioDTO> obterPorId(@PathVariable int id) {
		
		CartorioDTO cartorio = cartorioService.obterPorId(id);
		return cartorio != null ? ResponseEntity.ok(cartorio) : ResponseEntity.notFound().build();	

	}

	@DeleteMapping(path = "/{id}")
	public void deletarCartorio(@PathVariable int id) {
		try {
			cartorioService.deletarCartorio(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
