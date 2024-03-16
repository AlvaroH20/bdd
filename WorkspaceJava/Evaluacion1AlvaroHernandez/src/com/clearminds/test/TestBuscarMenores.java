package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;


public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda(new Celda("C1"));
		maquina.agregarCelda(new Celda("C2"));
		maquina.agregarCelda(new Celda("D1"));
		maquina.agregarCelda(new Celda("D2"));
		maquina.agregarCelda(new Celda("E1"));
		maquina.agregarCelda(new Celda("E2"));

		Producto producto1 = new Producto("CH001", "Chocolate", 1.50);
		maquina.cargarProducto(producto1, "C1", 8);

		Producto producto2 = new Producto("GA002", "Galletas", 1.20);
		maquina.cargarProducto(producto2, "C2", 6);

		Producto producto3 = new Producto("PA003", "Papitas", 0.80);
		maquina.cargarProducto(producto3, "D1", 10);

		Producto producto4 = new Producto("CH004", "Chicles", 0.50);
		maquina.cargarProducto(producto4, "D2", 12);

		Producto producto5 = new Producto("GO005", "Gomitas", 1.00);
		maquina.cargarProducto(producto5, "E1", 5);

		Producto producto6 = new Producto("CA006", "Caramelos", 0.75);
		maquina.cargarProducto(producto6, "E2", 7);
		
		ArrayList<Producto> menores=maquina.buscarMenores(1.10);
		System.out.println("Productos Menores: "+menores.size());
		for (int i = 0; i < menores.size(); i++) {
		    Producto producto = menores.get(i);
		    System.out.println("Nombre: " + producto.getNombre() + " Precio: " + producto.getPrecio());
		}
	}

}


