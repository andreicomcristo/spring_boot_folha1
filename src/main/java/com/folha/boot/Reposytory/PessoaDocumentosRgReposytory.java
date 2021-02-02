package com.folha.boot.Reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.folha.boot.domain.PessoaDocumentosRg;

@Repository
public interface PessoaDocumentosRgReposytory extends JpaRepository<PessoaDocumentosRg, Long> {

}
