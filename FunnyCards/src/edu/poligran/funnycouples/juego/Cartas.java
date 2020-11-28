package edu.poligran.funnycouples.juego;

import java.util.ArrayList;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Cartas extends FunnyCouples {
	
	
	int ID_Carta;
	String ImagenCarta;
	boolean Carta_Volteada;    
	String tema;

	//public String Buscarimagen;
	
	
	//private final ObjectProperty<ImageView> imageFile = new SimpleObjectProperty<>();
	
	
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

	public boolean isCarta_Volteada() {
		return Carta_Volteada;
	}

	public void setCarta_Volteada(boolean carta_Volteada) {
		Carta_Volteada = carta_Volteada;
	}


	public void setID_Carta(int iD_Carta) {
		ID_Carta = iD_Carta;
	}

	
	public int getID_Carta() {
	
	return ID_Carta;
	}
/*
public ImageView getImageFile() {
    return imageFile.get();
}

public ImageView setImageFile() {
    return imageFile.get();
}
*/

}

