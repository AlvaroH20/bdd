package com.krakedev.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.krakedev.entidades.Cliente;
import com.krakedev.excepciones.KrakeDevException;
import com.krakedev.persistencia.ClienteBD;

//el path es una direccion de enlace
@Path ("apirest")
public class ServiciosCliente {
	@Path ("insertar")
	//el metodo post hace referencia a metodos los cuales obtiene informacion desde un cuerpo(body) y en base a esa info lo ejecuta
	@POST 
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertar(Cliente cli) {
		//instancia para acceder a los metodos
		ClienteBD cb = new ClienteBD();  
		try {
			cb.insertar(cli);
			//al finalizar la insercion retornar el response
			return Response.ok().build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	@Path ("presentar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response presentar() {
		ClienteBD cb = new ClienteBD();
		ArrayList<Cliente> lista = null;
		
		try {
			lista=cb.obtener();
			return Response.ok(lista).build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
}
