package org.uniquindio.edu.co.poo.veterinaria.ViewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.uniquindio.edu.co.poo.veterinaria.app.App;
import org.uniquindio.edu.co.poo.veterinaria.model.*;
import org.uniquindio.edu.co.poo.veterinaria.utilities.Paths;

public class RegistroMascota {

    private Veterinaria veterinaria;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField EdadMas;

    @FXML
    private ComboBox<Dueño> SeleccioneDueño;

    @FXML
    private TextField TxtDireccion;

    @FXML
    private TextField TxtNombreMascota;

    @FXML
    private TextField TxtRaza;

    @FXML
    private Button btnVolver;

    @FXML
    private ComboBox<Especie> seleccionrEspecie;

    // Constructor vacío requerido por JavaFX
    public RegistroMascota() {}

    // Setter para asignar veterinaria
    public void setVeterinaria(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
        cargarDueños();
    }

    // Llenar ComboBox de dueños de forma segura
    private void cargarDueños() {
        if (veterinaria == null || SeleccioneDueño == null) return;

        SeleccioneDueño.getItems().clear();

        for (Persona p : veterinaria.getListaPersonas()) {
            if (p instanceof Dueño) {
                SeleccioneDueño.getItems().add((Dueño) p);
            }
        }
        System.out.println("Dueños cargados: " + SeleccioneDueño.getItems().size());
    }

    @FXML
    void initialize() {
        // Llenar especies
        seleccionrEspecie.getItems().addAll(Especie.values());
    }

    @FXML
    void RegistrarMascota(ActionEvent event) {
        String nombre = TxtNombreMascota.getText();
        String raza = TxtRaza.getText();
        String direccion = TxtDireccion.getText();
        Especie especie = seleccionrEspecie.getValue();
        String edadText = EdadMas.getText();
        Dueño dueño = SeleccioneDueño.getValue();

        if (nombre.isEmpty() || raza.isEmpty() || direccion.isEmpty() || especie == null || edadText.isEmpty() || dueño == null) {
            System.out.println("Faltan datos por completar");
            return;
        }

        int edad;
        try {
            edad = Integer.parseInt(edadText);
        } catch (NumberFormatException e) {
            System.out.println("Edad inválida");
            return;
        }

        String idVeterinaria = "M" + System.currentTimeMillis();
        Mascota mascota = new Mascota(nombre, especie, raza, edad, idVeterinaria);
        mascota.setDueño(dueño);

        veterinaria.registrarMascota(mascota, dueño);

        System.out.println("Mascota registrada: " + mascota.getNombre() + " - Dueño: " + dueño.getNombre());

        // Limpiar campos
        TxtNombreMascota.clear();
        TxtRaza.clear();
        TxtDireccion.clear();
        EdadMas.clear();
        seleccionrEspecie.getSelectionModel().clearSelection();
        SeleccioneDueño.getSelectionModel().clearSelection();
    }

    @FXML
    void VolverInicio(ActionEvent event) {
        App.app.setScene(Paths.SELECCION_ACCION);
    }

    // Abrir ventana y asignar veterinaria
    public static void abrirVentana(Veterinaria veterinaria) throws Exception {
        javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(
                RegistroMascota.class.getResource("/org/uniquindio/edu/co/poo/veterinaria/View/RegistroMascota.fxml")
        );

        Parent root = loader.load();
        RegistroMascota controller = loader.getController();
        controller.setVeterinaria(veterinaria);

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
