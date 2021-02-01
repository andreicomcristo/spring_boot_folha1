package com.folha.boot.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "estados_civis")
public class EstadosCivis extends AbstractEntity<Long> {

	@Column(name = "nome_estado_civil", nullable = false, length = 100)
	private String nomeEstadoCivil;

	@Column(name = "descricao_estado_civil", length = 300)
	private String descricaoEstadoCivil;

	@OneToMany(mappedBy = "seqEstadoCivil")
	private Collection<Pessoa> pessoaCollection;
}
