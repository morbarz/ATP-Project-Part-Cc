module com.example.atp {
    requires javafx.controls;
    requires javafx.fxml;


    exports View;
    opens View to javafx.fxml;
}