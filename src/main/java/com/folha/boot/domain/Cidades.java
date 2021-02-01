package com.folha.boot.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "cidades")
public class Cidades extends AbstractEntity<Long> {

	@Column(name = "nome_cidade", nullable = false, length = 150)
	private String nomeCidade;

	@JoinColumn(name = "id_pais_fk", referencedColumnName = "id", nullable = false)
	@ManyToOne(optional = false)
	private Paises idPaisFk;

	@JoinColumn(name = "id_uf_fk", referencedColumnName = "id", nullable = false)
	@ManyToOne(optional = false)
	private Uf idUfFk;

	@OneToMany(mappedBy = "idEnderecoCidadeFk")
	private Collection<Enderecos> enderecosCollection;

	@OneToMany(mappedBy = "idEnderecoCidadeFk")
	private Collection<Unidades> unidadesCollection;

	@OneToMany(mappedBy = "seqCidadeNatal")
	private Collection<Pessoa> pessoaCollection;

	@OneToMany(mappedBy = "idCidadeFk")
	private Collection<PessoaDocumentosTitulo> pessoaDocumentosTituloCollection;

}
