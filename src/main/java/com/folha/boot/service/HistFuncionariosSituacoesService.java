package com.folha.boot.service;

import java.util.List;

import com.folha.boot.domain.HistFuncionariosSituacoes;

public interface HistFuncionariosSituacoesService {

	void salvar(HistFuncionariosSituacoes histFuncionariosSituacoes);

	void editar(HistFuncionariosSituacoes HistFuncionariosSituacoes);

	void excluir(Long id);

	HistFuncionariosSituacoes buscarPorId(Long id);

	List<HistFuncionariosSituacoes> buscarTodos();
}
