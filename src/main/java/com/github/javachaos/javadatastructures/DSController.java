package com.github.javachaos.javadatastructures;

import com.github.javachaos.javadatastructures.datastructures.lists.StackSample;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DSController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to the DSA Application!");
        Platform.runLater(StackSample::new);
    }
}