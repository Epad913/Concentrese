package edu.poligran.funnycouples.juego;


public class Cartas extends FunnyCouples {
	
	
	int ID_Carta;
	String ImagenCarta;
	boolean Carta_Volteada;    
	String tema;

	
	
	
public Cartas(int id_carta, String imagencarta, String temacarta, boolean destapada) {
	this.ID_Carta=id_carta;
	this.ImagenCarta=imagencarta;
	this.tema=temacarta;
	this.Carta_Volteada=destapada;
	
}
	
	public String getImagenCarta() {
		return ImagenCarta;
	}
	
	

	public void setImagenCarta(String imagenCarta) {
		ImagenCarta = imagenCarta;
	}
	

	public void setID_Carta(int iD_Carta) {
		ID_Carta = iD_Carta;
	}

	
	public int getID_Carta() {
	
	return ID_Carta;
	}


}

