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
import com.valdecir.valdecir_teste.DTO.SituacaoDTO;
import com.valdecir.valdecir_teste.service.SituacaoService;
import com.valdecir.valdecir_teste.util.DuplicateNameException;

@RestController
@RequestMapping("/api/situacoes")
public class SituacaoController {

	@Autowired
	private SituacaoService situacaoService;

	@PostMapping
	public ResponseEntity<SituacaoDTO> criarSituacao(SituacaoDTO situacaoDTO) {

		try {
			SituacaoDTO novaSituacao = situacaoService.salvarSituacao(situacaoDTO);
			return ResponseEntity.ok(novaSituacao);
		} catch (DuplicateNameException  e) {
			
			SituacaoDTO erroSituacao = new SituacaoDTO(); 
			erroSituacao.setMensagemErro(e.getMessage());  
	        return ResponseEntity.status(HttpStatus.CONFLICT).body(erroSituacao); 
		}

	}

	@PutMapping
	public ResponseEntity<SituacaoDTO> alterarSituacao(SituacaoDTO situacaoDTO) {
		SituacaoDTO novaSituacao = situacaoService.alterarSituacao(situacaoDTO);
		return ResponseEntity.ok(novaSituacao);
	}

	@GetMapping
	public ResponseEntity<Page<SituacaoDTO>> obterSituacaoPage(
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "10") int size) {

		Page<SituacaoDTO> situacao = situacaoService.obterSituacaoPage(page, size);

		if (situacao.isEmpty()) {
			return ResponseEntity.noContent().build();

		}
		return ResponseEntity.ok(situacao);
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<SituacaoDTO> obterPorId(@PathVariable String id) {
		
		SituacaoDTO situacao = situacaoService.obterPorId(id);
		return situacao != null ? ResponseEntity.ok(situacao) : ResponseEntity.notFound().build();	

	}

	@DeleteMapping(path = "/{id}")
	public void deletarSituacao(@PathVariable String id) {
		try {
			situacaoService.deletarSituacao(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
