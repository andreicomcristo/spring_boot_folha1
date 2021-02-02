package com.folha.boot.Reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.folha.boot.domain.HistFuncionariosUnidadeAtuacao;

@Repository
public interface HistFuncionariosUnidadeAtuacaoReposytory extends JpaRepository<HistFuncionariosUnidadeAtuacao, Long> {

}
