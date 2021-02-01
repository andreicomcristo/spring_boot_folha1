package com.folha.boot.domain;

import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "sexos")
public class Sexos extends AbstractEntity<Long> {

	@Column(name = "nome_sexo", nullable = false, length = 100)
	private String nomeSexo;

	@Column(name = "descricao_sexo", length = 300)
	private String descricaoSexo;

	@OneToMany(mappedBy = "seqSexoDeclarado")
	private List<Pessoa> pessoaCollection;

	@OneToMany(mappedBy = "seqSexo")
	private List<Pessoa> pessoaCollection1;

}
