package com.folha.boot.Reposytory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.folha.boot.domain.PessoaDocumentosReservista;

@Repository
public interface PessoaDocumentosReservistaReposytory extends JpaRepository<PessoaDocumentosReservista, Long> {

}
