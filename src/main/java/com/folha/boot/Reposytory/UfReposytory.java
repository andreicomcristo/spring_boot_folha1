package com.folha.boot.Reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.folha.boot.domain.Uf;

@Repository
public interface UfReposytory extends JpaRepository<Uf, Long> {

}
