package com.capgemini.agendaBasica.negocioPersona;

import com.capgemini.agendaBasica.negocio.ServiciosNegocioPersona;

public class NegocioPersona implements ServiciosNegocioPersona {

	private String nombre;
	private String apellidos;
	private String dni;
	private String telefono;
	private String email;
	
	
	
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
 
		return this.nombre;
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		this.nombre = nombre;
	}

	@Override
	public String getApellidos() {
		// TODO Auto-generated method stub
		return this.apellidos;
	}

	@Override
	public void setApellidos(String apellidos) {
		// TODO Auto-generated method stub
		this.apellidos = apellidos;
	}

	@Override
	public String getDni() {
		// TODO Auto-generated method stub
		return this.dni;
	}

	@Override
	public void setDni(String dni) {
		// TODO Auto-generated method stub
		this.dni = dni;
	}

	@Override
	public String getTelefono() {
		// TODO Auto-generated method stub
		return this.telefono;
	}

	@Override
	public void setTelefono(String telefono) {
		// TODO Auto-generated method stub
		this.telefono = telefono;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return this.email;
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		this.email = email;
	}
	

}
