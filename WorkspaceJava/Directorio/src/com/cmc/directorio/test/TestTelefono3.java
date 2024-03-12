package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono fono1=new Telefono("movi","0987598135",30);
		Telefono fono2=new Telefono("movi","0982645455",40);
		Telefono fono3=new Telefono("claro","0985454455",50);
		
		AdminTelefono mov=new AdminTelefono();
		int contados=mov.contarMovi(fono1, fono2, fono3);
		System.out.println("Existen esta cantidad de operadoras movi: "+contados);

	}

}
