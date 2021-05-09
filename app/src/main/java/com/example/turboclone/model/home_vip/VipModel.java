package com.example.turboclone.model.home_vip;

public class VipModel {
    private int carImage;
    private String carPrice;
    private String carModel;
    private String carInformation;
    private String carDate;
    private int carSalon;

    public VipModel(int carImage, String carPrice, String carModel, String carInformation, String carDate, int carSalon) {
        this.carImage = carImage;
        this.carPrice = carPrice;
        this.carModel = carModel;
        this.carInformation = carInformation;
        this.carDate = carDate;
        this.carSalon = carSalon;
    }

    public int getCarImage() {
        return carImage;
    }

    public String getCarPrice() {
        return carPrice;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarInformation() {
        return carInformation;
    }

    public String getCarDate() {
        return carDate;
    }

    public int getCarSalon() {
        return carSalon;
    }
}
