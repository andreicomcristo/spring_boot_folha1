package com.folha.boot.domain;

import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "bancos")
public class Bancos extends AbstractEntity<Long> {

	@Column(name = "codigo_banco", nullable = false, length = 50)
	private String codigoBanco;

	@Column(name = "nome_banco", nullable = false, length = 300)
	private String nomeBanco;

	@Column(name = "sigla_banco", length = 150)
	private String siglaBanco;

	// ajustar essa relação.
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idBancoFk")
	private List<PessoaBancos> pessoaBancosCollection;

}
