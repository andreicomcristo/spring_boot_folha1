package com.folha.boot.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "escolaridades")
public class Escolaridades extends AbstractEntity<Long> {

	@Column(name = "nome_escolaridade", nullable = false, length = 100)
	private String nomeEscolaridade;

	@Column(name = "descricao_escolaridade", length = 300)
	private String descricaoEscolaridade;

	@OneToMany(mappedBy = "seqEscolaridade")
	private Collection<Pessoa> pessoaCollection;
}
