package com.example.agenda.agenda.repositorio;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.example.agenda.agenda.model.Agenda;

public interface AgendaRepositorio extends CrudRepository<Agenda, Integer>,  PagingAndSortingRepository<Agenda, Integer> {	
	
	
	public Iterable<Agenda> findByDescricaoContaining(String descricao);
	
	@Query("Select a from Agenda a where a.descricao like %:descricao%")
	public Iterable<Agenda> searchByNameLike(@Param("descricao") String descricao);
	
	
	

}
