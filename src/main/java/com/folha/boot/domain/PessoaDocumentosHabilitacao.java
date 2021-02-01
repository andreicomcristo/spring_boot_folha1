package com.folha.boot.domain;

import java.util.Date;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "pessoa_documentos_habilitacao")
public class PessoaDocumentosHabilitacao extends AbstractEntity<Long> {

	@Column(name = "numero_registro", nullable = false, length = 100)
	private String numeroRegistro;

	@Column(name = "dt_emissao")
	@Temporal(TemporalType.DATE)
	private Date dtEmissao;

	@Column(name = "dt_validade")
	@Temporal(TemporalType.DATE)
	private Date dtValidade;

	@Column(name = "dt_primeira_habilitacao")
	@Temporal(TemporalType.DATE)
	private Date dtPrimeiraHabilitacao;

	@JoinColumn(name = "id_habilitacao_categorias_fk", referencedColumnName = "id")
	@ManyToOne
	private HabilitacaoCategorias idHabilitacaoCategoriasFk;

	@JoinColumn(name = "id_pessoa_fk", referencedColumnName = "id")
	@ManyToOne
	private Pessoa idPessoaFk;

}
