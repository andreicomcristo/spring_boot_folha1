package com.folha.boot.domain;

import java.util.List;

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
	private List<Enderecos> enderecosCollection;

	@OneToMany(mappedBy = "idEnderecoCidadeFk")
	private List<Unidades> unidadesCollection;

	@OneToMany(mappedBy = "seqCidadeNatal")
	private List<Pessoa> pessoaCollection;

	@OneToMany(mappedBy = "idCidadeFk")
	private List<PessoaDocumentosTitulo> pessoaDocumentosTituloCollection;

}
