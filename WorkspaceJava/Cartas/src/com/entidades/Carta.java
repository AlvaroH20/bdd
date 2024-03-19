package com.entidades;

public class Carta {
	private Numero numero;
	private String palo;
	private String estado;
	 
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Numero getNumero() {
		return numero;
	}
	public void setNumero(Numero numero) {
		this.numero = numero;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	public Carta(Numero numero, String palo) {
		this.numero = numero;
		this.palo = palo;
		this.estado = "N";
	}
	public int getValor() {
	    return this.numero.getValor();
	}
	public void imprimir() {
		System.out.println(numero+"-"+palo);
	}
}
