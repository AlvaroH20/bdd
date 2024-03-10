package com.krakedev.test;

import com.krakedev.Auto;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instar dos autos y referenciarlos con las variables correspondientes
		Auto auto1=new Auto();
		Auto auto2=new Auto();
		//modificar los valores de los atributos
		auto1.setMarca("Toyota");
		auto1.setAnio(2018);
		auto1.setPrecio(26911.45);
		auto2.setMarca("Ferrari");
		auto2.setAnio(2020);
		auto2.setPrecio(269900.58);
		//mostrar los valores de los atributos en consola
		System.out.println("Marca auto1:"+auto1.getMarca());
		System.out.println("Anio auto1:"+auto1.getAnio());
		System.out.println("Precio auto1:"+auto1.getPrecio());
		//auto 2
		System.out.println("***************");
		System.out.println("Marca auto2:"+auto2.getMarca());
		System.out.println("Anio auto2:"+auto2.getAnio());
		System.out.println("Precio auto2:"+auto2.getPrecio());
		
	}

}
