package com.example.mp3uf5a3javafxpol.control;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

public class GraficoController implements Initializable {

    @FXML
    BarChart bchartPop;
    @FXML
    CategoryAxis xAxis;
    @FXML
    NumberAxis yAxis;

    XYChart.Series<String,Integer> dataSeries1 = new XYChart.Series();
    XYChart.Series<String,Integer> dataSeries2 = new XYChart.Series();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        xAxis.setLabel("Mes");
        yAxis.setLabel("Morts");

        dataSeries1.setName("Homes");
        dataSeries1.getData().add(new XYChart.Data<String, Integer>("Gener", 22));
        dataSeries1.getData().add(new XYChart.Data<String, Integer>("Febrer", 45));
        dataSeries1.getData().add(new XYChart.Data<String, Integer>("Març", 44));
        dataSeries1.getData().add(new XYChart.Data<String, Integer>("Abril", 17));
        dataSeries1.getData().add(new XYChart.Data<String, Integer>("Maig", 28));
        dataSeries1.getData().add(new XYChart.Data<String, Integer>("Juny", 22));
        dataSeries1.getData().add(new XYChart.Data<String, Integer>("Juliol", 45));
        dataSeries1.getData().add(new XYChart.Data<String, Integer>("Agost", 44));
        dataSeries1.getData().add(new XYChart.Data<String, Integer>("Setembre", 44));
        dataSeries1.getData().add(new XYChart.Data<String, Integer>("Octubre", 78));
        dataSeries1.getData().add(new XYChart.Data<String, Integer>("Novembre", 11));
        dataSeries1.getData().add(new XYChart.Data<String, Integer>("Desembre", 14));
        bchartPop.getData().add(dataSeries1);

        dataSeries2.setName("Dones");
        dataSeries2.getData().add(new XYChart.Data<String, Integer>("Gener", 32));
        dataSeries2.getData().add(new XYChart.Data<String, Integer>("Febrer", 22));
        dataSeries2.getData().add(new XYChart.Data<String, Integer>("Març", 45));
        dataSeries2.getData().add(new XYChart.Data<String, Integer>("Abril", 55));
        dataSeries2.getData().add(new XYChart.Data<String, Integer>("Maig", 65));
        dataSeries2.getData().add(new XYChart.Data<String, Integer>("Juny", 25));
        dataSeries2.getData().add(new XYChart.Data<String, Integer>("Juliol", 17));
        dataSeries2.getData().add(new XYChart.Data<String, Integer>("Agost", 12));
        dataSeries2.getData().add(new XYChart.Data<String, Integer>("Setembre", 11));
        dataSeries2.getData().add(new XYChart.Data<String, Integer>("Octubre", 20));
        dataSeries2.getData().add(new XYChart.Data<String, Integer>("Novembre", 33));
        dataSeries2.getData().add(new XYChart.Data<String, Integer>("Desembre", 46));
        bchartPop.getData().add(dataSeries2);
    }
}