package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		if(precio>0) {
			this.precio = precio;
			System.out.println("El precio es: "+precio);
		}else {
			this.precio=precio*-1;
			System.out.println("El precio es de tu negativo: "+this.precio);
		}
	}
	
	public double calcularPrecioPromo(int porcentajeDescuento) {
		double precioDes=((precio*porcentajeDescuento)/100);
		return precioDes;
	}
	
	
	
}
