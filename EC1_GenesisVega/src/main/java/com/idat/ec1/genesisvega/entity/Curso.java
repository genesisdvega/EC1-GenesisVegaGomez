package com.idat.ec1.genesisvega.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cursos")
public class Curso implements Serializable
{
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idCurso;
	
	@Column
	private String curso;
	
	@Column
	private String descripcion;
	
	@ManyToMany
	@JoinTable(name="cursos_profesores",
		joinColumns=@JoinColumn(name="curso_id"),
		inverseJoinColumns=@JoinColumn(name="profesores_id"))
	private Set<Profesor> itemsProfesorr=new HashSet<>();
	
	@ManyToOne
	@JoinColumn(name="malla_id",nullable=false)
	private MallaCurricular mallamallacurricular;
	
	public Curso() {		
	}

	public Curso(Integer idCurso, String curso, String descripcion, Set<Profesor> itemsProfesorr,
			MallaCurricular mallamallacurricular) {
		super();
		this.idCurso = idCurso;
		this.curso = curso;
		this.descripcion = descripcion;
		this.itemsProfesorr = itemsProfesorr;
		this.mallamallacurricular = mallamallacurricular;
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

	public Set<Profesor> getItemsProfesorr() {
		return itemsProfesorr;
	}

	public void setItemsProfesorr(Set<Profesor> itemsProfesorr) {
		this.itemsProfesorr = itemsProfesorr;
	}

	public MallaCurricular getMallamallacurricular() {
		return mallamallacurricular;
	}

	public void setMallamallacurricular(MallaCurricular mallamallacurricular) {
		this.mallamallacurricular = mallamallacurricular;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	
	
	
}
