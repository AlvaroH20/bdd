package com.krakedev.persistencia.test;

import java.math.BigDecimal;

import com.krakedev.persistencia.entidades.PersonaR;
import com.krakedev.persistencia.entidades.PrestamoR;
import com.krakedev.persistencia.servicios.AdminPersonaR;

public class TestEliminarPersonaR {

	public static void main(String[] args) {
		PrestamoR r= new PrestamoR(new BigDecimal(122.25));
        PersonaR p=new PersonaR("1234567894",r);
        try {
 
            AdminPersonaR.eliminar(p.getCedula());
            
            System.out.println("Persona eliminada correctamente");
        } catch (Exception e) {
            System.out.println("Error en el sistema "+e.getMessage());
        }

	}

}
