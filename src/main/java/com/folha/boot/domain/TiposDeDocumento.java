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

	public String getSiglaDocumento() {
		return siglaDocumento;
	}

	public void setSiglaDocumento(String siglaDocumento) {
		this.siglaDocumento = siglaDocumento;
	}

	public String getNomeDocumento() {
		return nomeDocumento;
	}

	public void setNomeDocumento(String nomeDocumento) {
		this.nomeDocumento = nomeDocumento;
	}

	public List<PessoaDocumentos> getPessoaDocumentosCollection() {
		return pessoaDocumentosCollection;
	}

	public void setPessoaDocumentosCollection(List<PessoaDocumentos> pessoaDocumentosCollection) {
		this.pessoaDocumentosCollection = pessoaDocumentosCollection;
	}

}
