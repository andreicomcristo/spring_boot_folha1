package com.folha.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.folha.boot.Reposytory.HistUnidadesDiretorReposytory;
import com.folha.boot.domain.HistUnidadesDiretor;

@Service
@Transactional(readOnly = false)
public class HistUnidadesDiretorServiceImpl implements HistUnidadesDiretorService{

	@Autowired
	private HistUnidadesDiretorReposytory reposytory;
	@Override
	public void salvar(HistUnidadesDiretor histUnidadesDiretor) {
		// TODO Auto-generated method stub
		reposytory.save(histUnidadesDiretor);
	}

	@Override
	public void editar(HistUnidadesDiretor histUnidadesDiretor) {
		// TODO Auto-generated method stub
		reposytory.save(histUnidadesDiretor);
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		reposytory.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public HistUnidadesDiretor buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return reposytory.findById(id).get();
	}

	@Transactional(readOnly = true)
	@Override
	public List<HistUnidadesDiretor> buscarTodos() {
		// TODO Auto-generated method stub
		return reposytory.findAll();
	}

}
