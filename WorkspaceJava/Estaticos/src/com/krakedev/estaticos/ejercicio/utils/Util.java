package com.krakedev.estaticos.ejercicio.utils;

public class Util {
	public static String formatearHora(int numero) {
		 String valorFormateado;
		 if (numero < 10) {
	            valorFormateado = "0" + numero;
	     } else {
	            valorFormateado = "" + numero;
	 }
	      		return valorFormateado;
	}
	public static String formatearDia(int numero) {
		String[] diasSemana= {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
		return diasSemana[numero];
	}
}
