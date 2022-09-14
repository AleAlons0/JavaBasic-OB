package com.alejodev.exercise3;

import static java.awt.SystemColor.text;

public class Exercise3 {

    public static void main(String[] args) {
        String[] textos = {"Hola","soy","java","developer"};
        int counter= 0;
        while(counter<textos.length) {
            String text="";
            for (int i=0; i<textos.length; i++) {
                text += " "+ textos[i];
                counter++;
            }
            System.out.println(text);
        }
    }
}
