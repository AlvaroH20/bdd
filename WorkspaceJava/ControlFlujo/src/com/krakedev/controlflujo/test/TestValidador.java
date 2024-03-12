package com.krakedev.controlflujo.test;

import com.krakedev.controlflujo.Validador;

public class TestValidador {

	public static void main(String[] args) {
		Validador validador=new Validador();
		validador.validadEdad(10);
		validador.validadEdad(20);
		validador.validadEdad(18);
		validador.validadEdad(16);
		validador.validadEdad(-3);
	}

}
