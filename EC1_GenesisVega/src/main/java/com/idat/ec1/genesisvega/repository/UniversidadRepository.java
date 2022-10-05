package com.idat.ec1.genesisvega.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.ec1.genesisvega.entity.Universidad;

//Uso de Spring Data
public interface UniversidadRepository extends JpaRepository<Universidad,Integer> {

}
