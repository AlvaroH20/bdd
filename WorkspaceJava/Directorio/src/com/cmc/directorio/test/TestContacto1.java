package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef=new Telefono("movi","0987598136",100);
		Contacto c=new Contacto("Cortez",telef,75.6);
		c.imprimir();
		System.out.println("Operadora: "+telef.getOperadora());
	}

}
