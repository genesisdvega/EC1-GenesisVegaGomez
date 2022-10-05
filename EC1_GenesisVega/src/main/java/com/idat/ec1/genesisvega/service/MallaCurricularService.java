package com.idat.ec1.genesisvega.service;

import java.util.Collection;

import com.idat.ec1.genesisvega.entity.MallaCurricular;

public interface MallaCurricularService 
{
	public abstract void insert(MallaCurricular mallacurricular);
	public abstract void update(MallaCurricular mallacurricular);
	public abstract void delete(Integer idMalla);
	public abstract MallaCurricular findById(Integer idMalla);
	public abstract Collection<MallaCurricular> findAll();
}
