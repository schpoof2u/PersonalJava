package com.udemy.java.shikhar.section6;

public class Lecture1 {
    public static void main(String[]args){
        //a class is a blueprint for building objects
        //an object is anything that stores its value in a field and has a behavior
        //Will be using the class named Car
        Car Porsche = new Car();
        Car bmw = new Car();
        bmw.setModel("x2 sports activity coupe");
        System.out.println("Model of BMW is "+bmw.getModel());

    }
}
