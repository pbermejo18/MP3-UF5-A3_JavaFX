package com.example.mp3uf5a3javafxpol;

import com.example.mp3uf5a3javafxpol.control.HelloController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class MainApp extends Application {
    private Stage primaryStage;
    private AnchorPane rootLayout;
    HelloController helloController;

    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage = stage;
        // Icono app
        Image image = new Image("file:logo.png");
        this.primaryStage.getIcons().add(image);
        this.primaryStage.setTitle("Pol!");

        initRootLayout();
    }

    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("hello-view.fxml"));
            this.rootLayout = (AnchorPane) loader.load();
            helloController = loader.getController();
            helloController.setMain(this);
            //rootLayout.getStyleClass().add("background");

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void oscuro() {
        rootLayout.getStylesheets().clear();
        rootLayout.getStylesheets().add(String.valueOf(MainApp.class.getResource("DarkTheme.css")));
    }

    public void claro() {
        rootLayout.getStylesheets().clear();
        rootLayout.getStylesheets().add(String.valueOf(MainApp.class.getResource("default.css")));
    }

    public void showGrafico() {
        try {
            // Load the fxml file and create a new stage for the popup.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("grafico.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage dialogStage = new Stage();
            // titulo ventana
            dialogStage.setTitle("Gráfico muertes");
            // logo ventana
            Image image = new Image("file:grafico-logo.png");
            dialogStage.getIcons().add(image);
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            dialogStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}