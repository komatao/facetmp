package com.facetemperature.admin.controller;


import java.util.List;

public class TemperatureRequestParams {


    @Override
    public String toString() {
        return "TemperatureRequestParams{" +
                "registrant='" + registrant + '\'' +
                ", data=" + data +
                '}';
    }

    public String getRegistrant() {
        return registrant;
    }

    public void setRegistrant(String registrant) {
        this.registrant = registrant;
    }

    public List<TemperatureRequestParam> getData() {
        return data;
    }

    public void setData(List<TemperatureRequestParam> data) {
        this.data = data;
    }

    private String registrant;
    private List<TemperatureRequestParam> data;

}
