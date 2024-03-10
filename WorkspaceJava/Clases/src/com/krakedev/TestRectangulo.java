package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo(10,5);
		Rectangulo r2=new Rectangulo(8,3);
		Rectangulo perimetro=new Rectangulo(4,2);
		
		int areaR1;
		int areaR2;
		double perimetroV;
		
		r1.setBase(10);
		r1.setAltura(5);
		
		r2.setBase(8);
		r2.setAltura(3);
		
		perimetro.setBase(4);
		perimetro.setAltura(2);
		
		perimetroV=perimetro.calcularPerimetro();
		System.out.println("Perimetro: "+perimetroV);
		areaR1=r1.calcularArea();
		System.out.println("Area: "+areaR1);
		areaR2=r2.calcularArea();
		System.out.println("Area: "+areaR2);
	}

}
