package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instar dos autos y referenciarlos con las variables correspondientes
		Auto auto1=new Auto();
		Auto auto2=new Auto();
		//modificar los valores de los atributos
		auto1.marca="Toyota";
		auto1.anio=2018;
		auto1.precio=26911.45;
		auto2.marca="Ferrari";
		auto2.anio=2020;
		auto2.precio=269900.58;
		//mostrar los valores de los atributos en consola
		System.out.println("Marca auto1:"+auto1.marca);
		System.out.println("Anio auto1:"+auto1.anio);
		System.out.println("Precio auto1:"+auto1.precio);
		//auto 2
		System.out.println("***************");
		System.out.println("Marca auto2:"+auto2.marca);
		System.out.println("Anio auto2:"+auto2.anio);
		System.out.println("Precio auto2:"+auto2.precio);
		
	}

}
