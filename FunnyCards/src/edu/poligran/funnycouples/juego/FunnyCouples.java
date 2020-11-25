
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
	
	int clic_uno=0;
	int clic_dos=0;
	int PosicionImagen;
	
	
	Scene miEscena;
	Pane contenedor;
	Button Btn1, Btn2, Btn3;
	ImageView  Imagen1, Imagen2, Imagen3, Imagen4, Imagen5, Imagen6, Imagen7, Imagen8, Imagen9, Imagen10,
	Imagen11, Imagen12, Imagen13, Imagen14, Imagen15, Imagen16, Imagen17, Imagen18, Imagen19, Imagen20;
	
	
	
public static void main(String[] args) {
	

	
	Application.launch(args);
	
	
}


@Override
public void start(Stage VentanaPrincipal) {
	
	//Cartas carta1 = new Cartas(C1, );
	
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
			
		//Baraja.add(Carta1);	
						
		//Collections.shuffle(imagenes);
			
			//imageObject
			
			
		}});
	
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
	
	
	
	//imágenes
	
	
	
	/* Se definen los ImageView iniciales con la imagen incognita.jpg  */
	Imagen1 = new ImageView("imagenes/incognita.jpg");
	Imagen1.relocate(10, 100);
	Imagen1.setFitWidth(155);
	Imagen1.setFitHeight(155);
	Imagen1.setPickOnBounds(true);
	
	Imagen1.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 System.out.println("Double clicked");
			 clic_uno=0;
			 clic_dos=0;
			 PosicionImagen=1;
			 //carta1.setImagenCarta(Imagen1);
		 }
		}
		);
	
	
	
	Imagen2 = new ImageView("Imagenes/incognita.jpg");
	Imagen2.relocate(150, 100);
	Imagen2.setFitWidth(155);
	Imagen2.setFitHeight(155);
	Imagen2.setPickOnBounds(true);
	Imagen2.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 System.out.println("Double clicked");
			 PosicionImagen=2;
			 	 
			 }
		 }
		);
	
	
	Imagen3 = new ImageView("Imagenes/incognita.jpg");
	Imagen3.relocate(290, 100);
	Imagen3.setFitWidth(155);
	Imagen3.setFitHeight(155);
	
	Imagen3.setPickOnBounds(true);
	Imagen3.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 System.out.println("Double clicked");
			 PosicionImagen=3;
			 	 
			 }
		 }
		);
	
	Imagen4 = new ImageView("Imagenes/incognita.jpg");
	Imagen4.relocate(430, 100);
	Imagen4.setFitWidth(155);
	Imagen4.setFitHeight(155);
	Imagen4.setPickOnBounds(true);
	Imagen4.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 System.out.println("Double clicked");
			 PosicionImagen=4;
			 	 
			 }
		 }
		);
	
	Imagen5 = new ImageView("Imagenes/incognita.jpg");
	Imagen5.relocate(570, 100);
	Imagen5.setFitWidth(155);
	Imagen5.setFitHeight(155);
	Imagen5.setPickOnBounds(true);
	Imagen5.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 System.out.println("Double clicked");
			 PosicionImagen=5;
			 	 
			 }
		 }
		);
	
	Imagen6 = new ImageView("Imagenes/incognita.jpg");
	Imagen6.relocate(10, 250);
	Imagen6.setFitWidth(155);
	Imagen6.setFitHeight(155);
	Imagen6.setPickOnBounds(true);
	Imagen6.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 System.out.println("Double clicked");
			 PosicionImagen=6;
			 	 
			 }
		 }
		);
	
	Imagen7 = new ImageView("Imagenes/incognita.jpg");
	Imagen7.relocate(150, 250);
	Imagen7.setFitWidth(155);
	Imagen7.setFitHeight(155);
	Imagen7.setPickOnBounds(true);
	Imagen7.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 System.out.println("Double clicked");
			 PosicionImagen=7;
			 	 
			 }
		 }
		);
	
	Imagen8 = new ImageView("Imagenes/incognita.jpg");
	Imagen8.relocate(290, 250);
	Imagen8.setFitWidth(155);
	Imagen8.setFitHeight(155);
	Imagen8.setPickOnBounds(true);
	Imagen8.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 System.out.println("Double clicked");
			 PosicionImagen=8;
			 	 
			 }
		 }
		);
	
	Imagen9 = new ImageView("Imagenes/incognita.jpg");
	Imagen9.relocate(430, 250);
	Imagen9.setFitWidth(155);
	Imagen9.setFitHeight(155);
	Imagen9.setPickOnBounds(true);
	Imagen9.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 System.out.println("Double clicked");
			 PosicionImagen=9;
			 	 
			 }
		 }
		);
	
	Imagen10 = new ImageView("Imagenes/incognita.jpg");
	Imagen10.relocate(570, 250);
	Imagen10.setFitWidth(155);
	Imagen10.setFitHeight(155);
	Imagen10.setPickOnBounds(true);
	Imagen10.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 System.out.println("Double clicked");
			 PosicionImagen=10;
			 	 
			 }
		 }
		);
	
	Imagen11 = new ImageView("Imagenes/incognita.jpg");
	Imagen11.relocate(10, 400);
	Imagen11.setFitWidth(155);
	Imagen11.setFitHeight(155);
	Imagen11.setPickOnBounds(true);
	Imagen11.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 System.out.println("Double clicked");
			 PosicionImagen=11;
			 	 
			 }
		 }
		);
	
	Imagen12 = new ImageView("Imagenes/incognita.jpg");
	Imagen12.relocate(150, 400);
	Imagen12.setFitWidth(155);
	Imagen12.setFitHeight(155);
	Imagen12.setPickOnBounds(true);
	Imagen12.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 System.out.println("Double clicked");
			 PosicionImagen=12;
			 	 
			 }
		 }
		);
	
	Imagen13 = new ImageView("Imagenes/incognita.jpg");
	Imagen13.relocate(290, 400);
	Imagen13.setFitWidth(155);
	Imagen13.setFitHeight(155);
	Imagen13.setPickOnBounds(true);
	Imagen13.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 System.out.println("Double clicked");
			 PosicionImagen=13;
			 	 
			 }
		 }
		);
	
	Imagen14 = new ImageView("Imagenes/incognita.jpg");
	Imagen14.relocate(430, 400);
	Imagen14.setFitWidth(155);
	Imagen14.setFitHeight(155);
	Imagen14.setPickOnBounds(true);
	Imagen14.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 System.out.println("Double clicked");
			 PosicionImagen=14;
			 	 
			 }
		 }
		);
	
	Imagen15 = new ImageView("Imagenes/incognita.jpg");
	Imagen15.relocate(570, 400);
	Imagen15.setFitWidth(155);
	Imagen15.setFitHeight(155);
	Imagen15.setPickOnBounds(true);
	Imagen15.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 System.out.println("Double clicked");
			 PosicionImagen=15;
			 	 
			 }
		 }
		);
	
	Imagen16 = new ImageView("Imagenes/incognita.jpg");
	Imagen16.relocate(10, 550);
	Imagen16.setFitWidth(155);
	Imagen16.setFitHeight(155);
	Imagen16.setPickOnBounds(true);
	Imagen16.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 System.out.println("Double clicked");
			 PosicionImagen=16;
			 	 
			 }
		 }
		);
	
	Imagen17 = new ImageView("Imagenes/incognita.jpg");
	Imagen17.relocate(150, 550);
	Imagen17.setFitWidth(155);
	Imagen17.setFitHeight(155);
	Imagen17.setPickOnBounds(true);
	Imagen17.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 System.out.println("Double clicked");
			 PosicionImagen=17;
			 	 
			 }
		 }
		);
	
	Imagen18 = new ImageView("Imagenes/incognita.jpg");
	Imagen18.relocate(290, 550);
	Imagen18.setFitWidth(155);
	Imagen18.setFitHeight(155);
	Imagen18.setPickOnBounds(true);
	Imagen18.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 System.out.println("Double clicked");
			 PosicionImagen=18;
			 	 
			 }
		 }
		);
	
	Imagen19 = new ImageView("Imagenes/incognita.jpg");
	Imagen19.relocate(430, 550);
	Imagen19.setFitWidth(155);
	Imagen19.setFitHeight(155);
	Imagen19.setPickOnBounds(true);
	Imagen19.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 System.out.println("Double clicked");
			 PosicionImagen=19;
			 	 
			 }
		 }
		);
	
	
	Imagen20 = new ImageView("Imagenes/incognita.jpg");
	Imagen20.relocate(570, 550);
	Imagen20.setFitWidth(155);
	Imagen20.setFitHeight(155);
	Imagen20.setPickOnBounds(true);
	Imagen20.setOnMouseClicked(new EventHandler <MouseEvent> (){
		 @Override
	     public void handle(MouseEvent e) {
			 System.out.println("Double clicked");
			 PosicionImagen=20;
			 	 
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

public void seleccionartema() {
	
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

public void repartircartas() {
	
}


}








