package com.folha.boot.Reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.folha.boot.domain.TiposDeFiliacao;

@Repository
public interface TiposDeFiliacaoReposytory extends JpaRepository<TiposDeFiliacao, Long> {

}
