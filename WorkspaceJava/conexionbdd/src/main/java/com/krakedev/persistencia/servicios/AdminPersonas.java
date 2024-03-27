package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	private static final Logger LOGGER=LogManager.getLogger(AdminPersonas.class);
	
	public static void insertar(Persona persona) throws Exception{
		Connection con=null;
		PreparedStatement ps;
		LOGGER.trace("persona a insertar>>>>>> "+persona);
		try {
			 con = ConexionBDD.conectar();
			 ps=con.prepareStatement("insert into persona(cedula,nombre,apellido,estatura,fecha_nacimiento,hora_nacimiento,cantidad_ahorrada,numero_hijos,estado_civil)"
						+"values(?,?,?,?,?,?,?,?,?)");//añade las incognitas necesarias por atibuto
				ps.setString(1, persona.getCedula());
				ps.setString(2, persona.getNombre());
				ps.setString(3, persona.getApellido());
				ps.setDouble(4, persona.getEstatura());
				ps.setInt(8, persona.getNumeroHijos());
				ps.setBigDecimal(7, persona.getCantidadAhorrada());
				ps.setString(9, persona.getEstadoCivil().getCodigo());
				ps.setDate(5, new java.sql.Date(persona.getFechaNacimiento().getTime()));
				ps.setTime(6, new Time(persona.getHoraNacimiento().getTime()));
				
				ps.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("Error al insertar",e);
			throw new Exception("Error al insertar");
		}finally {
			//cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos",e);
				throw new Exception("Error con la base de datos");
			}
		}
	}
	public static void actualizar(Persona persona) throws Exception{
		Connection con = null;
	    PreparedStatement ps = null;
	    try {
	        con = ConexionBDD.conectar();
	        ps = con.prepareStatement("update persona set nombre=?, apellido=?, estatura=?, fecha_nacimiento=?, hora_nacimiento=?, cantidad_ahorrada=?, numero_hijos=?, estado_civil=? where cedula=?");
	        ps.setString(1, persona.getNombre());
	        ps.setString(2, persona.getApellido());
	        ps.setDouble(3, persona.getEstatura());
	        ps.setDate(4, new java.sql.Date(persona.getFechaNacimiento().getTime()));
	        ps.setTime(5, new Time(persona.getHoraNacimiento().getTime()));
	        ps.setBigDecimal(6, persona.getCantidadAhorrada());
	        ps.setInt(7, persona.getNumeroHijos());
	        ps.setString(8, persona.getEstadoCivil().getCodigo());
	        ps.setString(9, persona.getCedula());

	        ps.executeUpdate();
	    } catch (SQLException e) {
	        LOGGER.error("Error al actualizar", e);
	        throw new Exception("Error al actualizar");
	    } finally {
	        //cerrar la conexión
	        try {
	            con.close(); 
	        } catch (SQLException e) {
	            LOGGER.error("Error al cerrar la conexión", e);
	            throw new Exception("Error al cerrar la conexión");
	        }
	    }
	}
	public static void eliminar(String cedulaE) throws Exception{
		Connection con = null;
	    PreparedStatement ps = null;
	    try {
	    	con = ConexionBDD.conectar();
	    	ps = con.prepareStatement("delete from persona where cedula=?");
	    	ps.setString(1, cedulaE);
	    	
	    	ps.executeUpdate();
	    	
	    } catch (SQLException e) {
	        LOGGER.error("Error al eliminar", e);
	        throw new Exception("Error al eliminar");
	    } finally {
	        //cerrar la conexión
	        try {
	            con.close(); 
	        } catch (SQLException e) {
	            LOGGER.error("Error al cerrar la conexión", e);
	            throw new Exception("Error al cerrar la conexión");
	        }
	    }
	}
}
