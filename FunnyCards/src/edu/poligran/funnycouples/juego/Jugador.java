package edu.poligran.funnycouples.juego;


/**
 * 
 */
public class Jugador extends FunnyCouples {
	
	
	 public String Nombre;
	 public int Intentos;
	 public int Puntaje;

    /**
     * constructor
     */
	
	
    public Jugador(String NombreJugador, int Nintentos, int VPuntaje) {
    	
   	
    	
    }

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getIntentos() {
		return Intentos;
	}

	public void setIntentos(int intentos) {
		Intentos = intentos;
	}

	public int getPuntaje() {
		return Puntaje;
	}

	public void setPuntaje(int puntaje) {
		Puntaje = puntaje;
	}

  

    
}