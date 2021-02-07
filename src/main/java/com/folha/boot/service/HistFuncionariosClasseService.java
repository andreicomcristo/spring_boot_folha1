package com.folha.boot.service;

import java.util.List;

import com.folha.boot.domain.HistFuncionariosClasse;

public interface HistFuncionariosClasseService {

	void salvar(HistFuncionariosClasse histFuncionariosClasse);

	void editar(HistFuncionariosClasse histFuncionariosClasse);

	void excluir(Long id);

	HistFuncionariosClasse buscarPorId(Long id);

	List<HistFuncionariosClasse> buscarTodos();
}
