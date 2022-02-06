package com.example.mp3uf5a3javafxpol.control;

import com.example.mp3uf5a3javafxpol.MainApp;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.css.PseudoClass;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML Label dateTime;
    @FXML Label dateTimeDay;

    @FXML AnchorPane anchorPane;

    MainApp mainApp ;

    public void setMain(MainApp mainApp){
        this.mainApp = mainApp;
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initClock();
    }

    private void initClock() {
        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            dateTime.setText(LocalDateTime.now().format(formatter));
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            dateTimeDay.setText(LocalDateTime.now().format(formatter2));
        }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }

    @FXML
    private void handleShowGrafico() {
        mainApp.showGrafico();
    }

    @FXML
    private void modeOscuro() {
        mainApp.oscuro();
    }

    @FXML
    private void modeClaro() {
        mainApp.claro();
    }
}