/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import DBAccess.Connect4DAOException;
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
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Connect4;
import static model.Connect4.getSingletonConnect4;
import model.Player;

/**
 * FXML Controller class
 *
 * @author javis
 */
public class HeolvidadocontraController implements Initializable {

    @FXML
    private Button botoncontinuar;
    @FXML
    private Button atras;
    
    private Stage primaryStage;
    @FXML
    private TextField textoUsuario;
    @FXML
    private TextField textoCorreo;
    @FXML
    private Text textoError;
    public static String recuperarUsuario;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        recuperarUsuario = textoUsuario.getText();
    }    

    @FXML
    private void elboton(ActionEvent event) throws Connect4DAOException {
       try {
           String u = textoUsuario.getText();
           String c = textoCorreo.getText();
           if( u.equals("") || u.isEmpty() || c.equals("") || c.isEmpty()){
                textoError.setText("No ha introducido usuario o correo");
                //RecuparaContraseña.setVisible(true);
                return;
            } 
           Connect4 m = Connect4.getSingletonConnect4();
           if(m.exitsNickName(u) == true ){
               Player p = m.getPlayer(u);
               if( p.checkEmail(c) == true ){
               FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/TeHaLlegadoCorreo.fxml"));
                Parent root = loader.load();
                this.recuperarUsuario = u;
                TeHaLlegadoCorreoController controlador = loader.getController();
                Scene scene = new Scene(root);
                controlador.initStage(primaryStage);
                primaryStage.setScene(scene);
                primaryStage.show();}
               else {
               textoError.setText("Este usuario o correo no existen");
           }
           } else {
               textoError.setText("Este usuario o correo no existen");
           }
        } catch (IOException ex) {
            Logger.getLogger(JuegoController.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    @FXML
    private void irAtras(ActionEvent event) {
        try{
           FXMLLoader v = new FXMLLoader(getClass().getResource("/vista/VistaLogin.fxml"));
            Parent root = v.load();
            LoginController juego = v.getController();
            Scene scene = new Scene(root);
            juego.initStage(primaryStage);
            primaryStage.setScene(scene);
            primaryStage.show();
       } catch(IOException e){
            e.printStackTrace();
       }
    }

    void initStage(Stage stage) {
        primaryStage = stage;
    }

    
}
