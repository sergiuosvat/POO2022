module paint.paintapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.swing;


    opens paint.paintapp to javafx.fxml;
    exports paint.paintapp;
}