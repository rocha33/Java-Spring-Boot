package com.valdecir.valdecir_teste.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.valdecir.valdecir_teste.model.Cartorio;

public interface CartorioRepository extends JpaRepository<Cartorio, Integer> {

	@Query("select count(c) > 0 from Cartorio c where c.situacao = :situacao")
	boolean ExisteCartorioSituacao(@Param("situacao") String situacao);	
	
	
	@Query("SELECT CASE WHEN COUNT(c) > 0 THEN true ELSE false END FROM Cartorio c WHERE c.situacao = :situacao")
    boolean ExisteCartorioAtribuicao(@Param("situacao") String situacao);

	@Query(value = "SELECT c.id FROM Cartorio c ORDER BY id DESC LIMIT 1", nativeQuery = true)
	int findLastInsertedId();

}
