package com.valdecir.valdecir_teste.convert;

import org.springframework.stereotype.Component;

import com.valdecir.valdecir_teste.DTO.SituacaoDTO;
import com.valdecir.valdecir_teste.model.Situacao;

@Component
public class SituacaoConvert {
	
	public SituacaoDTO toDTO(Situacao situacao) {
        SituacaoDTO dto = new SituacaoDTO();
        dto.setId(situacao.getId());
        dto.setNome(situacao.getNome());
        return dto;
    }

    public Situacao toEntity(SituacaoDTO dto) {
        Situacao situacao = new Situacao();
        situacao.setId(dto.getId());
        situacao.setNome(dto.getNome());
        return situacao;
    }

}
