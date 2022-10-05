package com.idat.ec1.genesisvega.service;

import java.util.Collection;

import com.idat.ec1.genesisvega.entity.Profesor;

public interface ProfesorService 
{
	public abstract void insert(Profesor profesor);
	public abstract void update(Profesor profesor);
	public abstract void delete(Integer idProfesor);
	public abstract Profesor findById(Integer idProfesor);
	public abstract Collection<Profesor> findAll();
}
