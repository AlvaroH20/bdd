package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;

public class PrestamoR {
	private String cedula;
	private BigDecimal monto;
	
	public PrestamoR() {}
	
	public PrestamoR(BigDecimal monto) {
		super();
		this.monto = monto;
	}

	public PrestamoR(String cedula, BigDecimal monto) {
		super();
		this.cedula = cedula;
		this.monto = monto;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "PrestamoR [cedula=" + cedula + ", monto=" + monto + "]";
	}
	
}
