package com.senes.back.agendamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senes.back.agendamento.model.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long>{

}
