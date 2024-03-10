package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado cua1=new Cuadrado(4);
		Cuadrado cua2=new Cuadrado(3);
		Cuadrado cua3=new Cuadrado(2);
		
		double areaC1;
		double perimetroC1;
		double areaC2;
		double perimetroC2;
		double areaC3;
		double perimetroC3;
		
		cua1.setLado(4);
		cua2.setLado(3);
		cua3.setLado(2);
		
		areaC1=cua1.calcularArea();
		perimetroC1=cua1.calcularPerimetro();
		areaC2=cua2.calcularArea();
		perimetroC2=cua2.calcularPerimetro();
		areaC3=cua3.calcularArea();
		perimetroC3=cua3.calcularPerimetro();
		
		System.out.println("Area: "+areaC1);
		System.out.println("Perimetro: "+perimetroC1);
		System.out.println("Area: "+areaC2);
		System.out.println("Perimetro: "+perimetroC2);
		System.out.println("Area: "+areaC3);
		System.out.println("Perimetro: "+perimetroC3);
		
	}

}
