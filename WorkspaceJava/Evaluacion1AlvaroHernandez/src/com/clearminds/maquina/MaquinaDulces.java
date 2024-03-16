package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;



public class MaquinaDulces {
    private ArrayList<Celda> celdas;
    private double saldo;
    
    public MaquinaDulces() {
        this.celdas = new ArrayList<Celda>();
        this.saldo = 0.0;
    }
    
    public void agregarCelda(Celda celda) {
        celdas.add(celda);
    }
    
    public void mostrarConfiguracion() {
        Celda celdaEncontrada;
        int numeroCelda=0;
        for(int i=0; i<celdas.size(); i++) {
            celdaEncontrada = celdas.get(i);
            numeroCelda = i + 1;
            System.out.println("Celda"+numeroCelda+ " : " +celdaEncontrada.getCodigo());
        }
    }
    
    public Celda buscarCelda(String codigoCelda) {
    	Celda elementoCelda=null;
    	Celda celdaEncontrada=null;
    	if(codigoCelda!=null) {
    		for (int i=0;i<celdas.size();i++) {
    				elementoCelda=celdas.get(i);
    				if(codigoCelda.equals(elementoCelda.getCodigo())) {
    					celdaEncontrada=elementoCelda;
    				}
    		}
    		return celdaEncontrada;
    	}else {
    		return null;
    	}
    }
    
    public void cargarProducto(Producto producto,String codigoCelda,int items) {
    	Celda celdaRecuperada=buscarCelda(codigoCelda);
    	if(celdaRecuperada!=null) {
    		celdaRecuperada.ingresarProducto(producto, items);
    	}
    }
    	
    public void mostrarProductos() {
    	Celda celdaRecuperada=null;
    	for(int i=0;i<celdas.size();i++) {
    		celdaRecuperada=celdas.get(i);
    		if(celdaRecuperada.getProducto()!=null) {
    		System.out.println("Nombre:"+celdaRecuperada.getProducto().getNombre()+" "+"Precio:"+celdaRecuperada.getProducto().getPrecio());
    		
    		}else {
    		System.out.println("Sin producto asignado");
    	
    		}
    	}
    	System.out.println("Saldo: "+saldo);
    		
    }
    
    public Producto buscarProductoEnCelda(String codigoCelda) {
    	Celda celdaEncontrada=null;
    	for(int i=0;i<celdas.size();i++) {
    		celdaEncontrada=celdas.get(i);
    	if(codigoCelda.equals(celdaEncontrada.getCodigo())) {
    		return celdaEncontrada.getProducto();
    		}
    	}
		return null;
    }
    
    public double consultarPrecio(String codigoCelda) {
    	Celda celdaEncontrada=null;
    	for(int i=0;i<celdas.size();i++) {
    		celdaEncontrada=celdas.get(i);
    	if(codigoCelda.equals(celdaEncontrada.getCodigo())) {
    		return celdaEncontrada.getProducto().getPrecio();
    		}
    	}
		return 0;
	}
    
    public Celda buscarCeldaProducto(String codigoProducto) {
    	Celda celdaEncontrada=null;
    	for(int i=0;i<celdas.size();i++) {
    		celdaEncontrada=celdas.get(i);
    	if(celdaEncontrada.getProducto()!=null && codigoProducto.equals(celdaEncontrada.getProducto().getCodigo())) {
    		return celdaEncontrada;
    		}
    	}
		return null;
    }
    
    public void incrementarProductos(String codigoProducto,int items) {
    	Celda celdaEncontrada=buscarCeldaProducto(codigoProducto);
    	celdaEncontrada.setStock(items);
    }
    
    public void vender(String codigoCelda) {
    	Celda celdaEncontrada=null;
    	for(int i=0;i<celdas.size();i++) {
    		celdaEncontrada=celdas.get(i);
    	if(celdaEncontrada.getCodigo()!=null && codigoCelda.equals(celdaEncontrada.getCodigo())) {
    		int stockActual=celdaEncontrada.getStock();
			int stocknuevo=stockActual - 1;
			celdaEncontrada.setStock(stocknuevo);
			
			double precioProducto=celdaEncontrada.getProducto().getPrecio();
			saldo=saldo+precioProducto;
    		}
    	}
    }
    
    public double venderConCambio(String codigoCelda,double valorIngresado) {
    	Celda celdaEncontrada=null;
    	for(int i=0;i<celdas.size();i++) {
    		celdaEncontrada=celdas.get(i);
    	if(celdaEncontrada.getCodigo()!=null && codigoCelda.equals(celdaEncontrada.getCodigo())) {
    		int stockActual=celdaEncontrada.getStock();
			int stocknuevo=stockActual - 1;
			celdaEncontrada.setStock(stocknuevo);
			
			double precioProducto=celdaEncontrada.getProducto().getPrecio();
			saldo=saldo+precioProducto;
			double vuelto=valorIngresado-celdaEncontrada.getProducto().getPrecio();
			return vuelto;
    		}
    	}
    	return 0;
    }
    
    public ArrayList<Producto> buscarMenores(double limite){
		Celda elementoProducto=null;
		ArrayList<Producto> menores=new ArrayList<Producto>();
		for(int i=0;i<celdas.size();i++) {
			elementoProducto=celdas.get(i);
			if(elementoProducto.getProducto().getPrecio()<=limite) {
				menores.add(elementoProducto.getProducto());
			}
		}
		return menores;
	}
    
    public ArrayList<Celda> getCeldas() {
        return celdas;
    }

    public void setCeldas(ArrayList<Celda> celdas) {
        this.celdas = celdas;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

