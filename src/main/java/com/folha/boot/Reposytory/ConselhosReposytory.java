package com.folha.boot.Reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.folha.boot.domain.Conselhos;

@Repository
public interface ConselhosReposytory extends JpaRepository<Conselhos, Long> {

}
