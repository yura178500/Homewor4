module com.example.homewor4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.homewor4 to javafx.fxml;
    exports com.example.homewor4;
}