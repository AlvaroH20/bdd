package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Prestamo> prestamos;
    private List<Cliente> clientes;

    public Banco() {
        this.prestamos = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public Cliente buscarCliente(String cedula) {
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                return cliente;
            }
        }
        return null; // el cliente no encontrado
    }

    public void registrarCliente(Cliente cliente) {
        for (Cliente c : clientes) {
            if (c.getCedula().equals(cliente.getCedula())) {
                System.out.println("Cliente ya existe: " + cliente.getCedula());
                return; 
            }
        }
        clientes.add(cliente);
    }
    public void asignarPrestamo(String cedulaCliente, Prestamo prestamo) {
        Cliente cliente = buscarCliente(cedulaCliente);
        if (cliente == null) {
            System.out.println("No es cliente del banco");
            return;
        }
        cliente.agregarPrestamo(prestamo);
        prestamos.add(prestamo);
        
        CalculadoraAmortizacion.generarTabla(prestamo);
    }
    public ArrayList<Prestamo> buscarPrestamos(String cedulaCliente) {
        Cliente cliente = buscarCliente(cedulaCliente);
        if (cliente == null) {
            return null;
        }

        return (ArrayList<Prestamo>) cliente.getPrestamos();
    }
    
    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

}