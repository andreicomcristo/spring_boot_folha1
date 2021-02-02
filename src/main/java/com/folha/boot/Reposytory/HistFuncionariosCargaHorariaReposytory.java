package com.folha.boot.Reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.folha.boot.domain.HistFuncionariosCargaHoraria;

@Repository
public interface HistFuncionariosCargaHorariaReposytory extends JpaRepository<HistFuncionariosCargaHoraria, Long> {

}
