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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import java.net.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Tooltip;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Connect4;
import static model.Connect4.getSingletonConnect4;
import model.Player;
/**
 * FXML Controller class
 *
 * @author felix
 */
public class LoginController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField textoUsuario;
    @FXML
    private PasswordField textoContraseña;
    @FXML
    private Button botonIniciar;
    @FXML
    private Text textoError;
    @FXML
    private Button botonRegistrar;
    
    private Stage primaryStage;
    @FXML
    private CheckBox recuerdame;
    
    //variables globales para guardar el usuario y la contraseña
    private String usuario;
    private String contraseña;
    private boolean estadoRecuerdame;
    @FXML
    private Hyperlink RecuparaContraseña;
    
   
    
    public void initStage(Stage stage){
         primaryStage = stage;
    }
    
    @FXML
   private void irARegistrar(ActionEvent event) {
       try{
           FXMLLoader v = new FXMLLoader(getClass().getResource("/vista/VistaRegistrar.fxml"));
       Parent root = v.load();
       RegistrarController juego = v.<RegistrarController>getController();
       juego.initStage(primaryStage);
       Scene scene = new Scene(root);
       primaryStage.setScene(scene);
       primaryStage.show();
       } catch(IOException e){
            e.printStackTrace();
       }
   }
    
    @FXML
    public void tryLogin(ActionEvent event) throws Connect4DAOException {
        try { 
            //obtener el texto de los apartados usuario y contraseña introducidos por el usuario
            String comprobarUsuario = textoUsuario.getText();
            String comprobarContraseña = textoContraseña.getText();
            /*if(recuerdame.isSelected() == true){
                textoUsuario.setText(usuario);
                textoContraseña.setText(contraseña);
            }*/
            //si campos usuario o contraseña en blancos, advertir al usuario de ello
            if( comprobarUsuario.equals("") || comprobarUsuario.isEmpty() || comprobarContraseña.equals("") || comprobarContraseña.isEmpty()){
                textoError.setText("No ha introducido usuario o contraseña");
                //RecuparaContraseña.setVisible(true);
                return;
            }
            //ver si estos campos ya han sido creados en la base de datos
            if(getSingletonConnect4().loginPlayer(comprobarUsuario, comprobarContraseña) != null ){
                //sobrescribir en las variables globales los datos del usuario que acaba de acceder
                this.usuario = comprobarUsuario;
                this.contraseña = comprobarContraseña;
                //cargra y lanzar la ventana del juego 
                FXMLLoader v = new FXMLLoader(getClass().getResource("/vista/VistaJuego.fxml"));
                Parent root = v.load();
                JuegoController juego = v.<JuegoController>getController();
                juego.initStage(primaryStage);
                Scene scene = new Scene(root);
                primaryStage.setScene(scene);
                primaryStage.show();
            } else {
                RecuparaContraseña.setVisible(true);
                textoError.setText("Usuario o contraseña incorrecta");
            }    // si no se cumple el if, entonces avisa de que no se ha podido iniciar sesion en el texto de error
       } catch (IOException e) {
            e.printStackTrace();
        } 
    }
    
     
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        RecuparaContraseña.setOnAction(e -> {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/Heolvidadocontra.fxml"));
                Parent root;
                
                root = loader.load();
                
                HeolvidadocontraController controlador = loader.getController();
                controlador.initStage(primaryStage);
                Scene scene = new Scene(root);
                primaryStage.setScene(scene);
                primaryStage.show();
            } catch (IOException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });
        try {
            
            // TODO
            //inicializa la base de datos para poder ser utilizada 
            Connect4 conecta4 = getSingletonConnect4();
            //elimina los datos que habia anteriormente, esto habra que quitarlo cuando se pueda registrar
            conecta4.removeAllData();
            //crea un jugador
            String nickName = "felix";
            String email = "felix@domain.es";
            String password = "marti";
            int points = 0;
            LocalDate birthdate = LocalDate.now().minusYears(18);
            Player result = conecta4.registerPlayer(nickName, email, password, birthdate, points);
        } catch (Connect4DAOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
    }

   
    
}

   


    


