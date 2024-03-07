package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calcu=new Calculadora();
		int resultadoSuma;
		double resultadoResta;
		
		resultadoSuma=calcu.suma(5, 3);
		resultadoResta=calcu.resta(10,3);
		double resultadoMul=calcu.multiplicar(5, 10);
		double resultadoDivi=calcu.dividir(10, 2);
		double resultadoProm=calcu.promediar(10, 8, 9);
		
		
		System.out.println("RESULTADO SUMA: "+resultadoSuma);
		System.out.println("RESULTADO RESTA: "+resultadoResta);
		System.out.println("RESULTADO MULTIPLICACION: "+resultadoMul);
		System.out.println("RESULTADO DIVISION: "+resultadoDivi);
		System.out.println("RESULTADO PROMEDIO: "+resultadoProm);
		calcu.mostrarResultado();
	}

}
