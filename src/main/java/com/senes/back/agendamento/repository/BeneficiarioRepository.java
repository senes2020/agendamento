package com.senes.back.agendamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senes.back.agendamento.model.Beneficiario;

public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Long>{

	Beneficiario findById(long id);
	
}
