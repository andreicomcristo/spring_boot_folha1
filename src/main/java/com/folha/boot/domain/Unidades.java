package com.folha.boot.domain;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "unidades")
public class Unidades extends AbstractEntity<Long> {
	
	@Column(name = "nome_fantasia", nullable = false, length = 300)
    private String nomeFantasia;
    
	@Column(name = "nome_empresarial", length = 300)
    private String nomeEmpresarial;
    
	@Column(name = "cnes", length = 50)
    private String cnes;
    
	@Column(name = "id_natureza_juridica_fk")
    private BigInteger idNaturezaJuridicaFk;
    
	@Column(name = "id_endereco_unidade_fk")
    private BigInteger idEnderecoUnidadeFk;
    
	@Column(name = "fone1", length = 40)
    private String fone1;
    
	@Column(name = "endereco_logradouro", length = 300)
    private String enderecoLogradouro;
    
	@Column(name = "endereco_numero", length = 150)
    private String enderecoNumero;
    
	@Column(name = "endereco_complemento", length = 300)
    private String enderecoComplemento;
    
	@Column(name = "endereco_bairro", length = 300)
    private String enderecoBairro;
    
	@Column(name = "endereco_cep", length = 50)
    private String enderecoCep;
    
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
    
	@JoinColumn(name = "id_endereco_cidade_fk", referencedColumnName = "id")
    @ManyToOne
    private Cidades idEnderecoCidadeFk;
    
	@JoinColumn(name = "id_operador_cadastro_fk", referencedColumnName = "id")
    @ManyToOne
    private PessoaOperadores idOperadorCadastroFk;
    
	@JoinColumn(name = "id_operador_cancelamento_fk", referencedColumnName = "id")
    @ManyToOne
    private PessoaOperadores idOperadorCancelamentoFk;
    
	@JoinColumn(name = "id_tipo_logradouro_fk", referencedColumnName = "id")
    @ManyToOne
    private TiposLogradouro idTipoLogradouroFk;
    
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idUnidadeDeSaudeFk")
    private List<HistUnidadesRegime> histUnidadesRegimeCollection;
    
	@OneToMany(mappedBy = "idUnidadeDeSaudeFk")
    private List<Autorizacoes> autorizacoesCollection;
    
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "unidades")
    private List<HistUnidadesDiretor> histUnidadesDiretorCollection;
    
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idUnidadeFk")
    private List<HistFuncionariosUnidadeLotacao> histFuncionariosUnidadeLotacaoCollection;
    
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idUnidadeFk")
    private List<HistFuncionariosUnidadeAtuacao> histFuncionariosUnidadeAtuacaoCollection;	
}
