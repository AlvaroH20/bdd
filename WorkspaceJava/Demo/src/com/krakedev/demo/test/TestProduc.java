package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProduc {

	public static void main(String[] args) {
		Producto producto1=new Producto(154,"CocaCola");
		producto1.setDescripcion("Esta muy bueno");
		producto1.setPeso(1.5);
		
		System.out.println("-----------------");
		System.out.println("PRODUCTOS");
		System.out.println("-----------------");
		System.out.println("Codigo: "+producto1.getCodigo());
		System.out.println("Nombre: "+producto1.getNombre());
		System.out.println("Descripcion: "+producto1.getDescripcion());
		System.out.println("Peso: "+producto1.getPeso());

	}

}