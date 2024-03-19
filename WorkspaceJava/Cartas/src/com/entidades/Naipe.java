package com.entidades;

import java.util.ArrayList;


public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;
	
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	public Naipe() {
        numerosPosibles = new ArrayList<>();
        numerosPosibles.add(new Numero("A", 11));
        numerosPosibles.add(new Numero("2", 2));
        numerosPosibles.add(new Numero("3", 3));
        numerosPosibles.add(new Numero("4", 4));
        numerosPosibles.add(new Numero("5", 5));
        numerosPosibles.add(new Numero("6", 6));
        numerosPosibles.add(new Numero("7", 7));
        numerosPosibles.add(new Numero("8", 8));
        numerosPosibles.add(new Numero("9", 9));
        numerosPosibles.add(new Numero("10", 10));
        numerosPosibles.add(new Numero("J", 10));
        numerosPosibles.add(new Numero("Q", 10));
        numerosPosibles.add(new Numero("K", 10));
        
        cartas = new ArrayList<>();
        for (int i=0;i<numerosPosibles.size();i++) {
        	Numero numero = numerosPosibles.get(i);
        	
        	Palos palos=new Palos();
        	String[] nombresPalos= {palos.getCorazonRojo(), palos.getCorazonNegro(), palos.getDiamante(), palos.getTrebol()};
        	for(int j=0; j<nombresPalos.length; j++) {
        		cartas.add(new Carta(numero,nombresPalos[j]));
        	}
        }
        }
        public ArrayList<Carta> barajar() {
            for (int i = 0; i < cartas.size(); i++) {
                cartas.get(i).setEstado("N");
            }
            ArrayList<Carta> auxiliar = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                int posicion = Random.obtenerPosicion();
                Carta carta = cartas.get(posicion);
                if (carta.getEstado().equals("N")) {
                    auxiliar.add(carta);
                    carta.setEstado("C");
                }
            }
            for (int i = 0; i < cartas.size(); i++) {
                if (cartas.get(i).getEstado().equals("N")) {
                    auxiliar.add(cartas.get(i));
                    cartas.get(i).setEstado("C");
                }
            }
            return auxiliar;
        }
    }

