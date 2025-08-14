package org.uniquindio.edu.co.poo.veterinaria.ViewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.uniquindio.edu.co.poo.veterinaria.app.App;
import org.uniquindio.edu.co.poo.veterinaria.model.Especialidad;
import org.uniquindio.edu.co.poo.veterinaria.model.Veterinario;
import org.uniquindio.edu.co.poo.veterinaria.model.Veterinaria;
import org.uniquindio.edu.co.poo.veterinaria.utilities.Paths;

public class RegistroVeterinario {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField TctTelefono;

    @FXML
    private TextField TxtApellido;

    @FXML
    private TextField TxtDireccion;

    @FXML
    private TextField TxtLicencia;

    @FXML
    private TextField TxtNombre;

    @FXML
    private TextField TxtNumID;

    @FXML
    private ComboBox<Especialidad> seleccionrEspecialidad;

    @FXML
    private Button btnRegistrar;

    @FXML
    private Button btnVolver;

    @FXML
    void RegistrarVeterinario(ActionEvent event) {
        Veterinaria veterinaria = App.app.getVeterinaria();

        if (TxtNombre.getText().isBlank() || TxtApellido.getText().isBlank() ||
                TxtNumID.getText().isBlank() || TctTelefono.getText().isBlank() ||
                TxtDireccion.getText().isBlank() || TxtLicencia.getText().isBlank() ||
                seleccionrEspecialidad.getValue() == null) {
            System.out.println("Todos los campos son obligatorios.");
            return;
        }

        Veterinario nuevoVet = new Veterinario(
                TxtNombre.getText(),
                TxtApellido.getText(),
                TxtNumID.getText(),
                TctTelefono.getText(),
                TxtLicencia.getText(),
                String.valueOf(System.currentTimeMillis()),
                seleccionrEspecialidad.getValue()
        );

        veterinaria.registrarPersona(nuevoVet);
        System.out.println("Veterinario registrado: " + nuevoVet.getNombre() + " " + nuevoVet.getApellido());

        // Limpiar campos
        TxtNombre.clear();
        TxtApellido.clear();
        TxtNumID.clear();
        TctTelefono.clear();
        TxtDireccion.clear();
        TxtLicencia.clear();
        seleccionrEspecialidad.getSelectionModel().clearSelection();
    }

    @FXML
    void ValverSeeccion(ActionEvent event) {
        App.app.setScene(Paths.REGISTRO_PERSONAS);
    }

    @FXML
    void initialize() {
        // Llenar el ComboBox con los valores del enum
        seleccionrEspecialidad.setItems(FXCollections.observableArrayList(Especialidad.values()));

        // Validaciones de inyección
        assert TctTelefono != null : "fx:id=\"TctTelefono\" was not injected.";
        assert TxtApellido != null : "fx:id=\"TxtApellido\" was not injected.";
        assert TxtDireccion != null : "fx:id=\"TxtDireccion\" was not injected.";
        assert TxtLicencia != null : "fx:id=\"TxtLicencia\" was not injected.";
        assert TxtNombre != null : "fx:id=\"TxtNombre\" was not injected.";
        assert TxtNumID != null : "fx:id=\"TxtNumID\" was not injected.";
        assert seleccionrEspecialidad != null : "fx:id=\"seleccionrEspecialidad\" was not injected.";
        assert btnRegistrar != null : "fx:id=\"btnRegistrar\" was not injected.";
        assert btnVolver != null : "fx:id=\"btnVolver\" was not injected.";
    }
}
