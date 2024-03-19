package com.krakedev.evaluacion;

public class Telefono {
    private String numero;
    private String tipo;
    private String estado;

    public Telefono(String numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        validarTelefono();
    }

    public String getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    private void validarTelefono() {
        if (numero == null || tipo == null) {
            estado = "E";
        } else if (!tipo.equalsIgnoreCase("movil") && !tipo.equalsIgnoreCase("convencional")) {
            estado = "E";
        } else if (tipo.equalsIgnoreCase("movil") && numero.length() != 10) {
            estado = "E";
        } else if (tipo.equalsIgnoreCase("convencional") && numero.length() != 7) {
            estado = "E";
        } else {
            estado = "C";
        }
    }
}

