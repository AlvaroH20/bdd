package com.krakedev.TestComposicion;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {
		AdminProducto admin=new AdminProducto();
		Producto productoA=new Producto("Papitas",2.5);
		Producto productoB=new Producto("Doritos",2.5);
		
		Producto mc=admin.buscarMasCaro(productoA, productoB);
		if(mc==null) {
			System.out.println("Son iguales");
		}else {
		System.out.println("El producto mas caro es: "+mc.getNombre());
		}
	}

}
