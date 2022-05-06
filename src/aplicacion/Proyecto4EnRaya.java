/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import controladores.LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author felix
 */
public class Proyecto4EnRaya extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Application.setUserAgentStylesheet(STYLESHEET_CASPIAN);
        //desde el main se carga la primera ventana y se le pasa el stage principal al controlador de la misma
        try{
            //lanza al principio la ventana de login 
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/VistaLogin.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Conecta4");
            //carga controlador de la ventana login 
            LoginController controladorPrincipal = loader.getController();
            controladorPrincipal.initStage(primaryStage);
            primaryStage.show();
           
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
