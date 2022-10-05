package com.idat.ec1.genesisvega.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idat.ec1.genesisvega.entity.Curso;
import com.idat.ec1.genesisvega.repository.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService {

	@Autowired
	private CursoRepository repository;

	@Override
	@Transactional(readOnly=false)
	public void insert(Curso curso) {
		repository.save(curso);
	}

	@Override
	@Transactional(readOnly=false)
	public void update(Curso curso) {
		repository.save(curso);		
	}

	@Override
	@Transactional(readOnly=false)
	public void delete(Integer idCurso) {
		repository.deleteById(idCurso);		
	}

	@Override
	@Transactional(readOnly=true)
	public Curso findById(Integer idCurso) {
		return repository.findById(idCurso).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<Curso> findAll() {
		return repository.findAll();
	}
	
	@Override
	@Transactional(readOnly=true)
	public Collection<Object[]> findAll_withProfesores() {
		return repository.findAll_withProfesores();
	}

}
