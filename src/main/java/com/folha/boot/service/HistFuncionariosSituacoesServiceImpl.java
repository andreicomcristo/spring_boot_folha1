package com.folha.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.folha.boot.Reposytory.HistFuncionariosSituacoesReposytory;
import com.folha.boot.domain.HistFuncionariosSituacoes;

@Service
@Transactional(readOnly = false)
public class HistFuncionariosSituacoesServiceImpl implements HistFuncionariosSituacoesService{

	@Autowired
	private HistFuncionariosSituacoesReposytory reposytory;
	
	@Override
	public void salvar(HistFuncionariosSituacoes histFuncionariosSituacoes) {
		// TODO Auto-generated method stub
		reposytory.save(histFuncionariosSituacoes);
	}

	@Override
	public void editar(HistFuncionariosSituacoes histFuncionariosSituacoes) {
		// TODO Auto-generated method stub
		reposytory.save(histFuncionariosSituacoes);
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		reposytory.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public HistFuncionariosSituacoes buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return reposytory.findById(id).get();
	}

	@Transactional(readOnly = true)
	@Override
	public List<HistFuncionariosSituacoes> buscarTodos() {
		// TODO Auto-generated method stub
		return reposytory.findAll();
	}

}
