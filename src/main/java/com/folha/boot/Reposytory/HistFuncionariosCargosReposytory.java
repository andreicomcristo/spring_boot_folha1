package com.folha.boot.Reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.folha.boot.domain.HistFuncionariosCargos;

@Repository
public interface HistFuncionariosCargosReposytory extends JpaRepository<HistFuncionariosCargos, Long> {

}
