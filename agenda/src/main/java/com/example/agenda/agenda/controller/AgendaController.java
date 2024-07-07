package com.example.agenda.agenda.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.agenda.agenda.model.Agenda;
import com.example.agenda.agenda.repositorio.AgendaRepositorio;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/agenda")
public class AgendaController {
	
	@Autowired
	private AgendaRepositorio agendaRepositorio;
	
	@RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT})
	public Agenda salvarAgenda(@Valid Agenda agenda) {
		return agendaRepositorio.save(agenda);
	}	
	
	@GetMapping(path = "/descricao/{parteDescricao}")
	public Iterable<Agenda> obterPorDescricao(@PathVariable String parteDescricao){
		return agendaRepositorio.searchByNameLike(parteDescricao);
	}
	
	
	@GetMapping(path = "/{id}")
	public Optional<Agenda> obterPorId(@PathVariable int id){
		return agendaRepositorio.findById(id);
	}
	
	
	@GetMapping
	public Iterable<Agenda> obterAgenda() {
		return agendaRepositorio.findAll();
	}
	
	@DeleteMapping(path =  "/{id}")
	public void ExcluirItem(@PathVariable int id) {
		agendaRepositorio.deleteById(id);
		
	}

	
	
}
