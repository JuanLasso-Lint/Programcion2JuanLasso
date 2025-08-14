package org.uniquindio.edu.co.poo.veterinaria.ViewController;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import org.uniquindio.edu.co.poo.veterinaria.app.App;
import org.uniquindio.edu.co.poo.veterinaria.model.*;
import org.uniquindio.edu.co.poo.veterinaria.utilities.Paths;

public class RegistroCitas {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField Descripcion;

    @FXML
    private DatePicker Fecha;

    @FXML
    private TextField Hora;

    @FXML
    private TextField Luagar;

    @FXML
    private ComboBox<Veterinario> Vete;

    @FXML
    private ComboBox<Dueño> boxDueño;

    @FXML
    private Button btnVolver;

    @FXML
    private TextField iDcITA;

    private Veterinaria veterinaria; // referencia a la veterinaria

    @FXML
    void SeleccionFecha(ActionEvent event) {
        LocalDate fecha = Fecha.getValue();
        System.out.println("Fecha seleccionada: " + fecha);
    }

    @FXML
    void SeleccionVeterinario(ActionEvent event) {
        Veterinario seleccionado = Vete.getValue();
        System.out.println("Veterinario seleccionado: " + seleccionado);
    }

    @FXML
    void ValverSeeccion(ActionEvent event) {
        App.app.setScene(Paths.SELECCION_ACCION);
    }

    @FXML
    void seleccionDueño(ActionEvent event) {
        Dueño seleccionado = boxDueño.getValue();
        System.out.println("Dueño seleccionado: " + seleccionado);
    }

    // Método para inyectar la veterinaria desde la clase App
    public void setVeterinaria(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;

        // Lista de veterinarios
        List<Veterinario> listaVets = veterinaria.getListaPersonas().stream()
                .filter(p -> p instanceof Veterinario)
                .map(p -> (Veterinario) p)
                .toList();

        // Lista de dueños
        List<Dueño> listaDuenos = veterinaria.getListaPersonas().stream()
                .filter(p -> p instanceof Dueño)
                .map(p -> (Dueño) p)
                .toList();

        Vete.getItems().setAll(listaVets);
        boxDueño.getItems().setAll(listaDuenos);
    }

    @FXML
    void RegistrarCita(ActionEvent event) {
        try {
            // Validar campos
            if (iDcITA.getText().isBlank() || Fecha.getValue() == null || Hora.getText().isBlank()
                    || Luagar.getText().isBlank() || Descripcion.getText().isBlank()
                    || boxDueño.getValue() == null || Vete.getValue() == null) {
                throw new IllegalArgumentException("Todos los campos son obligatorios.");
            }

            // Crear nueva cita
            Cita nuevaCita = new Cita(
                    iDcITA.getText(),
                    boxDueño.getValue(),
                    Vete.getValue(),
                    Fecha.getValue(),
                    LocalTime.parse(Hora.getText()),
                    Luagar.getText(),
                    Descripcion.getText()
            );

            // Registrar en la veterinaria
            veterinaria.registrarCita(nuevaCita);

            System.out.println("Cita registrada correctamente: " + nuevaCita);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void initialize() {
        assert Descripcion != null : "fx:id=\"Descripcion\" was not injected: check your FXML file 'RegistroCitas.fxml'.";
        assert Fecha != null : "fx:id=\"Fecha\" was not injected: check your FXML file 'RegistroCitas.fxml'.";
        assert Hora != null : "fx:id=\"Hora\" was not injected: check your FXML file 'RegistroCitas.fxml'.";
        assert Luagar != null : "fx:id=\"Luagar\" was not injected: check your FXML file 'RegistroCitas.fxml'.";
        assert Vete != null : "fx:id=\"Vete\" was not injected: check your FXML file 'RegistroCitas.fxml'.";
        assert boxDueño != null : "fx:id=\"boxDueño\" was not injected: check your FXML file 'RegistroCitas.fxml'.";
        assert btnVolver != null : "fx:id=\"btnVolver\" was not injected: check your FXML file 'RegistroCitas.fxml'.";
        assert iDcITA != null : "fx:id=\"iDcITA\" was not injected: check your FXML file 'RegistroCitas.fxml'.";
    }
}
