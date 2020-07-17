package com.senes.back.agendamento.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_companheiro")
public class Companheiro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_companheiro;

	public long getId_companheiro() {
		return id_companheiro;
	}

	public void setId_companheiro(long id_companheiro) {
		this.id_companheiro = id_companheiro;
	}

	@Override
	public String toString() {
		return "Companheiro [id_companheiro=" + id_companheiro + "]";
	}
	
}
