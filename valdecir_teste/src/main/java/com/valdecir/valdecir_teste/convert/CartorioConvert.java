package com.valdecir.valdecir_teste.convert;

import org.springframework.stereotype.Component;
import com.valdecir.valdecir_teste.DTO.AtribuicaoDTO;
import com.valdecir.valdecir_teste.DTO.CartorioDTO;
import com.valdecir.valdecir_teste.model.Atribuicao;
import com.valdecir.valdecir_teste.model.Cartorio;

@Component
public class CartorioConvert {
	

	public CartorioDTO toDTO(Cartorio cartorio) {

		CartorioDTO dto = new CartorioDTO();
		dto.setId(cartorio.getId());
		dto.setNome(cartorio.getNome());
		dto.setObservacao(cartorio.getObservacao());
		dto.setSituacao(cartorio.getSituacao());
		dto.setAtribuicoes(cartorio.getAtribuicoes().stream().map(this::toDTO).toList());
		return dto;
	}

	public Cartorio toEntity(CartorioDTO dto) {
		Cartorio cartorio = new Cartorio();
		cartorio.setId(dto.getId());
		cartorio.setNome(dto.getNome());
		cartorio.setObservacao(dto.getObservacao());
		cartorio.setSituacao(dto.getSituacao());
		 cartorio.setAtribuicoes(dto.getAtribuicoes().stream().map(this::toEntity).toList());
		return cartorio;
	}
	
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
