package com.idat.ec1.genesisvega.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.ec1.genesisvega.entity.Profesor;


//Uso de Spring Data
public interface ProfesorRepository extends JpaRepository<Profesor,Integer> {

}
