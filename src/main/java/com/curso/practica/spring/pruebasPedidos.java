package com.curso.practica.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class pruebasPedidos {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = 
				new ClassPathXmlApplicationContext("gestion.xml");
																		//Puede ser un @Service, o un bean que configuramos en el fichero xml
		GestionPedidoService gps = (GestionPedidosServiceImp) ctx.getBean("gestionPedidosABC");
		gps.gestionar();
	}

}
