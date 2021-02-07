package com.folha.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.folha.boot.Reposytory.HistUnidadesNaturezaJuridicaReposytory;
import com.folha.boot.domain.HistUnidadesNaturezaJuridica;

@Service
@Transactional(readOnly = false)
public class HistUnidadesNaturezaJuridicaServiceImpl  implements HistUnidadesNaturezaJuridicaService{

	@Autowired
	private HistUnidadesNaturezaJuridicaReposytory reposytory;
	@Override
	public void salvar(HistUnidadesNaturezaJuridica histUnidadesNaturezaJuridica) {
		// TODO Auto-generated method stub
		reposytory.save(histUnidadesNaturezaJuridica);
	}

	@Override
	public void editar(HistUnidadesNaturezaJuridica histUnidadesNaturezaJuridica) {
		// TODO Auto-generated method stub
		reposytory.save(histUnidadesNaturezaJuridica);
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		reposytory.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public HistUnidadesNaturezaJuridica buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return reposytory.findById(id).get();
	}

	@Transactional(readOnly = true)
	@Override
	public List<HistUnidadesNaturezaJuridica> buscarTodos() {
		// TODO Auto-generated method stub
		return reposytory.findAll();
	}

}
