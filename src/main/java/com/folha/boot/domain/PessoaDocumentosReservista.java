package com.folha.boot.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "pessoa_documentos_reservista")
public class PessoaDocumentosReservista extends AbstractEntity<Long> {

	@Column(name = "numero", length = 100)
	private String numero;

	@Column(name = "serie", length = 100)
	private String serie;

	@JoinColumn(name = "id_pessoa_fk", referencedColumnName = "id", nullable = false)
	@ManyToOne(optional = false)
	private Pessoa idPessoaFk;

}
