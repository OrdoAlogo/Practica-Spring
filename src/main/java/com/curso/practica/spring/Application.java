package com.curso.practica.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application
{
	public static void main( String[] args )
	{
		/*ConfigurableApplicationContext ctx = 
				new ClassPathXmlApplicationContext("gestion.xml");
		
		
		Gestor servicio = (Gestor) ctx.getBean("jefe1");
		servicio.gestionar();
		
		System.out.println("Fin de los Gestores");
		
		Recurso trabajo = (Recurso) ctx.getBean("prog1");
		trabajo.trabajar();*/
		
		ConfigurableApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		Gestor servicio = (Gestor) ctx.getBean(JefeEquipo.class);
		servicio.gestionar();
	}
}