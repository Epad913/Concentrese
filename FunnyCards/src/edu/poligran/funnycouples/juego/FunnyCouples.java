
package edu.poligran.funnycouples.juego;

/*Versión Mia */

import java.util.*;

import edu.poligran.funnycouples.juego.Cartas;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane; 
import javafx.scene.control.Label; 
import javafx.scene.control.Button;
import javafx.scene.image.*;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;


public class FunnyCouples extends Application{


	ArrayList<Cartas> ListaCartas = new ArrayList<Cartas>();
	
	
	/* Se definen los elementos con los que se va a trabajar en JFx */
	
	int dobleclic=0;
	int ID_uno=0, ID_dos=0;
	int PosicionImagen=0, x=0;
	String rutaImagen;
	
	
	Cartas Baraja, Baraja2;
	
	Scene miEscena;
	Pane contenedor;
	Button Btn1, Btn2, Btn3;
	ImageView  Imagen1, Imagen2, Imagen3, Imagen4, Imagen5, Imagen6, Imagen7, Imagen8, Imagen9, Imagen10,
	Imagen11, Imagen12, Imagen13, Imagen14, Imagen15, Imagen16, Imagen17, Imagen18, Imagen19, Imagen20;
	
	ImageView tempImagen,  imagen1, imagen2, imagen3, imagen4, imagen5, imagen6, imagen7, imagen8, imagen9, imagen10,
	imagen11, imagen12, imagen13, imagen14, imagen15, imagen16, imagen17, imagen18, imagen19, imagen20;
	
	
	
public static void main(String[] args) {
	

	
	Application.launch(args);
	
	
}


@Override
public void start(Stage VentanaPrincipal) {
	

	
	
	//nodo tipo texto
	Label mensaje = new Label("Bienvenidos a FunnyCouples Game. Recuerde que debe encontrar todas las parejas en el menor de los intentos posibles. Buena suerte...");
	/*  Elementos contenedor tema - se definen 3 botones con el respectivo tema*/
	
	Btn1 = new Button("Matematicas");
	Btn1.setTranslateX(40);
	Btn1.setTranslateY(30);
	Btn1.setMinWidth(80);
	Btn3 = new Button("Programación");
	Btn3.setMinWidth(80);
	Btn3.setTranslateX(140);
	Btn3.setTranslateY(30);
	Btn2 = new Button("Inglés");
	Btn2.setMinWidth(80);	
	Btn2.setTranslateX(240);
	Btn2.setTranslateY(30);
	
	//clic botones
	
	Btn1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent e) {
			
			seleccionartema();
			
		    asignar_cartas_matematicas();
		    
			
				
		
		}});
	
	Btn2.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent e) {
			
			seleccionartema();
			
		    asignar_cartas_ingles();
		    		
		}});
	
	Btn3.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent e) {
			
			seleccionartema();
			
		    asignar_cartas_programacion();
		    				
		
		}});
	/*
	private void voltear_carta(Cartas carta, ImageView imagen,String imagenes) {
		if(carta.isCarta_Volteada()) {
			carta.setCarta_Volteada(false);
			Image imageObject = new Image(imagenes);
			imagen.setImage(imageObject);
		}else {
			carta.setCarta_Volteada(true);
			Image imageObject = new Image("Imagenes/incognita.jpg");
			imagen.setImage(imageObject);
		}
	

}
	
	*/
	
	
	//imágenes
	
	
	
	/* Se definen los ImageView iniciales con la imagen incognita.jpg  */
	Imagen1 = new ImageView("imagenes/incognita.jpg");
	Imagen1.relocate(10, 100);
	Imagen1.setFitWidth(105);
	Imagen1.setFitHeight(105);
	Imagen1.setPickOnBounds(true);
	
	/*    */
	
	Imagen1.setOnMouseClicked(new EventHandler <MouseEvent> (){ 
		 @Override
	     public void handle(MouseEvent e) { 
			 if (e.getClickCount()==2) {
			 dobleclic=dobleclic+1;
			 Baraja=ListaCartas.get(0);
			 rutaImagen=Baraja.getImagenCarta().toString();
			 Imagen1.setImage(new Image(rutaImagen));
			 
			// verificar_parejas();
			 if(dobleclic <= 1) {	
				 x=0;
				 Baraja2=ListaCartas.get(x);
				 PosicionImagen=Baraja2.ID_Carta;
				 //System.out.println(Baraja2.ID_Carta+" "+Baraja2.ImagenCarta);
				 
				 
			} else {
				 dobleclic=0;
				 ID_uno=Baraja.ID_Carta;
				 ID_dos=Baraja2.ID_Carta;
				 if(ID_uno==ID_dos) {
					 System.out.println("PREMIO PREMIO PREMIO " + ID_uno +" y "+ ID_dos);
					 dobleclic=0;ID_uno=0;ID_dos=0;PosicionImagen=0;
				 }else {
					 //Imagen1.setImage(new Image("imagenes/incognita.jpg"));
					 
						 
					 }
				 }
				 System.out.println("Valor de Dobleclic:  dos " + dobleclic);
				 System.out.println("ID primera carta :" + ID_uno);
				 System.out.println("ID segunda carta : " + ID_dos);
				 
				 
				 }
			 
					 
	     
		 }
		 }
		
		);
	
	
	
	Imagen2 = new ImageView("Imagenes/incognita.jpg");
	Imagen2.relocate(150, 100);
	Imagen2.setFitWidth(105);
	Imagen2.setFitHeight(105);
	Imagen2.setPickOnBounds(true);
	Imagen2.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 if (e.getClickCount()==2) {
				 
			 dobleclic=dobleclic+1;
			 Baraja=ListaCartas.get(1);
			 rutaImagen=Baraja.getImagenCarta().toString();
			 //rutaImagen=toString();
			 Imagen2.setImage(new Image(rutaImagen));
			 
			 //
			 //verificar_parejas();
			 if(dobleclic <= 1) {
				 x=1;
				 Baraja2=ListaCartas.get(x);
				 PosicionImagen=Baraja2.ID_Carta;
				 System.out.println("Valor ID  carta Primer clic: "+ PosicionImagen);
				 
				 
			} else {
				 dobleclic=0;
				 ID_uno=Baraja.ID_Carta;
				 ID_dos=Baraja2.ID_Carta;
				 //ID_dos=ListaCartas.get(PosicionImagen).getID_Carta();
				 if(ID_uno==ID_dos) {
					 System.out.println("PREMIO PREMIO PREMIO " + dobleclic + "" + ID_uno +" "+ " "+ ID_dos);
					 dobleclic=0;ID_uno=0;ID_dos=0;PosicionImagen=0;
				 }
				 System.out.println("Valor de Dobleclic: " + dobleclic);
				 System.out.println("ID primera carta :" + ID_uno);
				 System.out.println("ID segunda carta : " + ID_dos);
				 
				 
				 }
			 
			 	 
			 }
		 }
		 }
		);
	
	
	Imagen3 = new ImageView("Imagenes/incognita.jpg");
	Imagen3.relocate(290, 100);
	Imagen3.setFitWidth(105);
	Imagen3.setFitHeight(105);
	
	Imagen3.setPickOnBounds(true);
	Imagen3.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 if (e.getClickCount()==2) {
				 System.out.println("Double clicked"+dobleclic);
				 dobleclic=dobleclic+1;
				Baraja=ListaCartas.get(2);
				 rutaImagen=Baraja.getImagenCarta().toString();
				 Imagen3.setImage(new Image(rutaImagen));
				 
				 if(dobleclic <=1) {	
					 x=2;
					 Baraja2=ListaCartas.get(x);
					 PosicionImagen=Baraja2.ID_Carta;
					 System.out.println("Valor variable PosicionImagen: "+ PosicionImagen);
					 
					 
				}else {
					 dobleclic=0;
					 ID_uno=Baraja.ID_Carta;
					 ID_dos=Baraja2.ID_Carta;
					 if(ID_uno==ID_dos) {
						 System.out.println("PREMIO PREMIO PREMIO " + dobleclic + "" + ID_uno +" "+ " "+ ID_dos);
						 dobleclic=0;ID_uno=0;ID_dos=0;PosicionImagen=0;
					 }
					 System.out.println("Valor de Dobleclic: " + dobleclic);
					 System.out.println("ID primera carta :" + ID_uno);
					 System.out.println("ID segunda carta : " + ID_dos);
					 
					 
					 }
			 	 
			 }}
		 }
		);
	
	Imagen4 = new ImageView("Imagenes/incognita.jpg");
	Imagen4.relocate(430, 100);
	Imagen4.setFitWidth(105);
	Imagen4.setFitHeight(105);
	Imagen4.setPickOnBounds(true);
	Imagen4.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 if (e.getClickCount()==2) {
				 System.out.println("Double clicked"+dobleclic);
				 dobleclic=dobleclic+1;
				Baraja=ListaCartas.get(3);
				 rutaImagen=Baraja.getImagenCarta().toString();
				 Imagen4.setImage(new Image(rutaImagen));
				 
				 if(dobleclic <= 1) {	
					 x=3;
					 Baraja2=ListaCartas.get(x);
					 PosicionImagen=Baraja2.ID_Carta;
					 System.out.println("Valor variable PosicionImagen: "+ PosicionImagen);
					 
					 
				}else {
					 dobleclic=0;
					 ID_uno=Baraja.ID_Carta;
					 ID_dos=Baraja2.ID_Carta;
					 if(ID_uno==ID_dos) {
						 System.out.println("PREMIO PREMIO PREMIO " + dobleclic + "" + ID_uno +" "+ " "+ ID_dos);
						 dobleclic=0;ID_uno=0;ID_dos=0;PosicionImagen=0;
					 }
					 System.out.println("Valor de Dobleclic: " + dobleclic);
					 System.out.println("ID primera carta :" + ID_uno);
					 System.out.println("ID segunda carta : " + ID_dos);
					 
					 
					 }
			 	 
			 }
		 }
		 }
		);
	
	Imagen5 = new ImageView("Imagenes/incognita.jpg");
	Imagen5.relocate(570, 100);
	Imagen5.setFitWidth(105);
	Imagen5.setFitHeight(105);
	Imagen5.setPickOnBounds(true);
	Imagen5.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 if (e.getClickCount()==2) {
				 System.out.println("Double clicked"+dobleclic);
				 dobleclic=dobleclic+1;
				Baraja=ListaCartas.get(4);
				 rutaImagen=Baraja.getImagenCarta().toString();
				 Imagen5.setImage(new Image(rutaImagen));
				 
				 if(dobleclic <= 1) {	
					 x=4;
					 Baraja2=ListaCartas.get(x);
					 PosicionImagen=Baraja2.ID_Carta;
					 System.out.println("Valor variable PosicionImagen: "+ PosicionImagen);
					 
					 
				} else {
					dobleclic=0;
					 ID_uno=Baraja.ID_Carta;
					 ID_dos=Baraja2.ID_Carta;
					 if(ID_uno==ID_dos) {
						 System.out.println("PREMIO PREMIO PREMIO " + dobleclic + "" + ID_uno +" "+ " "+ ID_dos);
						 dobleclic=0;ID_uno=0;ID_dos=0;PosicionImagen=0;
					 }
					 System.out.println("Valor de Dobleclic: " + dobleclic);
					 System.out.println("ID primera carta :" + ID_uno);
					 System.out.println("ID segunda carta : " + ID_dos);
					 
					 
					 }	 
						 
			 } 
			 }
		 }
		);
	
	Imagen6 = new ImageView("Imagenes/incognita.jpg");
	Imagen6.relocate(10, 250);
	Imagen6.setFitWidth(105);
	Imagen6.setFitHeight(105);
	Imagen6.setPickOnBounds(true);
	Imagen6.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 if (e.getClickCount()==2) {
				 System.out.println("Double clicked"+dobleclic);
				 dobleclic=dobleclic+1;
			
				Baraja=ListaCartas.get(5);
				 rutaImagen=Baraja.getImagenCarta().toString();
				 Imagen6.setImage(new Image(rutaImagen));
				 
				 if(dobleclic <= 1) {	
					 x=5;
					 Baraja2=ListaCartas.get(x);
					 PosicionImagen=Baraja2.ID_Carta;
					 System.out.println("Valor variable PosicionImagen: "+ PosicionImagen);
					 
					 
				}else {
					 ID_uno=Baraja.ID_Carta;
					 ID_dos=Baraja2.ID_Carta;
					 if(ID_uno==ID_dos) {
						 System.out.println("PREMIO PREMIO PREMIO " + dobleclic + "" + ID_uno +" "+ " "+ ID_dos);
						 dobleclic=0;ID_uno=0;ID_dos=0;PosicionImagen=0;
					 }
					 System.out.println("Valor de Dobleclic: " + dobleclic);
					 System.out.println("ID primera carta :" + ID_uno);
					 System.out.println("ID segunda carta : " + ID_dos);
					 dobleclic=0;
					 
					 }
				 
			 }		 
			 	 
			 }
		 }
		);
	
	Imagen7 = new ImageView("Imagenes/incognita.jpg");
	Imagen7.relocate(150, 250);
	Imagen7.setFitWidth(105);
	Imagen7.setFitHeight(105);
	Imagen7.setPickOnBounds(true);
	Imagen7.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 if (e.getClickCount()==2) {
				 System.out.println("Double clicked"+dobleclic);
				 dobleclic=dobleclic+1;
			
				 Baraja=ListaCartas.get(6);
				 rutaImagen=Baraja.getImagenCarta().toString();
				 Imagen7.setImage(new Image(rutaImagen));
				 
				 if(dobleclic <= 1) {	
					 x=6;
					 Baraja2=ListaCartas.get(x);
					 PosicionImagen=Baraja2.ID_Carta;
					 System.out.println("Valor variable PosicionImagen: "+ PosicionImagen);
					
					 
				}else {
					 dobleclic=0;
					 ID_uno=Baraja.ID_Carta;
					 ID_dos=Baraja2.ID_Carta;
					 if(ID_uno==ID_dos) {
						 System.out.println("PREMIO PREMIO PREMIO " + dobleclic + "" + ID_uno +" "+ " "+ ID_dos);
						 dobleclic=0;ID_uno=0;ID_dos=0;PosicionImagen=0;
					 }
					 System.out.println("Valor de Dobleclic: " + dobleclic);
					 System.out.println("ID primera carta :" + ID_uno);
					 System.out.println("ID segunda carta : " + ID_dos);
	 
					 }
				 
						 
			 }
			 }
		 }
		);
	
	Imagen8 = new ImageView("Imagenes/incognita.jpg");
	Imagen8.relocate(290, 250);
	Imagen8.setFitWidth(105);
	Imagen8.setFitHeight(105);
	Imagen8.setPickOnBounds(true);
	Imagen8.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 if (e.getClickCount()==2) {
				 dobleclic=dobleclic+1;
			 
				Baraja=ListaCartas.get(7);
				 rutaImagen=Baraja.getImagenCarta().toString();
				 Imagen8.setImage(new Image(rutaImagen));
				 
				 if(dobleclic <=1) {	
					 x=7;
					 Baraja2=ListaCartas.get(x);
					 PosicionImagen=Baraja2.ID_Carta;
					 System.out.println("Valor variable PosicionImagen: "+ PosicionImagen);	
					 
				}else {
					 ID_uno=Baraja.ID_Carta;
					 ID_dos=Baraja2.ID_Carta;
					 if(ID_uno==ID_dos) {
						 System.out.println("PREMIO PREMIO PREMIO " + dobleclic + "" + ID_uno +" "+ " "+ ID_dos);
						 dobleclic=0;ID_uno=0;ID_dos=0;PosicionImagen=0;
					 }
					 System.out.println("Valor de Dobleclic: " + dobleclic);
					 System.out.println("ID primera carta :" + ID_uno);
					 System.out.println("ID segunda carta : " + ID_dos);
					 dobleclic=0;
					 
					 }
				
						 
			 }
			 }
		 }
		);
	
	Imagen9 = new ImageView("Imagenes/incognita.jpg");
	Imagen9.relocate(430, 250);
	Imagen9.setFitWidth(105);
	Imagen9.setFitHeight(105);
	Imagen9.setPickOnBounds(true);
	Imagen9.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 if (e.getClickCount()==2) {
				 System.out.println("Double clicked"+dobleclic);
				 dobleclic=dobleclic+1;
			 
				Baraja=ListaCartas.get(8);
				 rutaImagen=Baraja.getImagenCarta().toString();
				 Imagen9.setImage(new Image(rutaImagen));
				 
				 if(dobleclic <= 1) {		
					 x=8;
					 Baraja2=ListaCartas.get(x);
					 PosicionImagen=Baraja2.ID_Carta;
					 System.out.println("Valor variable PosicionImagen: "+ PosicionImagen);
					
					 
				}else {
					 ID_uno=Baraja.ID_Carta;
					 ID_dos=Baraja2.ID_Carta;
					 if(ID_uno==ID_dos) {
						 System.out.println("PREMIO PREMIO PREMIO " + dobleclic + "" + ID_uno +" "+ " "+ ID_dos);
						 dobleclic=0;ID_uno=0;ID_dos=0;PosicionImagen=0;
					 }
					 System.out.println("Valor de Dobleclic: " + dobleclic);
					 System.out.println("ID primera carta :" + ID_uno);
					 System.out.println("ID segunda carta : " + ID_dos);
					 dobleclic=0;
					 
					 }
				 
			 }		 
			 }
		 }
		);
	
	Imagen10 = new ImageView("Imagenes/incognita.jpg");
	Imagen10.relocate(570, 250);
	Imagen10.setFitWidth(105);
	Imagen10.setFitHeight(105);
	Imagen10.setPickOnBounds(true);
	Imagen10.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 if (e.getClickCount()==2) {
				 
				 dobleclic=dobleclic+1;
			
				Baraja=ListaCartas.get(9);
				 rutaImagen=Baraja.getImagenCarta().toString();
				 Imagen10.setImage(new Image(rutaImagen));
				 
				 if(dobleclic <= 1) {	
					 x=9;
					 Baraja2=ListaCartas.get(x);
					 PosicionImagen=Baraja2.ID_Carta;
					 System.out.println("Valor variable PosicionImagen: "+ PosicionImagen);
					 
					 
				}else {
					 dobleclic=0;
					 ID_uno=Baraja.ID_Carta;
					 ID_dos=Baraja2.ID_Carta;
					 if(ID_uno==ID_dos) {
						 System.out.println("PREMIO PREMIO PREMIO " + dobleclic + "" + ID_uno +" "+ " "+ ID_dos);
						 dobleclic=0;ID_uno=0;ID_dos=0;PosicionImagen=0;
					 }
					 System.out.println("Valor de Dobleclic: " + dobleclic);
					 System.out.println("ID primera carta :" + ID_uno);
					 System.out.println("ID segunda carta : " + ID_dos);
					 
					 
					 }
				 
						 
			 }
			 }
		 }
		);
	
	Imagen11 = new ImageView("Imagenes/incognita.jpg");
	Imagen11.relocate(10, 400);
	Imagen11.setFitWidth(105);
	Imagen11.setFitHeight(105);
	Imagen11.setPickOnBounds(true);
	Imagen11.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 if (e.getClickCount()==2) {
				 System.out.println("Double clicked"+dobleclic);
				 dobleclic=dobleclic+1;
			 
				Baraja=ListaCartas.get(10);
				 rutaImagen=Baraja.getImagenCarta().toString();
				 Imagen11.setImage(new Image(rutaImagen));
				 
				 if(dobleclic <= 1) {	
					 x=10;
					 Baraja2=ListaCartas.get(x);
					 PosicionImagen=Baraja2.ID_Carta;
					 System.out.println("Valor variable PosicionImagen: "+ PosicionImagen);
					
					 
				}else {
			 	 
					 ID_uno=Baraja.ID_Carta;
					 ID_dos=Baraja2.ID_Carta;
					 if(ID_uno==ID_dos) {
						 System.out.println("PREMIO PREMIO PREMIO " + dobleclic + "" + ID_uno +" "+ " "+ ID_dos);
						 dobleclic=0;ID_uno=0;ID_dos=0;PosicionImagen=0;
					 }
					 System.out.println("Valor de Dobleclic: " + dobleclic);
					 System.out.println("ID primera carta :" + ID_uno);
					 System.out.println("ID segunda carta : " + ID_dos);
					 dobleclic=0;
					 
					 }
				 
						 
			 }
		 }
		 }
		);
	
	Imagen12 = new ImageView("Imagenes/incognita.jpg");
	Imagen12.relocate(150, 400);
	Imagen12.setFitWidth(105);
	Imagen12.setFitHeight(105);
	Imagen12.setPickOnBounds(true);
	Imagen12.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 if (e.getClickCount()==2) {
				 System.out.println("Double clicked"+dobleclic);
				 dobleclic=dobleclic+1;
			 
				Baraja=ListaCartas.get(11);
				 rutaImagen=Baraja.getImagenCarta().toString();
				 Imagen12.setImage(new Image(rutaImagen));
				 
				 if(dobleclic <= 1) {	
					 x=11;
					 Baraja2=ListaCartas.get(x);
					 PosicionImagen=Baraja2.ID_Carta;
					 System.out.println("Valor variable PosicionImagen: "+ PosicionImagen);
					 
					 
				}else {
					 dobleclic=0;
					 ID_uno=Baraja.ID_Carta;
					 ID_dos=Baraja2.ID_Carta;
					 if(ID_uno==ID_dos) {
						 System.out.println("PREMIO PREMIO PREMIO " + dobleclic + "" + ID_uno +" "+ " "+ ID_dos);
						 dobleclic=0;ID_uno=0;ID_dos=0;PosicionImagen=0;
					 }
					 System.out.println("Valor de Dobleclic: " + dobleclic);
					 System.out.println("ID primera carta :" + ID_uno);
					 System.out.println("ID segunda carta : " + ID_dos);
					 
					 
					 }
				 
			 }		 
			 	 
			 }
		 }
		);
	
	Imagen13 = new ImageView("Imagenes/incognita.jpg");
	Imagen13.relocate(290, 400);
	Imagen13.setFitWidth(105);
	Imagen13.setFitHeight(105);
	Imagen13.setPickOnBounds(true);
	Imagen13.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 if (e.getClickCount()==2) {
				 System.out.println("Double clicked"+dobleclic);
				 dobleclic=dobleclic+1;
			
				Baraja=ListaCartas.get(12);
				 rutaImagen=Baraja.getImagenCarta().toString();
				 Imagen13.setImage(new Image(rutaImagen));
				 
				 if(dobleclic <= 1) {	
					 x=12;
					 Baraja2=ListaCartas.get(x);
					 PosicionImagen=Baraja2.ID_Carta;
					 System.out.println("Valor variable PosicionImagen: "+ PosicionImagen);
					
				}else {
					 ID_uno=Baraja.ID_Carta;
					 ID_dos=Baraja2.ID_Carta;
					 if(ID_uno==ID_dos) {
						 System.out.println("PREMIO PREMIO PREMIO " + dobleclic + "" + ID_uno +" "+ " "+ ID_dos);
						 dobleclic=0;ID_uno=0;ID_dos=0;PosicionImagen=0;
					 }
					 System.out.println("Valor de Dobleclic: " + dobleclic);
					 System.out.println("ID primera carta :" + ID_uno);
					 System.out.println("ID segunda carta : " + ID_dos);
					 dobleclic=0;
					 
					 }
				
						 
			 } 
			 }
		 }
		);
	
	Imagen14 = new ImageView("Imagenes/incognita.jpg");
	Imagen14.relocate(430, 400);
	Imagen14.setFitWidth(105);
	Imagen14.setFitHeight(105);
	Imagen14.setPickOnBounds(true);
	Imagen14.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 if (e.getClickCount()==2) {
				 System.out.println("Double clicked"+dobleclic);
				 dobleclic=dobleclic+1;
			
				Baraja=ListaCartas.get(13);
				 rutaImagen=Baraja.getImagenCarta().toString();
				 Imagen14.setImage(new Image(rutaImagen));
				 
				 if(dobleclic <= 1) {	
					 x=13;
					 Baraja2.ListaCartas.get(x);
					 PosicionImagen=Baraja2.ID_Carta;
					 System.out.println("Valor variable PosicionImagen: "+ PosicionImagen);
					 
				}else {
					 ID_uno=Baraja.ID_Carta;
					 ID_dos=Baraja2.ID_Carta;
					 if(ID_uno==ID_dos) {
						 System.out.println("PREMIO PREMIO PREMIO " + dobleclic + "" + ID_uno +" "+ " "+ ID_dos);
						 dobleclic=0;ID_uno=0;ID_dos=0;PosicionImagen=0;
					 }
					 System.out.println("Valor de Dobleclic: " + dobleclic);
					 System.out.println("ID primera carta :" + ID_uno);
					 System.out.println("ID segunda carta : " + ID_dos);
					 dobleclic=0;
					 
					 }
				
						 
			 }
			 }
		 }
		);
	
	Imagen15 = new ImageView("Imagenes/incognita.jpg");
	Imagen15.relocate(570, 400);
	Imagen15.setFitWidth(105);
	Imagen15.setFitHeight(105);
	Imagen15.setPickOnBounds(true);
	Imagen15.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 if (e.getClickCount()==2) {
				 System.out.println("Double clicked"+dobleclic);
				 dobleclic=dobleclic+1;
			
				Baraja=ListaCartas.get(14);
				 rutaImagen=Baraja.getImagenCarta().toString();
				 Imagen15.setImage(new Image(rutaImagen));
				 
				 if(dobleclic <= 1) {	
					 x=14;
					 Baraja2=ListaCartas.get(x);
					 PosicionImagen=Baraja2.ID_Carta;
					 System.out.println("Valor variable PosicionImagen: "+ PosicionImagen);
					
				 }
					 else {
					 ID_uno=Baraja.ID_Carta;
					 ID_dos=Baraja2.ID_Carta;
					 if(ID_uno==ID_dos) {
						 System.out.println("PREMIO PREMIO PREMIO " + dobleclic + "" + ID_uno +" "+ " "+ ID_dos);
						 dobleclic=0;ID_uno=0;ID_dos=0;PosicionImagen=0;
					 }
					 System.out.println("Valor de Dobleclic: " + dobleclic);
					 System.out.println("ID primera carta :" + ID_uno);
					 System.out.println("ID segunda carta : " + ID_dos);
					 dobleclic=0;
					 
					 }
				
					 
				}
						 
			 } 
			 }
		 
		);
	
	Imagen16 = new ImageView("Imagenes/incognita.jpg");
	Imagen16.relocate(10, 550);
	Imagen16.setFitWidth(105);
	Imagen16.setFitHeight(105);
	Imagen16.setPickOnBounds(true);
	Imagen16.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 if (e.getClickCount()==2) {
				 System.out.println("Double clicked"+dobleclic);
				 dobleclic=dobleclic+1;
			
				Baraja=ListaCartas.get(15);
				 rutaImagen=Baraja.getImagenCarta().toString();
				 Imagen16.setImage(new Image(rutaImagen));
				 
				 if(dobleclic <= 1) {	
					 x=15;
					 Baraja2=ListaCartas.get(x);
					 PosicionImagen=Baraja2.ID_Carta;
					 System.out.println("Valor variable PosicionImagen: "+ PosicionImagen);
					 
				}else {
					 ID_uno=Baraja.ID_Carta;
					 ID_dos=Baraja2.ID_Carta;
					 if(ID_uno==ID_dos) {
						 System.out.println("PREMIO PREMIO PREMIO " + dobleclic + "" + ID_uno +" "+ " "+ ID_dos);
						 dobleclic=0;ID_uno=0;ID_dos=0;PosicionImagen=0;
					 }
					 System.out.println("Valor de Dobleclic: " + dobleclic);
					 System.out.println("ID primera carta :" + ID_uno);
					 System.out.println("ID segunda carta : " + ID_dos);
					 dobleclic=0;
					 
					 }
				 
			 }		 
			 	 
			 }
		 }
		);
	////////
	
	
	Imagen17 = new ImageView("Imagenes/incognita.jpg");
	Imagen17.relocate(150, 550);
	Imagen17.setFitWidth(105);
	Imagen17.setFitHeight(105);
	Imagen17.setPickOnBounds(true);
	Imagen17.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 if (e.getClickCount()==2) {
				 System.out.println("Double clicked"+dobleclic);
				 dobleclic=dobleclic+1;
			 
				Baraja=ListaCartas.get(16);
				 rutaImagen=Baraja.getImagenCarta().toString();
				 Imagen17.setImage(new Image(rutaImagen));
				 
				 if(dobleclic <= 1) {	
					 x=16;
					 Baraja2=ListaCartas.get(x);
					 PosicionImagen=Baraja2.ID_Carta;
					 System.out.println("Valor variable PosicionImagen: "+ PosicionImagen);
					
					 
				}else {
					 ID_uno=Baraja.ID_Carta;
					 ID_dos=Baraja2.ID_Carta;
					 if(ID_uno==ID_dos) {
						 System.out.println("PREMIO PREMIO PREMIO " + dobleclic + "" + ID_uno +" "+ " "+ ID_dos);
						 dobleclic=0;ID_uno=0;ID_dos=0;PosicionImagen=0;
					 }
					 System.out.println("Valor de Dobleclic: " + dobleclic);
					 System.out.println("ID primera carta :" + ID_uno);
					 System.out.println("ID segunda carta : " + ID_dos);
					 dobleclic=0;
					 
					 }
				 
						 
			 } 
			 }
		 }
		);
	///////////////////////////////////
	Imagen18 = new ImageView("Imagenes/incognita.jpg");
	Imagen18.relocate(290, 550);
	Imagen18.setFitWidth(105);
	Imagen18.setFitHeight(105);
	Imagen18.setPickOnBounds(true);
	Imagen18.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 if (e.getClickCount()==2) {
				 System.out.println("Double clicked"+dobleclic);
				 dobleclic=dobleclic+1;
			 
				Baraja=ListaCartas.get(17);
				 rutaImagen=Baraja.getImagenCarta().toString();
				 Imagen18.setImage(new Image(rutaImagen));
				 
				 if(dobleclic <= 1) {	
					 x=17;
					 Baraja2=ListaCartas.get(x);
					 PosicionImagen=Baraja2.ID_Carta;
					 System.out.println("Valor variable PosicionImagen: "+ PosicionImagen);
					
					 
				}else {
					 ID_uno=Baraja.ID_Carta;
					 ID_dos=Baraja2.ID_Carta;
					 if(ID_uno==ID_dos) {
						 System.out.println("PREMIO PREMIO PREMIO " + dobleclic + "" + ID_uno +" "+ " "+ ID_dos);
						 dobleclic=0;ID_uno=0;ID_dos=0;PosicionImagen=0;
					 }
					 System.out.println("Valor de Dobleclic: " + dobleclic);
					 System.out.println("ID primera carta :" + ID_uno);
					 System.out.println("ID segunda carta : " + ID_dos);
					 dobleclic=0;
					 
					 }
				 
			 }		 
			 	 
			 }
		 }
		);
	
	Imagen19 = new ImageView("Imagenes/incognita.jpg");
	Imagen19.relocate(430, 550);
	Imagen19.setFitWidth(105);
	Imagen19.setFitHeight(105);
	Imagen19.setPickOnBounds(true);
	Imagen19.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 if (e.getClickCount()==2) {
				 System.out.println("Double clicked"+dobleclic);
				 dobleclic=dobleclic+1;
			
				Baraja=ListaCartas.get(18);
				 rutaImagen=Baraja.getImagenCarta().toString();
				 Imagen19.setImage(new Image(rutaImagen));
				 
				 if(dobleclic <= 1) {	
					 x=18;
					 Baraja2=ListaCartas.get(x);
					 PosicionImagen=Baraja2.ID_Carta;
					 System.out.println("Valor variable PosicionImagen: "+ PosicionImagen);
					
				 }else
					 ID_uno=Baraja.ID_Carta;
					 ID_dos=Baraja2.ID_Carta;
					 if(ID_uno==ID_dos) {
						 System.out.println("PREMIO PREMIO PREMIO " + dobleclic + "" + ID_uno +" "+ " "+ ID_dos);
						 dobleclic=0;ID_uno=0;ID_dos=0;PosicionImagen=0;
					 }
					 System.out.println("Valor de Dobleclic: " + dobleclic);
					 System.out.println("ID primera carta :" + ID_uno);
					 System.out.println("ID segunda carta : " + ID_dos);
					 dobleclic=0;
					 
					 }
				
					 
				}
			 		 
			 	 
			 }
		 
		);
	
	
	Imagen20 = new ImageView("Imagenes/incognita.jpg");
	Imagen20.relocate(570, 550);
	Imagen20.setFitWidth(105);
	Imagen20.setFitHeight(105);
	Imagen20.setPickOnBounds(true);
	Imagen20.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 if (e.getClickCount()==2) {
				 System.out.println("Double clicked" + dobleclic);
				 dobleclic=dobleclic+1;
			
				 Baraja=ListaCartas.get(19);
				 rutaImagen=Baraja.getImagenCarta().toString();
				 Imagen20.setImage(new Image(rutaImagen));
				 
				 if(dobleclic <= 1) {	
					 x=19;
					 Baraja2=ListaCartas.get(x);
					 PosicionImagen=Baraja2.ID_Carta;
					 System.out.println("Valor variable PosicionImagen: "+ PosicionImagen);
					 
				 }else {		 
					 ID_uno=Baraja.ID_Carta;
					 ID_dos=Baraja2.ID_Carta;
					 if(ID_uno==ID_dos) {
						 System.out.println("PREMIO PREMIO PREMIO " + dobleclic + "" + ID_uno +" "+ " "+ ID_dos);
						 dobleclic=0;ID_uno=0;ID_dos=0;PosicionImagen=0;
					 }
					 System.out.println("Valor de Dobleclic: " + dobleclic);
					 System.out.println("ID primera carta :" + ID_uno);
					 System.out.println("ID segunda carta : " + ID_dos);
					 dobleclic=0;
					 
					 }
				
					 
				}
						 
			 }
			 }
		 
		);
	
	
	//
	
	Pane contenedor = new Pane();
	
	contenedor.getChildren().addAll(Btn1, Btn2, Btn3, mensaje, Imagen1, Imagen2, Imagen3, Imagen4, Imagen5, Imagen6, Imagen7, Imagen8, Imagen9, Imagen10,
			Imagen11, Imagen12, Imagen13, Imagen14, Imagen15, Imagen16, Imagen17, Imagen18, Imagen19, Imagen20);
	//contenedor.getChildren().add(mensaje);
	//tamaño de contenedor
	contenedor.setMinSize(400, 500);
	// ahora crear escena
	Scene Miescena = new Scene(contenedor);
	
	//

	
	
	//
	
	//propiedades del escenario
	VentanaPrincipal.setTitle("FunnyCouples Game 1.0");
	VentanaPrincipal.setMinHeight(700);
	VentanaPrincipal.setMinWidth(700);
	//asignar escena a escenario
	VentanaPrincipal.setScene(Miescena);
	//mostrar en pantalla
	VentanaPrincipal.show();
			
	
}
public void verificar_parejas() {
	
	if(dobleclic >= 2) {
		 ID_uno=ListaCartas.get(0).getID_Carta();
		 ID_dos=ListaCartas.get(PosicionImagen).getID_Carta();
		 if(ID_uno==ID_dos) {
			 System.out.println("PREMIO PREMIO PREMIO " + dobleclic + "" + ID_uno +" "+ " "+ ID_dos);
		 }
		 System.out.println("Valor de Dobleclic: " + dobleclic);
		 System.out.println("Primera carta Posición:" + ID_uno);
		 System.out.println("Segunda carta Posición: " + ID_dos);
		 dobleclic=0;
		 
		 }
	 if(dobleclic < 2) {			 
		 PosicionImagen=ListaCartas.get(PosicionImagen).getID_Carta();;
		 System.out.println("Valor variable PosicionImagen: "+ PosicionImagen);
		 dobleclic=dobleclic+1;
		 
	}
}

public void seleccionartema() {
	
	
	Imagen1.setImage(new Image("Imagenes/incognita.jpg"));
	Imagen2.setImage(new Image("Imagenes/incognita.jpg"));
	Imagen3.setImage(new Image("Imagenes/incognita.jpg"));
	Imagen4.setImage(new Image("Imagenes/incognita.jpg"));
	Imagen5.setImage(new Image("Imagenes/incognita.jpg"));
	Imagen6.setImage(new Image("Imagenes/incognita.jpg"));
	Imagen7.setImage(new Image("Imagenes/incognita.jpg"));
	Imagen8.setImage(new Image("Imagenes/incognita.jpg"));
	Imagen9.setImage(new Image("Imagenes/incognita.jpg"));
	Imagen10.setImage(new Image("Imagenes/incognita.jpg"));
	Imagen11.setImage(new Image("Imagenes/incognita.jpg"));
	Imagen12.setImage(new Image("Imagenes/incognita.jpg"));
	Imagen13.setImage(new Image("Imagenes/incognita.jpg"));
	Imagen14.setImage(new Image("Imagenes/incognita.jpg"));
	Imagen15.setImage(new Image("Imagenes/incognita.jpg"));
	Imagen16.setImage(new Image("Imagenes/incognita.jpg"));
	Imagen17.setImage(new Image("Imagenes/incognita.jpg"));
	Imagen18.setImage(new Image("Imagenes/incognita.jpg"));
	Imagen19.setImage(new Image("Imagenes/incognita.jpg"));
	Imagen20.setImage(new Image("Imagenes/incognita.jpg"));
	
}

public ArrayList<ImageView> getImages() {
    return getImages();
}

public void repartircartas() {
	
}

public void asignar_cartas_matematicas() {
	
	 dobleclic=0;ID_uno=0;ID_dos=0;PosicionImagen=0;
	
	ListaCartas.clear();
	
	Cartas carta1 = new Cartas(1,"matematicas/1_.png", "M", false);
	Cartas carta2 = new Cartas(1,"matematicas/1.png", "M", false);
	Cartas carta3 = new Cartas(2,"matematicas/10_.png", "M", false );
	Cartas carta4 = new Cartas(2,"matematicas/10.png", "M", false );
	Cartas carta5 = new Cartas(3,"matematicas/11_.png", "M", false );
	Cartas carta6 = new Cartas(3,"matematicas/11.png", "M", false );
	Cartas carta7 = new Cartas(4,"matematicas/12_.png", "M", false );
	Cartas carta8 = new Cartas(4,"matematicas/12.png", "M", false );
	Cartas carta9 = new Cartas(5,"matematicas/13_.png", "M", false );
	Cartas carta10 = new Cartas(5,"matematicas/13.png", "M", false );
	Cartas carta11 = new Cartas(6,"matematicas/14.png", "M", false );
	Cartas carta12 = new Cartas(6,"matematicas/14.png", "M", false );
	Cartas carta13 = new Cartas(7,"matematicas/15_.png", "M", false );
	Cartas carta14 = new Cartas(7,"matematicas/15.png", "M", false );
	Cartas carta15 = new Cartas(8,"matematicas/2_.png", "M", false );
	Cartas carta16 = new Cartas(8,"matematicas/2.png", "M", false );
	Cartas carta17 = new Cartas(9,"matematicas/3_.png", "M", false );
	Cartas carta18 = new Cartas(9,"matematicas/3.png", "M", false );
	Cartas carta19 = new Cartas(10,"matematicas/4_.png", "M", false );
	Cartas carta20 = new Cartas(10,"matematicas/4.png", "M", false );
	
	
	ListaCartas.add(0, carta1);
	ListaCartas.add(1, carta2);
	ListaCartas.add(2, carta3);
	ListaCartas.add(3, carta4);
	ListaCartas.add(4, carta5);
	ListaCartas.add(5, carta6);
	ListaCartas.add(6, carta7);
	ListaCartas.add(7, carta8);
	ListaCartas.add(8, carta9);
	ListaCartas.add(9, carta10);
	ListaCartas.add(10, carta11);
	ListaCartas.add(11, carta12);
	ListaCartas.add(12, carta13);
	ListaCartas.add(13, carta14);
	ListaCartas.add(14, carta15);
	ListaCartas.add(15, carta16);
	ListaCartas.add(16, carta17);
	ListaCartas.add(17, carta18);
	ListaCartas.add(18, carta19);
	ListaCartas.add(19, carta20);
	
	//Collections.shuffle(ListaCartas);
	
		
		}
public void asignar_cartas_programacion() {
	
	 dobleclic=0;ID_uno=0;ID_dos=0;PosicionImagen=0;
	
ListaCartas.clear();
	
	Cartas carta1 = new Cartas(1,"programacion/1.jpg", "M", false);
	Cartas carta2 = new Cartas(1,"programacion/1r.jpg", "M", false);
	Cartas carta3 = new Cartas(2,"programacion/2.jpg", "M", false );
	Cartas carta4 = new Cartas(2,"programacion/2r.jpg", "M", false );
	Cartas carta5 = new Cartas(3,"programacion/3.jpg", "M", false );
	Cartas carta6 = new Cartas(3,"programacion/3r.jpg", "M", false );
	Cartas carta7 = new Cartas(4,"programacion/4.jpg", "M", false );
	Cartas carta8 = new Cartas(4,"programacion/4r.jpg", "M", false );
	Cartas carta9 = new Cartas(5,"programacion/5.jpg", "M", false );
	Cartas carta10 = new Cartas(5,"programacion/5r.jpg", "M", false );
	Cartas carta11 = new Cartas(6,"programacion/6.jpg", "M", false );
	Cartas carta12 = new Cartas(6,"programacion/6r.jpg", "M", false );
	Cartas carta13 = new Cartas(7,"programacion/7.jpg", "M", false );
	Cartas carta14 = new Cartas(7,"programacion/7r.jpg", "M", false );
	Cartas carta15 = new Cartas(8,"programacion/8.jpg", "M", false );
	Cartas carta16 = new Cartas(8,"programacion/8r.jpg", "M", false );
	Cartas carta17 = new Cartas(9,"programacion/9.jpg", "M", false );
	Cartas carta18 = new Cartas(9,"programacion/9r.jpg", "M", false );
	Cartas carta19 = new Cartas(10,"programacion/10.jpg", "M", false );
	Cartas carta20 = new Cartas(10,"programacion/10r.jpg", "M", false );
	
	
	ListaCartas.add(0, carta1);
	ListaCartas.add(1, carta2);
	ListaCartas.add(2, carta3);
	ListaCartas.add(3, carta4);
	ListaCartas.add(4, carta5);
	ListaCartas.add(5, carta6);
	ListaCartas.add(6, carta7);
	ListaCartas.add(7, carta8);
	ListaCartas.add(8, carta9);
	ListaCartas.add(9, carta10);
	ListaCartas.add(10, carta11);
	ListaCartas.add(11, carta12);
	ListaCartas.add(12, carta13);
	ListaCartas.add(13, carta14);
	ListaCartas.add(14, carta15);
	ListaCartas.add(15, carta16);
	ListaCartas.add(16, carta17);
	ListaCartas.add(17, carta18);
	ListaCartas.add(18, carta19);
	ListaCartas.add(19, carta20);
	
	Collections.shuffle(ListaCartas);
	
	
}

public void asignar_cartas_ingles() {
	
	 dobleclic=0;ID_uno=0;ID_dos=0;PosicionImagen=0;
	
ListaCartas.clear();
	
	Cartas carta1 = new Cartas(1,"ingles/1_.png", "M", false);
	Cartas carta2 = new Cartas(1,"ingles/1.png", "M", false);
	Cartas carta3 = new Cartas(2,"ingles/10_.png", "M", false );
	Cartas carta4 = new Cartas(2,"ingles/10.png", "M", false );
	Cartas carta5 = new Cartas(3,"ingles/11_.png", "M", false );
	Cartas carta6 = new Cartas(3,"ingles/11.png", "M", false );
	Cartas carta7 = new Cartas(4,"ingles/12_.png", "M", false );
	Cartas carta8 = new Cartas(4,"ingles/12.png", "M", false );
	Cartas carta9 = new Cartas(5,"ingles/13_.png", "M", false );
	Cartas carta10 = new Cartas(5,"ingles/13.png", "M", false );
	Cartas carta11 = new Cartas(6,"ingles/14_.png", "M", false );
	Cartas carta12 = new Cartas(6,"ingles/14.png", "M", false );
	Cartas carta13 = new Cartas(7,"ingles/15_.png", "M", false );
	Cartas carta14 = new Cartas(7,"ingles/15.png", "M", false );
	Cartas carta15 = new Cartas(8,"ingles/2_.png", "M", false );
	Cartas carta16 = new Cartas(8,"ingles/2.png", "M", false );
	Cartas carta17 = new Cartas(9,"ingles/3_.png", "M", false );
	Cartas carta18 = new Cartas(9,"ingles/3.png", "M", false );
	Cartas carta19 = new Cartas(10,"ingles/4_.png", "M", false );
	Cartas carta20 = new Cartas(10,"ingles/4.png", "M", false );
	
	
	ListaCartas.add(0, carta1);
	ListaCartas.add(1, carta2);
	ListaCartas.add(2, carta3);
	ListaCartas.add(3, carta4);
	ListaCartas.add(4, carta5);
	ListaCartas.add(5, carta6);
	ListaCartas.add(6, carta7);
	ListaCartas.add(7, carta8);
	ListaCartas.add(8, carta9);
	ListaCartas.add(9, carta10);
	ListaCartas.add(10, carta11);
	ListaCartas.add(11, carta12);
	ListaCartas.add(12, carta13);
	ListaCartas.add(13, carta14);
	ListaCartas.add(14, carta15);
	ListaCartas.add(15, carta16);
	ListaCartas.add(16, carta17);
	ListaCartas.add(17, carta18);
	ListaCartas.add(18, carta19);
	ListaCartas.add(19, carta20);
	
	Collections.shuffle(ListaCartas);
	
	
	
}



}








