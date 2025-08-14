package org.uniquindio.edu.co.poo.veterinaria.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.uniquindio.edu.co.poo.veterinaria.model.Dueño;
import org.uniquindio.edu.co.poo.veterinaria.model.Especialidad;
import org.uniquindio.edu.co.poo.veterinaria.model.Veterinaria;
import org.uniquindio.edu.co.poo.veterinaria.model.Veterinario;
import org.uniquindio.edu.co.poo.veterinaria.utilities.Paths;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class App extends Application {

    public static App app;
    private Stage stageWindow;
    private Veterinaria veterinaria;

    public App() throws Exception {
        veterinaria = new Veterinaria("MUNDO PELUDO", "PRINCIPAL", "1651651200");

        // Veterinarios
        Veterinario veterinario1 = new Veterinario("Laura", "Gómez", "12478", "35124", "584112", "601", Especialidad.PerrosYGatos);
        Veterinario veterinario2 = new Veterinario("Andrés", "Pérez", "12589", "35987", "582341", "602", Especialidad.Aves);
        Veterinario veterinario3 = new Veterinario("Mariana", "López", "12854", "35741", "586729", "603", Especialidad.AnimalesExoticos);
        Veterinario veterinario4 = new Veterinario("Carlos", "Ramírez", "12987", "35698", "589654", "604", Especialidad.Reptiles);
        Veterinario veterinario5 = new Veterinario("Sofía", "Martínez", "12765", "35412", "580987", "605", Especialidad.Equinos);
        Veterinario veterinario6 = new Veterinario("Felipe", "Torres", "12643", "35321", "583210", "606", Especialidad.Equinos);
        Veterinario veterinario7 = new Veterinario("Valentina", "Morales", "12398", "35287", "581432", "607", Especialidad.PerrosYGatos);

        veterinaria.registrarPersona(veterinario1);
        veterinaria.registrarPersona(veterinario2);
        veterinaria.registrarPersona(veterinario3);
        veterinaria.registrarPersona(veterinario4);
        veterinaria.registrarPersona(veterinario5);
        veterinaria.registrarPersona(veterinario6);
        veterinaria.registrarPersona(veterinario7);

        // Dueños
        Dueño dueño1 = new Dueño("Juan", "Lasso", "1089", "31143", "B.provi");
        Dueño dueño2 = new Dueño("María", "Pérez", "2098", "3124567890", "B. San José");
        Dueño dueño3 = new Dueño("Carlos", "Ramírez", "3154", "3109876543", "B. El Prado");
        Dueño dueño4 = new Dueño("Luisa", "Fernández", "4187", "3137654321", "B. La Floresta");
        Dueño dueño5 = new Dueño("Pedro", "Martínez", "5271", "3001122334", "B. Santa Ana");
        Dueño dueño6 = new Dueño("Ana", "Gómez", "6392", "3209988776", "B. San Fernando");

        veterinaria.registrarPersona(dueño1);
        veterinaria.registrarPersona(dueño2);
        veterinaria.registrarPersona(dueño3);
        veterinaria.registrarPersona(dueño4);
        veterinaria.registrarPersona(dueño5);
        veterinaria.registrarPersona(dueño6);


    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        app = this;
        stageWindow = stage;
        setScene(Paths.INICIO);
    }

    public void setScene(String path) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
        try {
            AnchorPane pane = loader.load();
            Object controller = loader.getController();

            try {
                controller.getClass()
                        .getMethod("setVeterinaria", Veterinaria.class)
                        .invoke(controller, veterinaria);
            } catch (NoSuchMethodException ignored) {
                // El controlador no tiene setVeterinaria, no hacemos nada
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }

            Scene scene = new Scene(pane);
            stageWindow.setScene(scene);
            stageWindow.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Veterinaria getVeterinaria() {
        return veterinaria;
    }


}
