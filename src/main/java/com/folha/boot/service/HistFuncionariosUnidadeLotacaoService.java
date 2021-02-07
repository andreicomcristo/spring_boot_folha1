package com.folha.boot.service;

import java.util.List;

import com.folha.boot.domain.HistFuncionariosUnidadeLotacao;

public interface HistFuncionariosUnidadeLotacaoService {
	
	void salvar(HistFuncionariosUnidadeLotacao histFuncionariosUnidadeLotacao);

	void editar(HistFuncionariosUnidadeLotacao histFuncionariosUnidadeLotacao);

	void excluir(Long id);

	HistFuncionariosUnidadeLotacao buscarPorId(Long id);

	List<HistFuncionariosUnidadeLotacao> buscarTodos();

}
