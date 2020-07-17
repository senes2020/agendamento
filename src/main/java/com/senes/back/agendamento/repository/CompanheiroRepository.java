package com.senes.back.agendamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senes.back.agendamento.model.Companheiro;

public interface CompanheiroRepository extends JpaRepository<Companheiro, Long>{

	Companheiro findById(long id);
	
}
