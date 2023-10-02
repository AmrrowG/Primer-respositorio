package com.codingdojo.amaro.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.amaro.modelos.Cancion;

@Repository
public interface Repositorio extends CrudRepository<Cancion, Long>{
	List<Cancion> findAll();

	List<Cancion> findTop10ByOrderByRatingAsc();

	List<Cancion> findByArtistaContaining(String palabra);
	
}