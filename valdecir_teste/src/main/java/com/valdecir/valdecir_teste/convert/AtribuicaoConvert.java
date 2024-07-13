package com.valdecir.valdecir_teste.convert;

import org.springframework.stereotype.Component;

import com.valdecir.valdecir_teste.DTO.AtribuicaoDTO;
import com.valdecir.valdecir_teste.model.Atribuicao;

@Component
public class AtribuicaoConvert {

	public AtribuicaoDTO toDTO(Atribuicao atribuicao) {

		AtribuicaoDTO dto = new AtribuicaoDTO();
		dto.setId(atribuicao.getId());
		dto.setNome(atribuicao.getNome());
		dto.setSituacao(atribuicao.getSituacao());
		return dto;
	}

	public Atribuicao toEntity(AtribuicaoDTO dto) {

		Atribuicao atribuicao = new Atribuicao();
		atribuicao.setId(dto.getId());
		atribuicao.setNome(dto.getNome());
		atribuicao.setSituacao(dto.getSituacao());
		return atribuicao;
	}

}
