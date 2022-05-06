/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author felix
 */
public class JuegoController implements Initializable {

    
    
    
    private Stage primaryStage;
    
     private boolean turno1 = true;
     
     private boolean turno2 = false;
     //Columna 0
     private boolean f0c0ocupadoAzul = false;
     private boolean f0c0ocupadoRojo = false;
     private boolean f1c0ocupadoAzul = false;
     private boolean f1c0ocupadoRojo = false;
     private boolean f2c0ocupadoAzul = false;
     private boolean f2c0ocupadoRojo = false;
     private boolean f3c0ocupadoAzul = false;
     private boolean f3c0ocupadoRojo = false;
     private boolean f4c0ocupadoAzul = false;
     private boolean f4c0ocupadoRojo = false;
     private boolean f5c0ocupadoAzul = false;
     private boolean f5c0ocupadoRojo = false;
     private boolean f6c0ocupadoAzul = false;
     private boolean f6c0ocupadoRojo = false;
     //Columna 1
     private boolean f0c1ocupadoAzul = false;
     private boolean f0c1ocupadoRojo = false;
     private boolean f1c1ocupadoAzul = false;
     private boolean f1c1ocupadoRojo = false;
     private boolean f2c1ocupadoAzul = false;
     private boolean f2c1ocupadoRojo = false;
     private boolean f3c1ocupadoAzul = false;
     private boolean f3c1ocupadoRojo = false;
     private boolean f4c1ocupadoAzul = false;
     private boolean f4c1ocupadoRojo = false;
     private boolean f5c1ocupadoAzul = false;
     private boolean f5c1ocupadoRojo = false;
     private boolean f6c1ocupadoAzul = false;
     private boolean f6c1ocupadoRojo = false;
     //Columna2
     private boolean f0c2ocupadoAzul = false;
     private boolean f0c2ocupadoRojo = false;
     private boolean f1c2ocupadoAzul = false;
     private boolean f1c2ocupadoRojo = false;
     private boolean f2c2ocupadoAzul = false;
     private boolean f2c2ocupadoRojo = false;
     private boolean f3c2ocupadoAzul = false;
     private boolean f3c2ocupadoRojo = false;
     private boolean f4c2ocupadoAzul = false;
     private boolean f4c2ocupadoRojo = false;
     private boolean f5c2ocupadoAzul = false;
     private boolean f5c2ocupadoRojo = false;
     private boolean f6c2ocupadoAzul = false;
     private boolean f6c2ocupadoRojo = false;
     //Columna3
     private boolean f0c3ocupadoAzul = false;
     private boolean f0c3ocupadoRojo = false;
     private boolean f1c3ocupadoAzul = false;
     private boolean f1c3ocupadoRojo = false;
     private boolean f2c3ocupadoAzul = false;
     private boolean f2c3ocupadoRojo = false;
     private boolean f3c3ocupadoAzul = false;
     private boolean f3c3ocupadoRojo = false;
     private boolean f4c3ocupadoAzul = false;
     private boolean f4c3ocupadoRojo = false;
     private boolean f5c3ocupadoAzul = false;
     private boolean f5c3ocupadoRojo = false;
     private boolean f6c3ocupadoAzul = false;
     private boolean f6c3ocupadoRojo = false;
     //Columna4
     private boolean f0c4ocupadoAzul = false;
     private boolean f0c4ocupadoRojo = false;
     private boolean f1c4ocupadoAzul = false;
     private boolean f1c4ocupadoRojo = false;
     private boolean f2c4ocupadoAzul = false;
     private boolean f2c4ocupadoRojo = false;
     private boolean f3c4ocupadoAzul = false;
     private boolean f3c4ocupadoRojo = false;
     private boolean f4c4ocupadoAzul = false;
     private boolean f4c4ocupadoRojo = false;
     private boolean f5c4ocupadoAzul = false;
     private boolean f5c4ocupadoRojo = false;
     private boolean f6c4ocupadoAzul = false;
     private boolean f6c4ocupadoRojo = false;
     //Columna5
     private boolean f0c5ocupadoAzul = false;
     private boolean f0c5ocupadoRojo = false;
     private boolean f1c5ocupadoAzul = false;
     private boolean f1c5ocupadoRojo = false;
     private boolean f2c5ocupadoAzul = false;
     private boolean f2c5ocupadoRojo = false;
     private boolean f3c5ocupadoAzul = false;
     private boolean f3c5ocupadoRojo = false;
     private boolean f4c5ocupadoAzul = false;
     private boolean f4c5ocupadoRojo = false;
     private boolean f5c5ocupadoAzul = false;
     private boolean f5c5ocupadoRojo = false;
     private boolean f6c5ocupadoAzul = false;
     private boolean f6c5ocupadoRojo = false;
     //Columna6
     private boolean f0c6ocupadoAzul = false;
     private boolean f0c6ocupadoRojo = false;
     private boolean f1c6ocupadoAzul = false;
     private boolean f1c6ocupadoRojo = false;
     private boolean f2c6ocupadoAzul = false;
     private boolean f2c6ocupadoRojo = false;
     private boolean f3c6ocupadoAzul = false;
     private boolean f3c6ocupadoRojo = false;
     private boolean f4c6ocupadoAzul = false;
     private boolean f4c6ocupadoRojo = false;
     private boolean f5c6ocupadoAzul = false;
     private boolean f5c6ocupadoRojo = false;
     private boolean f6c6ocupadoAzul = false;
     private boolean f6c6ocupadoRojo = false;
     //Columna7
     private boolean f0c7ocupadoAzul = false;
     private boolean f0c7ocupadoRojo = false;
     private boolean f1c7ocupadoAzul = false;
     private boolean f1c7ocupadoRojo = false;
     private boolean f2c7ocupadoAzul = false;
     private boolean f2c7ocupadoRojo = false;
     private boolean f3c7ocupadoAzul = false;
     private boolean f3c7ocupadoRojo = false;
     private boolean f4c7ocupadoAzul = false;
     private boolean f4c7ocupadoRojo = false;
     private boolean f5c7ocupadoAzul = false;
     private boolean f5c7ocupadoRojo = false;
     private boolean f6c7ocupadoAzul = false;
     private boolean f6c7ocupadoRojo = false;
    
     private int  clickC1= 0;
     private int clickC2 = 0;
     private int clickC3 = 0;
     private int clickC4 = 0;
     private int clickC5 = 0;
     private int clickC6 = 0;
     private int clickC7 = 0;
     private int clickC8 = 0;
    
    ObservableList<String> opcionesJuego = FXCollections.observableArrayList("CPU", "PVP");
    @FXML
    private ComboBox<String> CajaOpciones;
    @FXML
    private Button w;
    @FXML
    private Button v;
    @FXML
    private Button u;
    @FXML
    private Button t;
    @FXML
    private Button s;
    @FXML
    private Button r;
    @FXML
    private Button q;
    @FXML
    private Button p;
    @FXML
    private Button o;
    @FXML
    private Button n;
    @FXML
    private Button m;
    @FXML
    private Button l;
    @FXML
    private Button k;
    @FXML
    private Button j;
    @FXML
    private Button i;
    @FXML
    private Button h;
    @FXML
    private Button g;
    @FXML
    private Button f;
    @FXML
    private Button e;
    @FXML
    private Button d;
    @FXML
    private Button c;
    @FXML
    private Button aa;
    @FXML
    private Button a;
    @FXML
    private Button ddd;
    @FXML
    private Button ccc;
    @FXML
    private Button bbb;
    @FXML
    private Button aaa;
    @FXML
    private Button zz;
    @FXML
    private Button yy;
    @FXML
    private Button cc;
    @FXML
    private Button bb;
    @FXML
    private Button b;
    @FXML
    private Button z;
    @FXML
    private Button y;
    @FXML
    private Button xx;
    @FXML
    private Button ww;
    @FXML
    private Button vv;
    @FXML
    private Button uu;
    @FXML
    private Button tt;
    @FXML
    private Button ss;
    @FXML
    private Button rr;
    @FXML
    private Button qq;
    @FXML
    private Button pp;
    @FXML
    private Button oo;
    @FXML
    private Button nn;
    @FXML
    private Button mm;
    @FXML
    private Button ll;
    @FXML
    private Button kk;
    @FXML
    private Button jj;
    @FXML
    private Button ii;
    @FXML
    private Button hh;
    @FXML
    private Button gg;
    @FXML
    private Button ff;
    @FXML
    private Button ee;
    @FXML
    private Button dd;
    @FXML
    private Button x;
    @FXML
    private Text textoTurno;
    @FXML
    private Button botonReiniciar;
    @FXML
    private Button cerrarSesion;
    
   
    public void initStage(Stage stage) {
        primaryStage = stage;
    }
            
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        CajaOpciones.setValue("PVP");
        CajaOpciones.setItems(opcionesJuego);
       
       
    }    

    
    @FXML
    private void botonsito(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/VistaSeHaCerradoSesion.fxml"));
            Parent root = loader.load();
            
            /*VistaSeHaCerradoSesionController controlador = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();*/
            VistaSeHaCerradoSesionController juego = loader.<VistaSeHaCerradoSesionController>getController();
            juego.initStage(primaryStage);
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(JuegoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    
    
    
     @FXML
    private void f0c0(ActionEvent event) { 
        
            switch(clickC1){
                case 0 :  if( turno1 && clickC1 == 0  ){ ww.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC1 == 0 ){ww.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC1 == 1 ){oo.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC1 == 1 ){oo.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC1 == 2 ){gg.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC1 == 2 ){gg.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC1 == 3){y.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC1 == 3 ){y.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC1 == 4  ){ q.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC1 == 4 ){q.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC1 == 5  ){ i.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC1 == 5 ){i.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC1 == 6 ){ a.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC1 == 6 ){a.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c0ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                
                
            }
            
            
         
        
        clickC1++;
        IA();
    }
    
    @FXML
    private void f1c0(ActionEvent event) {
         
            switch(clickC1){
                case 0 :  if( turno1 && clickC1 == 0  ){ ww.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c0ocupadoRojo = true;textoTurno.setText("Jugador2"); ganoRojo();}
                          else if( turno2 && clickC1 == 0 ){ww.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC1 == 1 ){oo.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC1 == 1 ){oo.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC1 == 2 ){gg.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC1 == 2 ){gg.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC1 == 3){y.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC1 == 3 ){y.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC1 == 4  ){ q.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC1 == 4 ){q.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC1 == 5  ){ i.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC1 == 5 ){i.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC1 == 6 ){ a.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC1 == 6 ){a.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        
        clickC1++;
        IA();
    }
    
     @FXML
    private void f2c0(ActionEvent event) {
        
         
            switch(clickC1){
                case 0 :  if( turno1 && clickC1 == 0  ){ ww.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC1 == 0 ){ww.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC1 == 1 ){oo.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC1 == 1 ){oo.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC1 == 2 ){gg.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC1 == 2 ){gg.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC1 == 3){y.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC1 == 3 ){y.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC1 == 4  ){ q.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC1 == 4 ){q.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC1 == 5  ){ i.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC1 == 5 ){i.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC1 == 6 ){ a.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC1 == 6 ){a.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        
        clickC1++;
        IA();
    }
    
     @FXML
    private void f3c0(ActionEvent event) {
        
            switch(clickC1){
                case 0 :  if( turno1 && clickC1 == 0  ){ ww.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC1 == 0 ){ww.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC1 == 1 ){oo.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC1 == 1 ){oo.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC1 == 2 ){gg.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC1 == 2 ){gg.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC1 == 3){y.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC1 == 3 ){y.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC1 == 4  ){ q.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC1 == 4 ){q.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC1 == 5  ){ i.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC1 == 5 ){i.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC1 == 6 ){ a.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC1 == 6 ){a.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        
        clickC1++;
        IA();
    }
    
     @FXML
    private void f4c0(ActionEvent event) {
        
        
            switch(clickC1){
                case 0 :  if( turno1 && clickC1 == 0  ){ ww.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC1 == 0 ){ww.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC1 == 1 ){oo.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC1 == 1 ){oo.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC1 == 2 ){gg.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC1 == 2 ){gg.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC1 == 3){y.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC1 == 3 ){y.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC1 == 4  ){ q.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC1 == 4 ){q.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC1 == 5  ){ i.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC1 == 5 ){i.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c0ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 6 : if( turno1 && clickC1 == 6 ){ a.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC1 == 6 ){a.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        
        clickC1++;
        IA();
    
    }
    
    @FXML
    private void f5c0(ActionEvent event) {
          
            switch(clickC1){
                case 0 :  if( turno1 && clickC1 == 0  ){ ww.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC1 == 0 ){ww.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c0ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 1 :  if ( turno1 && clickC1 == 1 ){oo.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC1 == 1 ){oo.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC1 == 2 ){gg.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC1 == 2 ){gg.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC1 == 3){y.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC1 == 3 ){y.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC1 == 4  ){ q.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC1 == 4 ){q.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC1 == 5  ){ i.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC1 == 5 ){i.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c0ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 6 : if( turno1 && clickC1 == 6 ){ a.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c0ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC1 == 6 ){a.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c0ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        
        clickC1++;
        IA();
    }
    
    @FXML
    private void f6c0(ActionEvent event) {
         
            switch(clickC1){
                case 0 :  if( turno1 && clickC1 == 0  ){ ww.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC1 == 0 ){ww.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC1 == 1 ){oo.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC1 == 1 ){oo.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC1 == 2 ){gg.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC1 == 2 ){gg.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC1 == 3){y.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC1 == 3 ){y.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC1 == 4  ){ q.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC1 == 4 ){q.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC1 == 5  ){ i.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC1 == 5 ){i.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC1 == 6 ){ a.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC1 == 6 ){a.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            
            
            
         
        }
        clickC1++;
        IA();
    }
    
      @FXML
    private void f0c1(ActionEvent event) {
        
        
            switch(clickC2){
                case 0 :  if( turno1 && clickC2 == 0  ){ xx.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC2 == 0 ){xx.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c1ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 1 :  if ( turno1 && clickC2 == 1 ){pp.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC2 == 1 ){pp.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC2 == 2 ){hh.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC2 == 2 ){hh.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC2 == 3){z.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC2 == 3 ){z.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC2 == 4  ){ r.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC2 == 4 ){r.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC2 == 5  ){ j.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC2 == 5 ){j.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC2 == 6 ){ b.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC2 == 6 ){b.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c1ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                
                
            }
            
            
         
        
        clickC2++;
        IA();
    }
    
    @FXML
    private void f1c1(ActionEvent event) {
          
            switch(clickC2){
                case 0 :  if( turno1 && clickC2 == 0  ){ xx.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC2 == 0 ){xx.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c1ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 1 :  if ( turno1 && clickC2 == 1 ){pp.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC2 == 1 ){pp.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC2 == 2 ){hh.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC2 == 2 ){hh.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC2 == 3){z.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC2 == 3 ){z.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC2 == 4  ){ r.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC2 == 4 ){r.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC2 == 5  ){ j.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC2 == 5 ){j.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC2 == 6 ){ b.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC2 == 6 ){b.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c1ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                
                
            }
            
            
         
        
        clickC2++;
        IA();
    }

     @FXML
    private void f2c1(ActionEvent event) {
          
            switch(clickC2){
                case 0 :  if( turno1 && clickC2 == 0  ){ xx.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC2 == 0 ){xx.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c1ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 1 :  if ( turno1 && clickC2 == 1 ){pp.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC2 == 1 ){pp.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC2 == 2 ){hh.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC2 == 2 ){hh.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC2 == 3){z.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC2 == 3 ){z.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC2 == 4  ){ r.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC2 == 4 ){r.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC2 == 5  ){ j.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC2 == 5 ){j.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC2 == 6 ){ b.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC2 == 6 ){b.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        
        clickC2++;
        IA();
    }
    
    @FXML
    private void f3c1(ActionEvent event) {
          
            switch(clickC2){
                case 0 :  if( turno1 && clickC2 == 0  ){ xx.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC2 == 0 ){xx.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c1ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 1 :  if ( turno1 && clickC2 == 1 ){pp.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC2 == 1 ){pp.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC2 == 2 ){hh.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC2 == 2 ){hh.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC2 == 3){z.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC2 == 3 ){z.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC2 == 4  ){ r.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC2 == 4 ){r.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC2 == 5  ){ j.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC2 == 5 ){j.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c1ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 6 : if( turno1 && clickC2 == 6 ){ b.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC2 == 6 ){b.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c1ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                
                
            }
            
            
         
        
        clickC2++;
        IA();
    }
    
    @FXML
    private void f4c1(ActionEvent event) {
          
            switch(clickC2){
                case 0 :  if( turno1 && clickC2 == 0  ){ xx.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC2 == 0 ){xx.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC2 == 1 ){pp.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC2 == 1 ){pp.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC2 == 2 ){hh.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC2 == 2 ){hh.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC2 == 3){z.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC2 == 3 ){z.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC2 == 4  ){ r.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC2 == 4 ){r.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC2 == 5  ){ j.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC2 == 5 ){j.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC2 == 6 ){ b.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC2 == 6 ){b.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c1ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                
                
            }
            
            
         
        
        clickC2++;
        IA();
    }
    
     @FXML
    private void f5c1(ActionEvent event) {
          
            switch(clickC2){
                case 0 :  if( turno1 && clickC2 == 0  ){ xx.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC2 == 0 ){xx.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC2 == 1 ){pp.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC2 == 1 ){pp.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC2 == 2 ){hh.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC2 == 2 ){hh.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC2 == 3){z.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC2 == 3 ){z.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC2 == 4  ){ r.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC2 == 4 ){r.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC2 == 5  ){ j.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC2 == 5 ){j.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC2 == 6 ){ b.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC2 == 6 ){b.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                
                
            }
            
            
         
        
        clickC2++;
        IA();
    }

     @FXML
    private void f6c1(ActionEvent event) {
          
            switch(clickC2){
                case 0 :  if( turno1 && clickC2 == 0  ){ xx.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC2 == 0 ){xx.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c1ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 1 :  if ( turno1 && clickC2 == 1 ){pp.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC2 == 1 ){pp.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC2 == 2 ){hh.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC2 == 2 ){hh.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC2 == 3){z.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC2 == 3 ){z.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC2 == 4  ){ r.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC2 == 4 ){r.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC2 == 5  ){ j.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC2 == 5 ){j.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c1ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC2 == 6 ){ b.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c1ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC2 == 6 ){b.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c1ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                
                
            }
            
            
         
        
        clickC2++;
        IA();
    }
     @FXML
    private void f0c2(ActionEvent event) {
         
            switch(clickC3){
                case 0 :  if( turno1 && clickC3 == 0  ){ yy.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC3 == 0 ){yy.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c2ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 1 :  if ( turno1 && clickC3 == 1 ){qq.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC3 == 1 ){qq.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC3 == 2 ){ii.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC3 == 2 ){ii.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC3 == 3){aa.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC3 == 3 ){aa.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC3 == 4  ){ s.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC3 == 4 ){s.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC3 == 5  ){ k.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC3 == 5 ){k.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC3 == 6 ){ c.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC3 == 6 ){c.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            
            
            
         
        }
        clickC3++;
        IA();
    }
    
    @FXML
    private void f1c2(ActionEvent event) {
         
            switch(clickC3){
                case 0 :  if( turno1 && clickC3 == 0  ){ yy.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC3 == 0 ){yy.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC3 == 1 ){qq.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC3 == 1 ){qq.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC3 == 2 ){ii.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC3 == 2 ){ii.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC3 == 3){aa.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC3 == 3 ){aa.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC3 == 4  ){ s.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC3 == 4 ){s.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC3 == 5  ){ k.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c2ocupadoRojo = true;textoTurno.setText("Jugador2"); ganoRojo();    }
                          else if( turno2 && clickC3 == 5 ){k.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 6 : if( turno1 && clickC3 == 6 ){ c.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC3 == 6 ){c.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        
        clickC3++;
        IA();
    }
     @FXML
    private void f2c2(ActionEvent event) {
         
            switch(clickC3){
                case 0 :  if( turno1 && clickC3 == 0  ){ yy.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC3 == 0 ){yy.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC3 == 1 ){qq.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC3 == 1 ){qq.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC3 == 2 ){ii.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC3 == 2 ){ii.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC3 == 3){aa.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC3 == 3 ){aa.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC3 == 4  ){ s.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC3 == 4 ){s.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC3 == 5  ){ k.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC3 == 5 ){k.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC3 == 6 ){ c.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC3 == 6 ){c.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            
            
            
         
        }
        clickC3++;
        IA();
    }

    @FXML
    private void f3c2(ActionEvent event) {
         
            switch(clickC3){
                case 0 :  if( turno1 && clickC3 == 0  ){ yy.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC3 == 0 ){yy.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC3 == 1 ){qq.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC3 == 1 ){qq.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC3 == 2 ){ii.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC3 == 2 ){ii.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC3 == 3){aa.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC3 == 3 ){aa.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC3 == 4  ){ s.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC3 == 4 ){s.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC3 == 5  ){ k.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC3 == 5 ){k.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c2ocupadoAzul = true;textoTurno.setText("Jugador1"); }
                case 6 : if( turno1 && clickC3 == 6 ){ c.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC3 == 6 ){c.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c2ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                
                
            
            
            
         
        }
        clickC3++;
        IA();
    }
    
     @FXML
    private void f4c2(ActionEvent event) {
         
            switch(clickC3){
                case 0 :  if( turno1 && clickC3 == 0  ){ yy.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC3 == 0 ){yy.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c2ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 1 :  if ( turno1 && clickC3 == 1 ){qq.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC3 == 1 ){qq.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC3 == 2 ){ii.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC3 == 2 ){ii.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC3 == 3){aa.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC3 == 3 ){aa.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC3 == 4  ){ s.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC3 == 4 ){s.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC3 == 5  ){ k.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC3 == 5 ){k.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c2ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 6 : if( turno1 && clickC3 == 6 ){ c.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC3 == 6 ){c.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        
        clickC3++;
        IA();
    }

    @FXML
    private void f5c2(ActionEvent event) {
         
            switch(clickC3){
                case 0 :  if( turno1 && clickC3 == 0  ){ yy.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC3 == 0 ){yy.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC3 == 1 ){qq.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC3 == 1 ){qq.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC3 == 2 ){ii.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC3 == 2 ){ii.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC3 == 3){aa.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC3 == 3 ){aa.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC3 == 4  ){ s.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC3 == 4 ){s.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC3 == 5  ){ k.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC3 == 5 ){k.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC3 == 6 ){ c.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC3 == 6 ){c.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                
                
            }
            
            
         
        
        clickC3++;
        IA();
    }
    
    @FXML
    private void f6c2(ActionEvent event) {
         {
            switch(clickC3){
                case 0 :  if( turno1 && clickC3 == 0  ){ yy.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC3 == 0 ){yy.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c2ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 1 :  if ( turno1 && clickC3 == 1 ){qq.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC3 == 1 ){qq.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC3 == 2 ){ii.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC3 == 2 ){ii.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC3 == 3){aa.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC3 == 3 ){aa.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC3 == 4  ){ s.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC3 == 4 ){s.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC3 == 5  ){ k.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC3 == 5 ){k.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c2ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 6 : if( turno1 && clickC3 == 6 ){ c.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c2ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC3 == 6 ){c.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c2ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        }
        clickC3++;
        IA();
    }

    
   
      @FXML
    private void f0c3(ActionEvent event) {
         {
            switch(clickC4){
                case 0 :  if( turno1 && clickC4 == 0  ){ zz.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC4 == 0 ){zz.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c3ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 1 :  if ( turno1 && clickC4 == 1 ){rr.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC4 == 1 ){rr.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC4 == 2 ){jj.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC4 == 2 ){jj.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC4 == 3){bb.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC4 == 3 ){bb.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC4 == 4  ){ t.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC4 == 4 ){t.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC4 == 5  ){ l.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC4 == 5 ){l.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC4 == 6 ){ d.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC4 == 6 ){d.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        }
        clickC4++;
        IA();
    }
    
       @FXML
    private void f1c3(ActionEvent event) {
         {
            switch(clickC4){
                case 0 :  if( turno1 && clickC4 == 0  ){ zz.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC4 == 0 ){zz.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC4 == 1 ){rr.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC4 == 1 ){rr.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC4 == 2 ){jj.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC4 == 2 ){jj.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC4 == 3){bb.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC4 == 3 ){bb.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC4 == 4  ){ t.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC4 == 4 ){t.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC4 == 5  ){ l.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC4 == 5 ){l.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c3ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 6 : if( turno1 && clickC4 == 6 ){ d.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC4 == 6 ){d.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        }
        clickC4++;
        IA();
    }

      @FXML
    private void f2c3(ActionEvent event) {
        {
            switch(clickC4){
                case 0 :  if( turno1 && clickC4 == 0  ){ zz.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC4 == 0 ){zz.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC4 == 1 ){rr.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC4 == 1 ){rr.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC4 == 2 ){jj.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC4 == 2 ){jj.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC4 == 3){bb.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC4 == 3 ){bb.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC4 == 4  ){ t.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC4 == 4 ){t.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC4 == 5  ){ l.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC4 == 5 ){l.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC4 == 6 ){ d.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC4 == 6 ){d.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        }
        clickC4++;
        IA();
        
    }

    @FXML
    private void f3c3(ActionEvent event) {
         {
            switch(clickC4){
                case 0 :  if( turno1 && clickC4 == 0  ){ zz.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC4 == 0 ){zz.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC4 == 1 ){rr.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC4 == 1 ){rr.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC4 == 2 ){jj.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC4 == 2 ){jj.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC4 == 3){bb.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC4 == 3 ){bb.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC4 == 4  ){ t.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC4 == 4 ){t.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC4 == 5  ){ l.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC4 == 5 ){l.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c3ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 6 : if( turno1 && clickC4 == 6 ){ d.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC4 == 6 ){d.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c3ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                
                
            }
            
            
         
        }
        clickC4++;
        IA();
    }

   @FXML
    private void f4c3(ActionEvent event) { 
            {
            switch(clickC4){
                case 0 :  if( turno1 && clickC4 == 0  ){ zz.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC4 == 0 ){zz.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC4 == 1 ){rr.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC4 == 1 ){rr.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC4 == 2 ){jj.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC4 == 2 ){jj.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC4 == 3){bb.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC4 == 3 ){bb.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC4 == 4  ){ t.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC4 == 4 ){t.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC4 == 5  ){ l.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC4 == 5 ){l.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c3ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 6 : if( turno1 && clickC4 == 6 ){ d.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC4 == 6 ){d.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        }
        clickC4++;
        IA();
    }
    
    @FXML
    private void f5c3(ActionEvent event) {
        
            {
             switch(clickC4){
                case 0 :  if( turno1 && clickC4 == 0  ){ zz.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC4 == 0 ){zz.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC4 == 1 ){rr.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC4 == 1 ){rr.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC4 == 2 ){jj.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC4 == 2 ){jj.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC4 == 3){bb.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC4 == 3 ){bb.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC4 == 4  ){ t.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC4 == 4 ){t.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC4 == 5  ){ l.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC4 == 5 ){l.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC4 == 6 ){ d.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC4 == 6 ){d.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        }
        clickC4++;
        IA();
        
    }
    
     @FXML
    private void f6c3(ActionEvent event) {
         {
            switch(clickC4){
                case 0 :  if( turno1 && clickC4 == 0  ){ zz.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC4 == 0 ){zz.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC4 == 1 ){rr.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC4 == 1 ){rr.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC4 == 2 ){jj.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC4 == 2 ){jj.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC4 == 3){bb.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC4 == 3 ){bb.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC4 == 4  ){ t.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC4 == 4 ){t.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC4 == 5  ){ l.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC4 == 5 ){l.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c3ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 6 : if( turno1 && clickC4 == 6 ){ d.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c3ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC4 == 6 ){d.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c3ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        }
        clickC4++;
        IA();
    }
    
    @FXML
    private void f0c4(ActionEvent event) {
        {
            switch(clickC5){
                case 0 :  if( turno1 && clickC5 == 0  ){ aaa.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC5 == 0 ){aaa.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC5 == 1 ){ss.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC5 == 1 ){ss.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC5 == 2 ){kk.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC5 == 2 ){kk.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC5 == 3){cc.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC5 == 3 ){cc.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC5 == 4  ){ u.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC5 == 4 ){u.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC5 == 5  ){ m.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC5 == 5 ){m.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c4ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 6 : if( turno1 && clickC5 == 6 ){ e.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC5 == 6 ){e.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c4ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                
                
            }
            
            
         
        }
        clickC5++;
        IA();
    }
    
    @FXML
    private void f1c4(ActionEvent event) {{
            switch(clickC5){
                case 0 :  if( turno1 && clickC5 == 0  ){ aaa.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC5 == 0 ){aaa.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC5 == 1 ){ss.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC5 == 1 ){ss.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC5 == 2 ){kk.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC5 == 2 ){kk.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC5 == 3){cc.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC5 == 3 ){cc.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC5 == 4  ){ u.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC5 == 4 ){u.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC5 == 5  ){ m.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC5 == 5 ){m.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c4ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 6 : if( turno1 && clickC5 == 6 ){ e.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC5 == 6 ){e.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c4ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                
                
            }
            
            
         
        }
        clickC5++;
        IA();
    }

    @FXML
    private void f2c4(ActionEvent event) {{
            switch(clickC5){
                case 0 :  if( turno1 && clickC5 == 0  ){ aaa.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC5 == 0 ){aaa.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC5 == 1 ){ss.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC5 == 1 ){ss.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC5 == 2 ){kk.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC5 == 2 ){kk.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC5 == 3){cc.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC5 == 3 ){cc.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC5 == 4  ){ u.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC5 == 4 ){u.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC5 == 5  ){ m.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC5 == 5 ){m.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c4ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 6 : if( turno1 && clickC5 == 6 ){ e.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC5 == 6 ){e.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        }
        clickC5++;
        IA();
    }
    
    @FXML
    private void f3c4(ActionEvent event) {{
            switch(clickC5){
                case 0 :  if( turno1 && clickC5 == 0  ){ aaa.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC5 == 0 ){aaa.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC5 == 1 ){ss.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC5 == 1 ){ss.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC5 == 2 ){kk.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC5 == 2 ){kk.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC5 == 3){cc.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC5 == 3 ){cc.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC5 == 4  ){ u.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC5 == 4 ){u.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC5 == 5  ){ m.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC5 == 5 ){m.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c4ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 6 : if( turno1 && clickC5 == 6 ){ e.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC5 == 6 ){e.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        }
        clickC5++;
        IA();
    }
    @FXML
    private void f4c4(ActionEvent event) {{
            switch(clickC5){
                case 0 :  if( turno1 && clickC5 == 0  ){ aaa.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC5 == 0 ){aaa.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c4ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 1 :  if ( turno1 && clickC5 == 1 ){ss.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC5 == 1 ){ss.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC5 == 2 ){kk.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC5 == 2 ){kk.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC5 == 3){cc.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC5 == 3 ){cc.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC5 == 4  ){ u.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC5 == 4 ){u.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC5 == 5  ){ m.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC5 == 5 ){m.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC5 == 6 ){ e.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC5 == 6 ){e.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        }
        clickC5++;
        IA();
    }
    
    @FXML
    private void f5c4(ActionEvent event) {{
            switch(clickC5){
                case 0 :  if( turno1 && clickC5 == 0  ){ aaa.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo(); }
                          else if( turno2 && clickC5 == 0 ){aaa.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c4ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 1 :  if ( turno1 && clickC5 == 1 ){ss.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC5 == 1 ){ss.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC5 == 2 ){kk.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC5 == 2 ){kk.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC5 == 3){cc.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC5 == 3 ){cc.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC5 == 4  ){ u.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC5 == 4 ){u.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC5 == 5  ){ m.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC5 == 5 ){m.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c4ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 6 : if( turno1 && clickC5 == 6 ){ e.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC5 == 6 ){e.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        }
        clickC5++;
        IA();
    }
    
    @FXML
    private void f6c4(ActionEvent event) {
        
        {
            switch(clickC5){
                case 0 :  if( turno1 && clickC5 == 0  ){ aaa.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC5 == 0 ){aaa.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC5 == 1 ){ss.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC5 == 1 ){ss.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC5 == 2 ){kk.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC5 == 2 ){kk.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC5 == 3){cc.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC5 == 3 ){cc.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC5 == 4  ){ u.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC5 == 4 ){u.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC5 == 5  ){ m.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC5 == 5 ){m.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c4ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC5 == 6 ){ e.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c4ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC5 == 6 ){e.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c4ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                
                
            }
            
            
         
        }
        clickC5++;
        IA();
    }
    
     @FXML
    private void f0c5(ActionEvent event) {
         {
            switch(clickC6){
                case 0 :  if( turno1 && clickC6 == 0  ){ bbb.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC6 == 0 ){bbb.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC6 == 1 ){tt.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC6 == 1 ){tt.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC6 == 2 ){ll.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC6 == 2 ){ll.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC6 == 3){dd.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC6 == 3 ){dd.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC6 == 4  ){ v.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC6 == 4 ){v.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC6 == 5  ){ n.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC6 == 5 ){n.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c5ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 6 : if( turno1 && clickC6 == 6 ){ f.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC6 == 6 ){f.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c5ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                
                
            }
            
            
         
        }
        clickC6++;
        IA();
    }
    
     @FXML
    private void f1c5(ActionEvent event) {
        {
            switch(clickC6){
                case 0 :  if( turno1 && clickC6 == 0  ){ bbb.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC6 == 0 ){bbb.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC6 == 1 ){tt.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC6 == 1 ){tt.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC6 == 2 ){ll.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC6 == 2 ){ll.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC6 == 3){dd.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC6 == 3 ){dd.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC6 == 4  ){ v.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC6 == 4 ){v.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC6 == 5  ){ n.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC6 == 5 ){n.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC6 == 6 ){ f.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC6 == 6 ){f.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c5ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                
                
            }
            
            
         
        }
        clickC6++;IA();
    }
    
     @FXML
    private void f2c5(ActionEvent event) {
        {
            switch(clickC6){
                case 0 :  if( turno1 && clickC6 == 0  ){ bbb.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC6 == 0 ){bbb.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c5ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 1 :  if ( turno1 && clickC6 == 1 ){tt.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC6 == 1 ){tt.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC6 == 2 ){ll.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC6 == 2 ){ll.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC6 == 3){dd.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC6 == 3 ){dd.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC6 == 4  ){ v.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC6 == 4 ){v.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC6 == 5  ){ n.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC6 == 5 ){n.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC6 == 6 ){ f.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC6 == 6 ){f.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        }
        clickC6++;IA();
    }
    @FXML
    private void f3c5(ActionEvent event) {
        {
            switch(clickC6){
                case 0 :  if( turno1 && clickC6 == 0  ){ bbb.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC6 == 0 ){bbb.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC6 == 1 ){tt.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC6 == 1 ){tt.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC6 == 2 ){ll.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC6 == 2 ){ll.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC6 == 3){dd.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC6 == 3 ){dd.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC6 == 4  ){ v.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC6 == 4 ){v.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC6 == 5  ){ n.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC6 == 5 ){n.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC6 == 6 ){ f.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC6 == 6 ){f.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c5ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                
                
            }
            
            
         
        }
        clickC6++;IA();
    }
    
     @FXML
    private void f4c5(ActionEvent event) {
        {
            switch(clickC6){
                case 0 :  if( turno1 && clickC6 == 0  ){ bbb.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC6 == 0 ){bbb.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c5ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 1 :  if ( turno1 && clickC6 == 1 ){tt.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC6 == 1 ){tt.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC6 == 2 ){ll.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC6 == 2 ){ll.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC6 == 3){dd.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC6 == 3 ){dd.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC6 == 4  ){ v.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC6 == 4 ){v.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC6 == 5  ){ n.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC6 == 5 ){n.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC6 == 6 ){ f.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC6 == 6 ){f.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c5ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                
                
            }
            
            
         
        }
        clickC6++;IA();
    }
    @FXML
    private void f5c5(ActionEvent event) {
        {
            switch(clickC6){
                case 0 :  if( turno1 && clickC6 == 0  ){ bbb.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC6 == 0 ){bbb.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC6 == 1 ){tt.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC6 == 1 ){tt.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC6 == 2 ){ll.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC6 == 2 ){ll.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC6 == 3){dd.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC6 == 3 ){dd.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC6 == 4  ){ v.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC6 == 4 ){v.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC6 == 5  ){ n.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC6 == 5 ){n.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c5ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 6 : if( turno1 && clickC6 == 6 ){ f.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC6 == 6 ){f.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        }
        clickC6++;IA();
    }
    @FXML
    private void f6c5(ActionEvent event) {
        {
            switch(clickC6){
                case 0 :  if( turno1 && clickC6 == 0  ){ bbb.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC6 == 0 ){bbb.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c5ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 1 :  if ( turno1 && clickC6 == 1 ){tt.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC6 == 1 ){tt.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC6 == 2 ){ll.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC6 == 2 ){ll.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC6 == 3){dd.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC6 == 3 ){dd.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC6 == 4  ){ v.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC6 == 4 ){v.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC6 == 5  ){ n.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC6 == 5 ){n.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC6 == 6 ){ f.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c5ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC6 == 6 ){f.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c5ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        }
        clickC6++;IA();
    }
    
    @FXML
    private void f0c6(ActionEvent event) {
        {
            switch(clickC7){
                case 0 :  if( turno1 && clickC7 == 0  ){ ccc.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC7 == 0 ){ccc.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC7 == 1 ){uu.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC7 == 1 ){uu.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC7 == 2 ){mm.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC7 == 2 ){mm.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC7 == 3){ee.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC7 == 3 ){ee.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC7 == 4  ){ w.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC7 == 4 ){w.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC7 == 5  ){ o.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC7 == 5 ){o.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c6ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 6 : if( turno1 && clickC7 == 6 ){ g.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC7 == 6 ){g.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c6ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                
                
            }
            
            
         
        }
        clickC7++;IA();
    }
    @FXML
    private void f1c6(ActionEvent event) {
        {
            switch(clickC7){
                case 0 :  if( turno1 && clickC7 == 0  ){ ccc.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC7 == 0 ){ccc.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC7 == 1 ){uu.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC7 == 1 ){uu.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC7 == 2 ){mm.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC7 == 2 ){mm.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC7 == 3){ee.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC7 == 3 ){ee.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC7 == 4  ){ w.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC7 == 4 ){w.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC7 == 5  ){ o.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC7 == 5 ){o.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC7 == 6 ){ g.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC7 == 6 ){g.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c6ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                
                
            }
            
            
         
        }
        clickC7++;IA();
    }
    @FXML
    private void f2c6(ActionEvent event) {
        {
            switch(clickC7){
                case 0 :  if( turno1 && clickC7 == 0  ){ ccc.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC7 == 0 ){ccc.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC7 == 1 ){uu.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC7 == 1 ){uu.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC7 == 2 ){mm.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC7 == 2 ){mm.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC7 == 3){ee.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC7 == 3 ){ee.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC7 == 4  ){ w.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC7 == 4 ){w.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC7 == 5  ){ o.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC7 == 5 ){o.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c6ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 6 : if( turno1 && clickC7 == 6 ){ g.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC7 == 6 ){g.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        }
        clickC7++;IA();
    }
    @FXML
    private void f3c6(ActionEvent event) {
        {
            switch(clickC7){
                case 0 :  if( turno1 && clickC7 == 0  ){ ccc.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC7 == 0 ){ccc.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC7 == 1 ){uu.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC7 == 1 ){uu.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC7 == 2 ){mm.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC7 == 2 ){mm.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC7 == 3){ee.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC7 == 3 ){ee.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC7 == 4  ){ w.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC7 == 4 ){w.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC7 == 5  ){ o.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC7 == 5 ){o.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC7 == 6 ){ g.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC7 == 6 ){g.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c6ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                
                
            }
            
            
         
        }
        clickC7++;IA();
    }
    @FXML
    private void f4c6(ActionEvent event) {
        {
            switch(clickC7){
                case 0 :  if( turno1 && clickC7 == 0  ){ ccc.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC7 == 0 ){ccc.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c6ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 1 :  if ( turno1 && clickC7 == 1 ){uu.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC7 == 1 ){uu.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC7 == 2 ){mm.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC7 == 2 ){mm.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC7 == 3){ee.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC7 == 3 ){ee.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC7 == 4  ){ w.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC7 == 4 ){w.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC7 == 5  ){ o.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC7 == 5 ){o.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC7 == 6 ){ g.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC7 == 6 ){g.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        }
        clickC7++;IA();
    }
    @FXML
    private void f5c6(ActionEvent event) {
        {
            switch(clickC7){
                case 0 :  if( turno1 && clickC7 == 0  ){ ccc.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC7 == 0 ){ccc.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC7 == 1 ){uu.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC7 == 1 ){uu.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC7 == 2 ){mm.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC7 == 2 ){mm.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC7 == 3){ee.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC7 == 3 ){ee.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC7 == 4  ){ w.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC7 == 4 ){w.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC7 == 5  ){ o.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC7 == 5 ){o.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC7 == 6 ){ g.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC7 == 6 ){g.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        }
        clickC7++;IA();
    }
    @FXML
    private void f6c6(ActionEvent event) {
        {
            switch(clickC7){
                case 0 :  if( turno1 && clickC7 == 0  ){ ccc.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC7 == 0 ){ccc.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC7 == 1 ){uu.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC7 == 1 ){uu.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC7 == 2 ){mm.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC7 == 2 ){mm.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC7 == 3){ee.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC7 == 3 ){ee.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC7 == 4  ){ w.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC7 == 4 ){w.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC7 == 5  ){ o.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC7 == 5 ){o.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c6ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 6 : if( turno1 && clickC7 == 6 ){ g.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c6ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC7 == 6 ){g.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c6ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        }
        clickC7++;IA();
    }
    
    @FXML
    private void f0c7(ActionEvent event) {
         {
            switch(clickC8){
                case 0 :  if( turno1 && clickC8 == 0  ){ ddd.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC8 == 0 ){ddd.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c7ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 1 :  if ( turno1 && clickC8 == 1 ){vv.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC8 == 1 ){vv.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC8 == 2 ){nn.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC8 == 2 ){nn.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC8 == 3){ff.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC8 == 3 ){ff.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC8 == 4  ){ x.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC8 == 4 ){x.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC8 == 5  ){ p.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC8 == 5 ){p.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC8 == 6 ){ h.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC8 == 6 ){h.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        }
        clickC8++;IA();
    }

    @FXML
    private void f1c7(ActionEvent event) {
         {
            switch(clickC8){
                case 0 :  if( turno1 && clickC8 == 0  ){ ddd.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC8 == 0 ){ddd.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC8 == 1 ){vv.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC8 == 1 ){vv.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC8 == 2 ){nn.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC8 == 2 ){nn.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC8 == 3){ff.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC8 == 3 ){ff.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC8 == 4  ){ x.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC8 == 4 ){x.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC8 == 5  ){ p.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC8 == 5 ){p.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC8 == 6 ){ h.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC8 == 6 ){h.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        }
        clickC8++;IA();
    }

     @FXML
    private void f2c7(ActionEvent event) {
         {
            switch(clickC8){
                case 0 :  if( turno1 && clickC8 == 0  ){ ddd.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC8 == 0 ){ddd.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC8 == 1 ){vv.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC8 == 1 ){vv.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC8 == 2 ){nn.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC8 == 2 ){nn.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC8 == 3){ff.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC8 == 3 ){ff.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC8 == 4  ){ x.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC8 == 4 ){x.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC8 == 5  ){ p.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC8 == 5 ){p.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC8 == 6 ){ h.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC8 == 6 ){h.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c7ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                
                
            }
            
            
         
        }
        clickC8++;IA();
    } 
    @FXML
    private void f3c7(ActionEvent event) {
         {
            switch(clickC8){
                case 0 :  if( turno1 && clickC8 == 0  ){ ddd.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC8 == 0 ){ddd.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC8 == 1 ){vv.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC8 == 1 ){vv.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC8 == 2 ){nn.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC8 == 2 ){nn.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC8 == 3){ff.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC8 == 3 ){ff.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC8 == 4  ){ x.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC8 == 4 ){x.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC8 == 5  ){ p.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC8 == 5 ){p.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC8 == 6 ){ h.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC8 == 6 ){h.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c7ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                
                
            }
            
            
         
        }
        clickC8++;IA();
    }
    @FXML
    private void f4c7(ActionEvent event) {
         {
            switch(clickC8){
                case 0 :  if( turno1 && clickC8 == 0  ){ ddd.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC8 == 0 ){ddd.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c7ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 1 :  if ( turno1 && clickC8 == 1 ){vv.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC8 == 1 ){vv.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC8 == 2 ){nn.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC8 == 2 ){nn.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC8 == 3){ff.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC8 == 3 ){ff.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC8 == 4  ){ x.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC8 == 4 ){x.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC8 == 5  ){ p.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC8 == 5 ){p.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC8 == 6 ){ h.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC8 == 6 ){h.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        }
        clickC8++;IA();
    }
    @FXML
    private void f5c7(ActionEvent event) {
         {
            switch(clickC8){
                case 0 :  if( turno1 && clickC8 == 0  ){ ddd.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC8 == 0 ){ddd.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC8 == 1 ){vv.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC8 == 1 ){vv.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC8 == 2 ){nn.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC8 == 2 ){nn.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC8 == 3){ff.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC8 == 3 ){ff.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC8 == 4  ){ x.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC8 == 4 ){x.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC8 == 5  ){ p.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC8 == 5 ){p.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 6 : if( turno1 && clickC8 == 6 ){ h.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC8 == 6 ){h.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                
                
            }
            
            
         
        }
        clickC8++;IA();
    }
    @FXML
    private void f6c7(ActionEvent event) {
         
            switch(clickC8){
                case 0 :  if( turno1 && clickC8 == 0  ){ ddd.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f0c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC8 == 0 ){ddd.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f0c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul(); }
                case 1 :  if ( turno1 && clickC8 == 1 ){vv.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f1c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if(turno2 &&clickC8 == 1 ){vv.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f1c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 2 : if (turno1 && clickC8 == 2 ){nn.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f2c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC8 == 2 ){nn.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f2c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 3 : if (turno1 && clickC8 == 3){ff.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f3c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if(turno2 && clickC8 == 3 ){ff.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f3c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 4 :  if (turno1 && clickC8 == 4  ){ x.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f4c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                         else if (turno2 && clickC8 == 4 ){x.setStyle("-fx-background-color: #0000ff; ");turno1 = true; turno2=false;f4c7ocupadoAzul = true;textoTurno.setText("Jugador1");ganoAzul();}
                case 5 : if( turno1 && clickC8 == 5  ){ p.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f5c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC8 == 5 ){p.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f5c7ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                case 6 : if( turno1 && clickC8 == 6 ){ h.setStyle("-fx-background-color: #ff0000; ");turno2 = true; turno1=false;f6c7ocupadoRojo = true;textoTurno.setText("Jugador2");ganoRojo();}
                          else if( turno2 && clickC8 == 6 ){h.setStyle("-fx-background-color: #0000ff; "); turno2 = false; turno1 = true;f6c7ocupadoAzul = true;textoTurno.setText("Jugador1"); ganoAzul();}
                
                
            }
         
            
         
        
        clickC8++;IA();
    }
    

    private boolean victoriaRojo(){
        //horizontales
        //fila de abajo = 0
        if (f0c0ocupadoRojo == true && f0c1ocupadoRojo == true && f0c2ocupadoRojo == true && f0c3ocupadoRojo == true){return true;}
        else if (f0c4ocupadoRojo == true && f0c1ocupadoRojo == true && f0c2ocupadoRojo == true && f0c3ocupadoRojo == true){return true;}
        else if (f0c4ocupadoRojo == true && f0c5ocupadoRojo == true && f0c2ocupadoRojo == true && f0c3ocupadoRojo == true){return true;}
        else if (f0c4ocupadoRojo == true && f0c5ocupadoRojo == true && f0c6ocupadoRojo == true && f0c3ocupadoRojo == true){return true;}
        else if (f0c4ocupadoRojo == true && f0c5ocupadoRojo == true && f0c6ocupadoRojo == true && f0c7ocupadoRojo == true){return true;}
        //fila 1
        else if (f1c0ocupadoRojo == true && f1c1ocupadoRojo == true && f1c2ocupadoRojo == true && f1c3ocupadoRojo == true){return true;}
        else if (f1c4ocupadoRojo == true && f1c1ocupadoRojo == true && f1c2ocupadoRojo == true && f1c3ocupadoRojo == true){return true;}
        else if (f1c4ocupadoRojo == true && f1c5ocupadoRojo == true && f1c2ocupadoRojo == true && f1c3ocupadoRojo == true){return true;}
        else if (f1c4ocupadoRojo == true && f1c5ocupadoRojo == true && f1c6ocupadoRojo == true && f1c3ocupadoRojo == true){return true;}
        else if (f1c4ocupadoRojo == true && f1c5ocupadoRojo == true && f1c6ocupadoRojo == true && f1c7ocupadoRojo == true){return true;}
        //fila 2
        else if (f2c0ocupadoRojo == true && f2c1ocupadoRojo == true && f2c2ocupadoRojo == true && f2c3ocupadoRojo == true){return true;}
        else if (f2c4ocupadoRojo == true && f2c1ocupadoRojo == true && f2c2ocupadoRojo == true && f2c3ocupadoRojo == true){return true;}
        else if (f2c4ocupadoRojo == true && f2c5ocupadoRojo == true && f2c2ocupadoRojo == true && f2c3ocupadoRojo == true){return true;}
        else if (f2c4ocupadoRojo == true && f2c5ocupadoRojo == true && f2c6ocupadoRojo == true && f2c3ocupadoRojo == true){return true;}
        else if (f2c4ocupadoRojo == true && f2c5ocupadoRojo == true && f2c6ocupadoRojo == true && f2c7ocupadoRojo == true){return true;}
        //fila 3
        else if (f3c0ocupadoRojo == true && f3c1ocupadoRojo == true && f3c2ocupadoRojo == true && f3c3ocupadoRojo == true){return true;}
        else if (f3c4ocupadoRojo == true && f3c1ocupadoRojo == true && f3c2ocupadoRojo == true && f3c3ocupadoRojo == true){return true;}
        else if (f3c4ocupadoRojo == true && f3c5ocupadoRojo == true && f3c2ocupadoRojo == true && f3c3ocupadoRojo == true){return true;}
        else if (f3c4ocupadoRojo == true && f3c5ocupadoRojo == true && f3c6ocupadoRojo == true && f3c3ocupadoRojo == true){return true;}
        else if (f3c4ocupadoRojo == true && f3c5ocupadoRojo == true && f3c6ocupadoRojo == true && f3c7ocupadoRojo == true){return true;}
        //fila 4
         else if (f4c0ocupadoRojo == true && f4c1ocupadoRojo == true && f4c2ocupadoRojo == true && f4c3ocupadoRojo == true){return true;}
        else if (f4c4ocupadoRojo == true && f4c1ocupadoRojo == true && f4c2ocupadoRojo == true && f4c3ocupadoRojo == true){return true;}
        else if (f4c4ocupadoRojo == true && f4c5ocupadoRojo == true && f4c2ocupadoRojo == true && f4c3ocupadoRojo == true){return true;}
        else if (f4c4ocupadoRojo == true && f4c5ocupadoRojo == true && f4c6ocupadoRojo == true && f4c3ocupadoRojo == true){return true;}
        else if (f4c4ocupadoRojo == true && f4c5ocupadoRojo == true && f4c6ocupadoRojo == true && f4c7ocupadoRojo == true){return true;}
        //fila 5
         else if (f5c0ocupadoRojo == true && f5c1ocupadoRojo == true && f5c2ocupadoRojo == true && f5c3ocupadoRojo == true){return true;}
        else if (f5c4ocupadoRojo == true && f5c1ocupadoRojo == true && f5c2ocupadoRojo == true && f5c3ocupadoRojo == true){return true;}
        else if (f5c4ocupadoRojo == true && f5c5ocupadoRojo == true && f5c2ocupadoRojo == true && f5c3ocupadoRojo == true){return true;}
        else if (f5c4ocupadoRojo == true && f5c5ocupadoRojo == true && f5c6ocupadoRojo == true && f5c3ocupadoRojo == true){return true;}
        else if (f5c4ocupadoRojo == true && f5c5ocupadoRojo == true && f5c6ocupadoRojo == true && f5c7ocupadoRojo == true){return true;}
        //fila 6
         else if (f6c0ocupadoRojo == true && f6c1ocupadoRojo == true && f6c2ocupadoRojo == true && f6c3ocupadoRojo == true){return true;}
        else if (f6c4ocupadoRojo == true && f6c1ocupadoRojo == true && f6c2ocupadoRojo == true && f6c3ocupadoRojo == true){return true;}
        else if (f6c4ocupadoRojo == true && f6c5ocupadoRojo == true && f6c2ocupadoRojo == true && f6c3ocupadoRojo == true){return true;}
        else if (f6c4ocupadoRojo == true && f6c5ocupadoRojo == true && f6c6ocupadoRojo == true && f6c3ocupadoRojo == true){return true;}
        else if (f6c4ocupadoRojo == true && f6c5ocupadoRojo == true && f6c6ocupadoRojo == true && f6c7ocupadoRojo == true){return true;}
        
        
        //verticales
        //columna 0
        else if (f0c0ocupadoRojo == true && f1c0ocupadoRojo == true && f2c0ocupadoRojo== true && f3c0ocupadoRojo == true){return true;}
        else if (f4c0ocupadoRojo == true && f1c0ocupadoRojo == true && f2c0ocupadoRojo== true && f3c0ocupadoRojo == true){return true;}
        else if (f4c0ocupadoRojo == true && f5c0ocupadoRojo == true && f2c0ocupadoRojo== true && f3c0ocupadoRojo == true){return true;}
        else if (f4c0ocupadoRojo == true && f5c0ocupadoRojo == true && f6c0ocupadoRojo== true && f3c0ocupadoRojo == true){return true;}
        //columna 1
        else if (f0c1ocupadoRojo == true && f1c1ocupadoRojo == true && f2c1ocupadoRojo== true && f3c1ocupadoRojo == true){return true;}
        else if (f4c1ocupadoRojo == true && f1c1ocupadoRojo == true && f2c1ocupadoRojo== true && f3c1ocupadoRojo == true){return true;}
        else if (f4c1ocupadoRojo == true && f5c1ocupadoRojo == true && f2c1ocupadoRojo== true && f3c1ocupadoRojo == true){return true;}
        else if (f4c1ocupadoRojo == true && f5c1ocupadoRojo == true && f6c1ocupadoRojo== true && f3c1ocupadoRojo == true){return true;}
        //columna 2
        else if (f0c2ocupadoRojo == true && f1c2ocupadoRojo == true && f2c2ocupadoRojo== true && f3c2ocupadoRojo == true){return true;}
        else if (f4c2ocupadoRojo == true && f1c2ocupadoRojo == true && f2c2ocupadoRojo== true && f3c2ocupadoRojo == true){return true;}
        else if (f4c2ocupadoRojo == true && f5c2ocupadoRojo == true && f2c2ocupadoRojo== true && f3c2ocupadoRojo == true){return true;}
        else if (f4c2ocupadoRojo == true && f5c2ocupadoRojo == true && f6c2ocupadoRojo== true && f3c2ocupadoRojo == true){return true;}
        //columna 3
        else if (f0c3ocupadoRojo == true && f1c3ocupadoRojo == true && f2c3ocupadoRojo== true && f3c3ocupadoRojo == true){return true;}
        else if (f4c3ocupadoRojo == true && f1c3ocupadoRojo == true && f2c3ocupadoRojo== true && f3c3ocupadoRojo == true){return true;}
        else if (f4c3ocupadoRojo == true && f5c3ocupadoRojo == true && f2c3ocupadoRojo== true && f3c3ocupadoRojo == true){return true;}
        else if (f4c3ocupadoRojo == true && f5c3ocupadoRojo == true && f6c3ocupadoRojo== true && f3c3ocupadoRojo == true){return true;}
        //columna 4
        else if (f0c4ocupadoRojo == true && f1c4ocupadoRojo == true && f2c4ocupadoRojo== true && f3c4ocupadoRojo == true){return true;}
        else if (f4c4ocupadoRojo == true && f1c4ocupadoRojo == true && f2c4ocupadoRojo== true && f3c4ocupadoRojo == true){return true;}
        else if (f4c4ocupadoRojo == true && f5c4ocupadoRojo == true && f2c4ocupadoRojo== true && f3c4ocupadoRojo == true){return true;}
        else if (f4c4ocupadoRojo == true && f5c4ocupadoRojo == true && f6c4ocupadoRojo== true && f3c4ocupadoRojo == true){return true;}
        //columna 5
        else if (f0c5ocupadoRojo == true && f1c5ocupadoRojo == true && f2c5ocupadoRojo== true && f3c5ocupadoRojo == true){return true;}
        else if (f4c5ocupadoRojo == true && f1c5ocupadoRojo == true && f2c5ocupadoRojo== true && f3c5ocupadoRojo == true){return true;}
        else if (f4c5ocupadoRojo == true && f5c5ocupadoRojo == true && f2c5ocupadoRojo== true && f3c5ocupadoRojo == true){return true;}
        else if (f4c5ocupadoRojo == true && f5c5ocupadoRojo == true && f6c5ocupadoRojo== true && f3c5ocupadoRojo == true){return true;}
        //columna 6
        else if (f0c6ocupadoRojo == true && f1c6ocupadoRojo == true && f2c6ocupadoRojo== true && f3c6ocupadoRojo == true){return true;}
        else if (f4c6ocupadoRojo == true && f1c6ocupadoRojo == true && f2c6ocupadoRojo== true && f3c6ocupadoRojo == true){return true;}
        else if (f4c6ocupadoRojo == true && f5c6ocupadoRojo == true && f2c6ocupadoRojo== true && f3c6ocupadoRojo == true){return true;}
        else if (f4c6ocupadoRojo == true && f5c6ocupadoRojo == true && f6c6ocupadoRojo== true && f3c6ocupadoRojo == true){return true;}
        //columna 7
        else if (f0c7ocupadoRojo == true && f1c7ocupadoRojo == true && f2c7ocupadoRojo== true && f3c7ocupadoRojo == true){return true;}
        else if (f4c7ocupadoRojo == true && f1c7ocupadoRojo == true && f2c7ocupadoRojo== true && f3c7ocupadoRojo == true){return true;}
        else if (f4c7ocupadoRojo == true && f5c7ocupadoRojo == true && f2c7ocupadoRojo== true && f3c7ocupadoRojo == true){return true;}
        else if (f4c7ocupadoRojo == true && f5c7ocupadoRojo == true && f6c7ocupadoRojo== true && f3c7ocupadoRojo == true){return true;}
        
        
        //diagonales inclinado hacia la derecha
        else if(f0c0ocupadoRojo == true && f1c1ocupadoRojo == true && f2c2ocupadoRojo == true && f3c3ocupadoRojo == true){return true;}
        else if(f0c1ocupadoRojo == true && f1c2ocupadoRojo == true && f2c3ocupadoRojo == true && f3c4ocupadoRojo == true){return true;}
        else if(f0c2ocupadoRojo == true && f1c3ocupadoRojo == true && f2c4ocupadoRojo == true && f3c5ocupadoRojo == true){return true;}
        else if(f0c3ocupadoRojo == true && f1c4ocupadoRojo == true && f2c5ocupadoRojo == true && f3c6ocupadoRojo == true){return true;}
        else if(f0c4ocupadoRojo == true && f1c5ocupadoRojo == true && f2c6ocupadoRojo == true && f3c7ocupadoRojo == true){return true;}
        
        else if(f1c0ocupadoRojo == true && f2c1ocupadoRojo == true && f3c2ocupadoRojo == true && f4c3ocupadoRojo == true){return true;}
        else if(f1c1ocupadoRojo == true && f2c2ocupadoRojo == true && f3c3ocupadoRojo == true && f4c4ocupadoRojo == true){return true;}
        else if(f1c2ocupadoRojo == true && f2c3ocupadoRojo == true && f3c4ocupadoRojo == true && f4c5ocupadoRojo == true){return true;}
        else if(f1c3ocupadoRojo == true && f2c4ocupadoRojo == true && f3c5ocupadoRojo == true && f4c6ocupadoRojo == true){return true;}
        else if(f1c4ocupadoRojo == true && f2c5ocupadoRojo == true && f3c6ocupadoRojo == true && f4c7ocupadoRojo == true){return true;}
        
        else if(f2c0ocupadoRojo == true && f3c1ocupadoRojo == true && f4c2ocupadoRojo == true && f5c3ocupadoRojo == true){return true;}
        else if(f2c1ocupadoRojo == true && f3c2ocupadoRojo == true && f4c3ocupadoRojo == true && f5c4ocupadoRojo == true){return true;}   
        else if(f2c2ocupadoRojo == true && f3c3ocupadoRojo == true && f4c4ocupadoRojo == true && f5c5ocupadoRojo == true){return true;}   
        else if(f2c3ocupadoRojo == true && f3c4ocupadoRojo == true && f4c5ocupadoRojo == true && f5c6ocupadoRojo == true){return true;}  
        else if(f2c4ocupadoRojo == true && f3c5ocupadoRojo == true && f4c6ocupadoRojo == true && f5c7ocupadoRojo == true){return true;} 
        
        else if(f3c0ocupadoRojo == true && f4c1ocupadoRojo == true && f5c2ocupadoRojo == true && f6c3ocupadoRojo == true){return true;}
        else if(f3c1ocupadoRojo == true && f4c2ocupadoRojo == true && f5c3ocupadoRojo == true && f6c4ocupadoRojo == true){return true;}
        else if(f3c2ocupadoRojo == true && f4c3ocupadoRojo == true && f5c4ocupadoRojo == true && f6c5ocupadoRojo == true){return true;}
        else if(f3c3ocupadoRojo == true && f4c4ocupadoRojo == true && f5c5ocupadoRojo == true && f6c6ocupadoRojo == true){return true;}
        else if(f3c4ocupadoRojo == true && f4c5ocupadoRojo == true && f5c6ocupadoRojo == true && f6c7ocupadoRojo == true){return true;}
        
        //diagonales inclinadas hacia la izquierda
        else if(f0c7ocupadoRojo == true && f1c6ocupadoRojo == true && f2c5ocupadoRojo == true && f3c4ocupadoRojo == true){return true;}
        else if(f0c6ocupadoRojo == true && f1c5ocupadoRojo == true && f2c4ocupadoRojo == true && f3c3ocupadoRojo == true){return true;}
        else if(f0c5ocupadoRojo == true && f1c4ocupadoRojo == true && f2c3ocupadoRojo == true && f3c2ocupadoRojo == true){return true;}
        else if(f0c4ocupadoRojo == true && f1c3ocupadoRojo == true && f2c2ocupadoRojo == true && f3c1ocupadoRojo == true){return true;}
        else if(f0c3ocupadoRojo == true && f1c2ocupadoRojo == true && f2c1ocupadoRojo == true && f3c0ocupadoRojo == true){return true;}
        
        else if(f1c7ocupadoRojo == true && f2c6ocupadoRojo == true && f3c5ocupadoRojo == true && f4c4ocupadoRojo == true){return true;}
        else if(f1c6ocupadoRojo == true && f2c5ocupadoRojo == true && f3c4ocupadoRojo == true && f4c3ocupadoRojo == true){return true;}
        else if(f1c5ocupadoRojo == true && f2c4ocupadoRojo == true && f3c3ocupadoRojo == true && f4c2ocupadoRojo == true){return true;}
        else if(f1c4ocupadoRojo == true && f2c3ocupadoRojo == true && f3c2ocupadoRojo == true && f4c1ocupadoRojo == true){return true;}
        else if(f1c3ocupadoRojo == true && f2c2ocupadoRojo == true && f3c1ocupadoRojo == true && f4c0ocupadoRojo == true){return true;}
        
        else if(f2c7ocupadoRojo == true && f3c6ocupadoRojo == true && f4c5ocupadoRojo == true && f5c4ocupadoRojo == true){return true;}
        else if(f2c6ocupadoRojo == true && f3c5ocupadoRojo == true && f4c4ocupadoRojo == true && f5c3ocupadoRojo == true){return true;}
        else if(f2c5ocupadoRojo == true && f3c4ocupadoRojo == true && f4c3ocupadoRojo == true && f5c2ocupadoRojo == true){return true;}
        else if(f2c4ocupadoRojo == true && f3c3ocupadoRojo == true && f4c2ocupadoRojo == true && f5c1ocupadoRojo == true){return true;}
        else if(f2c3ocupadoRojo == true && f3c2ocupadoRojo == true && f4c1ocupadoRojo == true && f5c0ocupadoRojo == true){return true;}
        
        else if(f3c7ocupadoRojo == true && f4c6ocupadoRojo == true && f5c5ocupadoRojo == true && f6c4ocupadoRojo == true){return true;}
        else if(f3c6ocupadoRojo == true && f4c5ocupadoRojo == true && f5c4ocupadoRojo == true && f6c3ocupadoRojo == true){return true;}
        else if(f3c5ocupadoRojo == true && f4c4ocupadoRojo == true && f5c3ocupadoRojo == true && f6c2ocupadoRojo == true){return true;}
        else if(f3c4ocupadoRojo == true && f4c3ocupadoRojo == true && f5c2ocupadoRojo == true && f6c1ocupadoRojo == true){return true;}
        else if(f3c3ocupadoRojo == true && f4c2ocupadoRojo == true && f5c1ocupadoRojo == true && f6c0ocupadoRojo == true){return true;}




        
        return false;
    }
    
    private boolean victoriaAzul(){
        //horizontales
        //fila de abajo = 0
        if (f0c0ocupadoAzul== true && f0c1ocupadoAzul == true && f0c2ocupadoAzul == true && f0c3ocupadoAzul == true){return true;}
        else if (f0c4ocupadoAzul == true && f0c1ocupadoAzul == true && f0c2ocupadoAzul == true && f0c3ocupadoAzul == true){return true;}
        else if (f0c4ocupadoAzul == true && f0c5ocupadoAzul == true && f0c2ocupadoAzul == true && f0c3ocupadoAzul == true){return true;}
        else if (f0c4ocupadoAzul== true && f0c5ocupadoAzul == true && f0c6ocupadoAzul == true && f0c3ocupadoAzul == true){return true;}
        else if (f0c4ocupadoAzul == true && f0c5ocupadoAzul == true && f0c6ocupadoAzul == true && f0c7ocupadoAzul == true){return true;}
        //fila 1
        else if (f1c0ocupadoAzul == true && f1c1ocupadoAzul == true && f1c2ocupadoAzul == true && f1c3ocupadoAzul == true){return true;}
        else if (f1c4ocupadoAzul == true && f1c1ocupadoAzul == true && f1c2ocupadoAzul == true && f1c3ocupadoAzul == true){return true;}
        else if (f1c4ocupadoAzul == true && f1c5ocupadoAzul == true && f1c2ocupadoAzul == true && f1c3ocupadoAzul == true){return true;}
        else if (f1c4ocupadoAzul == true && f1c5ocupadoAzul == true && f1c6ocupadoAzul == true && f1c3ocupadoAzul == true){return true;}
        else if (f1c4ocupadoAzul == true && f1c5ocupadoAzul == true && f1c6ocupadoAzul == true && f1c7ocupadoAzul == true){return true;}
        //fila 2
        else if (f2c0ocupadoAzul == true && f2c1ocupadoAzul == true && f2c2ocupadoAzul == true && f2c3ocupadoAzul == true){return true;}
        else if (f2c4ocupadoAzul == true && f2c1ocupadoAzul == true && f2c2ocupadoAzul == true && f2c3ocupadoAzul == true){return true;}
        else if (f2c4ocupadoAzul == true && f2c5ocupadoAzul == true && f2c2ocupadoAzul == true && f2c3ocupadoAzul == true){return true;}
        else if (f2c4ocupadoAzul == true && f2c5ocupadoAzul == true && f2c6ocupadoAzul == true && f2c3ocupadoAzul == true){return true;}
        else if (f2c4ocupadoAzul == true && f2c5ocupadoAzul == true && f2c6ocupadoAzul == true && f2c7ocupadoAzul == true){return true;}
       //fila 3
        else if (f3c0ocupadoAzul == true && f3c1ocupadoAzul == true && f3c2ocupadoAzul == true && f3c3ocupadoAzul == true){return true;}
        else if (f3c4ocupadoAzul == true && f3c1ocupadoAzul == true && f3c2ocupadoAzul == true && f3c3ocupadoAzul == true){return true;}
        else if (f3c4ocupadoAzul == true && f3c5ocupadoAzul == true && f3c2ocupadoAzul == true && f3c3ocupadoAzul == true){return true;}
        else if (f3c4ocupadoAzul == true && f3c5ocupadoAzul == true && f3c6ocupadoAzul == true && f3c3ocupadoAzul == true){return true;}
        else if (f3c4ocupadoAzul == true && f3c5ocupadoAzul == true && f3c6ocupadoAzul == true && f3c7ocupadoAzul == true){return true;}
        //fila 4
        else if (f4c0ocupadoAzul == true && f4c1ocupadoAzul == true && f4c2ocupadoAzul == true && f4c3ocupadoAzul == true){return true;}
        else if (f4c4ocupadoAzul == true && f4c1ocupadoAzul == true && f4c2ocupadoAzul == true && f4c3ocupadoAzul == true){return true;}
        else if (f4c4ocupadoAzul == true && f4c5ocupadoAzul == true && f4c2ocupadoAzul == true && f4c3ocupadoAzul == true){return true;}
        else if (f4c4ocupadoAzul == true && f4c5ocupadoAzul == true && f4c6ocupadoAzul == true && f4c3ocupadoAzul == true){return true;}
        else if (f4c4ocupadoAzul == true && f4c5ocupadoAzul == true && f4c6ocupadoAzul == true && f4c7ocupadoAzul == true){return true;}
        //fila 5
        else if (f5c0ocupadoAzul == true && f5c1ocupadoAzul == true && f5c2ocupadoAzul == true && f5c3ocupadoAzul == true){return true;}
        else if (f5c4ocupadoAzul == true && f5c1ocupadoAzul == true && f5c2ocupadoAzul == true && f5c3ocupadoAzul == true){return true;}
        else if (f5c4ocupadoAzul == true && f5c5ocupadoAzul == true && f5c2ocupadoAzul == true && f5c3ocupadoAzul == true){return true;}
        else if (f5c4ocupadoAzul == true && f5c5ocupadoAzul == true && f5c6ocupadoAzul == true && f5c3ocupadoAzul == true){return true;}
        else if (f5c4ocupadoAzul == true && f5c5ocupadoAzul == true && f5c6ocupadoAzul == true && f5c7ocupadoAzul == true){return true;}
        //fila 6
        else if (f6c0ocupadoAzul == true && f6c1ocupadoAzul == true && f6c2ocupadoAzul == true && f6c3ocupadoAzul == true){return true;}
        else if (f6c4ocupadoAzul == true && f6c1ocupadoAzul == true && f6c2ocupadoAzul == true && f6c3ocupadoAzul == true){return true;}
        else if (f6c4ocupadoAzul == true && f6c5ocupadoAzul == true && f6c2ocupadoAzul == true && f6c3ocupadoAzul == true){return true;}
        else if (f6c4ocupadoAzul == true && f6c5ocupadoAzul == true && f6c6ocupadoAzul == true && f6c3ocupadoAzul == true){return true;}
        else if (f6c4ocupadoAzul == true && f6c5ocupadoAzul == true && f6c6ocupadoAzul == true && f6c7ocupadoAzul == true){return true;}
        
        
        //vertical
        //columna 0
        else if (f0c0ocupadoAzul == true && f1c0ocupadoAzul == true && f2c0ocupadoAzul== true && f3c0ocupadoAzul == true){return true;}
        else if (f4c0ocupadoAzul == true && f1c0ocupadoAzul == true && f2c0ocupadoAzul== true && f3c0ocupadoAzul == true){return true;}
        else if (f4c0ocupadoAzul == true && f5c0ocupadoAzul == true && f2c0ocupadoAzul== true && f3c0ocupadoAzul == true){return true;}
        else if (f4c0ocupadoAzul == true && f5c0ocupadoAzul == true && f6c0ocupadoAzul== true && f3c0ocupadoAzul == true){return true;}
        //columna 1
        else if (f0c1ocupadoAzul == true && f1c1ocupadoAzul == true && f2c1ocupadoAzul== true && f3c1ocupadoAzul == true){return true;}
        else if (f4c1ocupadoAzul == true && f1c1ocupadoAzul == true && f2c1ocupadoAzul== true && f3c1ocupadoAzul == true){return true;}
        else if (f4c1ocupadoAzul == true && f5c1ocupadoAzul == true && f2c1ocupadoAzul== true && f3c1ocupadoAzul == true){return true;}
        else if (f4c1ocupadoAzul == true && f5c1ocupadoAzul == true && f6c1ocupadoAzul== true && f3c1ocupadoAzul == true){return true;}
        //columna 2
        else if (f0c2ocupadoAzul == true && f1c2ocupadoAzul == true && f2c2ocupadoAzul== true && f3c2ocupadoAzul == true){return true;}
        else if (f4c2ocupadoAzul == true && f1c2ocupadoAzul == true && f2c2ocupadoAzul== true && f3c2ocupadoAzul == true){return true;}
        else if (f4c2ocupadoAzul == true && f5c2ocupadoAzul == true && f2c2ocupadoAzul== true && f3c2ocupadoAzul == true){return true;}
        else if (f4c2ocupadoAzul == true && f5c2ocupadoAzul == true && f6c2ocupadoAzul== true && f3c2ocupadoAzul == true){return true;}
        //columna 3
        else if (f0c3ocupadoAzul == true && f1c3ocupadoAzul == true && f2c3ocupadoAzul== true && f3c3ocupadoAzul == true){return true;}
        else if (f4c3ocupadoAzul == true && f1c3ocupadoAzul == true && f2c3ocupadoAzul== true && f3c3ocupadoAzul == true){return true;}
        else if (f4c3ocupadoAzul == true && f5c3ocupadoAzul == true && f2c3ocupadoAzul== true && f3c3ocupadoAzul == true){return true;}
        else if (f4c3ocupadoAzul == true && f5c3ocupadoAzul == true && f6c3ocupadoAzul== true && f3c3ocupadoAzul == true){return true;}
        //columna 4
        else if (f0c4ocupadoAzul == true && f1c4ocupadoAzul == true && f2c4ocupadoAzul== true && f3c4ocupadoAzul == true){return true;}
        else if (f4c4ocupadoAzul == true && f1c4ocupadoAzul == true && f2c4ocupadoAzul== true && f3c4ocupadoAzul == true){return true;}
        else if (f4c4ocupadoAzul == true && f5c4ocupadoAzul == true && f2c4ocupadoAzul== true && f3c4ocupadoAzul == true){return true;}
        else if (f4c4ocupadoAzul == true && f5c4ocupadoAzul == true && f6c4ocupadoAzul== true && f3c4ocupadoAzul == true){return true;}
        //columna 5
        else if (f0c5ocupadoAzul == true && f1c5ocupadoAzul == true && f2c5ocupadoAzul== true && f3c5ocupadoAzul == true){return true;}
        else if (f4c5ocupadoAzul == true && f1c5ocupadoAzul == true && f2c5ocupadoAzul== true && f3c5ocupadoAzul == true){return true;}
        else if (f4c5ocupadoAzul == true && f5c5ocupadoAzul == true && f2c5ocupadoAzul== true && f3c5ocupadoAzul == true){return true;}
        else if (f4c5ocupadoAzul == true && f5c5ocupadoAzul == true && f6c5ocupadoAzul== true && f3c5ocupadoAzul == true){return true;}
        //columna 6
        else if (f0c6ocupadoAzul == true && f1c6ocupadoAzul == true && f2c6ocupadoAzul== true && f3c6ocupadoAzul == true){return true;}
        else if (f4c6ocupadoAzul == true && f1c6ocupadoAzul == true && f2c6ocupadoAzul== true && f3c6ocupadoAzul == true){return true;}
        else if (f4c6ocupadoAzul == true && f5c6ocupadoAzul == true && f2c6ocupadoAzul== true && f3c6ocupadoAzul == true){return true;}
        else if (f4c6ocupadoAzul == true && f5c6ocupadoAzul == true && f6c6ocupadoAzul== true && f3c6ocupadoAzul == true){return true;}
        //columna 7
        else if (f0c7ocupadoAzul == true && f1c7ocupadoAzul == true && f2c7ocupadoAzul== true && f3c7ocupadoAzul == true){return true;}
        else if (f4c7ocupadoAzul == true && f1c7ocupadoAzul == true && f2c7ocupadoAzul== true && f3c7ocupadoAzul == true){return true;}
        else if (f4c7ocupadoAzul == true && f5c7ocupadoAzul == true && f2c7ocupadoAzul== true && f3c7ocupadoAzul == true){return true;}
        else if (f4c7ocupadoAzul == true && f5c7ocupadoAzul == true && f6c7ocupadoAzul== true && f3c7ocupadoAzul == true){return true;}
        
        //diagonales inclinado hacia la derecha
        else if(f0c0ocupadoAzul == true && f1c1ocupadoAzul == true && f2c2ocupadoAzul == true && f3c3ocupadoAzul == true){return true;}
        else if(f0c1ocupadoAzul == true && f1c2ocupadoAzul == true && f2c3ocupadoAzul == true && f3c4ocupadoAzul == true){return true;}
        else if(f0c2ocupadoAzul == true && f1c3ocupadoAzul == true && f2c4ocupadoAzul == true && f3c5ocupadoAzul == true){return true;}
        else if(f0c3ocupadoAzul == true && f1c4ocupadoAzul == true && f2c5ocupadoAzul == true && f3c6ocupadoAzul == true){return true;}
        else if(f0c4ocupadoAzul == true && f1c5ocupadoAzul == true && f2c6ocupadoAzul == true && f3c7ocupadoAzul == true){return true;}
        
        else if(f1c0ocupadoAzul == true && f2c1ocupadoAzul == true && f3c2ocupadoAzul == true && f4c3ocupadoAzul == true){return true;}
        else if(f1c1ocupadoAzul == true && f2c2ocupadoAzul == true && f3c3ocupadoAzul == true && f4c4ocupadoAzul == true){return true;}
        else if(f1c2ocupadoAzul == true && f2c3ocupadoAzul == true && f3c4ocupadoAzul == true && f4c5ocupadoAzul == true){return true;}
        else if(f1c3ocupadoAzul == true && f2c4ocupadoAzul == true && f3c5ocupadoAzul == true && f4c6ocupadoAzul == true){return true;}
        else if(f1c4ocupadoAzul == true && f2c5ocupadoAzul == true && f3c6ocupadoAzul == true && f4c7ocupadoAzul == true){return true;}
        
        else if(f2c0ocupadoAzul == true && f3c1ocupadoAzul == true && f4c2ocupadoAzul == true && f5c3ocupadoAzul == true){return true;}
        else if(f2c1ocupadoAzul == true && f3c2ocupadoAzul == true && f4c3ocupadoAzul == true && f5c4ocupadoAzul == true){return true;}   
        else if(f2c2ocupadoAzul == true && f3c3ocupadoAzul == true && f4c4ocupadoAzul == true && f5c5ocupadoAzul == true){return true;}   
        else if(f2c3ocupadoAzul == true && f3c4ocupadoAzul == true && f4c5ocupadoAzul == true && f5c6ocupadoAzul == true){return true;}  
        else if(f2c4ocupadoAzul == true && f3c5ocupadoAzul == true && f4c6ocupadoAzul == true && f5c7ocupadoAzul == true){return true;} 
        
        else if(f3c0ocupadoAzul == true && f4c1ocupadoAzul == true && f5c2ocupadoAzul == true && f6c3ocupadoAzul == true){return true;}
        else if(f3c1ocupadoAzul == true && f4c2ocupadoAzul == true && f5c3ocupadoAzul == true && f6c4ocupadoAzul == true){return true;}
        else if(f3c2ocupadoAzul == true && f4c3ocupadoAzul == true && f5c4ocupadoAzul == true && f6c5ocupadoAzul == true){return true;}
        else if(f3c3ocupadoAzul == true && f4c4ocupadoAzul == true && f5c5ocupadoAzul == true && f6c6ocupadoAzul == true){return true;}
        else if(f3c4ocupadoAzul == true && f4c5ocupadoAzul == true && f5c6ocupadoAzul == true && f6c7ocupadoAzul == true){return true;}
        
        //diagonales inclinadas hacia la izquierda
        else if(f0c7ocupadoAzul == true && f1c6ocupadoAzul == true && f2c5ocupadoAzul == true && f3c4ocupadoAzul == true){return true;}
        else if(f0c6ocupadoAzul == true && f1c5ocupadoAzul == true && f2c4ocupadoAzul == true && f3c3ocupadoAzul == true){return true;}
        else if(f0c5ocupadoAzul == true && f1c4ocupadoAzul == true && f2c3ocupadoAzul == true && f3c2ocupadoAzul == true){return true;}
        else if(f0c4ocupadoAzul == true && f1c3ocupadoAzul == true && f2c2ocupadoAzul == true && f3c1ocupadoAzul == true){return true;}
        else if(f0c3ocupadoAzul == true && f1c2ocupadoAzul == true && f2c1ocupadoAzul == true && f3c0ocupadoAzul == true){return true;}
        
        else if(f1c7ocupadoAzul == true && f2c6ocupadoAzul == true && f3c5ocupadoAzul == true && f4c4ocupadoAzul == true){return true;}
        else if(f1c6ocupadoAzul == true && f2c5ocupadoAzul == true && f3c4ocupadoAzul == true && f4c3ocupadoAzul == true){return true;}
        else if(f1c5ocupadoAzul == true && f2c4ocupadoAzul == true && f3c3ocupadoAzul == true && f4c2ocupadoAzul == true){return true;}
        else if(f1c4ocupadoAzul == true && f2c3ocupadoAzul == true && f3c2ocupadoAzul == true && f4c1ocupadoAzul == true){return true;}
        else if(f1c3ocupadoAzul == true && f2c2ocupadoAzul == true && f3c1ocupadoAzul == true && f4c0ocupadoAzul == true){return true;}
        
        else if(f2c7ocupadoAzul == true && f3c6ocupadoAzul == true && f4c5ocupadoAzul == true && f5c4ocupadoAzul == true){return true;}
        else if(f2c6ocupadoAzul == true && f3c5ocupadoAzul == true && f4c4ocupadoAzul == true && f5c3ocupadoAzul == true){return true;}
        else if(f2c5ocupadoAzul == true && f3c4ocupadoAzul == true && f4c3ocupadoAzul == true && f5c2ocupadoAzul == true){return true;}
        else if(f2c4ocupadoAzul == true && f3c3ocupadoAzul == true && f4c2ocupadoAzul == true && f5c1ocupadoAzul == true){return true;}
        else if(f2c3ocupadoAzul == true && f3c2ocupadoAzul == true && f4c1ocupadoAzul == true && f5c0ocupadoAzul == true){return true;}
        
        else if(f3c7ocupadoAzul == true && f4c6ocupadoAzul == true && f5c5ocupadoAzul == true && f6c4ocupadoAzul == true){return true;}
        else if(f3c6ocupadoAzul == true && f4c5ocupadoAzul == true && f5c4ocupadoAzul == true && f6c3ocupadoAzul == true){return true;}
        else if(f3c5ocupadoAzul == true && f4c4ocupadoAzul == true && f5c3ocupadoAzul == true && f6c2ocupadoAzul == true){return true;}
        else if(f3c4ocupadoAzul == true && f4c3ocupadoAzul == true && f5c2ocupadoAzul == true && f6c1ocupadoAzul == true){return true;}
        else if(f3c3ocupadoAzul == true && f4c2ocupadoAzul == true && f5c1ocupadoAzul == true && f6c0ocupadoAzul == true){return true;}






        
        return false;
    }
    
    private void ganoRojo(){
        if(victoriaRojo()) try {
            FXMLLoader v = new FXMLLoader(getClass().getResource("/vista/RojoHaGanado.fxml"));
            Parent root = v.load();
            RojoHaGanadoController juego = v.getController();
             
            juego.initStage(primaryStage);
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(JuegoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return;
    
    }
    
    
    
    private void ganoAzul(){
        if(victoriaAzul()) try {
            FXMLLoader v = new FXMLLoader(getClass().getResource("/vista/HaGanadoAzul.fxml"));
            Parent root = v.load();
            HaGanadoAzulController juego = v.getController();
             
            juego.initStage(primaryStage);
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(JuegoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return;
    
    }
    
    private boolean esCPU(){
         String cadena = (String) CajaOpciones.getValue();
        if(cadena.equals("CPU")){return true;}
        else{return false;}
        
    
    }
    
    private void IA() {
        if (esCPU() && turno2 == true){
            int w2= (int) (Math.random() * 10);
             int w3 = w2 % 8;
             
            switch (w3){
            case 0: if(w3 == 0){a.fire(); }
                
            case 1: if(w3 == 1)b.fire();
            
            case 2: if(w3 == 2)c.fire();
                
            case 3: if(w3 == 3)d.fire();
                
            case 4: if(w3==4) e.fire();
                
            case 5:if(w3 == 5)f.fire();
                
            case 6:if(w3 == 6)g.fire();
                
            case 7: if(w3 == 7)  h.fire();  
                
        
          }
                turno2 = false; turno1 = true;
        }}
    
    
   




    

    

   

    

    



    

    

    

    

    

   
    

    

    

   

    

    



    

    

    

   
  
    
    private boolean esPVP(){
        String cadena = (String) CajaOpciones.getValue();
        if(cadena.equals("PVP")){return true;}
        else{return false;}
    
    }

    @FXML
    private void Reiniciar(ActionEvent event) {
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
