package com.folha.boot.service;

import java.util.List;

import com.folha.boot.domain.HistUnidadesNaturezaJuridica;

public interface HistUnidadesNaturezaJuridicaService {
	
	void salvar(HistUnidadesNaturezaJuridica histUnidadesNaturezaJuridica);

	void editar(HistUnidadesNaturezaJuridica histUnidadesNaturezaJuridica);

	void excluir(Long id);

	HistUnidadesNaturezaJuridica buscarPorId(Long id);

	List<HistUnidadesNaturezaJuridica> buscarTodos();
}
