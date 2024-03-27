package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {

	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("C", "Casado");
        Persona p = new Persona("1716547852", "Mercedes", "Pilco", ec);
        try {
 
            AdminPersonas.eliminar(p.getCedula());
            
            System.out.println("Persona eliminada correctamente");
        } catch (Exception e) {
            System.out.println("Error en el sistema "+e.getMessage());
        }

	}

}
