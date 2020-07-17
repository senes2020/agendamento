package com.senes.back.agendamento.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senes.back.agendamento.model.Agendamento;
import com.senes.back.agendamento.repository.AgendamentoRepository;

@RestController
@RequestMapping(value="home")
public class AgendamentoResource {

	@Autowired
	AgendamentoRepository agendamentoRepository;
	
	@PostMapping("/agendamento/cadastro")
	public Agendamento efetuar(@RequestBody Agendamento agendamento) {
		Agendamento novoAgendamento = agendamentoRepository.save(agendamento);
		return novoAgendamento;
	}
	
	@GetMapping("/agendamento/lista/{companheiro}")
	public Agendamento getAgendamentoPorCompanheiro(@PathVariable Long companheiro){
		return agendamentoRepository.findAgendamentoPorIdCompanheiro(companheiro);
	}
	
}
