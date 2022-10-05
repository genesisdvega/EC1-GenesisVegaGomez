package com.idat.ec1.genesisvega.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idat.ec1.genesisvega.entity.Profesor;
import com.idat.ec1.genesisvega.repository.ProfesorRepository;


@Service
public class ProfesorServiceImpl implements ProfesorService
{
	@Autowired
	private ProfesorRepository repository;

	@Override
	@Transactional(readOnly=false)
	public void insert(Profesor profesor) {
		repository.save(profesor);
	}

	@Override
	@Transactional(readOnly=false)
	public void update(Profesor profesor) {
		repository.save(profesor);		
	}

	@Override
	@Transactional(readOnly=false)
	public void delete(Integer idProfesor) {
		repository.deleteById(idProfesor);		
	}

	@Override
	@Transactional(readOnly=true)
	public Profesor findById(Integer idProfesor) {
		return repository.findById(idProfesor).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<Profesor> findAll() {
		return repository.findAll();
	}
}
