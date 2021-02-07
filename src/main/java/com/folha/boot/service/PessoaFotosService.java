package com.folha.boot.service;

import java.util.List;

import com.folha.boot.domain.PessoaFotos;

public interface PessoaFotosService {
	
	void salvar(PessoaFotos pessoaFotos);

	void editar(PessoaFotos pessoaFotos);

	void excluir(Long id);

	PessoaFotos buscarPorId(Long id);

	List<PessoaFotos> buscarTodos();
}
