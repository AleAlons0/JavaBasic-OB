package com.alejodev.project2;

public class ProjectTwo {

    private static double iva= 1.19;

    public static void main(String[] args) {

        double resultado = getprice(15.98);
        System.out.println(resultado);

    }
    public static double getprice(double price) {
        return price * iva;
    }
}
