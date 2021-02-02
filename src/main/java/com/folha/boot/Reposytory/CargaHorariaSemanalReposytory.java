package com.folha.boot.Reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.folha.boot.domain.CargaHorariaSemanal;

@Repository
public interface CargaHorariaSemanalReposytory extends JpaRepository<CargaHorariaSemanal, Long> {

}
