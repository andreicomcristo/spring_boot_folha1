package com.folha.boot.service;

import java.util.List;

import com.folha.boot.domain.HistUnidadesDiretor;


public interface HistUnidadesDiretorService {
	
	void salvar(HistUnidadesDiretor histUnidadesDiretor);

	void editar(HistUnidadesDiretor histUnidadesDiretor);

	void excluir(Long id);

	HistUnidadesDiretor buscarPorId(Long id);

	List<HistUnidadesDiretor> buscarTodos();

}
