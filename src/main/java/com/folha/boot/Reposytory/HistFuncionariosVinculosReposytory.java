package com.folha.boot.Reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.folha.boot.domain.HistFuncionariosVinculos;

@Repository
public interface HistFuncionariosVinculosReposytory extends JpaRepository<HistFuncionariosVinculos, Long> {

}
