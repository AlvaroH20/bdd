package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestBuscarPorApellido {

	public static void main(String[] args) {
	        try {
	        	//apellido que contenga o
	            String apellido = "o"; 
	            ArrayList<Persona> personas = AdminPersonas.buscarPorApellido(apellido);
	            if (personas.isEmpty()) {
	                System.out.println("No se encontraron personas con el apellido que contiene la letra 'o'");
	            } else {
	                System.out.println("Personas encontradas con el apellido que contiene la letra 'o'");
	                for (Persona persona : personas) {
	                    System.out.println(persona);
	                }
	            }
	        } catch (Exception e) {
	            System.err.println("Error al buscar personas por apellido: " + e.getMessage());
	        }
	}

}
