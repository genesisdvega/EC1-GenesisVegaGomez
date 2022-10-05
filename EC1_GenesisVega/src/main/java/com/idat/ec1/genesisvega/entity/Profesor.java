package com.idat.ec1.genesisvega.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="profesores")
public class Profesor implements Serializable
{
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idProfesor;
	
	@Column
	private String profesor;
	
	
	@ManyToMany(mappedBy="itemsProfesor")
	private Set<Curso> itemsCuarto=new HashSet<>();
	
	public Profesor() {		
	}

	public Profesor(Integer idProfesor, String profesor, Set<Curso> itemsCuarto) {
		super();
		this.idProfesor = idProfesor;
		this.profesor = profesor;
		this.itemsCuarto = itemsCuarto;
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

	public Set<Curso> getItemsCuarto() {
		return itemsCuarto;
	}

	public void setItemsCuarto(Set<Curso> itemsCuarto) {
		this.itemsCuarto = itemsCuarto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	
	
}
