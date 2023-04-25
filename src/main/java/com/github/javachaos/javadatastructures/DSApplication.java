package com.github.javachaos.javadatastructures;

import com.github.javachaos.javadatastructures.datastructures.lists.QueueSample;
import com.github.javachaos.javadatastructures.datastructures.lists.StackSample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DSApplication //extends Application {
{
   // @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(DSApplication.class.getResource("dsa.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("DSA Front-end");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        QueueSample qs = new QueueSample();
        qs.run();
        //launch();
    }
}