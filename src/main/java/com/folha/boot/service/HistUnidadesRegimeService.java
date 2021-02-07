package com.folha.boot.service;

import java.util.List;

import com.folha.boot.domain.HistUnidadesRegime;

public interface HistUnidadesRegimeService {
	
	void salvar(HistUnidadesRegime histUnidadesRegime);

	void editar(HistUnidadesRegime histUnidadesRegime);

	void excluir(Long id);

	HistUnidadesRegime buscarPorId(Long id);

	List<HistUnidadesRegime> buscarTodos();

}
