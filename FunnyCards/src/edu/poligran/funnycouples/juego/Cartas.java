package edu.poligran.funnycouples.juego;

import java.util.ArrayList;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.image.ImageView;

public class Cartas extends FunnyCouples {
	
	
	public int ID_Carta;
	public ImageView getImagenCarta() {
		return ImagenCarta;
	}

	public void setImagenCarta(ImageView imagenCarta) {
		ImagenCarta = imagenCarta;
	}

	public boolean isCarta_Volteada() {
		return Carta_Volteada;
	}

	public void setCarta_Volteada(boolean carta_Volteada) {
		Carta_Volteada = carta_Volteada;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getBuscarimagen() {
		return Buscarimagen;
	}

	public void setBuscarimagen(String buscarimagen) {
		Buscarimagen = buscarimagen;
	}

	public void setID_Carta(int iD_Carta) {
		ID_Carta = iD_Carta;
	}

	public ImageView ImagenCarta; 
	public boolean Carta_Volteada;    
	public String tema;
	
	public String Buscarimagen;
	
	
	private final ObjectProperty<ImageView> imageFile = new SimpleObjectProperty<>();
	
	
public Cartas(int id_carta, ImageView imagencarta, String temacarta, boolean destapada) {
	
}
	
public int getID_Carta() {
	
	return ID_Carta;
}

public ImageView getImageFile() {
    return imageFile.get();
}
  
public void asignar_cartas_matematicas() {
	
	
	ImageView imagen1=new ImageView("matematicas/1_.png");
	ImageView imagen2=new ImageView("matematicas/1.png");
	ImageView imagen3=new ImageView("matematicas/10_.png");
	ImageView imagen4=new ImageView("matematicas/10.png");
	ImageView imagen5=new ImageView("matematicas/11_.png");
	ImageView imagen6=new ImageView("matematicas/11.png");
	ImageView imagen7=new ImageView("matematicas/12_.png");
	ImageView imagen8=new ImageView("matematicas/12.png");
	ImageView imagen9=new ImageView("matematicas/13_.png");
	ImageView imagen10=new ImageView("matematicas/13.png");
	ImageView imagen11=new ImageView("matematicas/14_.png");
	ImageView imagen12=new ImageView("matematicas/14.png");
	ImageView imagen13=new ImageView("matematicas/15_.png");
	ImageView imagen14=new ImageView("matematicas/15.png");
	ImageView imagen15=new ImageView("matematicas/2_.png");
	ImageView imagen16=new ImageView("matematicas/2.png");
	ImageView imagen17=new ImageView("matematicas/3_.png");
	ImageView imagen18=new ImageView("matematicas/3.png");
	ImageView imagen19=new ImageView("matematicas/4.png");
	ImageView imagen20=new ImageView("matematicas/4_.png");
	

		
		
		}

public void asignar_cartas_ingles() {
	
	
	ImageView imagen1=new ImageView("ingles/1_.png");
	ImageView imagen2=new ImageView("ingles/1.png");
	ImageView imagen3=new ImageView("ingles/10_.png");
	ImageView imagen4=new ImageView("ingles/10.png");
	ImageView imagen5=new ImageView("ingles/11_.png");
	ImageView imagen6=new ImageView("ingles/11.png");
	ImageView imagen7=new ImageView("ingles/12_.png");
	ImageView imagen8=new ImageView("ingles/12.png");
	ImageView imagen9=new ImageView("ingles/13_.png");
	ImageView imagen10=new ImageView("ingles/13.png");
	ImageView imagen11=new ImageView("ingles/14_.png");
	ImageView imagen12=new ImageView("ingles/14.png");
	ImageView imagen13=new ImageView("ingles/15_.png");
	ImageView imagen14=new ImageView("ingles/15.png");
	ImageView imagen15=new ImageView("ingles/2_.png");
	ImageView imagen16=new ImageView("ingles/2.png");
	ImageView imagen17=new ImageView("ingles/3_.png");
	ImageView imagen18=new ImageView("ingles/3.png");
	ImageView imagen19=new ImageView("ingles/4.png");
	ImageView imagen20=new ImageView("ingles/4_.png");
	
	
	
}

public void asignar_cartas_programacion()
{
	//faltan las imagenes
	/*
	ImageView imagen1=new ImageView("programacion/1_.png");
	ImageView imagen2=new ImageView("programacion/1.png");
	ImageView imagen3=new ImageView("programacion/10_.png");
	ImageView imagen4=new ImageView("programacion/10.png");
	ImageView imagen5=new ImageView("programacion/11_.png");
	ImageView imagen6=new ImageView("programacion/11.png");
	ImageView imagen7=new ImageView("programacion/12_.png");
	ImageView imagen8=new ImageView("programacion/12.png");
	ImageView imagen9=new ImageView("programacion/13_.png");
	ImageView imagen10=new ImageView("programacion/13.png");
	ImageView imagen11=new ImageView("programacion/14_.png");
	ImageView imagen12=new ImageView("programacion/14.png");
	ImageView imagen13=new ImageView("programacion/15_.png");
	ImageView imagen14=new ImageView("programacion/15.png");
	ImageView imagen15=new ImageView("programacion/2_.png");
	ImageView imagen16=new ImageView("programacion/2.png");
	ImageView imagen17=new ImageView("programacion/3_.png");
	ImageView imagen18=new ImageView("programacion/3.png");
	ImageView imagen19=new ImageView("programacion/4.png");
	ImageView imagen20=new ImageView("programacion/4_.png");
	*/
}

}

