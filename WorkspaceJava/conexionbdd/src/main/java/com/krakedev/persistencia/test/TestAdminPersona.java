package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminPersona {

	public static void main(String[] args) {
		EstadoCivil ec= new EstadoCivil("U","Union Libre");
		Persona p=new Persona("1718557888","Pedro","Pascal",ec);
		try {
			Date fechaNac=Convertidor.convertirFecha("1935/01/20");
			Date horaNac=Convertidor.convertirHora("08:50");
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setCantidadAhorrada(new BigDecimal(900.55));
			p.setNumeroHijos(2);
			p.setEstatura(1.77);
			AdminPersonas.insertar(p);
			
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+e.getMessage());
		}
		
	}

}
