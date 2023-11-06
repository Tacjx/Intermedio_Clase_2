module com.example.intermedio_clase_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.intermedio_clase_2 to javafx.fxml;
    exports com.example.intermedio_clase_2;
}