package com.idat.ec1.genesisvega.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.idat.ec1.genesisvega.entity.Curso;



//Uso de Spring Data
public interface CursoRepository extends JpaRepository<Curso,Integer> {
	public abstract Collection<Object[]> findAll_withProfesores();

}
