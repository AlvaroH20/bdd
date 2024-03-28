package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsultaPersonas {

	public static void main(String[] args) {
		try {
			ArrayList<Persona> persona=AdminPersonas.buscarPoNombre("Mario");
			System.out.println(persona);
		} catch (Exception e) {
	
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
