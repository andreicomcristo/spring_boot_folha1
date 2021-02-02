package com.folha.boot.Reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.folha.boot.domain.HistFuncionariosClasse;

@Repository
public interface HistFuncionariosClasseReposytory extends JpaRepository<HistFuncionariosClasse, Long> {

}
