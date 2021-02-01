package com.folha.boot.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "cargos")
public class Cargos extends AbstractEntity<Long> {

	@Column(name = "nome_cargo", length = 150)
	private String nomeCargo;

	@Column(name = "descricao_cargo", length = 300)
	private String descricaoCargo;

	@OneToMany(mappedBy = "idCargoFk")
	private Collection<CargosEspecialidade> cargosEspecialidadeCollection;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idCargoFk")
	private Collection<HistFuncionariosCargos> histFuncionariosCargosCollection;

	@JoinColumn(name = "id_nivel_cargo_fk", referencedColumnName = "id", nullable = false)
	@ManyToOne(optional = false)
	private NiveisCargo idNivelCargoFk;
}
