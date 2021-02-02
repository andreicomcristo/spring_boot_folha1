package com.folha.boot.Reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.folha.boot.domain.Escolaridades;

@Repository
public interface EscolaridadesReposytory extends JpaRepository<Escolaridades, Long> {

}
