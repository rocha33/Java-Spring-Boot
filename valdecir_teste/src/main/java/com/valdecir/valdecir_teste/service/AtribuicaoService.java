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
import com.valdecir.valdecir_teste.model.Atribuicao;
import com.valdecir.valdecir_teste.util.DuplicateNameException;

import jakarta.validation.Valid;

@Service
public class AtribuicaoService {

	@Autowired
	private AtribuicaoRepository atribuicaoRepository;

	@Autowired
	private AtribuicaoConvert atribuicaoConvert;
	
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

	public void deletarAtribuicao(String id) throws Exception {

		try {
			// Verifica se o registro pode ser excluído
			if (atribuicaoRepository.existsById(id)) {
				// Lógica para verificar integridade referencial
				// Se referenciado em outros lugares, lançar exceção
				// Exemplo: se há referências na tabela de outro registro, então:
				// if (outroRepository.existsBySituacaoId(id)) {
				// throw new IntegrityViolationException("Registro utilizado em outro
				// cadastro.");
				// }

				atribuicaoRepository.deleteById(id);
			} else {
				throw new Exception("Registro não encontrado.");
			}
		} catch (DataIntegrityViolationException e) {
			throw new Exception("Registro utilizado em outro cadastro.");
		}

	}

}
