package View;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MyViewController {
    @FXML
    private Label welcomeText;
    public MyViewController(){}

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}