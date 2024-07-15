package com.valdecir.valdecir_teste.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valdecir.valdecir_teste.model.Situacao;

@Repository
public interface SituacaoRepository extends JpaRepository<Situacao, String>{	

}
