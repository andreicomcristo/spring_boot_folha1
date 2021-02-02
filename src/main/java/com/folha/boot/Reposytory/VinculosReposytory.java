package com.folha.boot.Reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.folha.boot.domain.Vinculos;

@Repository
public interface VinculosReposytory extends JpaRepository<Vinculos, Long> {

}
