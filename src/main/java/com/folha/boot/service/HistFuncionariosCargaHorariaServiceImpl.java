package com.folha.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.folha.boot.Reposytory.HistFuncionariosCargaHorariaReposytory;
import com.folha.boot.domain.HistFuncionariosCargaHoraria;

@Service
@Transactional(readOnly = false)
public class HistFuncionariosCargaHorariaServiceImpl implements HistFuncionariosCargaHorariaService{

	@Autowired
	private HistFuncionariosCargaHorariaReposytory reposytory;
	
	@Override
	public void salvar(HistFuncionariosCargaHoraria histFuncionariosCargaHoraria) {
		// TODO Auto-generated method stub
		reposytory.save(histFuncionariosCargaHoraria);
	}

	@Override
	public void editar(HistFuncionariosCargaHoraria histFuncionariosCargaHoraria) {
		// TODO Auto-generated method stub
		reposytory.save(histFuncionariosCargaHoraria);
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		reposytory.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public HistFuncionariosCargaHoraria buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return reposytory.findById(id).get();
	}

	@Transactional(readOnly = true)
	@Override
	public List<HistFuncionariosCargaHoraria> buscarTodos() {
		// TODO Auto-generated method stub
		return reposytory.findAll();
	}

}
