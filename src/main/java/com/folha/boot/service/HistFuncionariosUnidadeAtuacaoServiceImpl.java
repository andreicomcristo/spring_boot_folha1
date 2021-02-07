package com.folha.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.folha.boot.Reposytory.HistFuncionariosUnidadeAtuacaoReposytory;
import com.folha.boot.domain.HistFuncionariosUnidadeAtuacao;

@Service
@Transactional(readOnly = false)
public class HistFuncionariosUnidadeAtuacaoServiceImpl implements HistFuncionariosUnidadeAtuacaoService{

	@Autowired
	private HistFuncionariosUnidadeAtuacaoReposytory reposytory;
	
	@Override
	public void salvar(HistFuncionariosUnidadeAtuacao histFuncionariosUnidadeAtuacao) {
		// TODO Auto-generated method stub
		reposytory.save(histFuncionariosUnidadeAtuacao);
	}

	@Override
	public void editar(HistFuncionariosUnidadeAtuacao histFuncionariosUnidadeAtuacao) {
		// TODO Auto-generated method stub
		reposytory.save(histFuncionariosUnidadeAtuacao);
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		reposytory.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public HistFuncionariosUnidadeAtuacao buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return reposytory.findById(id).get();
	}

	@Transactional(readOnly = true)
	@Override
	public List<HistFuncionariosUnidadeAtuacao> buscarTodos() {
		// TODO Auto-generated method stub
		return reposytory.findAll();
	}

}
