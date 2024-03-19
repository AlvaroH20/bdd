package com.servicios;

import java.util.ArrayList;
import com.entidades.Carta;
import com.entidades.Naipe;

public class Juego {
    private Naipe naipe;
    private ArrayList<ArrayList<Carta>> cartasJugadores;
    private ArrayList<Carta> naipeBarajado;
    private ArrayList<String> idJugadores; 

    public Juego(ArrayList<String> idsJugadores) {
        this.idJugadores = idsJugadores; 
        naipe = new Naipe();
        naipeBarajado = naipe.barajar();
        cartasJugadores = new ArrayList<>();
        for (int i = 0; i < idsJugadores.size(); i++) {
            cartasJugadores.add(new ArrayList<>());
        }
    
    }
    public ArrayList<String> getJugadores() {
        return this.idJugadores;
    }

    public ArrayList<ArrayList<Carta>> getCartasJugadores() {
        return cartasJugadores;
    }
    

    public void entregarCartas(int cartasPorJugador) {
        int cantJugadores = cartasJugadores.size();
        int cartasEntregadas = 0;

        while (cartasEntregadas < cartasPorJugador * cantJugadores) {
            for (int i = 0; i < cantJugadores && cartasEntregadas < cartasPorJugador * cantJugadores; i++) {
                ArrayList<Carta> cartasDeJugador = cartasJugadores.get(i);
                Carta cartaEntregada = naipeBarajado.remove(0);
                cartasDeJugador.add(cartaEntregada);
                cartasEntregadas++;
            }
        }
    }

    public String determinarGanador() {
		String idGanador = idJugadores.get(0);
		int sumaGanador = devolverTotal(0);

		for (int i = 1; i < cartasJugadores.size(); i++) {
			int sumaActual = devolverTotal(i);

			if (sumaActual >= sumaGanador) {
				idGanador = idJugadores.get(i);
				sumaGanador = sumaActual;
			}
		}

		return idGanador; 
	}

    public int devolverTotal(int indiceJugador) {
        int suma = 0;
        for (Carta carta : cartasJugadores.get(indiceJugador)) {
            suma += carta.getValor();
        }
        return suma;
    }

    public String devolverIdJugador(int indiceJugador) {
        return this.idJugadores.get(indiceJugador); 
    }
}

