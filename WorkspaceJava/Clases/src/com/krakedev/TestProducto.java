package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto productoA=new Producto();
		Producto productoB=new Producto();
		Producto productoC=new Producto();
		// modificar atributos
		productoA.setNombre("Alchol Anticeptico");
		productoA.setDescripcion("Son buenos solventes");
		productoA.setPrecio(4.3);
		productoA.setStockActual(69);
		//producto B
		productoB.setNombre("Bandas");
		productoB.setDescripcion("Banditas anticepticas");
		productoB.setPrecio(10.32);
		productoB.setStockActual(12);
		//producto C
		productoC.setNombre("Hydraplus");
		productoC.setDescripcion("Bebida hidratante");
		productoC.setPrecio(4.14);
		productoC.setStockActual(50);
		//mostrar en consola
		System.out.println("PRODUCTO A");
		System.out.println("Nombre:"+productoA.getNombre());
		System.out.println("Descripcion:"+productoA.getDescripcion());
		System.out.println("Precio:"+productoA.getPrecio());
		System.out.println("Stock:"+productoA.getStockActual());
			System.out.println("--------------------------");
		System.out.println("PRODUCTO B");
		System.out.println("Nombre:"+productoB.getNombre());
		System.out.println("Descripcion:"+productoB.getDescripcion());
		System.out.println("Precio:"+productoB.getPrecio());
		System.out.println("Stock:"+productoB.getStockActual());
			System.out.println("--------------------------");
		System.out.println("PRODUCTO C");
		System.out.println("Nombre:"+productoC.getNombre());
		System.out.println("Descripcion:"+productoC.getDescripcion());
		System.out.println("Precio:"+productoC.getPrecio());
		System.out.println("Stock:"+productoC.getStockActual());
		
	}

}
