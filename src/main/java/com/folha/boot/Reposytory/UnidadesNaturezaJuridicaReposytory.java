package com.folha.boot.Reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.folha.boot.domain.UnidadesNaturezaJuridica;

@Repository
public interface UnidadesNaturezaJuridicaReposytory extends JpaRepository<UnidadesNaturezaJuridica, Long> {

}
