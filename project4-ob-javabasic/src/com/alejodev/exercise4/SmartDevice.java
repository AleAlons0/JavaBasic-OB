package com.alejodev.exercise4;

public class SmartDevice {

    public String name;
    public String model;
    public String manufacturer;
    public String serialNumber;
    public double price;

    public SmartDevice() {
    }

    public SmartDevice(String name, String model, String manufacturer, String serialNumber, double price) {
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
    }
}
