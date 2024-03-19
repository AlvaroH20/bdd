package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Prestamo;
import com.cmc.evaluacion.utilidades.Utilitario;

public class CalculadoraAmortizacion {

	public static double calcularCuota(Prestamo prestamo) {
		double monto=prestamo.getMonto();
		double interesAnual=prestamo.getInteres();
		double porcentajeInteresMensual = interesAnual / 12 / 100;
		int plazo=prestamo.getPlazo();
		
		double cuota= monto * (porcentajeInteresMensual /(1 - Math.pow(1+porcentajeInteresMensual, -plazo)));
		
		return cuota;
	}
	public static void generarTabla(Prestamo prestamo) {

	Cuota[] cuotas = prestamo.getCuotas();
	
		double interesPrestamo = prestamo.getInteres() / 12 / 100; //
		double calcularCuota = calcularCuota(prestamo);
			for (int i = 0; i < cuotas.length; i++) {
				Cuota cuota = new Cuota(i + 1);
				cuota.setCuota(calcularCuota);
				prestamo.getCuotas()[i] = cuota;
			if (i == 0) {
				prestamo.getCuotas()[i].setInicio(prestamo.getMonto());
			}
			
		}
		
			for(int i = 0; i < cuotas.length; i++) {
				Cuota cuota=cuotas[i];
			if (i < cuotas.length - 1) {
				calcularValoresCuota(interesPrestamo, cuota, cuotas[i + 1]);

			} else {
				calcularValoresCuota(interesPrestamo, cuota, null);
			}
		}
	}

    private static void calcularValoresCuota(double interes, Cuota cuotaActual, Cuota cuotaSiguiente) {
        double interesCalculado = cuotaActual.getInicio() * interes;
        double abonoCapital = cuotaActual.getCuota() - interesCalculado;
        double saldo = cuotaActual.getInicio() - abonoCapital;
        
        cuotaActual.setInteres(interesCalculado);
        cuotaActual.setAbonoCapital(abonoCapital);
        cuotaActual.setSaldo(saldo);

        if (cuotaSiguiente != null) {
            cuotaSiguiente.setInicio(saldo);
        }
    }
    public static void mostrarTabla(Prestamo prestamo) {
        System.out.println("Número | Cuota | Inicio | Interés | Abono Capital | Saldo");
        for (Cuota cuota : prestamo.getCuotas()) {
            System.out.println(
                    cuota.getNumero() + "      | " +
                    Utilitario.redondear(cuota.getCuota()) + " | " +
                    Utilitario.redondear(cuota.getInicio()) + " |" +
                    Utilitario.redondear(cuota.getInteres()) + "     | " +
                    Utilitario.redondear(cuota.getAbonoCapital()) + "      | " +
                    Utilitario.redondear(cuota.getSaldo())
            );
        }
	}
}
