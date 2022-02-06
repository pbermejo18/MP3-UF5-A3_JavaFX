module com.example.mp3uf5a3javafxpol {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.mp3uf5a3javafxpol to javafx.fxml;
    exports com.example.mp3uf5a3javafxpol;
    exports com.example.mp3uf5a3javafxpol.model;
    opens com.example.mp3uf5a3javafxpol.model to javafx.fxml;
    exports com.example.mp3uf5a3javafxpol.control;
    opens com.example.mp3uf5a3javafxpol.control to javafx.fxml;
}