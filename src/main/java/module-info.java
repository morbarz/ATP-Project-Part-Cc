module com.example.atp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.atp to javafx.fxml;
    exports com.example.atp;
}