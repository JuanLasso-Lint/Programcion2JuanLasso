package org.uniquindio.edu.co.poo.veterinaria.ViewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.uniquindio.edu.co.poo.veterinaria.app.App;
import org.uniquindio.edu.co.poo.veterinaria.utilities.Paths;

public class ViewControllerSeleccionAccion {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BtnCitas;

    @FXML
    private Button BtnIrARegistroMas;

    @FXML
    private Button BtnIrRegistroPers;

    @FXML
    private Button btnVolver;

    @FXML
    void IrARegistoCitas(ActionEvent event) {
        App.app.setScene(Paths.REGISTRO_CITAS);

    }

    @FXML
    void IrARegistroMascotas(ActionEvent event) {
        App.app.setScene(Paths.REGISTRO_MASCOTA);

    }

    @FXML
    void IrARegistroPersonas(ActionEvent event) {

        App.app.setScene(Paths.REGISTRO_PERSONAS);

    }

    @FXML
    void VolverInicio(ActionEvent event) {
        App.app.setScene(Paths.INICIO);

    }

    @FXML
    void initialize() {
        assert BtnCitas != null : "fx:id=\"BtnCitas\" was not injected: check your FXML file 'SeleccionAccion.fxml'.";
        assert BtnIrARegistroMas != null : "fx:id=\"BtnIrARegistroMas\" was not injected: check your FXML file 'SeleccionAccion.fxml'.";
        assert BtnIrRegistroPers != null : "fx:id=\"BtnIrRegistroPers\" was not injected: check your FXML file 'SeleccionAccion.fxml'.";
        assert btnVolver != null : "fx:id=\"btnVolver\" was not injected: check your FXML file 'SeleccionAccion.fxml'.";

    }

}
