package com.krakedev.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.krakedev.entidades.Cliente;
import com.krakedev.excepciones.KrakeDevException;
import com.krakedev.utils.ConexionBDD;

public class ClientesBDD {
    public void insertar(Cliente cliente) throws KrakeDevException {
        Connection con = null;
        try {
            con = ConexionBDD.obtenerConexion();
            PreparedStatement ps = con.prepareStatement("insert into clientes(cedula, nombre, numerohijos) values(?,?,?)");
            ps.setString(1, cliente.getCedula());
            ps.setString(2, cliente.getNombre());
            ps.setInt(3, cliente.getNumeroHijos());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new KrakeDevException("Error al insertar el cliente");
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void actualizar(Cliente cliente) throws KrakeDevException {
        Connection con = null;
        try {
            con = ConexionBDD.obtenerConexion();
            PreparedStatement ps = con.prepareStatement("update clientes set nombre=?, numerohijos=? where cedula=?");
            ps.setString(1, cliente.getNombre());
            ps.setInt(2, cliente.getNumeroHijos());
            ps.setString(3, cliente.getCedula());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new KrakeDevException("Error al actualizar el cliente");
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
     }
}