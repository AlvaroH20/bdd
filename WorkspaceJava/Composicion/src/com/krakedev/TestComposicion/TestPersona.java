package com.krakedev.TestComposicion;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1=new Persona();
		p1.setNombre("Romario");
		p1.setApellido("Meneses");
		
		Direccion dir=new Direccion();
		dir.setCallePrincipal("Avenida el pibe");
		dir.setCalleSecundaria("Avenida Prakata");
		dir.setNumero("N-75");
		p1.setDireccion(dir);
		
		String nombre=p1.getNombre();
		Direccion d1=p1.getDireccion();
		
		System.out.println(nombre);
		//di esta null y trato de invocar a un metodo con esa variable
		System.out.println(d1.getCallePrincipal());
		
		                 //null.algunMetodo()
		p1.imprimir();
		
		Persona p2=new Persona();
		Direccion d2=new Direccion("Av shyris","Eloy Alfaro","S/N");
		p2.setNombre("Ana");
		p2.setDireccion(d2);
		p2.imprimir();
		
		Persona p3=new Persona();
		p3.setDireccion(new Direccion("xx","aa","125"));
		p3.imprimir();
	}

}
