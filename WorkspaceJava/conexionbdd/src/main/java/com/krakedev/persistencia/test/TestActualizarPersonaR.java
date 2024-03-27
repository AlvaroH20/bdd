package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.PersonaR;
import com.krakedev.persistencia.entidades.PrestamoR;
import com.krakedev.persistencia.servicios.AdminPersonaR;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizarPersonaR {

	public static void main(String[] args) {
		PrestamoR r= new PrestamoR(new BigDecimal(122.25));
        PersonaR p=new PersonaR("1234567894",r);
        try {
            Date fechaNac=Convertidor.convertirFecha("2000/01/20");
            Date horaNac=Convertidor.convertirHora("09:50");
            p.setNombre("Messi");
            p.setApellido("Wabo");
            p.setFechaNacimiento(fechaNac);
            p.setHoraNacimiento(horaNac);
            p.setCantidadAhorrada(new BigDecimal(1530.45));
            p.setNumeroHijos(3);

            
            AdminPersonaR.actualizar(p);


        } catch (Exception e) {
            System.out.println("Error en el sistema: "+e.getMessage());
        }
	}

}
