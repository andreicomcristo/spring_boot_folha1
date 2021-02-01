package com.folha.boot.domain;

import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "enderecos")
public class Enderecos extends AbstractEntity<Long> {

	@Column(name = "endereco_logradouro", nullable = false, length = 300)
	private String enderecoLogradouro;

	@Column(name = "endereco_numero", length = 20)
	private String enderecoNumero;

	@Column(name = "endereco_complemento", length = 300)
	private String enderecoComplemento;

	@Column(name = "endereco_bairro", length = 300)
	private String enderecoBairro;

	@Column(name = "endereco_cep", length = 20)
	private String enderecoCep;

	@JoinColumn(name = "id_endereco_cidade_fk", referencedColumnName = "id")
	@ManyToOne
	private Cidades idEnderecoCidadeFk;

	@JoinColumn(name = "id_pessoa_fk", referencedColumnName = "id", nullable = false)
	@ManyToOne(optional = false)
	private Pessoa idPessoaFk;

	@JoinColumn(name = "id_tipo_logradouro_fk", referencedColumnName = "id", nullable = false)
	@ManyToOne(optional = false)
	private TiposLogradouro idTipoLogradouroFk;

	@OneToMany(mappedBy = "seqEndereco")
	private List<Pessoa> pessoaCollection;
}
