package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admin=new AdminPersonas();
		admin.agregar(new Persona("Leo","Messi",33));
		admin.agregar(new Persona("Valery","Miamor",21));
		admin.agregar(new Persona("Angie","Laotra",19));
		admin.imprimir();
		
		Persona personaP1=admin.buscarPorNombre("Leo");
		if(personaP1!=null) {
			System.out.println("La persona que buscas es: "+personaP1.getApellido()+" "+personaP1.getEdad());
		}else {
			System.out.println("No exixte una persona con ese nombre");
		}
		
		ArrayList<Persona> personasMayores=admin.buscarMayores(20);
		System.out.println("Personas mayores: "+personasMayores.size());
		
	}

}
