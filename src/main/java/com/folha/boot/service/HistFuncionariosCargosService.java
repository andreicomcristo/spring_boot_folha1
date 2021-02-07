package com.folha.boot.service;

import java.util.List;

import com.folha.boot.domain.HistFuncionariosCargos;

public interface HistFuncionariosCargosService {

	void salvar(HistFuncionariosCargos histFuncionariosCargos);

	void editar(HistFuncionariosCargos histFuncionariosCargos);

	void excluir(Long id);

	HistFuncionariosCargos buscarPorId(Long id);

	List<HistFuncionariosCargos> buscarTodos();
}
