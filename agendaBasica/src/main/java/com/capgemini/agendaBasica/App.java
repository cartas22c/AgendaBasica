package com.capgemini.agendaBasica;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.agendaBasica.negocio.ServiciosNegocioAgenda;
import com.capgemini.agendaBasica.negocio.ServiciosNegocioPersona;

/**
 * Hello world!
 *
 */
public class App 
{

	public static ApplicationContext contexto;


	public static void main( String[] args )
	{
		System.out.println( "---Agenda---!" );
		contexto = new ClassPathXmlApplicationContext("beans.xml");
		
		ServiciosNegocioAgenda myagenda = (ServiciosNegocioAgenda) contexto.getBean("serviciosNegocioAgenda");
		myagenda.showContactos();
		
		myagenda.getContacto("53473082Z").setNombre("Peeliiiiiuuuusaa");
		myagenda.showContactos();

		
	}
}
