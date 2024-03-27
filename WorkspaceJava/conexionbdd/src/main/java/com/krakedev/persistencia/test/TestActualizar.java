package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {
	
	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("C", "Casado");
        Persona p = new Persona("1716547852", "Mercedes", "Pilco", ec);
        try {
            Date fechaNac = Convertidor.convertirFecha("1999/12/21");
            Date horaNac = Convertidor.convertirHora("09:50");
            p.setFechaNacimiento(fechaNac);
            p.setHoraNacimiento(horaNac);
            p.setCantidadAhorrada(new BigDecimal(1230.45));
            p.setNumeroHijos(5);
            p.setEstatura(1.55);

            AdminPersonas.actualizar(p);
            
            System.out.println("Persona actualizada correctamente");
        } catch (Exception e) {
            System.out.println("Error en el sistema "+e.getMessage());
        }
    }

}
