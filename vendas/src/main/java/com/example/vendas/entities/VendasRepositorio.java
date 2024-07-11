package com.example.vendas.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.vendas.model.Venda;

@Repository
public interface VendasRepositorio extends JpaRepository<Venda, Integer> {
   
	@Query("Select v from Venda v where v.data between :dataIni and :dataFim")
	public List<Venda> obtervendasPorDatas(@Param("dataIni") Date dataIni, @Param(":dataFim") java.util.Date dadaFim);
		

	
}
