package com.krakedev.herencia;

public class Gato extends Animal{
	@Override
	public void dormir() {
		System.out.println("Gato Gaturriando");
	}
	public void maullar() {
        System.out.println("Gauuun");
    }
	//sobrecarga
	public void maullar(String adjetivo) {
        System.out.println("Gato maullando " + adjetivo + " brutalmente");
    }
}
