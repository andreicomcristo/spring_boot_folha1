package com.folha.boot.domain;

import java.util.Date;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "pessoa_documentos_conselho")
public class PessoaDocumentosConselho extends AbstractEntity<Long> {
	@Column(name = "numero_conselho", nullable = false, length = 100)
    private String numeroConselho;
    @Column(name = "dt_emissao")
    @Temporal(TemporalType.DATE)
	private Date dtEmissao;
    @Column(name = "dt_validade")
    @Temporal(TemporalType.DATE)
    private Date dtValidade;
    @JoinColumn(name = "id_conselhos_fk", referencedColumnName = "id")
    @ManyToOne
    private Conselhos idConselhosFk;
    @JoinColumn(name = "id_pessoa_fk", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private Pessoa idPessoaFk;
    @JoinColumn(name = "id_uf_fk", referencedColumnName = "id")
    @ManyToOne
    private Uf idUfFk;

	
}
