package com.udemy.java.shikhar.section6;

import java.util.Locale;

public class Car {
    // the public keyword means unrestricted access to the class/method
    private int doors; //all the variables below are fields
    private int wheels;
    private String model; //private means in this context don't let any other class than Car have access to these variables
    //public String model;
    private String engine;
    private String color;
    public void setModel(String model){// is a setter, set the value of the field
        String validModel = model.toLowerCase();
        if(validModel.equals("718 cayman") || validModel.equals("x2 sports activity coupe")) {
            this.model = model;
        }
        else{
            this.model="Unknown";
        }
    }
    public String getModel(){// is a getter, gets the value of the field
        return this.model;
    }
}
