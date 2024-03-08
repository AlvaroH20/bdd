package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo();
		Rectangulo perimetro=new Rectangulo();
		
		int areaR1;
		int areaR2;
		double perimetroV;
		
		r1.base=10;
		r1.altura=5;
		
		r2.base=8;
		r2.altura=3;
		
		perimetro.base=4;
		perimetro.altura=2;
		
		perimetroV=perimetro.calcularPerimetro();
		System.out.println("Perimetro: "+perimetroV);
		areaR1=r1.calcularArea();
		System.out.println("Area: "+areaR1);
		areaR2=r2.calcularArea();
		System.out.println("Area: "+areaR2);
	}

}
