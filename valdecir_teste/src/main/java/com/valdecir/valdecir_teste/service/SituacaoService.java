package com.valdecir.valdecir_teste.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.valdecir.valdecir_teste.DTO.SituacaoDTO;
import com.valdecir.valdecir_teste.convert.CartorioConvert;
import com.valdecir.valdecir_teste.convert.SituacaoConvert;
import com.valdecir.valdecir_teste.entity.CartorioRepository;
import com.valdecir.valdecir_teste.entity.SituacaoRepository;
import com.valdecir.valdecir_teste.model.Situacao;
import com.valdecir.valdecir_teste.util.DuplicateNameException;
import com.valdecir.valdecir_teste.util.IntegrityViolationException;

@Service
public class SituacaoService {

	@Autowired
	private SituacaoRepository situacaoRepository;

	@Autowired
	private SituacaoConvert situacaoConvert;

	@Autowired
	private CartorioRepository cartorioRepositorio;

	public Page<SituacaoDTO> obterSituacaoPage(int page, int size) {

		Pageable pageAble = PageRequest.of(page, size);
		return situacaoRepository.findAll(pageAble).map(situacaoConvert::toDTO);

	}

	public SituacaoDTO obterPorId(String id) {

		return situacaoRepository.findById(id).map(situacaoConvert::toDTO).orElse(null);
	}

	public SituacaoDTO salvarSituacao(SituacaoDTO situacaoDTO) {

		if (situacaoRepository.existsById(situacaoDTO.getId())) {
			SituacaoDTO existing = situacaoRepository.findById(situacaoDTO.getId()).map(situacaoConvert::toDTO)
					.orElse(null);
			throw new DuplicateNameException("Nome já informado no registro com código " + existing.getId() + ".");
		}

		Situacao situacao = situacaoConvert.toEntity(situacaoDTO);
		Situacao situacaoSalva = situacaoRepository.save(situacao);
		return situacaoConvert.toDTO(situacaoSalva);
	}

	public SituacaoDTO alterarSituacao(SituacaoDTO situacaoDTO) {

		Situacao situacao = situacaoConvert.toEntity(situacaoDTO);
		Situacao situacaoSalva = situacaoRepository.save(situacao);
		return situacaoConvert.toDTO(situacaoSalva);
	}

	public String deletarSituacao(String id) throws Exception {

		try {

			if (situacaoRepository.existsById(id)) {

				// verifica referencia
				if (cartorioRepositorio.ExisteCartorioSituacao(id)) {
					return "Registro vinculado na tabela cartório. Não pode ser deletado!";

				}

				situacaoRepository.deleteById(id);

				return "deletado com sucesso";
			} else {
				return "Registro não encontrado.";
			}
		} catch (DataIntegrityViolationException e) {
			return "Registro utilizado em outro cadastro.";
		}
	}

}
