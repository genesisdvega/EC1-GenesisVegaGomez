package com.idat.ec1.genesisvega.util;

import java.util.ArrayList;
import java.util.Collection;

import com.idat.ec1.genesisvega.entity.MallaCurricular;
import com.idat.ec1.genesisvega.entity.Profesor;
import com.idat.ec1.genesisvega.entity.Universidad;
import com.idat.ec1.genesisvega.mapper.ProfesorMapper;
import com.idat.ec1.genesisvega.mapper.UniversidadMapper;




public class UtilMapper 
{
	public static Collection<CursoMapper> toCurso(Collection<Curso> cursos)
	{
		Collection<CursoMapper> mapper=new ArrayList<>();
		
		for(Curso cuarto:cuartos) 
		{
			CursoMapper cursoMapper=new CursoMapper(cuarto);
			mapper.add(cursoMapper);
		}
		
		return mapper;
	}
	
	public static Collection<MallaCurricularMapper> toMallaCurricular(Collection<MallaCurricular> mallacurriculares)
	{
		Collection<MallaCurricularMapper> mapper=new ArrayList<>();
		
		for(MallaCurricular mallacurricular:mallacurriculares) 
		{
			MallaCurricularMapper mallacurricularMapper=new MallaCurricularMapper(mallacurricular);
			mapper.add(mallacurricularMapper);
		}
		
		return mapper;
	}
	
	public static Collection<ProfesorMapper> toProfesor(Collection<Profesor> profesores)
	{
		Collection<ProfesorMapper> mapper=new ArrayList<>();
		
		for(Profesor profesor:profesores) 
		{
			ProfesorMapper profesorMapper=new ProfesorMapper(profesor);
			mapper.add(profesorMapper);
		}
		
		return mapper;
	}
	
	public static Collection<UniversidadMapper> toUniversidad(Collection<Universidad> universidades)
	{
		Collection<UniversidadMapper> mapper=new ArrayList<>();
		
		for(Universidad universidad:universidades) 
		{
			UniversidadMapper universidadMapper=new UniversidadMapper(universidad);
			mapper.add(universidadMapper);
		}
		
		return mapper;
	}
	



}

