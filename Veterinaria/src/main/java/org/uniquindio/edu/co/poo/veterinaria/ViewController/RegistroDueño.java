package org.uniquindio.edu.co.poo.veterinaria.ViewController;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.uniquindio.edu.co.poo.veterinaria.app.App;
import org.uniquindio.edu.co.poo.veterinaria.model.Dueño;
import org.uniquindio.edu.co.poo.veterinaria.model.Veterinaria;
import org.uniquindio.edu.co.poo.veterinaria.utilities.Paths;

public class RegistroDueño {

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
    private TextField TxtNombre;

    @FXML
    private TextField TxtNumID;

    @FXML
    private Button btnRegistrar;

    @FXML
    private Button btnVolver;

    @FXML
    void RegistrarDueño(ActionEvent event) {
        try {
            // Validar que todos los campos estén llenos
            if (TxtNombre.getText().isBlank() || TxtApellido.getText().isBlank() ||
                    TxtNumID.getText().isBlank() || TctTelefono.getText().isBlank() ||
                    TxtDireccion.getText().isBlank()) {
                System.out.println("Error: Todos los campos son obligatorios.");
                return;
            }

            // Obtener la veterinaria desde App
            Veterinaria veterinaria = App.app.getVeterinaria();
            if (veterinaria == null) {
                System.out.println("Error: Veterinaria no inicializada.");
                return;
            }

            // Crear un nuevo Dueño
            Dueño nuevoDueño = new Dueño(
                    TxtNombre.getText(),
                    TxtApellido.getText(),
                    TxtNumID.getText(),
                    TctTelefono.getText(),
                    TxtDireccion.getText()
            );

            // Registrar el dueño en la veterinaria
            veterinaria.registrarPersona(nuevoDueño);

            System.out.println("Dueño registrado correctamente: " + nuevoDueño.getNombre() + " " + nuevoDueño.getApellido());

            // Limpiar campos
            TxtNombre.clear();
            TxtApellido.clear();
            TxtNumID.clear();
            TctTelefono.clear();
            TxtDireccion.clear();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void ValverSeeccion(ActionEvent event) {
        App.app.setScene(Paths.REGISTRO_PERSONAS);
    }

    @FXML
    void initialize() {
        assert TctTelefono != null : "fx:id=\"TctTelefono\" was not injected: check your FXML file 'RegistroDueño.fxml'.";
        assert TxtApellido != null : "fx:id=\"TxtApellido\" was not injected: check your FXML file 'RegistroDueño.fxml'.";
        assert TxtDireccion != null : "fx:id=\"TxtDireccion\" was not injected: check your FXML file 'RegistroDueño.fxml'.";
        assert TxtNombre != null : "fx:id=\"TxtNombre\" was not injected: check your FXML file 'RegistroDueño.fxml'.";
        assert TxtNumID != null : "fx:id=\"TxtNumID\" was not injected: check your FXML file 'RegistroDueño.fxml'.";
        assert btnRegistrar != null : "fx:id=\"btnRegistrar\" was not injected: check your FXML file 'RegistroDueño.fxml'.";
        assert btnVolver != null : "fx:id=\"btnVolver\" was not injected: check your FXML file 'RegistroDueño.fxml'.";
    }
}
