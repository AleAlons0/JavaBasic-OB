package com.alejodev.exercise4;

public class SmartWatch extends SmartDevice{

    public String compatibility;

    public SmartWatch() {
    }

    public SmartWatch(String name, String model, String manufacturer, String serialNumber, double price, String compatibility) {
        super(name, model, manufacturer, serialNumber, price);
        this.compatibility = compatibility;
    }
}
