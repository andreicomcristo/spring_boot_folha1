package com.folha.boot.domain;

import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "tipos_de_filiacao")
public class TiposDeFiliacao extends AbstractEntity<Long> {

	@Column(name = "nome_tipo_filiacao", nullable = false, length = 150)
	private String nomeTipoFiliacao;

	@Column(name = "descricao_tipo_filiacao", length = 300)
	private String descricaoTipoFiliacao;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoFiliacaoFk")
	private List<PessoaFilhos> pessoaFilhosCollection;

}
