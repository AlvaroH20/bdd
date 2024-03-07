package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto productoA=new Producto();
		Producto productoB=new Producto();
		Producto productoC=new Producto();
		// modificar atributos
		productoA.nombre="Alchol Anticeptico";
		productoA.descripcion="Son buenos solventes";
		productoA.precio=4.3;
		productoA.stockActual=69;
		//producto B
		productoB.nombre="Bandas";
		productoB.descripcion="Banditas anticepticas";
		productoB.precio=10.32;
		productoB.stockActual=12;
		//producto C
		productoC.nombre="Hydraplus";
		productoC.descripcion="Bebida hidratante";
		productoC.precio=4.14;
		productoC.stockActual=50;
		//mostrar en consola
		System.out.println("PRODUCTO A");
		System.out.println("Nombre:"+productoA.nombre);
		System.out.println("Descripcion:"+productoA.descripcion);
		System.out.println("Precio:"+productoA.precio);
		System.out.println("Stock:"+productoA.stockActual);
			System.out.println("--------------------------");
		System.out.println("PRODUCTO B");
		System.out.println("Nombre:"+productoB.nombre);
		System.out.println("Descripcion:"+productoB.descripcion);
		System.out.println("Precio:"+productoB.precio);
		System.out.println("Stock:"+productoB.stockActual);
			System.out.println("--------------------------");
		System.out.println("PRODUCTO C");
		System.out.println("Nombre:"+productoC.nombre);
		System.out.println("Descripcion:"+productoC.descripcion);
		System.out.println("Precio:"+productoC.precio);
		System.out.println("Stock:"+productoC.stockActual);
		
	}

}
