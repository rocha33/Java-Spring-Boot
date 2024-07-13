package com.valdecir.valdecir_teste.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valdecir.valdecir_teste.model.Atribuicao;

@Repository
public interface AtribuicaoRepository extends JpaRepository<Atribuicao, String> {

}
