package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.EstadoCivil;
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
	public static ArrayList<Persona> buscarPoNombre(String nombreBusqueda) throws Exception{
		ArrayList<Persona> persona=new ArrayList<Persona>();
		Connection con = null;
	    PreparedStatement ps = null;
	    ResultSet rs=null;
	    try {
			con=ConexionBDD.conectar();
			ps=con.prepareStatement("select * from persona where nombre like ?");
			ps.setString(1, "%"+nombreBusqueda+"%");
			
			rs=ps.executeQuery();
			//si es busqueda por clave primaria 
			/*if(rs.next()){
			 *crear  persona etc
			 * 
			 * 
			 * }*/
			while(rs.next()) {
				String nombre=rs.getString("nombre");
				String cedula=rs.getString("cedula");
				Persona p = new Persona();
				p.setCedula(cedula);
				p.setNombre(nombre);
				persona.add(p);
			}
		} catch (Exception e) {
			LOGGER.error("Error al consultar por Nombre", e);
	        throw new Exception("Error al consultar por Nombre");
		}finally {
	        //cerrar la conexión
	        try {
	            con.close(); 
	        } catch (SQLException e) {
	            LOGGER.error("Error al cerrar la conexión", e);
	            throw new Exception("Error al cerrar la conexión");
	        }
	    }
	    return persona;
	}
	public static Persona buscarPorCedula(String cedula) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Persona persona = null;
        try {
            con = ConexionBDD.conectar();
            ps = con.prepareStatement("select * from persona where cedula = ?");
            ps.setString(1, cedula);
            rs = ps.executeQuery();
            if (rs.next()) {
                persona = new Persona();
                String cedula1=rs.getString("cedula");
                persona.setCedula(cedula1);
                String nombre=rs.getString("nombre");
                persona.setNombre(nombre);
                String apellido=rs.getString("apellido");
                persona.setApellido(apellido);
                Double estatura=rs.getDouble("estatura");
                persona.setEstatura(estatura);
                BigDecimal cantidadAhorrada = rs.getBigDecimal("cantidad_ahorrada");
                persona.setCantidadAhorrada(cantidadAhorrada);
                Date fechaN=rs.getDate("fecha_nacimiento");
                persona.setFechaNacimiento(fechaN);
                Time horaN=rs.getTime("hora_nacimiento");
                persona.setHoraNacimiento(horaN);
                int numeroHijos=rs.getInt("numero_hijos");
                persona.setNumeroHijos(numeroHijos);
                String ECivil=rs.getString("estado_civil");
                EstadoCivil estadoCivil = new EstadoCivil();
                estadoCivil.setCodigo(ECivil);
                persona.setEstadoCivil(estadoCivil);
            }
        } catch (Exception e) {
            LOGGER.error("Error al buscar por cedula", e);
            throw new Exception("Error al buscar por cedula");
        } finally {
	        //cerrar la conexión
	        try {
	            con.close(); 
	        } catch (SQLException e) {
	            LOGGER.error("Error al cerrar la conexión", e);
	            throw new Exception("Error al cerrar la conexión");
	        }
        }
        return persona;
    }
	public static ArrayList<Persona> buscarPorApellido(String apellido) throws Exception {
	    ArrayList<Persona> personas = new ArrayList<>();
	    Connection con = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;
	    try {
	        con = ConexionBDD.conectar();
	        ps = con.prepareStatement("select * from persona where apellido like ?");
	        ps.setString(1, "%"+apellido+"%");
	        rs = ps.executeQuery();
	        while (rs.next()) {
	            Persona persona = new Persona();
	            String cedula1=rs.getString("cedula");
                persona.setCedula(cedula1);
                String nombre=rs.getString("nombre");
                persona.setNombre(nombre);
                String apellido1=rs.getString("apellido");
                persona.setApellido(apellido1);
                Double estatura=rs.getDouble("estatura");
                persona.setEstatura(estatura);
                BigDecimal cantidadAhorrada = rs.getBigDecimal("cantidad_ahorrada");
                persona.setCantidadAhorrada(cantidadAhorrada);
                Date fechaN=rs.getDate("fecha_nacimiento");
                persona.setFechaNacimiento(fechaN);
                Time horaN=rs.getTime("hora_nacimiento");
                persona.setHoraNacimiento(horaN);
                int numeroHijos=rs.getInt("numero_hijos");
                persona.setNumeroHijos(numeroHijos);
	            String ECivil=rs.getString("estado_civil");
                EstadoCivil estadoCivil = new EstadoCivil();
                estadoCivil.setCodigo(ECivil);
                persona.setEstadoCivil(estadoCivil);
                
	            personas.add(persona);
	        }
	    } catch (Exception e) {
	        LOGGER.error("Error al buscar por apellido", e);
	        throw new Exception("Error al buscar por apellido");
	    } finally {
	        try {
	            if (rs != null) rs.close();
	            if (ps != null) ps.close();
	            if (con != null) con.close();
	        } catch (SQLException e) {
	            LOGGER.error("Error al cerrar la conexión", e);
	            throw new Exception("Error al cerrar la conexión");
	        }
	    }
	    return personas;
	}

		
	
}
