package com.folha.boot.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "pessoa_funcionarios")
public class PessoaFuncionarios extends AbstractEntity<Long> {

	@Column(name = "matricula", length = 30)
    private String matricula;
    
	@Column(name = "dt_nomeacao")
    @Temporal(TemporalType.DATE)
	private Date dtNomeacao;
    
	@Column(name = "dt_posse")
    @Temporal(TemporalType.DATE)
    private Date dtPosse;
    
	@Column(name = "numero_de_ordem", length = 150)
    private String numeroDeOrdem;
    
	@Column(name = "numero_de_ponto", length = 150)
    private String numeroDePonto;
    
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
    
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idFuncionarioFk")
    private List<HistFuncionariosAutorizacao> histFuncionariosAutorizacaoCollection;
    
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idFuncionarioFk")
    private List<HistFuncionariosClasse> histFuncionariosClasseCollection;
    
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idFuncionarioFk")
    private List<HistFuncionariosCargaHoraria> histFuncionariosCargaHorariaCollection;
    
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idFuncionarioFk")
    private List<HistFuncionariosCargos> histFuncionariosCargosCollection;
    
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idFuncionarioFk")
    private List<HistFuncionariosCarreira> histFuncionariosCarreiraCollection;
    
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idFuncionarioFk")
    private List<HistFuncionariosSituacoes> histFuncionariosSituacoesCollection;
    
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idFuncionarioFk")
    private List<Autorizacoes> autorizacoesCollection;
    
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idFuncionarioFk")
    private List<HistFuncionariosVinculos> histFuncionariosVinculosCollection;
    
	@JoinColumn(name = "id_pessoa_fk", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private Pessoa idPessoaFk;
    
	@JoinColumn(name = "id_operador_cadastro_fk", referencedColumnName = "id")
    @ManyToOne
    private PessoaOperadores idOperadorCadastroFk;
    
	@JoinColumn(name = "id_operador_cancelamento_fk", referencedColumnName = "id")
    @ManyToOne
    private PessoaOperadores idOperadorCancelamentoFk;
    
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idFuncionarioFk")
    private List<HistFuncionariosUnidadeAtuacao> histFuncionariosUnidadeAtuacaoCollection;

}
