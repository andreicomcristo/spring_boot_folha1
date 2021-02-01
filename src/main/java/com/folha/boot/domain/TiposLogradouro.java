package com.folha.boot.domain;

import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "tipos_logradouro")
public class TiposLogradouro extends AbstractEntity<Long> {

	@Column(name = "nome_tipo_logradouro", nullable = false, length = 150)
	private String nomeTipoLogradouro;

	@Column(name = "descricao_tipo_logradouro", length = 300)
	private String descricaoTipoLogradouro;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoLogradouroFk")
	private List<Enderecos> enderecosCollection;

	@OneToMany(mappedBy = "idTipoLogradouroFk")
	private List<Unidades> unidadesCollection;

}
