package com.folha.boot.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "habilitacao_categorias")
public class HabilitacaoCategorias extends AbstractEntity<Long> {

	@Column(name = "nome_habilitacao_categoria", nullable = false, length = 30)
	private String nomeHabilitacaoCategoria;

	@Column(name = "descricao_habilitacao_categoria", length = 300)
	private String descricaoHabilitacaoCategoria;

	@OneToMany(mappedBy = "idHabilitacaoCategoriasFk")
	private Collection<PessoaDocumentosHabilitacao> pessoaDocumentosHabilitacaoCollection;

}
