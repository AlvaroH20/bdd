package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestBuscarPorCedula {

	public static void main(String[] args) {
		try {
			String cedula = "1718557852";
			Persona persona = AdminPersonas.buscarPorCedula(cedula);
			if (persona != null) {
				System.out.println("Persona encontrada: " + persona);
			} else {
				System.out.println("No se encontró ninguna persona con la cédula: " + cedula);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
