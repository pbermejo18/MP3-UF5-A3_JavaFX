package com.example.mp3uf5a3javafxpol.model;

import javafx.beans.property.*;

public class Muertes {
    private final StringProperty mes;
    private final StringProperty mdones;
    private final StringProperty mhomes;
    private final StringProperty total;

    public Muertes() {
        this(null, null, null, null);
    }

    public Muertes(String mes, String mdones, String mhomes, String total) {
        this.mes = new SimpleStringProperty(mes);
        this.mdones = new SimpleStringProperty(mdones);
        this.mhomes = new SimpleStringProperty(mhomes);
        this.total = new SimpleStringProperty(total);
    }

    public String getMes() {
        return mes.get();
    }
    public void setMes(String mes) {
        this.mes.set(mes);
    }
    public StringProperty mesProperty() {
        return mes;
    }

    public String getMdones() {
        return mdones.get();
    }
    public void setMdones(String mdones) {
        this.mdones.set(mdones);
    }

    public StringProperty mdonesProperty() {
        return mdones;
    }

    public String getMhomes() {
        return mhomes.get();
    }
    public void setMhomes(String mhomes) {
        this.mhomes.set(mhomes);
    }

    public StringProperty mhomesProperty() {
        return mhomes;
    }

    public String getTotal() {
        return total.get();
    }
    public void setTotal(String total) {
        this.total.set(total);
    }

    public StringProperty totalProperty() {
        return total;
    }
}
