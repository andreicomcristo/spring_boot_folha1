package com.folha.boot.domain;

import java.util.Date;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "pessoa_documentos_rg")
public class PessoaDocumentosRg extends AbstractEntity<Long> {

	@Column(name = "rg_numero", nullable = false, length = 100)
	private String rgNumero;

	@Column(name = "rg_orgao_emissor", length = 100)
	private String rgOrgaoEmissor;

	@Column(name = "dt_emissao")
	@Temporal(TemporalType.DATE)
	private Date dtEmissao;

	@Column(name = "id_pessoa_fk", nullable = false)
	private long idPessoaFk;

	@JoinColumn(name = "id_uf_emissao", referencedColumnName = "id")
	@ManyToOne
	private Uf idUfEmissao;
}
