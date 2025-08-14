package org.uniquindio.edu.co.poo.veterinaria.ViewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.uniquindio.edu.co.poo.veterinaria.app.App;
import org.uniquindio.edu.co.poo.veterinaria.utilities.Paths;

public class ViewControllerInicio {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BtnInicio;

    @FXML
    void IniciarVeterinaria(ActionEvent event) {
        App.app.setScene(Paths.SELECCION_ACCION);

    }

    @FXML
    void initialize() {
        assert BtnInicio != null : "fx:id=\"BtnInicio\" was not injected: check your FXML file 'Inicio.fxml'.";

    }

}





