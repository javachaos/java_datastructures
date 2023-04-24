module com.github.javachaos.javadatastructures {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.github.javachaos.javadatastructures to javafx.fxml;
    exports com.github.javachaos.javadatastructures;
}