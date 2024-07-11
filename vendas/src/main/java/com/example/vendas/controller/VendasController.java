package com.example.vendas.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.vendas.model.Venda;
import com.example.vendas.service.VendaService;

@RestController
@RequestMapping("api/venda")
public class VendasController {
	
	@Autowired
	VendaService vendaService;
	
	@PostMapping
	public Venda gerarVenda(Venda venda) {
		return vendaService.gerarVenda(venda);
	}
	
    @PutMapping
	public Venda atualizarVenda(Venda venda) {
		return vendaService.gerarVenda(venda);
	}
    
    @GetMapping
    public ResponseEntity<Page<Venda>> onterVendas(
    		 @RequestParam(defaultValue = "0") int page, 
    		 @RequestParam(defaultValue =  "50") int size){
    	
    	Page<Venda> vendas =  vendaService.obtervendas(page, size);
    	
    	if(vendas.isEmpty()) {
    		return ResponseEntity.noContent().build();
    	}
    	
    	return ResponseEntity.ok(vendas);
    }
    
    
    @GetMapping
    public ResponseEntity<List<Venda>> obterVendasPorData(@RequestParam Date dataIni, @RequestParam Date dataFim){
    	List<Venda> vendas =  vendaService.obterVendasDatas(dataIni, dataFim);
    	
    	if(vendas.isEmpty()) {
    		ResponseEntity.noContent().build();
    		
    	}
    	return ResponseEntity.ok(vendas);
    }
 	

}
