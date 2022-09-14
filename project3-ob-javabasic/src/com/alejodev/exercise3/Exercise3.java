package com.alejodev.exercise3;

import static java.awt.SystemColor.text;

public class Exercise3 {

    public static void main(String[] args) {
        String[] textos = {"funciones","datos","holaMundo"};
        int counter= 0;
        String text= null;
        while(counter<textos.length) {
            text = textos[counter] + " " + textos[counter++];
        }
        System.out.println(text);
    }
}
