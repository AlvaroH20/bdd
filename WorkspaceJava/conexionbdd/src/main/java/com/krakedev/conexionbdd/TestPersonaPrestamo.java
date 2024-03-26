package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPersonaPrestamo {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement ps=null;
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","12345678");
			System.out.println("conexion exitosa");
			//insert para personaR
			ps=connection.prepareStatement("insert into personaR(cedula,nombre,apellido,estatura,fecha_nacimiento,hora_nacimiento,cantidad_ahorrada,numero_hijos)"
				+"values(?,?,?,?,?,?,?,?)");
			ps.setString(1, "1745896236");
			ps.setString(2, "Juanito");
			ps.setString(3, "Marino");
			ps.setDouble(4, 1.78);
			ps.setBigDecimal(7, new BigDecimal(1200));
			ps.setInt(8, 11);
			//fecha de nacieminto y hora 
			SimpleDateFormat sf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr="2000/01/12 11:50:34";
			try {
				Date fecha=sf.parse(fechaStr);
				long fechaMilis=fecha.getTime();
				java.sql.Date fechaSQL= new java.sql.Date(fechaMilis);
				Time timeSQL=new Time(fechaMilis);
				
				ps.setDate(5, fechaSQL);
				ps.setTime(6, timeSQL);
				
				ps.executeUpdate();
				System.out.println("insertpersonaExitoso");
			} catch (ParseException e) {
				e.printStackTrace();
			
			}
			//insert para prestamoR
			ps=connection.prepareStatement("insert into prestamoR(cedula,monto,fecha_prestamo,hora_prestamo,garante)"
					+"values(?,?,?,?,?)");
			ps.setString(1, "1745896236");
			ps.setString(5, "Garante11");
			ps.setBigDecimal(2, new BigDecimal(800));
			System.out.println("Insert prestamoR exitoso");
			SimpleDateFormat sfi=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStri="2024/07/02 09:10:04";
			try {
				Date fecha=sfi.parse(fechaStri);
				long fechaMilis=fecha.getTime();
				java.sql.Date fechaSQLp= new java.sql.Date(fechaMilis);
				Time timeSQLp=new Time(fechaMilis);
				
				ps.setDate(3, fechaSQLp);
				ps.setTime(4, timeSQLp);
				
				ps.executeUpdate();
			} catch (ParseException e) {
				e.printStackTrace();
			
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
