package com.folha.boot.domain;

import java.util.Date;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "hist_funcionarios_unidade_lotacao")

public class HistFuncionariosUnidadeLotacao extends AbstractEntity<Long> {

	@Column(name = "id_funcionario_fk", nullable = false)
    private long idFuncionarioFk;
    
	
    @Column(name = "dt_cadastro", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dtCadastro;
    
	@Column(name = "motivo_cadastro", length = 300)
    private String motivoCadastro;
    
	@Column(name = "dt_cancelamento")
    @Temporal(TemporalType.DATE)
    private Date dtCancelamento;
    
	@Column(name = "motivo_cancelamento", length = 300)
    private String motivoCancelamento;
    
	@JoinColumn(name = "id_operador_cadastro_fk", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private PessoaOperadores idOperadorCadastroFk;
    
	@JoinColumn(name = "id_operador_cancelamento_fk", referencedColumnName = "id")
    @ManyToOne
    private PessoaOperadores idOperadorCancelamentoFk;
    
	@JoinColumn(name = "id_unidade_fk", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private Unidades idUnidadeFk;

}
