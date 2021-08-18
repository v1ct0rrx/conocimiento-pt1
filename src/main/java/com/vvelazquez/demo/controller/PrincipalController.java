package com.vvelazquez.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vvelazquez.demo.entidades.Persona;
import com.vvelazquez.demo.service.PersonasServices;

@RestController
@RequestMapping("/principal")
public class PrincipalController {
	
	private PersonasServices personasService;

	@Autowired
	public PrincipalController (PersonasServices personasService) {
		this.personasService = personasService;
	}
	

	@GetMapping
	public String holaMundo() {
		return "HolaMundo";
	}

	@GetMapping("/persona/{id}")
	public List<Persona> buscar(@PathVariable(name = "id") Integer id, @RequestParam(name="nombre", required = false) String nombre, 
																 @RequestParam(name="apellido1", required = false) String apellido1, 
																 @RequestParam(name="apellido2", required = false) String apellido2, 
																 @RequestParam(name="edad", required = false) Short edad) {
		
		return personasService.obtenerPersona(id, nombre, apellido1, apellido2, edad);
	}

	
}
