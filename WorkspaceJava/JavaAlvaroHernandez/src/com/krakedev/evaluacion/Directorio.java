package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
    private ArrayList<Contacto> contactos;
    private ArrayList<Contacto> correctos;
    private ArrayList<Contacto> incorrectos;
    private Date ultimaModificacion;

    public Directorio() {
        contactos = new ArrayList<>();
        correctos = new ArrayList<>();
        incorrectos = new ArrayList<>();
        ultimaModificacion = new Date();
    }

    public boolean agregarContacto(Contacto contacto) {
        if (buscarPorCedula(contacto.getCedula()) == null) {
            contactos.add(contacto);
            ultimaModificacion = new Date();
            return true;
        }
        return false;
    }

    public Contacto buscarPorCedula(String cedula) {
        for (Contacto contacto : contactos) {
            if (contacto.getCedula().equals(cedula)) {
                return contacto;
            }
        }
        return null;
    }

    public String consultarUltimaModificacion() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return dateFormat.format(ultimaModificacion);
    }

    public void depurar() {
        for (Contacto contacto : contactos) {
            if (contacto.getDireccion() != null) {
                correctos.add(contacto);
            } else {
                incorrectos.add(contacto);
            }
        }
        contactos.clear();
    }

    public int contarPerdidos() {
        int contador = 0;
        for (Contacto contacto : contactos) {
            if (contacto.getDireccion() == null) {
                contador++;
            }
        }
        return contador;
    }

    public int contarFijos() {
        int contador = 0;
        for (Contacto contacto : contactos) {
            for (Telefono telefono : contacto.getTelefonos()) {
                if (telefono.getEstado().equals("C") && telefono.getTipo().equalsIgnoreCase("convencional")) {
                    contador++;
                    break;
                }
            }
        }
        return contador;
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public ArrayList<Contacto> getCorrectos() {
        return correctos;
    }

    public ArrayList<Contacto> getIncorrectos() {
        return incorrectos;
    }
}
