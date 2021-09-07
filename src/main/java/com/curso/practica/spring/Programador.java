package com.curso.practica.spring;

public class Programador implements Recurso {

	private String tarea;
	
	
	public Programador() {
		this.tarea = "Programador";
	}


	@Override
	public void trabajar() {
		System.out.println("Realizo la tarea de: "+tarea);
	}
	public String getTarea() {
		return tarea;
	}
	public void setTarea(String tarea) {
		this.tarea = tarea;
	}
	

}
