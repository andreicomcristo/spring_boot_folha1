package com.folha.boot.domain;

import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "privilegios")
public class Privilegios extends AbstractEntity<Long> {

	@Column(name = "nome_privilegio", nullable = false, length = 300)
	private String nomePrivilegio;

	@Basic(optional = false)
	@Column(name = "descricao_privilegio", nullable = false, length = 3000)
	private String descricaoPrivilegio;

	@OneToMany(mappedBy = "seqPrivilegio")
	private List<PessoaOperadores> pessoaOperadoresCollection;

}
