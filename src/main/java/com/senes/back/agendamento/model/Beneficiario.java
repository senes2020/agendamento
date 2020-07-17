package com.senes.back.agendamento.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_beneficiario")
public class Beneficiario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_beneficiario;

	public long getId_beneficiario() {
		return id_beneficiario;
	}

	public void setId_beneficiario(long id_beneficiario) {
		this.id_beneficiario = id_beneficiario;
	}

	@Override
	public String toString() {
		return "Beneficiario [id_beneficiario=" + id_beneficiario + "]";
	}
	
}
