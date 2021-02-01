package com.folha.boot.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "conselhos")
public class Conselhos extends AbstractEntity<Long> {

	@Column(name = "nome_conselho", nullable = false, length = 100)
	private String nomeConselho;

	@Column(name = "descricao_conselho", length = 300)
	private String descricaoConselho;

	@OneToMany(mappedBy = "idConselhosFk")
	private Collection<PessoaDocumentosConselho> pessoaDocumentosConselhoCollection;

}
