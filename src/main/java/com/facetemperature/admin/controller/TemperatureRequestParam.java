package com.facetemperature.admin.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TemperatureRequestParam {
    public String getVisitName() {
        return visitName;
    }

    public void setVisitName(String visitName) {
        this.visitName = visitName;
    }

    public String getRegistrant() {
        return registrant;
    }

    public void setRegistrant(String registrant) {
        this.registrant = registrant;
    }

    public String getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime;
    }

    public String getInAndOut() {
        return inAndOut;
    }

    public void setInAndOut(String inAndOut) {
        this.inAndOut = inAndOut;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public String getVisitCode() {
        return visitCode;
    }

    public void setVisitCode(String visitCode) {
        this.visitCode = visitCode;
    }

    @Override
    public String toString() {
        return "TemperatureRequestParam{" +
                "visitName='" + visitName + '\'' +
                ", registrant='" + registrant + '\'' +
                ", visitTime='" + visitTime + '\'' +
                ", inAndOut='" + inAndOut + '\'' +
                ", temperature=" + temperature +
                ", visitCode='" + visitCode + '\'' +
                '}';
    }

    private String visitName;
    private String registrant;
    private String visitTime;
    private String inAndOut;
    private Double temperature;
    private String visitCode;
}
