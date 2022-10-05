package com.idat.ec1.genesisvega.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idat.ec1.genesisvega.entity.MallaCurricular;
import com.idat.ec1.genesisvega.repository.MallaCurricularRepository;


@Service
public class MalllaCurricularServiceImpl implements MallaCurricularService
{
	@Autowired
	private MallaCurricularRepository repository;

	@Override
	@Transactional(readOnly=false)
	public void insert(MallaCurricular mallacurricular) {
		repository.save(mallacurricular);
	}

	@Override
	@Transactional(readOnly=false)
	public void update(MallaCurricular mallacurricular) {
		repository.save(mallacurricular);		
	}

	@Override
	@Transactional(readOnly=false)
	public void delete(Integer idMalla) {
		repository.deleteById(idMalla);		
	}

	@Override
	@Transactional(readOnly=true)
	public MallaCurricular findById(Integer idMalla) {
		return repository.findById(idMalla).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<MallaCurricular> findAll() {
		return repository.findAll();
	}
}
