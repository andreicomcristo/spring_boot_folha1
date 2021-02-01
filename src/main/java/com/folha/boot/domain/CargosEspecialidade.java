package com.folha.boot.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "cargos_especialidade")
public class CargosEspecialidade extends AbstractEntity<Long> {

	@Column(name = "nome_especialidade_cargo", nullable = false, length = 100)
	private String nomeEspecialidadeCargo;

	@Column(name = "descricao_especialidade_cargo", length = 300)
	private String descricaoEspecialidadeCargo;

	@JoinColumn(name = "id_cargo_fk", referencedColumnName = "id")
	@ManyToOne
	private Cargos idCargoFk;
}
