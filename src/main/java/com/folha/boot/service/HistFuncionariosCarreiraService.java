package com.folha.boot.service;

import java.util.List;

import com.folha.boot.domain.HistFuncionariosCarreira;

public interface HistFuncionariosCarreiraService {
	
	void salvar(HistFuncionariosCarreira histFuncionariosCarreira);

	void editar(HistFuncionariosCarreira histFuncionariosCarreira);

	void excluir(Long id);

	HistFuncionariosCarreira buscarPorId(Long id);

	List<HistFuncionariosCarreira> buscarTodos();	

}
