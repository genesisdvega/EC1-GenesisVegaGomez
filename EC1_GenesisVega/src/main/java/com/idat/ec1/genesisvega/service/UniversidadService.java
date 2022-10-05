package com.idat.ec1.genesisvega.service;

import java.util.Collection;

import com.idat.ec1.genesisvega.entity.Universidad;

public interface UniversidadService 
{
	public abstract void insert(Universidad universidad);
	public abstract void update(Universidad universidad);
	public abstract void delete(Integer idUniversidad);
	public abstract Universidad findById(Integer idUniversidad);
	public abstract Collection<Universidad> findAll();
}
