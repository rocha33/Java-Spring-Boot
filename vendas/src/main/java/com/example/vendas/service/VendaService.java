package com.example.vendas.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.vendas.entities.VendasRepositorio;
import com.example.vendas.model.Venda;

@Service
public class VendaService {
	
	@Autowired
	VendasRepositorio vendasRepositorio;
	
	public Venda gerarVenda(Venda venda) {
		return vendasRepositorio.save(venda);
	}
	
	public Page<Venda> obtervendas(int page, int size){
		Pageable pageAble = PageRequest.of(page, size);
		
		return vendasRepositorio.findAll(pageAble);
	}
	
	public List<Venda> obterVendasDatas(Date dataIni, Date dadaFim){
		return vendasRepositorio.obtervendasPorDatas(dataIni, dadaFim);
	}

}
