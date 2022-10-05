package com.idat.ec1.genesisvega.mapper;

import com.idat.ec1.genesisvega.entity.Universidad;


public class UniversidadMapper 
{
	private Integer idUniversidad;
	private String universidad;

	public UniversidadMapper() {		
	}

	public UniversidadMapper(Integer idUniversidad, String universidad) {
		super();
		this.idUniversidad = idUniversidad;
		this.universidad = universidad;
	}

	public Integer getIdUniversidad() {
		return idUniversidad;
	}

	public void setIdUniversidad(Integer idUniversidad) {
		this.idUniversidad = idUniversidad;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}


	
	
	
}
