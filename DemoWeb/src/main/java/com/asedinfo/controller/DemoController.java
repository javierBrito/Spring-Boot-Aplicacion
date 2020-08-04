package com.asedinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.asedinfo.model.Persona;
import com.asedinfo.repo.IPersona;

@Controller
public class DemoController {
	// Instanciar interface persona
	@Autowired
	private IPersona iPersona;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		// Instanciar modelo/entidad persona
		Persona persona = new Persona();
		// Poblar entidad persona
		persona.setIdPersona(2);
		persona.setNombre("Vicente Brito");
		// Guardar entidad persona
		iPersona.save(persona);
		
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/listar")
	public String greeting(Model model) {
		model.addAttribute("personas", iPersona.findAll());
		return "greeting";
	}

}