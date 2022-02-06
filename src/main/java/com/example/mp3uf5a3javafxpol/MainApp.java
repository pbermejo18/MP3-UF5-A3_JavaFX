package com.example.mp3uf5a3javafxpol;

import com.example.mp3uf5a3javafxpol.control.HelloController;
import com.example.mp3uf5a3javafxpol.model.Muertes;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;

public class MainApp extends Application {
    private Stage primaryStage;
    private AnchorPane rootLayout;
    HelloController helloController;

    // Lista de las muertes para añadirlas a la tabla
    private ObservableList<Muertes> muertesdata = FXCollections.observableArrayList();

    /**
     * Constructor
     */
    public MainApp() {
        // Todas las muertes
        muertesdata.add(new Muertes("Gener","32", "22","54"));
        muertesdata.add(new Muertes("Febrer","22", "45","67"));
        muertesdata.add(new Muertes("Març","45", "44","89"));
        muertesdata.add(new Muertes("Abril","55", "17","72"));
        muertesdata.add(new Muertes("Maig","65", "28","93"));
        muertesdata.add(new Muertes("Juny","25", "22","47"));
        muertesdata.add(new Muertes("Juliol","17", "45","62"));
        muertesdata.add(new Muertes("Agost","12", "44","56"));
        muertesdata.add(new Muertes("Setembre","11", "44","55"));
        muertesdata.add(new Muertes("Octubre","20", "78","98"));
        muertesdata.add(new Muertes("Novembre","33", "11","44"));
        muertesdata.add(new Muertes("Desembre","46", "14","60"));
    }

    public ObservableList<Muertes> getMuertesData() {
        return muertesdata;
    }

    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage = stage;
        // Icono app
        Image image = new Image("file:logo.png");
        this.primaryStage.getIcons().add(image);
        this.primaryStage.setTitle("Morts a Catalunya");

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
            dialogStage.setTitle("Gràfic morts");
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