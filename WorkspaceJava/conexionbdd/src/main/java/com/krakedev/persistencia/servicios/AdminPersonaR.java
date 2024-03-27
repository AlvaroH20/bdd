package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.PersonaR;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonaR {
private static final Logger LOGGER=LogManager.getLogger(AdminPersonaR.class);
	
	public static void insertar(PersonaR personaR) throws Exception{
		Connection con=null;
		PreparedStatement ps;
		try {
			 con = ConexionBDD.conectar();
			 ps=con.prepareStatement("insert into personaR(cedula,nombre,apellido,estatura,fecha_nacimiento,hora_nacimiento,cantidad_ahorrada,numero_hijos,monto)"
						+"values(?,?,?,?,?,?,?,?,?)");

				ps.setString(1, personaR.getCedula());
				ps.setString(2, personaR.getNombre());
				ps.setString(3, personaR.getApellido());
				ps.setDouble(4, personaR.getEstatura());
				ps.setInt(8, personaR.getNumeroHijos());
				ps.setBigDecimal(7, personaR.getCantidadAhorrada());
				ps.setBigDecimal(9, personaR.getPrestamo().getMonto());
				ps.setDate(5, new java.sql.Date(personaR.getFechaNacimiento().getTime()));
				ps.setTime(6, new Time(personaR.getHoraNacimiento().getTime()));
				
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
	public static void actualizar(PersonaR personaR) throws Exception{
		Connection con = null;
	    PreparedStatement ps = null;
	    try {
	        con = ConexionBDD.conectar();
	        ps = con.prepareStatement("update personaR set nombre=?, apellido=?, estatura=?, fecha_nacimiento=?, hora_nacimiento=?, cantidad_ahorrada=?, numero_hijos=?, monto=? where cedula=?");
	        ps.setString(1, personaR.getNombre());
	        ps.setString(2, personaR.getApellido());
	        ps.setDouble(3, personaR.getEstatura());
	        ps.setDate(4, new java.sql.Date(personaR.getFechaNacimiento().getTime()));
	        ps.setTime(5, new Time(personaR.getHoraNacimiento().getTime()));
	        ps.setBigDecimal(6, personaR.getCantidadAhorrada());
	        ps.setInt(7, personaR.getNumeroHijos());
			ps.setBigDecimal(8, personaR.getPrestamo().getMonto());
	        ps.setString(9, personaR.getCedula());

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
	public static void eliminar(String cedulaR) throws Exception{
		Connection con = null;
	    PreparedStatement ps = null;
	    try {
	    	con = ConexionBDD.conectar();
	    	ps = con.prepareStatement("delete from personaR where cedula=?");
	    	ps.setString(1, cedulaR);
	    	
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
