package com.folha.boot.domain;

import java.util.Date;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "pessoa_bancos")
public class PessoaBancos extends AbstractEntity<Long> {

	@Column(name = "operacao_variacao", length = 20)
	private String operacaoVariacao;

	@Column(name = "agencia_numero", nullable = false, length = 20)
	private String agenciaNumero;

	@Column(name = "agencia_dv", length = 5)
	private String agenciaDv;

	@Column(name = "conta_numero", nullable = false, length = 20)
	private String contaNumero;

	@Column(name = "conta_dv", nullable = false, length = 5)
	private String contaDv;

	@Column(name = "agencia_nome", length = 300)
	private String agenciaNome;

	@Column(name = "prioritario", length = 2147483647)
	private String prioritario;

	@Column(name = "dt_cadastro")
	@Temporal(TemporalType.DATE)
	private Date dtCadastro;

	@Column(name = "motivo_cadastro", length = 300)
	private String motivoCadastro;

	@Column(name = "dt_cancelamento")
	@Temporal(TemporalType.DATE)
	private Date dtCancelamento;

	@Column(name = "motivo_cancelamento", length = 300)
	private String motivoCancelamento;

	@JoinColumn(name = "id_banco_fk", referencedColumnName = "id", nullable = false)
	@ManyToOne(optional = false)
	private Bancos idBancoFk;

	@JoinColumn(name = "id_pessoa_fk", referencedColumnName = "id", nullable = false)
	@ManyToOne(optional = false)
	private Pessoa idPessoaFk;

	@JoinColumn(name = "id_operador_cadastro_fk", referencedColumnName = "id")
	@ManyToOne
	private PessoaOperadores idOperadorCadastroFk;

	@JoinColumn(name = "id_operador_cancelamento_fk", referencedColumnName = "id")
	@ManyToOne
	private PessoaOperadores idOperadorCancelamentoFk;

}
