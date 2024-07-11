package com.example.vendas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.vendas.entities.PessoaRepositorio;
import com.example.vendas.model.Pessoa;

@Service
public class PessoaService {

	@Autowired
	PessoaRepositorio pessoaRepositorio;

	public Page<Pessoa> obterPessoaPage(int page, int size) {

		Pageable pageAble = PageRequest.of(page, size);

		return pessoaRepositorio.findAll(pageAble);

	}

	public List<Pessoa> obterPessoaParteNome(String nome) {
		return pessoaRepositorio.findByNomeContaining(nome);
	}

	public Optional<Pessoa> obterpessoaId(int id) {
		return pessoaRepositorio.findById(id);
	}

	public Pessoa salvarPessoa(Pessoa pessoa) {
		if (pessoa.getNome().isEmpty()) {
			throw new IllegalArgumentException();
		}

		return pessoaRepositorio.save(pessoa);
	}

	public void deletarPessoa(int id) {
		pessoaRepositorio.deleteById(id);
	}

}
