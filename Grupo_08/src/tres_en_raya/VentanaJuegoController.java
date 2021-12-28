/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tres_en_raya;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author leonardo
 */
public class VentanaJuegoController implements Initializable {

    @FXML
    private Button btn0x0;
    @FXML
    private Button btn1x0;
    @FXML
    private Button btn2x0;
    @FXML
    private Button btn0x1;
    @FXML
    private Button btn1x1;
    @FXML
    private Button btn2x1;
    @FXML
    private Button btn0x2;
    @FXML
    private Button btn1x2;
    @FXML
    private Button btn2x2;
    @FXML
    private Button btnAyuda;
    @FXML
    private Button btnTablero;
    @FXML
    private Label marcadorX;
    @FXML
    private Label marcador0;
    @FXML
    private RadioButton rbtnX;
    @FXML
    private RadioButton rbtnO;
    @FXML
    private Label lblTurnos;
    @FXML
    private ToggleGroup seleccion;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void recomendarJugada(ActionEvent event) {
    }

    @FXML
    private void mostrarTableros(ActionEvent event) {
    }

    @FXML
    private void turnX(ActionEvent event) {
    }

    @FXML
    private void turnO(ActionEvent event) {
    }
    
}
