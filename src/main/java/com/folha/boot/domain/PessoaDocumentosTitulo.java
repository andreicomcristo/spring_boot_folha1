package com.folha.boot.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "pessoa_documentos_titulo")
public class PessoaDocumentosTitulo extends AbstractEntity<Long> {

	@Column(name = "numero_titulo", nullable = false, length = 100)
    private String numeroTitulo;
    
	@Column(name = "zona", length = 100)
    private String zona;
    
	@Column(name = "secao", length = 100)
    private String secao;
    
	@JoinColumn(name = "id_cidade_fk", referencedColumnName = "id")
    @ManyToOne
    private Cidades idCidadeFk;
    
	@JoinColumn(name = "id_pessoa_fk", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private Pessoa idPessoaFk;
}
