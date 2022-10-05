package com.idat.ec1.genesisvega.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.ec1.genesisvega.entity.Universidad;
import com.idat.ec1.genesisvega.service.UniversidadService;


@RestController
@RequestMapping("/piso")
public class UniversidadController 
{
	@Autowired
	private UniversidadService universidadService;
	
	public UniversidadController() {		
	}
	
	@GetMapping("/listar")
	public ResponseEntity<?> listar_GET()
	{
		Collection<Universidad> collection=universidadService.findAll();
		Collection<UniversidadoMapper> collectionMapper=UtilMapper.toUniversidad(collection);
		
		if(collection.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		else {
			return new ResponseEntity<>(collectionMapper,HttpStatus.OK);
		}
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<?> registrar_POST(@RequestBody Universidad universidad)
	{
		universidadService.insert(universidad);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping("/editar/{idUniversidad}")
	public ResponseEntity<?> editar_PUT(@RequestBody Universidad universidadEdit,@PathVariable Integer idUniversidad)
	{
		Universidad universidadDb=universidadService.findById(idUniversidad);
		
		if(universidadDb!=null)
		{
			universidadEdit.setIdUniversidad(idUniversidad)
			universidadService.update(universidadEdit);
			
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
		return new ResponseEntity<>("¡Error, universidad no existe!",HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/borrar/{idUniversidad}")
	public ResponseEntity<?> borrar_DELETE(@PathVariable Integer idUniversidad) 
	{
		Universidad universidadDb=universidadService.findById(idUniversidad);
		
		if(universidadDb!=null)
		{
			universidadService.delete(idUniversidad);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
		return new ResponseEntity<>("¡Error, universidad no existe!",HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/buscar/{idUniversidad}")
	public ResponseEntity<?> buscar_GET(@PathVariable Integer idUniversidad)
	{
		Universidad pisoDb=universidadService.findById(idUniversidad);
		UniversidadoMapper universidadMapper = new UniversidadoMapper(universidadDb);
		
		if(universidadMapper!=null) {
			return new ResponseEntity<>(universidadMapper,HttpStatus.FOUND);
		}
		
		return new ResponseEntity<>("¡Error, universidad no existe!",HttpStatus.NOT_FOUND);
	}
}











