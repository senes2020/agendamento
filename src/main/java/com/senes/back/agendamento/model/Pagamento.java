package com.senes.back.agendamento.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_pagamento")
public class Pagamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_pagamento;

	public long getId_pagamento() {
		return id_pagamento;
	}

	public void setId_pagamento(long id_pagamento) {
		this.id_pagamento = id_pagamento;
	}

	@Override
	public String toString() {
		return "Pagamento [id_pagamento=" + id_pagamento + "]";
	}
	
}
