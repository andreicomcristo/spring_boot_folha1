package com.folha.boot.Reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.folha.boot.domain.HistFuncionariosCarreira;

@Repository
public interface HistFuncionariosCarreiraReposytory extends JpaRepository<HistFuncionariosCarreira, Long> {

}
