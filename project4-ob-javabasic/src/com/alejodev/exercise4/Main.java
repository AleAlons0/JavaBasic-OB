package com.alejodev.exercise4;


public class Main{

    public static void main(String[] args) {

        SmartDevice smartDevice = new SmartDevice("Xaxa", "mono","Xiaomi","KS8897",60.20);
        System.out.println (smartDevice);

        SmartDevice smartPhone1 = new SmartPhone("Galaxy", "s22","Samsung","US87565658D",520.20,"1080px x 1200px","high");
        System.out.println(smartPhone1);

        SmartDevice smartWatch1 = new SmartWatch("Apolo", "11","Samsung","AV672551",120.20,"Android");
        System.out.println(smartWatch1);
    }
}
