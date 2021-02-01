package com.folha.boot.domain;

import java.util.Date;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "pessoa_filhos")
public class PessoaFilhos extends AbstractEntity<Long> {

	@Column(name = "nome_filho", nullable = false, length = 300)
	private String nomeFilho;

	@Column(name = "dt_nascimento")
	@Temporal(TemporalType.DATE)
	private Date dtNascimento;

	@Column(name = "cpf_filho", length = 20)
	private String cpfFilho;

	@Column(name = "rg_filho", length = 30)
	private String rgFilho;

	@Column(name = "rg_dt_emissao_filho")
	@Temporal(TemporalType.DATE)
	private Date rgDtEmissaoFilho;

	@Column(name = "rg_orgao_expedidor", length = 150)
	private String rgOrgaoExpedidor;

	@Column(name = "numero_certidao_nascimento", length = 150)
	private String numeroCertidaoNascimento;

	@Column(name = "dt_certidado_nascimento")
	@Temporal(TemporalType.DATE)
	private Date dtCertidadoNascimento;

	@Column(name = "cartorio_certidado_nascimento", length = 150)
	private String cartorioCertidadoNascimento;

	@Column(name = "livro_certidao_nascimento", length = 150)
	private String livroCertidaoNascimento;

	@Column(name = "folha_certidao_nascimento", length = 150)
	private String folhaCertidaoNascimento;

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

	@JoinColumn(name = "id_pessoa_fk", referencedColumnName = "id", nullable = false)
	@ManyToOne(optional = false)
	private Pessoa idPessoaFk;

	@JoinColumn(name = "id_operador_cadastro_fk", referencedColumnName = "id")
	@ManyToOne
	private PessoaOperadores idOperadorCadastroFk;

	@JoinColumn(name = "id_operador_cancelamento_fk", referencedColumnName = "id")
	@ManyToOne
	private PessoaOperadores idOperadorCancelamentoFk;

	@JoinColumn(name = "id_tipo_filiacao_fk", referencedColumnName = "id", nullable = false)
	@ManyToOne(optional = false)
	private TiposDeFiliacao idTipoFiliacaoFk;

}
