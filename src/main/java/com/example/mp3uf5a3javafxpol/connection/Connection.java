package com.example.mp3uf5a3javafxpol.connection;
/*
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import uf5.mp3.dam.practicajavafx.config.configData;
import uf5.mp3.dam.practicajavafx.model.Forecast;
import uf5.mp3.dam.practicajavafx.model.OpenWeatherMap;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

public class Connection {
    private String url_source = configData.URL_OWM;

    public OpenWeatherMap getWeather(String params) {
        OpenWeatherMap weatherMap = null;
        URL url = null;
        StringBuilder sb = new StringBuilder(url_source).append(params).append(configData.API_KEY);

        try {
            url = new URL(sb.toString());
            weatherMap = new ObjectMapper().readValue(url, OpenWeatherMap.class);
        } catch (JsonProcessingException | MalformedInputException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return weatherMap;

    }

    public Forecast getForecast(String params) {
        Forecast forecast = null;
        URL url = null;
        StringBuilder sb = new StringBuilder(configData.URL_OWM).append(params).append("&appid=").append(configData.API_KEY);

        try {
            url = new URL(sb.toString());
            forecast = new ObjectMapper().readValue(url, Forecast.class);
        } catch (MalformedURLException | JsonMappingException | JsonParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return forecast;


    }

}
*/