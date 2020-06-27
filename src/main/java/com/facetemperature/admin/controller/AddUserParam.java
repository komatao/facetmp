package com.facetemperature.admin.controller;

public class AddUserParam {
    public String getInputName() {
        return inputName;
    }

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    public String getInputId() {
        return inputId;
    }

    public void setInputId(String inputId) {
        this.inputId = inputId;
    }


    @Override
    public String toString() {
        return "AddUserParam{" +
                "inputName='" + inputName + '\'' +
                ", inputId='" + inputId + '\'' +
                '}';
    }

    private String inputName;
    private String inputId;
}
