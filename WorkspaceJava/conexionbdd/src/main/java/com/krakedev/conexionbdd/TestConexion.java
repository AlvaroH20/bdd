package com.krakedev.conexionbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		//iniciar una conexion
		Connection connection=null;
		PreparedStatement ps=null;
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","12345678");
			System.out.println("conexion exitosa");
			ps=connection.prepareStatement("insert into clientes(cedula,nombre,apellido,fecha_nacimiento,hora_nacimiento)"
					+"values(?,?,?,?,?)");//añade las incognitas necesarias por atibuto
			ps.setString(1, "1745236985");
			ps.setString(2, "Carlos");
			ps.setString(3, "Ramirez");
			//ps.setInt(4, 2);
			//ps.setDouble(5, 1.56);
			//ps.setBigDecimal(6, new BigDecimal(1200.34)); para money
			SimpleDateFormat sf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr="2020/03/22 10:05:04";
			try {
				Date fecha=sf.parse(fechaStr);
				System.out.println(fecha);
				long fechaMilis=fecha.getTime();
				System.out.println(fechaMilis);
				//crea un java.sql.Date, partiendo de un java.util.Date
				java.sql.Date fechaSQL= new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);
				
				Time timeSQL=new Time(fechaMilis);
				System.out.println(timeSQL);
				
				ps.setDate(4, fechaSQL);
				ps.setTime(5, timeSQL);
				
				ps.executeUpdate();
				System.out.println("Ejecuta insert");
				
			} catch (ParseException e) {
				e.printStackTrace();
			
		}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
