package com.asedinfo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asedinfo.model.Persona;
import com.asedinfo.repo.IPersona;

@RestController
@RequestMapping("/personas")
public class RestDemoController {
	// Instanciar interface persona
	@Autowired
	private IPersona iPersona;
	
	@GetMapping
	public List<Persona> listar() {
		return iPersona.findAll();
	}
	
	@PostMapping
	public void insertar(@RequestBody Persona persona) {
		iPersona.save(persona);
	}
	
	@PutMapping
	public void modificar(@RequestBody Persona persona) {
		iPersona.save(persona);
	}
	
	@DeleteMapping(value="/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		iPersona.deleteById(id);
	}

}