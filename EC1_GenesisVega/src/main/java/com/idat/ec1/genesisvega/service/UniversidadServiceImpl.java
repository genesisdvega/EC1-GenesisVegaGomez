package com.idat.ec1.genesisvega.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idat.ec1.genesisvega.entity.Universidad;
import com.idat.ec1.genesisvega.repository.UniversidadRepository;

@Service
public class UniversidadServiceImpl implements UniversidadService
{
	@Autowired
	private UniversidadRepository repository;

	@Override
	@Transactional(readOnly=false)
	public void insert(Universidad universidad) {
		repository.save(universidad);
	}

	@Override
	@Transactional(readOnly=false)
	public void update(Universidad universidad) {
		repository.save(universidad);		
	}

	@Override
	@Transactional(readOnly=false)
	public void delete(Integer idUniversidad) {
		repository.deleteById(idUniversidad);		
	}

	@Override
	@Transactional(readOnly=true)
	public Universidad findById(Integer idUniversidad) {
		return repository.findById(idUniversidad).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<Universidad> findAll() {
		return repository.findAll();
	}
}
