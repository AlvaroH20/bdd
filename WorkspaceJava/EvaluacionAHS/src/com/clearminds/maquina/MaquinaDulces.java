package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public void configurarMaquina(String codigoCelda1, String codigoCelda2, String codigoCelda3, String codigoCelda4) {
		this.celda1=new Celda(codigoCelda1);
		this.celda2=new Celda(codigoCelda2);
		this.celda3=new Celda(codigoCelda3);
		this.celda4=new Celda(codigoCelda4);
	}
	
	public void mostrarConfiguracion() {
		System.out.println("Celda 1 codigo: "+celda1.getCodigo());
		System.out.println("Celda 2 codigo: "+celda2.getCodigo());
		System.out.println("Celda 3 codigo: "+celda3.getCodigo());
		System.out.println("Celda 4 codigo: "+celda4.getCodigo());
	}

	public Celda buscarCelda(String codigoCel) {
		if (codigoCel==celda1.getCodigo()) {
			return celda1;
		}
		if (codigoCel==celda2.getCodigo()) {
			return celda2;
		}
		if (codigoCel==celda3.getCodigo()) {
			return celda3;
		}
		if (codigoCel==celda4.getCodigo()) {
			return celda4;
		}else {
			return null;
		}	
	}	
	
	public void cargarProducto(Producto producto,String codigoCel,int items) {
		Celda celdaRecuperada=buscarCelda(codigoCel);
		celdaRecuperada.setProducto(producto);
		celdaRecuperada.setStock(items);
	}
	
	public void mostrarProductos() {
		if (celda1.getProducto() != null) {
		System.out.println("**********Celda 1: "+celda1.getCodigo());
		System.out.println("Saldo de la maquina: "+saldo);
		System.out.println("Stock actual celda 1: "+celda1.getStock());
		System.out.println("Nombre producto celda 1: "+celda1.getProducto().getNombre());
		System.out.println("Precio producto celda 1: "+celda1.getProducto().getPrecio());
		System.out.println("Codigo producto celda 1: "+celda1.getProducto().getCodigo());
		}else {
			System.out.println("**********Celda 1: "+celda1.getCodigo());
			System.out.println("Stock: "+celda1.getStock());
	        System.out.println("La celda no tiene producto!!!");
	    }
		if (celda2.getProducto() != null) {
		System.out.println("**********Celda 2: "+celda2.getCodigo());
		System.out.println("Saldo de la maquina: "+saldo);
		System.out.println("Stock actual celda 2: "+celda2.getStock());
		System.out.println("Nombre producto celda 2: "+celda2.getProducto().getNombre());
		System.out.println("Precio producto celda 2: "+celda2.getProducto().getPrecio());
		System.out.println("Codigo producto celda 2: "+celda2.getProducto().getCodigo());
		}else {
			System.out.println("**********Celda 2: "+celda2.getCodigo());
			System.out.println("Stock: "+celda2.getStock());
	        System.out.println("La celda no tiene producto!!!");
		}
		if (celda3.getProducto() != null) {
		System.out.println("**********Celda 3: "+celda3.getCodigo());
		System.out.println("Saldo de la maquina: "+saldo);
		System.out.println("Stock actual celda 3: "+celda3.getStock());
		System.out.println("Nombre producto celda 3: "+celda3.getProducto().getNombre());
		System.out.println("Precio producto celda 3: "+celda3.getProducto().getPrecio());
		System.out.println("Codigo producto celda 3: "+celda3.getProducto().getCodigo());
		}else {
			System.out.println("**********Celda 3: "+celda3.getCodigo());
			System.out.println("Stock: "+celda3.getStock());
	        System.out.println("La celda no tiene producto!!!");
	    }
		if (celda4.getProducto() != null) {
		System.out.println("**********Celda 4: "+celda4.getCodigo());
		System.out.println("Saldo de la maquina: "+saldo);
		System.out.println("Stock actual celda 4: "+celda4.getStock());
		System.out.println("Nombre producto celda 4: "+celda4.getProducto().getNombre());
		System.out.println("Precio producto celda 4: "+celda4.getProducto().getPrecio());
		System.out.println("Codigo producto celda 4: "+celda4.getProducto().getCodigo());
		}else {
			System.out.println("**********Celda 4: "+celda4.getCodigo());
			System.out.println("Stock: "+celda4.getStock());
	        System.out.println("La celda no tiene producto!!!");
	    }
		System.out.println("Saldo de la maquina: "+saldo);
	}
	
	public Producto buscarProductoEnCelda(String codigoCelda) {
		if(codigoCelda==celda1.getCodigo()) {
			return celda1.getProducto();
		}
		if(codigoCelda==celda2.getCodigo()) {
			return celda2.getProducto();
		}
		if(codigoCelda==celda3.getCodigo()) {
			return celda3.getProducto();
		}
		if(codigoCelda==celda4.getCodigo()) {
			return celda4.getProducto();
		}
		else {
			return null;
		}
	}
	
	public double consultarPrecio(String codigoCelda) {
		if(codigoCelda==celda1.getCodigo()) {
			return celda1.getProducto().getPrecio();
		}
		if(codigoCelda==celda2.getCodigo()) {
			return celda2.getProducto().getPrecio();
		}
		if(codigoCelda==celda3.getCodigo()) {
			return celda3.getProducto().getPrecio();
		}
		if(codigoCelda==celda4.getCodigo()) {
			return celda4.getProducto().getPrecio();
		}
		return 0;
	}
	
	public Celda buscarCeldaProducto(String codigoProducto) {
	    if(celda1.getProducto()!= null && codigoProducto==celda1.getProducto().getCodigo()) {
	        return celda1;
	    }
	    if(celda2.getProducto()!= null && codigoProducto==celda2.getProducto().getCodigo()) {
	        return celda2;
	    }
	    if(celda3.getProducto()!= null && codigoProducto==celda3.getProducto().getCodigo()) {
	        return celda3;
	    }
	    if(celda4.getProducto()!= null && codigoProducto==celda4.getProducto().getCodigo()) {
	        return celda4;
	    }
	    else {
	        return null;
	    }
	}
	
	public void incrementarProductos(String codigoProducto,int cantidadItems) {
		Celda celdaEncontrada=buscarCeldaProducto(codigoProducto);
		celdaEncontrada.setStock(cantidadItems);
	}
	
	public void vender(String codigoCelda) {
		Celda celdaEncontrada=buscarCelda(codigoCelda);
		if(celdaEncontrada !=null) {
			int stockActual=celdaEncontrada.getStock();
			int stocknuevo=stockActual - 1;
			celdaEncontrada.setStock(stocknuevo);
			
			double precioProducto=celdaEncontrada.getProducto().getPrecio();
			saldo=saldo+precioProducto;
		}
	}
	public double venderConCambio(String codigoCelda,double valorIngresado) {
		Celda celdaEncontrada=buscarCelda(codigoCelda);
		if(celdaEncontrada !=null) {
			int stockActual=celdaEncontrada.getStock();
			celdaEncontrada.setStock(stockActual - 1);
			double precioProducto=celdaEncontrada.getProducto().getPrecio();
			saldo=saldo+precioProducto;
			double vuelto=valorIngresado-celdaEncontrada.getProducto().getPrecio();
			return vuelto;
		}else {
			return 0;
		}
	}
	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
