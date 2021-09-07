package com.curso.practica.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public JefeEquipo jefeE() {
		return new JefeEquipo();
	}
	
	@Bean
	public Programador programador() {
		Programador p = new Programador();
		p.setTarea("Programar en C++");
		return p;
	}
	
	@Bean
	public Programador programador2() {
		Programador p = new Programador();
		p.setTarea("Programar en Java EE");
		return p;
	}

}
