package com.idat.ec1.genesisvega.service;

import java.util.Collection;
import java.util.List;

import com.idat.ec1.genesisvega.entity.Curso;


public interface CursoService 
{
	public abstract void insert(Curso curso);
	public abstract void update(Curso curso);
	public abstract void delete(Integer idCurso);
	public abstract Curso findById(Integer idCurso);
	public abstract Collection<Curso> findAll();
	
	public abstract Collection<Object[]> findAll_withProfesores();
}
