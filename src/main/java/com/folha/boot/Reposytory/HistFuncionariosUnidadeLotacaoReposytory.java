package com.folha.boot.Reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.folha.boot.domain.HistFuncionariosUnidadeLotacao;

@Repository
public interface HistFuncionariosUnidadeLotacaoReposytory extends JpaRepository<HistFuncionariosUnidadeLotacao, Long> {

}
