package com.krakedev.inventario.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.inventario.entidades.Categoria;
import com.krakedev.inventario.entidades.Producto;

@Path("productos")
public class ServiciosProducto {

	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Producto producto) {
		System.out.println("Producto insertado>>>" + producto);
	}

	@Path("actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Producto producto) {
		System.out.println("Producto actualizado>>>" + producto);
	}
	@Path("consultar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Producto> recuperarTodos() {
		ArrayList<Producto> productos = new ArrayList<>();
		Categoria categoria1 = new Categoria(10, "Electronica");
		Producto producto1 = new Producto("001", "Laptop", categoria1, 805.2, 10);
		productos.add(producto1);

		Categoria categoria2 = new Categoria(20, "Ropa");
		Producto producto2 = new Producto("002", "Camiseta", categoria2, 19.99, 50);
		productos.add(producto2);

		Categoria categoria3 = new Categoria(30, "Hogar");
		Producto producto3 = new Producto("003", "Mesa", categoria3, 151.3, 5);
		productos.add(producto3);
		
		System.out.println("consultar>>>>"+productos);
		return productos;
		
	}
	@Path("mbuscar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Producto buscar() {
		Categoria catePro=new Categoria(50, "Frituras");
		Producto produc=new Producto("005", "Papitas", catePro, 1.56, 80);
		return produc;
	}
}
