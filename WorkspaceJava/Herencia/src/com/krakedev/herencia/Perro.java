package com.krakedev.herencia;

public class Perro extends Animal {
	public void ladrar() {
		System.out.println("Perro ladrando");
	}
	@Override
	public void dormir() {
		//reutilizar
		super.dormir();
		System.out.println("Perro durminedo");
	}
}
