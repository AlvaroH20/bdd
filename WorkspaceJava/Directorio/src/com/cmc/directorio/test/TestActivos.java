package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telefono1 = new Telefono("claro", "098758465", 120);
		Contacto contacto1 = new Contacto("Carvajal", telefono1, 95);
		Telefono telefono2 = new Telefono("movi", "098715489", 130);
		Contacto contacto2 = new Contacto("Messi", telefono2, 58);
		
		System.out.println("Peso: "+contacto1.getPeso());
		System.out.println("Apellido: "+contacto1.getApellido());
		telefono1.imprimir();
		System.out.println("///////////////////////////////");
		AdminTelefono activar=new AdminTelefono();
		activar.activarMensajeria(telefono2);
		
		AdminContactos usuario = new AdminContactos();
		usuario.activarUsuario(contacto2);
		
		System.out.println("Peso: "+contacto2.getPeso());
		System.out.println("Apellido: "+contacto2.getApellido());
		telefono2.imprimir();
		
	}

}
