/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import controladores.JuegoController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author javis
 */
public class RojoHaGanadoController implements Initializable {

    @FXML
    private Button botonVale;
    
    private Stage primaryStage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void initStage(Stage stage) {
        primaryStage = stage;
    }

    @FXML
    private void Volver(ActionEvent event) {
         try {
            FXMLLoader v = new FXMLLoader(getClass().getResource("/vista/VistaJuego.fxml"));
            Parent root = v.load();
            JuegoController juego = v.<JuegoController>getController();
             
            juego.initStage(primaryStage);
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(JuegoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
