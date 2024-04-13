package com.krakedev.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.krakedev.entidades.Cliente;
import com.krakedev.excepciones.KrakeDevException;
import com.krakedev.util.ConexionBDD;

public class ClienteBD {
	public void insertar(Cliente objetoCliente) throws KrakeDevException {
		//abrir la conexion
		Connection con= null;
		PreparedStatement ps=null;
		try {
			con=ConexionBDD.obtenerConexion();
			//Crear la consulta en el sql
			ps=con.prepareStatement("insert into cliente (cedula, nombre) values (?,?)");
			//asignacion de valores para las incognitas
			ps.setString(1, objetoCliente.getCedula());
			ps.setString(2, objetoCliente.getNombre());
			//envia la consulta a BDD y recibe una respuesta
			ps.executeUpdate();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al insertar");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al realizar la consulta al insertar");
		}finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public ArrayList<Cliente> obtener() throws KrakeDevException {
		ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
		Connection con= null;
		PreparedStatement ps=null;
		ResultSet rs= null;
		Cliente objetoCliente=null;
		try {
			con=ConexionBDD.obtenerConexion();
			ps=con.prepareStatement("select * from cliente");
			rs=ps.executeQuery();
			while(rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				
				objetoCliente = new Cliente(cedula,nombre);
				listaCliente.add(objetoCliente);
			}
		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al insertar");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al realizar la consulta al insertar");
		}finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return listaCliente;
	}
	
}
