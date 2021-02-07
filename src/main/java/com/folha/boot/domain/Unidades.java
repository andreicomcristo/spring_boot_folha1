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
    
	/*@OneToMany(cascade = CascadeType.ALL, mappedBy = "unidades")
    private List<HistUnidadesDiretor> histUnidadesDiretorCollection;*/
    
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idUnidadeFk")
    private List<HistFuncionariosUnidadeLotacao> histFuncionariosUnidadeLotacaoCollection;
    
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idUnidadeFk")
    private List<HistFuncionariosUnidadeAtuacao> histFuncionariosUnidadeAtuacaoCollection;

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getNomeEmpresarial() {
		return nomeEmpresarial;
	}

	public void setNomeEmpresarial(String nomeEmpresarial) {
		this.nomeEmpresarial = nomeEmpresarial;
	}

	public String getCnes() {
		return cnes;
	}

	public void setCnes(String cnes) {
		this.cnes = cnes;
	}

	public BigInteger getIdNaturezaJuridicaFk() {
		return idNaturezaJuridicaFk;
	}

	public void setIdNaturezaJuridicaFk(BigInteger idNaturezaJuridicaFk) {
		this.idNaturezaJuridicaFk = idNaturezaJuridicaFk;
	}

	public BigInteger getIdEnderecoUnidadeFk() {
		return idEnderecoUnidadeFk;
	}

	public void setIdEnderecoUnidadeFk(BigInteger idEnderecoUnidadeFk) {
		this.idEnderecoUnidadeFk = idEnderecoUnidadeFk;
	}

	public String getFone1() {
		return fone1;
	}

	public void setFone1(String fone1) {
		this.fone1 = fone1;
	}

	public String getEnderecoLogradouro() {
		return enderecoLogradouro;
	}

	public void setEnderecoLogradouro(String enderecoLogradouro) {
		this.enderecoLogradouro = enderecoLogradouro;
	}

	public String getEnderecoNumero() {
		return enderecoNumero;
	}

	public void setEnderecoNumero(String enderecoNumero) {
		this.enderecoNumero = enderecoNumero;
	}

	public String getEnderecoComplemento() {
		return enderecoComplemento;
	}

	public void setEnderecoComplemento(String enderecoComplemento) {
		this.enderecoComplemento = enderecoComplemento;
	}

	public String getEnderecoBairro() {
		return enderecoBairro;
	}

	public void setEnderecoBairro(String enderecoBairro) {
		this.enderecoBairro = enderecoBairro;
	}

	public String getEnderecoCep() {
		return enderecoCep;
	}

	public void setEnderecoCep(String enderecoCep) {
		this.enderecoCep = enderecoCep;
	}

	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public String getMotivoCadastro() {
		return motivoCadastro;
	}

	public void setMotivoCadastro(String motivoCadastro) {
		this.motivoCadastro = motivoCadastro;
	}

	public Date getDtCancelamento() {
		return dtCancelamento;
	}

	public void setDtCancelamento(Date dtCancelamento) {
		this.dtCancelamento = dtCancelamento;
	}

	public String getMotivoCancelamento() {
		return motivoCancelamento;
	}

	public void setMotivoCancelamento(String motivoCancelamento) {
		this.motivoCancelamento = motivoCancelamento;
	}

	public Cidades getIdEnderecoCidadeFk() {
		return idEnderecoCidadeFk;
	}

	public void setIdEnderecoCidadeFk(Cidades idEnderecoCidadeFk) {
		this.idEnderecoCidadeFk = idEnderecoCidadeFk;
	}

	public PessoaOperadores getIdOperadorCadastroFk() {
		return idOperadorCadastroFk;
	}

	public void setIdOperadorCadastroFk(PessoaOperadores idOperadorCadastroFk) {
		this.idOperadorCadastroFk = idOperadorCadastroFk;
	}

	public PessoaOperadores getIdOperadorCancelamentoFk() {
		return idOperadorCancelamentoFk;
	}

	public void setIdOperadorCancelamentoFk(PessoaOperadores idOperadorCancelamentoFk) {
		this.idOperadorCancelamentoFk = idOperadorCancelamentoFk;
	}

	public TiposLogradouro getIdTipoLogradouroFk() {
		return idTipoLogradouroFk;
	}

	public void setIdTipoLogradouroFk(TiposLogradouro idTipoLogradouroFk) {
		this.idTipoLogradouroFk = idTipoLogradouroFk;
	}

	public List<HistUnidadesRegime> getHistUnidadesRegimeCollection() {
		return histUnidadesRegimeCollection;
	}

	public void setHistUnidadesRegimeCollection(List<HistUnidadesRegime> histUnidadesRegimeCollection) {
		this.histUnidadesRegimeCollection = histUnidadesRegimeCollection;
	}

	public List<Autorizacoes> getAutorizacoesCollection() {
		return autorizacoesCollection;
	}

	public void setAutorizacoesCollection(List<Autorizacoes> autorizacoesCollection) {
		this.autorizacoesCollection = autorizacoesCollection;
	}

	/*public List<HistUnidadesDiretor> getHistUnidadesDiretorCollection() {
		return histUnidadesDiretorCollection;
	}*/

	/*public void setHistUnidadesDiretorCollection(List<HistUnidadesDiretor> histUnidadesDiretorCollection) {
		this.histUnidadesDiretorCollection = histUnidadesDiretorCollection;
	}*/

	public List<HistFuncionariosUnidadeLotacao> getHistFuncionariosUnidadeLotacaoCollection() {
		return histFuncionariosUnidadeLotacaoCollection;
	}

	public void setHistFuncionariosUnidadeLotacaoCollection(
			List<HistFuncionariosUnidadeLotacao> histFuncionariosUnidadeLotacaoCollection) {
		this.histFuncionariosUnidadeLotacaoCollection = histFuncionariosUnidadeLotacaoCollection;
	}

	public List<HistFuncionariosUnidadeAtuacao> getHistFuncionariosUnidadeAtuacaoCollection() {
		return histFuncionariosUnidadeAtuacaoCollection;
	}

	public void setHistFuncionariosUnidadeAtuacaoCollection(
			List<HistFuncionariosUnidadeAtuacao> histFuncionariosUnidadeAtuacaoCollection) {
		this.histFuncionariosUnidadeAtuacaoCollection = histFuncionariosUnidadeAtuacaoCollection;
	}
	
}
