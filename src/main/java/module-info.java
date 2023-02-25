module com.example.eje2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.eje2 to javafx.fxml;
    exports com.example.eje2;
    exports com.example.ejercicio2;
    opens com.example.ejercicio2 to javafx.fxml;
}