package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class Testtelefono4 {

	public static void main(String[] args) {
		Telefono fono1=new Telefono("movi","0989987835",60);
		Telefono fono2=new Telefono("claro","0912345455",70);
		Telefono fono3=new Telefono("claro","0984587568",80);
		Telefono fono4=new Telefono("claro","0985789656",90);
		
		AdminTelefono clar=new AdminTelefono();
		int cont=clar.contarClaro(fono1, fono2, fono3, fono4);
		System.out.println("Existen esta cantidad de operadoras claro: "+cont);
	}

}
