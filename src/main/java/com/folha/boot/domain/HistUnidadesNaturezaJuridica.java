package com.folha.boot.domain;

import java.util.Date;
import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "hist_unidades_natureza_juridica")
public class HistUnidadesNaturezaJuridica extends AbstractEntity<Long> {

	@Column(name = "id_natureza_juridica_fk", nullable = false)
	private long idNaturezaJuridicaFk;

	@Basic(optional = false)
	@Column(name = "dt_cadastro", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dtCadastro;

	@Column(name = "motivo_cadastro", length = 150)
	private String motivoCadastro;

	@Column(name = "dt_cancelamento")
	@Temporal(TemporalType.DATE)
	private Date dtCancelamento;

	@Column(name = "motivo_cancelamento", length = 150)
	private String motivoCancelamento;

	@JoinColumn(name = "id_operador_cadastro_fk", referencedColumnName = "id", nullable = false)
	@ManyToOne(optional = false)
	private PessoaOperadores idOperadorCadastroFk;

	@JoinColumn(name = "id_operador_cancelamento_fk", referencedColumnName = "id")
	@ManyToOne
	private PessoaOperadores idOperadorCancelamentoFk;

	@JoinColumn(name = "id_unidade_de_saude_fk", referencedColumnName = "id", nullable = false)
	@ManyToOne(optional = false)
	private UnidadesNaturezaJuridica idUnidadeDeSaudeFk;

}
