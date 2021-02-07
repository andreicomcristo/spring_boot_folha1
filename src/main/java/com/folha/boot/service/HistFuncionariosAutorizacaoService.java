package com.folha.boot.service;

import java.util.List;

import com.folha.boot.domain.HistFuncionariosAutorizacao;

public interface HistFuncionariosAutorizacaoService {
	
	void salvar(HistFuncionariosAutorizacao histFuncionariosAutorizacao);

	void editar(HistFuncionariosAutorizacao histFuncionariosAutorizacao);

	void excluir(Long id);

	HistFuncionariosAutorizacao buscarPorId(Long id);

	List<HistFuncionariosAutorizacao > buscarTodos();

}
