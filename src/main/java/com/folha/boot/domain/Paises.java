package com.folha.boot.domain;

import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "paises")
public class Paises extends AbstractEntity<Long> {

	@Column(name = "nome_pais", nullable = false, length = 300)
	private String nomePais;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idPaisFk")
	private List<Cidades> cidadesCollection;

}
