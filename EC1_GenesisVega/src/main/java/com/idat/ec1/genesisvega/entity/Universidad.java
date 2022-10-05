package com.idat.ec1.genesisvega.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="universidades")
public class Universidad implements Serializable
{
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idUniversidad;
	
	@Column
	private String universidad;

	
	@OneToOne(mappedBy="universidad",cascade = CascadeType.MERGE, orphanRemoval = true)
	private MallaCurricular mallacurricular;
	
	public Universidad() {		
	}

	public Universidad(Integer idUniversidad, String universidad, MallaCurricular mallacurricular) {
		super();
		this.idUniversidad = idUniversidad;
		this.universidad = universidad;
		this.mallacurricular = mallacurricular;
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

	public MallaCurricular getMallacurricular() {
		return mallacurricular;
	}

	public void setMallacurricular(MallaCurricular mallacurricular) {
		this.mallacurricular = mallacurricular;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
