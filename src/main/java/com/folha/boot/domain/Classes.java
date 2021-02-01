package com.folha.boot.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "classes")
public class Classes extends AbstractEntity<Long> {

	@Column(name = "sigla_classe", nullable = false, length = 10)
	private String siglaClasse;

	@Column(name = "nome_classe", nullable = false, length = 150)
	private String nomeClasse;

	@Column(name = "descricao_classe", length = 300)
	private String descricaoClasse;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idClasseFk")
	private Collection<HistFuncionariosClasse> histFuncionariosClasseCollection;

}
