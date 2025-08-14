module org.uniquindio.edu.co.poo.veterinaria {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;



    opens org.uniquindio.edu.co.poo.veterinaria to javafx.fxml;
    exports org.uniquindio.edu.co.poo.veterinaria;
    exports org.uniquindio.edu.co.poo.veterinaria.app;
    opens org.uniquindio.edu.co.poo.veterinaria.app to javafx.fxml;
    exports org.uniquindio.edu.co.poo.veterinaria.ViewController;
    opens org.uniquindio.edu.co.poo.veterinaria.ViewController to javafx.fxml;
}