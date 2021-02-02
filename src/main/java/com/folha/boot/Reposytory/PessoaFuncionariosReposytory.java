package com.folha.boot.Reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.folha.boot.domain.PessoaFuncionarios;

@Repository
public interface PessoaFuncionariosReposytory extends JpaRepository<PessoaFuncionarios, Long> {

}
