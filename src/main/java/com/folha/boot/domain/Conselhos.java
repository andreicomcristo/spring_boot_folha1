package com.folha.boot.domain;

import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "conselhos")
public class Conselhos extends AbstractEntity<Long> {

	@Column(name = "nome_conselho", nullable = false, length = 100)
	private String nomeConselho;

	@Column(name = "descricao_conselho", length = 300)
	private String descricaoConselho;

	@OneToMany(mappedBy = "idConselhosFk")
	private List<PessoaDocumentosConselho> pessoaDocumentosConselhoCollection;

	public String getNomeConselho() {
		return nomeConselho;
	}

	public void setNomeConselho(String nomeConselho) {
		this.nomeConselho = nomeConselho;
	}

	public String getDescricaoConselho() {
		return descricaoConselho;
	}

	public void setDescricaoConselho(String descricaoConselho) {
		this.descricaoConselho = descricaoConselho;
	}

	public List<PessoaDocumentosConselho> getPessoaDocumentosConselhoCollection() {
		return pessoaDocumentosConselhoCollection;
	}

	public void setPessoaDocumentosConselhoCollection(List<PessoaDocumentosConselho> pessoaDocumentosConselhoCollection) {
		this.pessoaDocumentosConselhoCollection = pessoaDocumentosConselhoCollection;
	}

	
}
