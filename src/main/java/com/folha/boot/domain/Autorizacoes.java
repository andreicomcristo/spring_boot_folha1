package com.folha.boot.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "autorizacoes")
public class Autorizacoes extends AbstractEntity<Long> {

	@Column(name = "dt_inicio")
	@Temporal(TemporalType.DATE)
	private Date dtInicio;

	@Column(name = "dt_fim")
	@Temporal(TemporalType.DATE)
	private Date dtFim;

	@Column(name = "id_carga_horaria_semanal_fk", nullable = false)
	private long idCargaHorariaSemanalFk;

	@Column(name = "dt_criacao", nullable = false)
	@Temporal(TemporalType.DATE)

	private Date dtCriacao;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idAutorizacaoFk")

	private List<HistFuncionariosAutorizacao> histFuncionariosAutorizacaoCollection;
	@JoinColumn(name = "id_funcionario_fk", referencedColumnName = "id", nullable = false)
	@ManyToOne(optional = false)

	private PessoaFuncionarios idFuncionarioFk;
	@JoinColumn(name = "id_operador_criacao_fk", referencedColumnName = "id", nullable = false)
	@ManyToOne(optional = false)

	private PessoaOperadores idOperadorCriacaoFk;
	@JoinColumn(name = "id_unidade_de_saude_fk", referencedColumnName = "id")
	@ManyToOne

	private Unidades idUnidadeDeSaudeFk;

}
