package com.example.mp3uf5a3javafxpol.control;

import com.example.mp3uf5a3javafxpol.MainApp;
import com.example.mp3uf5a3javafxpol.model.Muertes;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TableView<Muertes> table;
    @FXML
    private TableColumn<Muertes, String> mes;
    @FXML
    private TableColumn<Muertes, String> dones;
    @FXML
    private TableColumn<Muertes, String> homes;
    @FXML
    private TableColumn<Muertes, String> total;

    @FXML Label dateTime;
    @FXML Label dateTimeDay;

    @FXML AnchorPane anchorPane;

    MainApp mainApp ;

    public void setMain(MainApp mainApp){
        this.mainApp = mainApp;
        table.setItems(mainApp.getMuertesData());
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initClock();

        // Valor a las celdas de la tabla
        mes.setCellValueFactory(
                cellData -> cellData.getValue().mesProperty());
        dones.setCellValueFactory(
                cellData -> cellData.getValue().mdonesProperty());
        homes.setCellValueFactory(
                cellData -> cellData.getValue().mhomesProperty());
        total.setCellValueFactory(
                cellData -> cellData.getValue().totalProperty());
    }

    // Este metodo coge la hora y fecha actual
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

    // Al pulsar la opción gráfico se abre esta pantalla con un gráfico con los datos
    @FXML
    private void handleShowGrafico() {
        mainApp.showGrafico();
    }

    // Al pulsar la opción estilo/oscuro cambia de css a través del metodo modeOscuro() del mainapp.
    @FXML
    private void modeOscuro() {
        mainApp.oscuro();
    }

    // Al pulsar la opción estilo/claro cambia de css a través del metodo modeClaro() del mainapp.
    @FXML
    private void modeClaro() {
        mainApp.claro();
    }
}