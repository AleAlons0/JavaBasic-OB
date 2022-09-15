package com.alejodev.exercise4;

public class SmartPhone extends SmartDevice{

    public String resolution;
    public String range;

    public SmartPhone() {
    }

    public SmartPhone(String name, String model, String manufacturer, String serialNumber, double price, String resolution, String range) {
        super(name, model, manufacturer, serialNumber, price);
        this.resolution = resolution;
        this.range = range;
    }
}
