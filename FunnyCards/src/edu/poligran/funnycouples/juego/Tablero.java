package edu.poligran.funnycouples.juego;

import java.util.ArrayList;


public class Tablero {
	
	
	private ArrayList<Cartas> cartas;
	private int puntaje = 0;
	private int intentos = 0;
	
	public int getPuntaje() {
		return puntaje;
	}


	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}


	public int getIntentos() {
		return intentos;
	}


	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}


	public Tablero(){
		
	}


	public ArrayList<Cartas> getCartas() {
		return cartas;
	}


	public void setCartas(ArrayList<Cartas> cartas) {
		this.cartas = cartas;
	}


	/**
     * Default constructor
     */
    public Tablero(String tematica, int contarparejas, ArrayList<Cartas> tablerocartas) {
    	
    	
    }


}