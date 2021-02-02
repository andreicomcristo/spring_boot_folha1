package com.folha.boot.Reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.folha.boot.domain.Situacoes;

@Repository
public interface SituacoesReposytory extends JpaRepository<Situacoes, Long> {

}
