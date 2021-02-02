package com.folha.boot.Reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.folha.boot.domain.Cidades;

@Repository
public interface CidadesReposytory extends JpaRepository<Cidades, Long> {

}
