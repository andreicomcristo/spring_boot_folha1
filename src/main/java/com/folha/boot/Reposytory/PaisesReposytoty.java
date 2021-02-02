package com.folha.boot.Reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.folha.boot.domain.Paises;

@Repository
public interface PaisesReposytoty extends JpaRepository<Paises, Long> {

}
