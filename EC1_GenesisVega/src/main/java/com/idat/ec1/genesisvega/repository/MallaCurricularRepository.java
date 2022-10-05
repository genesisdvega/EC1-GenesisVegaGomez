package com.idat.ec1.genesisvega.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.ec1.genesisvega.entity.MallaCurricular;

//Uso de Spring Data
public interface MallaCurricularRepository extends JpaRepository<MallaCurricular,Integer> {

}
