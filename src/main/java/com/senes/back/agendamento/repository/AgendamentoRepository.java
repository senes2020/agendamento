package com.senes.back.agendamento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.senes.back.agendamento.model.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long>{

	Agendamento findById(long id);
	
	@Query(value="SELECT a FROM Agendamento a "
			+ "INNER JOIN a.companheiro comp WHERE comp.id_companheiro =:companheiro")
	Agendamento findAgendamentoPorIdCompanheiro(Long companheiro);
}
