package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class testProductos {

	public static void main(String[] args) {
		Producto producto=new Producto();
		producto.setPrecio(-55);
		double resultado=producto.calcularPrecioPromo(50);
		System.out.println("El precio con descuento es: "+resultado);
	}

}
   