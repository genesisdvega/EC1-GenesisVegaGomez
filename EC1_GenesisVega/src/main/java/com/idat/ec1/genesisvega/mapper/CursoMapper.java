package com.idat.ec1.genesisvega.mapper;

import pe.idat.Calificada.entity.Cuarto;
import pe.idat.Calificada.entity.Dueno;


public class CursoMapper 
{
	private Integer idCurso;
	private String curso;
	private String descripcion;

	
	public CursoMapper() {		
	}


	public CursoMapper(Integer idCurso, String curso, String descripcion) {
		super();
		this.idCurso = idCurso;
		this.curso = curso;
		this.descripcion = descripcion;
	}


	public Integer getIdCurso() {
		return idCurso;
	}


	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	

	
	
	
}
