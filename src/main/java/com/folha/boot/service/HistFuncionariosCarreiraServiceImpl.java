package com.folha.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.folha.boot.Reposytory.HistFuncionariosCarreiraReposytory;
import com.folha.boot.domain.HistFuncionariosCarreira;

@Service
@Transactional(readOnly = false)
public class HistFuncionariosCarreiraServiceImpl implements HistFuncionariosCarreiraService{

	@Autowired
	private HistFuncionariosCarreiraReposytory reposytory;
	@Override
	public void salvar(HistFuncionariosCarreira histFuncionariosCarreira) {
		// TODO Auto-generated method stub
		reposytory.save(histFuncionariosCarreira);
	}

	@Override
	public void editar(HistFuncionariosCarreira histFuncionariosCarreira) {
		// TODO Auto-generated method stub
		reposytory.save(histFuncionariosCarreira);
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		reposytory.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public HistFuncionariosCarreira buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return reposytory.findById(id).get();
	}

	@Transactional(readOnly = true)
	@Override
	public List<HistFuncionariosCarreira> buscarTodos() {
		// TODO Auto-generated method stub
		return reposytory.findAll();
	}

}
