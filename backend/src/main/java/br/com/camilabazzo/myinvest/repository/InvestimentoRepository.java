package br.com.camilabazzo.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.camilabazzo.myinvest.domain.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long>{

}
