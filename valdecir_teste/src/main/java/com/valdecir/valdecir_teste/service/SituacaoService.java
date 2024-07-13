package com.valdecir.valdecir_teste.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.valdecir.valdecir_teste.DTO.SituacaoDTO;
import com.valdecir.valdecir_teste.convert.SituacaoConvert;
import com.valdecir.valdecir_teste.entity.SituacaoRepository;
import com.valdecir.valdecir_teste.model.Situacao;
import com.valdecir.valdecir_teste.util.DuplicateNameException;

@Service
public class SituacaoService {

	@Autowired
	private SituacaoRepository situacaoRepository;

	@Autowired
	private SituacaoConvert situacaoConvert;

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

	public void deletarSituacao(String id) throws Exception {

		try {
			// Verifica se o registro pode ser excluído
			if (situacaoRepository.existsById(id)) {
				// Lógica para verificar integridade referencial
				// Se referenciado em outros lugares, lançar exceção
				// Exemplo: se há referências na tabela de outro registro, então:
				// if (outroRepository.existsBySituacaoId(id)) {
				// throw new IntegrityViolationException("Registro utilizado em outro
				// cadastro.");
				// }

				situacaoRepository.deleteById(id);
			} else {
				throw new Exception("Registro não encontrado.");
			}
		} catch (DataIntegrityViolationException e) {
			throw new Exception("Registro utilizado em outro cadastro.");
		}
	}

}