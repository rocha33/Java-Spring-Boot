package com.valdecir.valdecir_teste.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.valdecir.valdecir_teste.DTO.AtribuicaoDTO;
import com.valdecir.valdecir_teste.convert.AtribuicaoConvert;
import com.valdecir.valdecir_teste.entity.AtribuicaoRepository;
import com.valdecir.valdecir_teste.entity.CartorioRepository;
import com.valdecir.valdecir_teste.entity.SituacaoRepository;
import com.valdecir.valdecir_teste.model.Atribuicao;
import com.valdecir.valdecir_teste.util.DuplicateNameException;
import com.valdecir.valdecir_teste.util.ShowMensagm;
import com.valdecir.valdecir_teste.util.IntegrityViolationException;

import jakarta.validation.Valid;

@Service
public class AtribuicaoService {

	@Autowired
	private AtribuicaoRepository atribuicaoRepository;

	@Autowired
	private AtribuicaoConvert atribuicaoConvert;

	@Autowired
	private SituacaoRepository situacaoRepository;

	@Autowired
	private CartorioRepository cartorioRepositorio;

	public Page<AtribuicaoDTO> obterAtribuicaoPage(int page, int size) {

		Pageable pageAble = PageRequest.of(page, size);
		return atribuicaoRepository.findAll(pageAble).map(atribuicaoConvert::toDTO);

	}

	public AtribuicaoDTO salvarAtribuicao(@Valid AtribuicaoDTO atribuicaoDto) {

		if (atribuicaoRepository.existsById(atribuicaoDto.getId())) {
			AtribuicaoDTO existing = atribuicaoRepository.findById(atribuicaoDto.getId()).map(atribuicaoConvert::toDTO)
					.orElse(null);
			throw new DuplicateNameException("Nome já informado no registro com código " + existing.getId() + ".");
		}

		Atribuicao atribuicao = atribuicaoConvert.toEntity(atribuicaoDto);
		Atribuicao situacaoSalva = atribuicaoRepository.save(atribuicao);
		return atribuicaoConvert.toDTO(situacaoSalva);

	}

	public AtribuicaoDTO alterarAtribuicao(@Valid AtribuicaoDTO atribuicaoDto) {

		Atribuicao atribuicao = atribuicaoConvert.toEntity(atribuicaoDto);
		Atribuicao situacaoSalva = atribuicaoRepository.save(atribuicao);
		return atribuicaoConvert.toDTO(situacaoSalva);

	}

	public AtribuicaoDTO buscarPorId(String id) {

		return atribuicaoRepository.findById(id).map(atribuicaoConvert::toDTO).orElse(null);
	}

	public ShowMensagm deletarAtribuicao(String id) throws Exception {

		ShowMensagm mensagem = new ShowMensagm();
		try {
			// Verifica se o registro pode ser excluído
			if (atribuicaoRepository.existsById(id)) {

				// verifica referencia
				if (cartorioRepositorio.ExisteCartorioAtribuicao(id)) {
					mensagem.setMensagem("Registro vinculado na tabela cartório. Não pode ser deletado!");			
					return mensagem;

				}

				atribuicaoRepository.deleteById(id);
				mensagem.setMensagem("Excluido com sucesso");
				
			} else {
				mensagem.setMensagem("Registro não encontrado.");
			}
		} catch (DataIntegrityViolationException e) {
			mensagem.setMensagem("Registro utilizado em outro cadastro.");
		}
		return mensagem;

	}

}
