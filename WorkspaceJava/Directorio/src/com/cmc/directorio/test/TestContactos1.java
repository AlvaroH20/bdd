package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		Telefono telefono1=new Telefono("movi","098758465",110);
		Contacto contacto1=new Contacto("Hernandez",telefono1,75);
		Telefono telefono2=new Telefono("claro","098755698",110);
		Contacto contacto2=new Contacto("Rosales",telefono2,80);
		
		AdminContactos ctn=new AdminContactos();
		Contacto personaCtn=ctn.buscarMasPesado(contacto1, contacto2);
		if(personaCtn!=null) {
			System.out.println("La persona mas pesada es: "+personaCtn.getApellido());
			System.out.println("Telefono: "+personaCtn.getTelefono().getNumero());
			System.out.println("El peso es: "+personaCtn.getPeso());
			System.out.println("Operadora: "+personaCtn.getTelefono().getOperadora());
			System.out.println("El codigo es: "+personaCtn.getTelefono().getCodigo());
		}else {
			System.out.println("Tienen el mismo peso");
		}
		AdminContactos op=new AdminContactos();
		Boolean personaOp=op.compararOperadoras(telefono1, telefono2);
		if(personaOp==true) {
			System.out.println("Las operadoras son las mismas");
		}else {
			System.out.println("Las operadoras son distintas");
		}
		
	}

}
