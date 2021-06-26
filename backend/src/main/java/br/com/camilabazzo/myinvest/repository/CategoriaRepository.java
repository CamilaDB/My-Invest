package br.com.camilabazzo.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.camilabazzo.myinvest.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	
}
