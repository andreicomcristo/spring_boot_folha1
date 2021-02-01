package com.folha.boot.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "carreiras")
public class Carreiras extends AbstractEntity<Long> {

	
    @Column(name = "sigla_carreira", nullable = false, length = 10)
    private String siglaCarreira;
    
    @Column(name = "nome_carreira", nullable = false, length = 150)
    private String nomeCarreira;
    
    @Column(name = "descricao_carreira", length = 300)
    private String descricaoCarreira;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCarreiraFk")
    private Collection<HistFuncionariosCarreira> histFuncionariosCarreiraCollection;

}
