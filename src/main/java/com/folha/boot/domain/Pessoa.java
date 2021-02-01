package com.folha.boot.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "pessoa")
public class Pessoa extends AbstractEntity<Long> {

	@Column(name = "cpf", nullable = false, length = 20)
	private String cpf;

	@Basic(optional = false)
	@Column(name = "nome", nullable = false, length = 300)
	private String nome;

	@Column(name = "fone1", length = 30)
	private String fone1;

	@Column(name = "fone2", length = 30)
	private String fone2;

	@Column(name = "fone3", length = 30)
	private String fone3;

	@Column(name = "email", length = 150)
	private String email;

	@Column(name = "email_saude", length = 150)
	private String emailSaude;

	@Column(name = "dt_nascimento")
	@Temporal(TemporalType.DATE)
	private Date dtNascimento;

	@Column(name = "nome_pai", length = 300)
	private String nomePai;

	@Column(name = "nome_mae", length = 300)
	private String nomeMae;

	@Column(name = "dt_cadastro")
	@Temporal(TemporalType.DATE)
	private Date dtCadastro;

	@Column(name = "dt_cancelamento")
	@Temporal(TemporalType.DATE)
	private Date dtCancelamento;

	@Column(name = "moivo_cancelamento", length = 300)
	private String moivoCancelamento;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idPessoaFk")
	private List<PessoaFilhos> pessoaFilhosCollection;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idPessoaFk")
	private List<PessoaDocumentosConselho> pessoaDocumentosConselhoCollection;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idPessoaFk")
	private List<PessoaDocumentosReservista> pessoaDocumentosReservistaCollection;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idPessoaFk")
	private List<PessoaFotos> pessoaFotosCollection;

	@OneToMany(mappedBy = "idPessoaFk")
	private List<PessoaDocumentos> pessoaDocumentosCollection;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idPessoaFk")
	private List<PessoaOperadores> pessoaOperadoresCollection;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idPessoaFk")
	private List<Enderecos> enderecosCollection;

	@OneToMany(mappedBy = "idPessoaFk")
	private List<PessoaDocumentosHabilitacao> pessoaDocumentosHabilitacaoCollection;

	@JoinColumn(name = "seq_cidade_natal", referencedColumnName = "id")
	@ManyToOne
	private Cidades seqCidadeNatal;

	@JoinColumn(name = "seq_endereco", referencedColumnName = "id")
	@ManyToOne
	private Enderecos seqEndereco;

	@JoinColumn(name = "seq_escolaridade", referencedColumnName = "id")
	@ManyToOne
	private Escolaridades seqEscolaridade;

	@JoinColumn(name = "seq_estado_civil", referencedColumnName = "id")
	@ManyToOne
	private EstadosCivis seqEstadoCivil;

	@JoinColumn(name = "seq_operador_cadastro", referencedColumnName = "id")
	@ManyToOne
	private PessoaOperadores seqOperadorCadastro;

	@JoinColumn(name = "seq_operador_cancelamento", referencedColumnName = "id")
	@ManyToOne
	private PessoaOperadores seqOperadorCancelamento;

	@JoinColumn(name = "seq_sexo_declarado", referencedColumnName = "id")
	@ManyToOne
	private Sexos seqSexoDeclarado;

	@JoinColumn(name = "seq_sexo", referencedColumnName = "id")
	@ManyToOne
	private Sexos seqSexo;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idPessoaFk")
	private List<PessoaDocumentosCtps> pessoaDocumentosCtpsCollection;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idPessoaFk")
	private List<PessoaBancos> pessoaBancosCollection;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pessoa")
	private List<HistUnidadesDiretor> histUnidadesDiretorCollection;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idPessoaFk")
	private List<PessoaFuncionarios> pessoaFuncionariosCollection;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idPessoaFk")
	private List<PessoaDocumentosTitulo> pessoaDocumentosTituloCollection;

}
