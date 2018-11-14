package com.capgemini.agendaBasica.negocio;

import java.util.List;

 
public interface ServiciosNegocioAgenda {
	
	public List<ServiciosNegocioPersona> getContactos();
	public void setContactos(List<ServiciosNegocioPersona> contactos);
	public ServiciosNegocioPersona getContacto(String dni);
	public void setContacto(ServiciosNegocioPersona contacto);
	public void removeContacto(String dni);
	public void showContactos();

}
