
package edu.poligran.funnycouples.juego;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.IOException;


public class FunnyCouples extends Application{

    @Override
    public void start(Stage primaryStage) throws IOException {
    	

    	
    	BorderPane kroot = (BorderPane) FXMLLoader.load(getClass().getResource("ventanaP.fxml"));
    	
   
        //Parent kroot = FXMLLoader.load(getClass().getResource("ventanaP.fxml"));

        Scene scene = new Scene(kroot);
        primaryStage.setTitle("Juego Concentrese 1.0");
        primaryStage.setScene(scene);
        
        
        primaryStage.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
