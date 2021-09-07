package com.curso.practica.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//El nombre del bean que ponemos en el main
@Service("gestionPedidosABC")
public class GestionPedidosServiceImp implements GestionPedidoService {

	@Autowired
	private Pedido pedido;
	
	@Override
	public void gestionar() {
		System.out.println("....Gestionando Pedidos.....");
		pedido.pidiendo();

	}

}
