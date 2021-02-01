package com.folha.boot.domain;

import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "vinculos")
public class Vinculos extends AbstractEntity<Long> {

	@Column(name = "nome_vinculo", nullable = false, length = 100)
	private String nomeVinculo;

	@Column(name = "descricao_vinculo", length = 300)
	private String descricaoVinculo;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idVinculoFk")
	private List<HistFuncionariosVinculos> histFuncionariosVinculosCollection;

}
