package com.krakedev.test;

import com.krakedev.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p; //1. Declaro una variable llamada p tipo Persona
		Persona p2=new Persona("Angelina",75,1.54);
		p=new Persona("Mario",45,1.56);//2. instanciar un objeto Persona y guardarle 
		
		// 3. Accedo a los atributos
		System.out.println("nombre:"+p.getNombre());
		System.out.println("edad:" + p.getEdad());
		System.out.println("estatura:" + p.getEstatura());
		
		//4.Modificar los atributos
		p.setNombre("Mario");
		p.setEdad(45);
		p.setEstatura(1.56);
		System.out.println("***************");
		//5. accedo a los atributos
		System.out.println("nombre:"+p.getNombre());
		System.out.println("edad:"+p.getEdad());
		System.out.println("estatura:"+p.getEstatura());
		
		p2.setNombre("Angelina");
		System.out.println("***************");
		System.out.println("p.nombre: "+p.getNombre());
		System.out.println("p2.nombre: "+p2.getNombre());
		System.out.println("edad:"+p2.getEdad());
		System.out.println("estatura:"+p2.getEstatura());
	}

}
