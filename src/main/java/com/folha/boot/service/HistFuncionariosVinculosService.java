package com.folha.boot.service;

import java.util.List;

import com.folha.boot.domain.HistFuncionariosVinculos;

public interface HistFuncionariosVinculosService {
	
	void salvar(HistFuncionariosVinculos histFuncionariosVinculos);

	void editar(HistFuncionariosVinculos histFuncionariosVinculos);

	void excluir(Long id);

	HistFuncionariosVinculos buscarPorId(Long id);

	List<HistFuncionariosVinculos> buscarTodos();

}
