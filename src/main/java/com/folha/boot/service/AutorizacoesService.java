package com.folha.boot.service;

import java.util.List;

import com.folha.boot.domain.Autorizacoes;

public interface AutorizacoesService {

	void salvar(Autorizacoes autorizacoes);

	void editar(Autorizacoes autorizacoes);

	void excluir(Long id);

	Autorizacoes buscarPorId(Long id);

	List<Autorizacoes> buscarTodos();

}
