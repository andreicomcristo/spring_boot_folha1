package com.folha.boot.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "pessoa_fotos")
public class PessoaFotos extends AbstractEntity<Long> {

	@Lob
	@Column(name = "fotografia")
	private byte[] fotografia;

	@JoinColumn(name = "id_pessoa_fk", referencedColumnName = "id", nullable = false)
	@ManyToOne(optional = false)
	private Pessoa idPessoaFk;

}
