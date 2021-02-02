package com.folha.boot.domain;

import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "situacoes")
public class Situacoes extends AbstractEntity<Long> {

	@Column(name = "nome_situacao", nullable = false, length = 300)
    private String nomeSituacao;
    
	@Column(name = "descricao_situacao", length = 300)
    private String descricaoSituacao;
    
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idSituacaoFk")
    private List<HistFuncionariosSituacoes> histFuncionariosSituacoesCollection;

	public String getNomeSituacao() {
		return nomeSituacao;
	}

	public void setNomeSituacao(String nomeSituacao) {
		this.nomeSituacao = nomeSituacao;
	}

	public String getDescricaoSituacao() {
		return descricaoSituacao;
	}

	public void setDescricaoSituacao(String descricaoSituacao) {
		this.descricaoSituacao = descricaoSituacao;
	}

	public List<HistFuncionariosSituacoes> getHistFuncionariosSituacoesCollection() {
		return histFuncionariosSituacoesCollection;
	}

	public void setHistFuncionariosSituacoesCollection(
			List<HistFuncionariosSituacoes> histFuncionariosSituacoesCollection) {
		this.histFuncionariosSituacoesCollection = histFuncionariosSituacoesCollection;
	}

}
