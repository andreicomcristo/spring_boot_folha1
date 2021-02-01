package com.folha.boot.domain;

import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "tipos_de_documento")
public class TiposDeDocumento extends AbstractEntity<Long> {

	@Column(name = "sigla_documento", length = 300)
	private String siglaDocumento;

	@Column(name = "nome_documento", length = 300)
	private String nomeDocumento;

	@OneToMany(mappedBy = "idTiposDeDocumentoFk")
	private List<PessoaDocumentos> pessoaDocumentosCollection;

}
