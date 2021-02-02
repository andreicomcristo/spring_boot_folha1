package com.folha.boot.Reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.folha.boot.domain.HistFuncionariosSituacoes;

@Repository
public interface HistFuncionariosSituacoesReposytory extends JpaRepository<HistFuncionariosSituacoes, Long> {

}
