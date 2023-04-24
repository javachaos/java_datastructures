package com.github.javachaos.javadatastructures;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DSController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to the DSA Application!");
    }
}