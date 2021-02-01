package com.folha.boot.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "pessoa_documentos")
public class PessoaDocumentos extends AbstractEntity<Long> {

	@Column(name = "numero_documento", length = 100)
	private String numeroDocumento;

	@JoinColumn(name = "id_pessoa_fk", referencedColumnName = "id")
	@ManyToOne
	private Pessoa idPessoaFk;

	@JoinColumn(name = "id_tipos_de_documento_fk", referencedColumnName = "id")
	@ManyToOne
	private TiposDeDocumento idTiposDeDocumentoFk;

}
