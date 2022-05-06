/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author felix
 */
public class RegistrarController implements Initializable {

    @FXML
    private TextField textoNombreNuevo;
    @FXML
    private TextField textoCorreo;
    @FXML
    private PasswordField textoContraseñaNueva;
    @FXML
    private DatePicker fechaDeNacimiento;
    @FXML
    private Text textoErrorRegistra;
    @FXML
    private Button botonCambiarAvatar;
    @FXML
    private ImageView imagen;
    @FXML
    private Button botonCrearCuenta;
    
    private Stage primaryStage;
    @FXML
    private Button anterior;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    void initStage(Stage stage) {
        primaryStage = stage;
    }

    @FXML
    private void antes(ActionEvent event) {
        try{
           FXMLLoader v = new FXMLLoader(getClass().getResource("/vista/VistaLogin.fxml"));
       Parent root = v.load();
       LoginController juego = v.<LoginController>getController();
       juego.initStage(primaryStage);
       Scene scene = new Scene(root);
       primaryStage.setScene(scene);
       primaryStage.show();
       } catch(IOException e){
            e.printStackTrace();
       }
    }
    
}
