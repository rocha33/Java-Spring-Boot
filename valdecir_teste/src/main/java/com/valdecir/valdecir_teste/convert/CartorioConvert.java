package com.valdecir.valdecir_teste.convert;

import java.util.List;
import java.util.stream.Collectors;

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

		if (cartorio.getAtribuicoes() != null) {
			List<AtribuicaoDTO> atribuicoes = cartorio.getAtribuicoes().stream().map(this::toDTO)
					.collect(Collectors.toList());
			dto.setAtribuicoes(atribuicoes);
		}

		return dto;
	}

	public Cartorio toEntity(CartorioDTO dto) {
		Cartorio cartorio = new Cartorio();
		cartorio.setId(dto.getId());
		cartorio.setNome(dto.getNome());
		cartorio.setObservacao(dto.getObservacao());
		cartorio.setSituacao(dto.getSituacao());

		if (dto.getAtribuicoes() != null) {
			List<Atribuicao> atribuicoes = dto.getAtribuicoes().stream().map(this::toEntity)
					.collect(Collectors.toList());
			cartorio.setAtribuicoes(atribuicoes);
		}

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
