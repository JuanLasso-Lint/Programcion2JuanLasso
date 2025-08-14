
package org.uniquindio.edu.co.poo.veterinaria.ViewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import org.uniquindio.edu.co.poo.veterinaria.app.App;
import org.uniquindio.edu.co.poo.veterinaria.utilities.Paths;

public class RegistroPersonas{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BtnCitas;

    @FXML
    private Button btnVolver;

    @FXML
    void IrARegistroDueños(ActionEvent event) {
        App.app.setScene(Paths.REGISTRO_DUEÑOS);

    }

    @FXML
    void IrAregistroVeterinarios(ActionEvent event) {
        App.app.setScene(Paths.REGISTRO_VETERINARIO);
    }

    @FXML
    void IrregistroPesonal(ActionEvent event) {

    }

    @FXML
    void VolverInicio(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert BtnCitas != null : "fx:id=\"BtnCitas\" was not injected: check your FXML file 'RegistroPersonas.fxml'.";
        assert btnVolver != null : "fx:id=\"btnVolver\" was not injected: check your FXML file 'RegistroPersonas.fxml'.";

    }

}
