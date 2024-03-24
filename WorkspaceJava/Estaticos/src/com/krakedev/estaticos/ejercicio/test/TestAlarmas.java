package com.krakedev.estaticos.ejercicio.test;


import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {
		Alarma alam1=new Alarma(DiasSemana.LUNES,5,45);
		Alarma alam2=new Alarma(DiasSemana.MARTES,8,55);
		Alarma alam3=new Alarma(DiasSemana.MIERCOLES,9,40);
		Alarma alam4=new Alarma(DiasSemana.JUEVES,1,15);
		Alarma alam5=new Alarma(DiasSemana.VIERNES,3,41);
		Alarma alam6=new Alarma(DiasSemana.SABADO,10,25);
		Alarma alam7=new Alarma(DiasSemana.DOMINGO,11,5);
		AdminAlarmas adminAlarmas=new AdminAlarmas();
		
		adminAlarmas.agregarAlarma(alam1);
		adminAlarmas.agregarAlarma(alam2);
		adminAlarmas.agregarAlarma(alam3);
		adminAlarmas.agregarAlarma(alam4);
		adminAlarmas.agregarAlarma(alam5);
		adminAlarmas.agregarAlarma(alam6);
		adminAlarmas.agregarAlarma(alam7);
		
		ArrayList<Alarma> alarmasActuales=adminAlarmas.getAlarmas();
		System.out.println(alarmasActuales);
	}

}
