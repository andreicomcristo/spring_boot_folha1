package com.folha.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.folha.boot.Reposytory.HistFuncionariosUnidadeLotacaoReposytory;
import com.folha.boot.domain.HistFuncionariosUnidadeLotacao;

public class HistFuncionariosUnidadeLotacaoServiceImpl implements HistFuncionariosUnidadeLotacaoService {

	@Autowired
	private HistFuncionariosUnidadeLotacaoReposytory reposytory;
	
	@Override
	public void salvar(HistFuncionariosUnidadeLotacao histFuncionariosUnidadeLotacao) {
		// TODO Auto-generated method stub
		reposytory.save(histFuncionariosUnidadeLotacao);
	}

	@Override
	public void editar(HistFuncionariosUnidadeLotacao histFuncionariosUnidadeLotacao) {
		// TODO Auto-generated method stub
		reposytory.save(histFuncionariosUnidadeLotacao);
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		reposytory.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public HistFuncionariosUnidadeLotacao buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return reposytory.findById(id).get();
	}

	@Transactional(readOnly = true)
	@Override
	public List<HistFuncionariosUnidadeLotacao> buscarTodos() {
		// TODO Auto-generated method stub
		return reposytory.findAll();
	}

}
