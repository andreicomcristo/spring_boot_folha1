package com.folha.boot.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "carga_horaria_semanal")
public class CargaHorariaSemanal extends AbstractEntity<Long> {

	@Column(name = "carga_horaria", nullable = false)
	private int cargaHoraria;

	@Column(name = "descricao_carga_horaria", length = 300)
	private String descricaoCargaHoraria;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idCargaHorariaSemanalFk")
	private Collection<HistFuncionariosCargaHoraria> histFuncionariosCargaHorariaCollection;

}
