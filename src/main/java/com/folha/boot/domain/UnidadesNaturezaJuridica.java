package com.folha.boot.domain;
import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "unidades_natureza_juridica")
public class UnidadesNaturezaJuridica extends AbstractEntity<Long> {

	@Column(name = "nome_natureza_juridica", nullable = false, length = 150)
    private String nomeNaturezaJuridica;
   
	@Column(name = "descricao_natureza_juridica", length = 300)
    private String descricaoNaturezaJuridica;
    
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idUnidadeDeSaudeFk")
    private List<HistUnidadesNaturezaJuridica> histUnidadesNaturezaJuridicaCollection;

}
