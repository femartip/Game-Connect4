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
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Connect4;
import static model.Connect4.getSingletonConnect4;
import model.Player;

/**
 * FXML Controller class
 *
 * @author javis
 */
public class TuContraEsController implements Initializable {

    @FXML
    private Button fin;
    private Stage primaryStage;
    @FXML
    private Text contraseña;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        try {
            String u = HeolvidadocontraController.recuperarUsuario;
            Connect4 m = Connect4.getSingletonConnect4();
            Player p = m.getPlayer(u);
            String pas = p.getPassword();
            contraseña.setText(pas);
                    } catch (Connect4DAOException ex) {
            Logger.getLogger(TuContraEsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }    

    @FXML
    private void aInicio(ActionEvent event) {
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
