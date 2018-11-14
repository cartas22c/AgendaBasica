package com.capgemini.agendaBasica.negocioAgenda;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.capgemini.agendaBasica.negocio.ServiciosNegocioAgenda;
import com.capgemini.agendaBasica.negocio.ServiciosNegocioPersona;

public class NegocioAgenda implements ServiciosNegocioAgenda{
	
	private List<ServiciosNegocioPersona> contactos;
 	
	
	public List<ServiciosNegocioPersona> getContactos() {
		// TODO Auto-generated method stub
		return this.contactos;
	}
	
	public void setContactos(List<ServiciosNegocioPersona> contactos) {
		// TODO Auto-generated method stub
		this.contactos = contactos;
	}
	
	public ServiciosNegocioPersona getContacto(String dni) {
		// TODO Auto-generated method stub
		ServiciosNegocioPersona contactoSelected = this.contactos.stream().filter(p -> p.getDni().contains(dni)).collect(Collectors.toList()).get(0);
		return contactoSelected;
	}
	
	public void setContacto(ServiciosNegocioPersona contacto) {
		// TODO Auto-generated method stub
		this.contactos.add(contacto);
 	}
	
	public void removeContacto(String dni) {
		// TODO Auto-generated method stub
		ServiciosNegocioPersona contactoDelete= this.contactos.stream().filter(p -> p.getDni().contains(dni)).collect(Collectors.toList()).get(0);
		this.contactos.remove(contactoDelete);
	}
	
	public void showContactos() {
		// TODO Auto-generated method stub
		
		this.contactos.stream().forEach(p -> System.out.println(p.getNombre() + " " + p.getApellidos()));
	}

}
