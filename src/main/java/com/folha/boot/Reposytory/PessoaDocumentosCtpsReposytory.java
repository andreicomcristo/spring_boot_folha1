package com.folha.boot.Reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.folha.boot.domain.PessoaDocumentosCtps;

@Repository
public interface PessoaDocumentosCtpsReposytory extends JpaRepository<PessoaDocumentosCtps, Long> {

}
