package com.folha.boot.domain;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "pessoa_operadores")
public class PessoaOperadores extends AbstractEntity<Long> {

	@Column(name = "senha", nullable = false, length = 300)
	private String senha;

	@Column(name = "dt_cadastro")
	@Temporal(TemporalType.DATE)
	private Date dtCadastro;

	@Column(name = "id_operador_cadastro_fk")
	private BigInteger idOperadorCadastroFk;

	@Column(name = "dt_cancelamento")
	@Temporal(TemporalType.DATE)
	private Date dtCancelamento;

	@Column(name = "id_operador_cancelamento_fk")
	private BigInteger idOperadorCancelamentoFk;

	@Column(name = "motivo_cancelamento", length = 500)
	private String motivoCancelamento;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idOperadorCadastroFk")
	private List<HistFuncionariosAutorizacao> histFuncionariosAutorizacaoCollection;

	@OneToMany(mappedBy = "idOperadorCancelamentoFk")
	private List<HistFuncionariosAutorizacao> histFuncionariosAutorizacaoCollection1;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idOperadorCadastroFk")
	private List<HistFuncionariosClasse> histFuncionariosClasseCollection;

	@OneToMany(mappedBy = "idOperadorCancelamentoFk")
	private List<HistFuncionariosClasse> histFuncionariosClasseCollection1;

	@OneToMany(mappedBy = "idOperadorCancelamentoFk")
	private List<HistFuncionariosCargaHoraria> histFuncionariosCargaHorariaCollection;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idOperadorCadastroFk")
	private List<HistFuncionariosCargaHoraria> histFuncionariosCargaHorariaCollection1;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idOperadorCadastroFk")
	private List<HistFuncionariosCargos> histFuncionariosCargosCollection;

	@OneToMany(mappedBy = "idOperadorCancelamentoFk")
	private List<HistFuncionariosCargos> histFuncionariosCargosCollection1;

	@OneToMany(mappedBy = "idOperadorCadastroFk")
	private List<PessoaFilhos> pessoaFilhosCollection;

	@OneToMany(mappedBy = "idOperadorCancelamentoFk")
	private List<PessoaFilhos> pessoaFilhosCollection1;

	@JoinColumn(name = "id_pessoa_fk", referencedColumnName = "id", nullable = false)
	@ManyToOne(optional = false)
	private Pessoa idPessoaFk;

	@JoinColumn(name = "seq_privilegio", referencedColumnName = "id")
	@ManyToOne
	private Privilegios seqPrivilegio;

	@OneToMany(mappedBy = "idOperadorCadastroFk")
	private List<Unidades> unidadesCollection;

	@OneToMany(mappedBy = "idOperadorCancelamentoFk")
	private List<Unidades> unidadesCollection1;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idOperadorCadastroFk")
	private List<HistUnidadesNaturezaJuridica> histUnidadesNaturezaJuridicaCollection;

	@OneToMany(mappedBy = "idOperadorCancelamentoFk")
	private List<HistUnidadesNaturezaJuridica> histUnidadesNaturezaJuridicaCollection1;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idOperadorCadastroFk")
	private List<HistUnidadesRegime> histUnidadesRegimeCollection;

	@OneToMany(mappedBy = "idOperadorCancelamentoFk")
	private List<HistUnidadesRegime> histUnidadesRegimeCollection1;

	@OneToMany(mappedBy = "seqOperadorCadastro")
	private List<Pessoa> pessoaCollection;

	@OneToMany(mappedBy = "seqOperadorCancelamento")
	private List<Pessoa> pessoaCollection1;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idOperadorCadastroFk")
	private List<HistFuncionariosCarreira> histFuncionariosCarreiraCollection;

	@OneToMany(mappedBy = "idOperadorCancelamentoFk")
	private List<HistFuncionariosCarreira> histFuncionariosCarreiraCollection1;

	@OneToMany(mappedBy = "idOperadorCancelamentoFk")
	private List<HistFuncionariosSituacoes> histFuncionariosSituacoesCollection;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idOperadorCadastroFk")
	private List<HistFuncionariosSituacoes> histFuncionariosSituacoesCollection1;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idOperadorCriacaoFk")
	private List<Autorizacoes> autorizacoesCollection;

	@OneToMany(mappedBy = "idOperadorCadastroFk")
	private List<PessoaBancos> pessoaBancosCollection;

	@OneToMany(mappedBy = "idOperadorCancelamentoFk")
	private List<PessoaBancos> pessoaBancosCollection1;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idOperadorCadastroFk")
	private List<HistFuncionariosVinculos> histFuncionariosVinculosCollection;

	@OneToMany(mappedBy = "idOperadorCancelamentoFk")
	private List<HistFuncionariosVinculos> histFuncionariosVinculosCollection1;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pessoaOperadores")
	private List<HistUnidadesDiretor> histUnidadesDiretorCollection;

	@OneToMany(mappedBy = "idOperadorCancelamentoFk")
	private List<HistUnidadesDiretor> histUnidadesDiretorCollection1;

	@OneToMany(mappedBy = "idOperadorCadastroFk")
	private List<PessoaFuncionarios> pessoaFuncionariosCollection;

	@OneToMany(mappedBy = "idOperadorCancelamentoFk")
	private List<PessoaFuncionarios> pessoaFuncionariosCollection1;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idOperadorCadastroFk")
	private List<HistFuncionariosUnidadeLotacao> histFuncionariosUnidadeLotacaoCollection;

	@OneToMany(mappedBy = "idOperadorCancelamentoFk")
	private List<HistFuncionariosUnidadeLotacao> histFuncionariosUnidadeLotacaoCollection1;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idOperadorCadastroFk")
	private List<HistFuncionariosUnidadeAtuacao> histFuncionariosUnidadeAtuacaoCollection;

	@OneToMany(mappedBy = "idOperadorCancelamentoFk")
	private List<HistFuncionariosUnidadeAtuacao> histFuncionariosUnidadeAtuacaoCollection1;

}
