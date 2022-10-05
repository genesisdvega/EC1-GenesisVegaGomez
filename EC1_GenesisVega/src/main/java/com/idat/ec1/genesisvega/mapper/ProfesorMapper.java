package com.idat.ec1.genesisvega.mapper;

import com.idat.ec1.genesisvega.entity.Profesor;

public class ProfesorMapper 
{
	private Integer idProfesor;
	private String profesor;
	
	public ProfesorMapper() {		
	}

	public ProfesorMapper(Integer idProfesor, String profesor) {
		super();
		this.idProfesor = idProfesor;
		this.profesor = profesor;
	}

	public Integer getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(Integer idProfesor) {
		this.idProfesor = idProfesor;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	
}
