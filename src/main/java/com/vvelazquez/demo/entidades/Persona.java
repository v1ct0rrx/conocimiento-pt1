package com.vvelazquez.demo.entidades;

public class Persona {

	private Integer id;
	
	private String nombre;
	
	private String apellido1;
	
	private String apellido2;
	
	private Short edad;
	
	public Persona(Integer id, String nombre, String apellido1, String apellido2, Short edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public Short getEdad() {
		return edad;
	}

	public void setEdad(Short edad) {
		this.edad = edad;
	}
	
}
