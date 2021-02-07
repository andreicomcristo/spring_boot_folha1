package com.folha.boot.service;

import java.util.List;

import com.folha.boot.domain.HistFuncionariosCargaHoraria;

public interface HistFuncionariosCargaHorariaService {

	void salvar(HistFuncionariosCargaHoraria histFuncionariosCargaHoraria);

	void editar(HistFuncionariosCargaHoraria histFuncionariosCargaHoraria);

	void excluir(Long id);

	HistFuncionariosCargaHoraria  buscarPorId(Long id);

	List<HistFuncionariosCargaHoraria> buscarTodos();
}
