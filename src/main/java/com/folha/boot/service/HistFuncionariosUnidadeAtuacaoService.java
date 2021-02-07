package com.folha.boot.service;

import java.util.List;

import com.folha.boot.domain.HistFuncionariosUnidadeAtuacao;

public interface HistFuncionariosUnidadeAtuacaoService {

	void salvar(HistFuncionariosUnidadeAtuacao histFuncionariosUnidadeAtuacao);

	void editar(HistFuncionariosUnidadeAtuacao histFuncionariosUnidadeAtuacao);

	void excluir(Long id);

	HistFuncionariosUnidadeAtuacao buscarPorId(Long id);

	List<HistFuncionariosUnidadeAtuacao> buscarTodos();
}
