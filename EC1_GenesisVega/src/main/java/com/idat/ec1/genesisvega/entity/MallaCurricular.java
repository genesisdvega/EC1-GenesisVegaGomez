package com.idat.ec1.genesisvega.entity;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collection;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="mallacurriculares")
public class MallaCurricular implements Serializable
{
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idMalla;
	
	@Column
	private String año;

	@OneToOne(cascade = CascadeType.MERGE, orphanRemoval = true)
	@JoinColumn(name="universidad_id",nullable=false)
	private Universidad universidad;
	
	@OneToMany(mappedBy="malla",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Collection<Curso> itemsCurso=new ArrayList<>();
	
	
	public MallaCurricular() {		
	}


	public MallaCurricular(Integer idMalla, String año, Universidad universidad, Collection<Curso> itemsCurso) {
		super();
		this.idMalla = idMalla;
		this.año = año;
		this.universidad = universidad;
		this.itemsCurso = itemsCurso;
	}


	public Integer getIdMalla() {
		return idMalla;
	}


	public void setIdMalla(Integer idMalla) {
		this.idMalla = idMalla;
	}


	public String getAño() {
		return año;
	}


	public void setAño(String año) {
		this.año = año;
	}


	public Universidad getUniversidad() {
		return universidad;
	}


	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}


	public Collection<Curso> getItemsCurso() {
		return itemsCurso;
	}


	public void setItemsCurso(Collection<Curso> itemsCurso) {
		this.itemsCurso = itemsCurso;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
}
