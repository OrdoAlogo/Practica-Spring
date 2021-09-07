package com.curso.practica.spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class JefeEquipo implements Gestor {

	private int equipo;
	
	@Autowired
	//@Qualifier("progJava") //FUNCIONA
	@Resource(name="programador") //Funciona (nombres de los metodos que hay en AppConfig)
	private Recurso recurso;		//Y como bean llamamos a la misma clase JefeEq desde el main
	
	public JefeEquipo() {
		equipo = 1;
	}

	public JefeEquipo(int equipo, Recurso recurso) {
		super();
		this.equipo = equipo;
		this.recurso = recurso;
	}

	@Override
	public void gestionar() {
		System.out.println("Gestiono el Equipo: "+equipo);
		System.out.println("Iniciar Recursos");
		recurso.trabajar();

	}

}
