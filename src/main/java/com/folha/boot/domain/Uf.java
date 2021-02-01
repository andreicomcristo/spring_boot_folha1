package com.folha.boot.domain;

import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "uf")
public class Uf extends AbstractEntity<Long> {

	@Column(name = "sigla_uf", nullable = false, length = 300)
	private String siglaUf;

	@Basic(optional = false)
	@Column(name = "nome_uf", nullable = false, length = 300)
	private String nomeUf;

	@OneToMany(mappedBy = "idUfFk")
	private List<PessoaDocumentosConselho> pessoaDocumentosConselhoCollection;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idUfFk")
	private List<Cidades> cidadesCollection;

	@OneToMany(mappedBy = "idUfEmissao")
	private List<PessoaDocumentosRg> pessoaDocumentosRgCollection;

}
