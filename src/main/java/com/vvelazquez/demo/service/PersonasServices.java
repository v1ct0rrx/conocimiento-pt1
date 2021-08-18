package com.vvelazquez.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vvelazquez.demo.entidades.Persona;

@Service("PersonasServices")
public class PersonasServices {

	public List<Persona> obtenerPersona(Integer id, String nombre, String apellido1, String apellido2, Short edad){
		
		List<Persona> aux1 = new ArrayList<>();
		
		for(int i= 0; i < 10; i++) {
			aux1.add(new Persona(id + i, nombre, apellido1, apellido2, edad));
		}

		this.filtrarPersonas(aux1);
		
		return aux1;
	}

	private void filtrarPersonas(List<Persona> aux1) {
		Iterator<Persona> iterator = aux1.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getId() > 5) {
				iterator.remove();
			}
		}
	}
	
}
