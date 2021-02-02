package com.folha.boot.Reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.folha.boot.domain.TiposLogradouro;

@Repository
public interface TiposLogradouroReposytory extends JpaRepository<TiposLogradouro, Long> {

}
