package com.krakedev.entidades;

public class libro {
	private String isbn;
	private String nombre;
	private int numero_paginas;
	
	public libro(String isbn, String nombre, int numero_paginas) {
		super();
		this.isbn = isbn;
		this.nombre = nombre;
		this.numero_paginas = numero_paginas;
	}
	public libro() {}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero_paginas() {
		return numero_paginas;
	}
	public void setNumero_paginas(int numero_paginas) {
		this.numero_paginas = numero_paginas;
	}
	@Override
	public String toString() {
		return "libro [isbn=" + isbn + ", nombre=" + nombre + ", numero_paginas=" + numero_paginas + "]";
	}
	
}
