package com.folha.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.folha.boot.Reposytory.HistUnidadesRegimeReposytory;
import com.folha.boot.domain.HistUnidadesRegime;

@Service
@Transactional(readOnly = false)
public class HistUnidadesRegimeServiceImpl implements HistUnidadesRegimeService{

	@Autowired
	private HistUnidadesRegimeReposytory reposytory;
	@Override
	public void salvar(HistUnidadesRegime histUnidadesRegime) {
		// TODO Auto-generated method stub
		reposytory.save(histUnidadesRegime);
	}

	@Override
	public void editar(HistUnidadesRegime histUnidadesRegime) {
		// TODO Auto-generated method stub
		reposytory.save(histUnidadesRegime);
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		reposytory.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public HistUnidadesRegime buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return reposytory.findById(id).get();
	}

	@Transactional(readOnly = true)
	@Override
	public List<HistUnidadesRegime> buscarTodos() {
		// TODO Auto-generated method stub
		return reposytory.findAll();
	}

}
