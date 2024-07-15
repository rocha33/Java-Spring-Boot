package com.valdecir.valdecir_teste.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.valdecir.valdecir_teste.DTO.AtribuicaoDTO;
import com.valdecir.valdecir_teste.DTO.CartorioDTO;
import com.valdecir.valdecir_teste.convert.AtribuicaoConvert;
import com.valdecir.valdecir_teste.convert.CartorioConvert;
import com.valdecir.valdecir_teste.entity.AtribuicaoRepository;
import com.valdecir.valdecir_teste.entity.CartorioRepository;
import com.valdecir.valdecir_teste.model.Atribuicao;
import com.valdecir.valdecir_teste.model.Cartorio;
import com.valdecir.valdecir_teste.util.DuplicateNameException;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CartorioService {

	@Autowired
	private CartorioRepository cartorioRepository;

	@Autowired
	private CartorioConvert cartorioConvert;

	@Autowired
	private AtribuicaoRepository atribuicaoRepository;

	@Transactional
	public CartorioDTO salvarCartorio(CartorioDTO cartorioDTO) {

		if (cartorioRepository.existsById(cartorioDTO.getId())) {
			CartorioDTO existing = cartorioRepository.findById(cartorioDTO.getId()).map(cartorioConvert::toDTO)
					.orElse(null);
			throw new DuplicateNameException("Id já informado no registro com código " + existing.getId() + ".");
		}

		Cartorio cartorio = cartorioConvert.toEntity(cartorioDTO);
		Cartorio cartorioSalva = cartorioRepository.save(cartorio);

		for (Atribuicao atrib : cartorioSalva.getAtribuicoes()) {
			AtribuicaoDTO atribuicaoDTO = new AtribuicaoDTO();
			atribuicaoDTO.setId(atrib.getId());
			atribuicaoDTO.setNome(atrib.getNome());
			atribuicaoDTO.setSituacao(atrib.getSituacao());
			atribuicaoDTO.setCartorioId(cartorioSalva.getId());

			cartorioConvert.toDTO(cartorioSalva);

			Atribuicao atribuicao = cartorioConvert.toEntity(atribuicaoDTO);
			atribuicaoRepository.save(atribuicao);
		}

		return cartorioConvert.toDTO(cartorioSalva);
	}

	public CartorioDTO alterarCartorio(CartorioDTO cartorioDTO) {

		Cartorio cartorio = cartorioConvert.toEntity(cartorioDTO);
		Cartorio cartorioSalva = cartorioRepository.save(cartorio);
		return cartorioConvert.toDTO(cartorioSalva);
	}

	public CartorioDTO obterPorId(int id) {

		return cartorioRepository.findById(id).map(cartorioConvert::toDTO).orElse(null);
	}

	public Page<CartorioDTO> obterCartorioPage(int page, int size) {

		Pageable pageable = PageRequest.of(page, size);
		Page<Cartorio> cartorioPage = cartorioRepository.findAllWithAtribuicoes(pageable);
		return cartorioPage.map(cartorioConvert::toDTO);	

	}

	public void deletarCartorio(int id) throws Exception {

		if (cartorioRepository.existsById(id)) {
			cartorioRepository.deleteById(id);
		} else {
			throw new Exception("Registro não encontrado.");
		}

	}

}
