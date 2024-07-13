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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.valdecir.valdecir_teste.DTO.AtribuicaoDTO;
import com.valdecir.valdecir_teste.service.AtribuicaoService;
import com.valdecir.valdecir_teste.util.DuplicateNameException;

@RestController
@RequestMapping("api/atribuicoes")
public class AtribuicaoController {

	@Autowired
	private AtribuicaoService atribuicaoService;

	@PostMapping
	public ResponseEntity<AtribuicaoDTO> criarAtribuicao(AtribuicaoDTO atribuicaoDto) {

		try {
			AtribuicaoDTO novaAtribuicao = atribuicaoService.salvarAtribuicao(atribuicaoDto);
			return ResponseEntity.ok(novaAtribuicao);
		} catch (DuplicateNameException e) {

			AtribuicaoDTO erroAtribuicao = new AtribuicaoDTO();
			erroAtribuicao.setMensagemErro(e.getMessage());
			return ResponseEntity.status(HttpStatus.CONFLICT).body(erroAtribuicao);
		}

	}

	@PutMapping
	public ResponseEntity<AtribuicaoDTO> alterarAtribuicao(AtribuicaoDTO atribuicaoDto) {
		AtribuicaoDTO novaAtribuicao = atribuicaoService.alterarAtribuicao(atribuicaoDto);
		return ResponseEntity.ok(novaAtribuicao);
	}
	
	@GetMapping
	public ResponseEntity<Page<AtribuicaoDTO>> obterAtribuicaoPage(
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "10") int size) {

		Page<AtribuicaoDTO> situacao = atribuicaoService.obterAtribuicaoPage(page, size);

		if (situacao.isEmpty()) {
			return ResponseEntity.noContent().build();

		}
		return ResponseEntity.ok(situacao);
	}
	

	@GetMapping("/{id}")
	public ResponseEntity<AtribuicaoDTO> buscarAtribuicao(@PathVariable String id) {
		AtribuicaoDTO atribuicao = atribuicaoService.buscarPorId(id);
		return atribuicao != null ? ResponseEntity.ok(atribuicao) : ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{id}")
	public void deletarAtribuicao(@PathVariable String id) {

		try {
			atribuicaoService.deletarAtribuicao(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
