package com.udemy.java.shikhar.section3;

public class Lecture22 {
    public static void main(String[]args){
        //Operator precedence and Operator challenge
        //making new variables for each step of readability
        //checking to see if the number has a remainder
        double testdouble1=20.00d;
        double testdouble2=80.00d;
        double testdouble3=(testdouble1+testdouble2)*100.00d;
        double testdouble4=testdouble3%40.00d;
        boolean modulus0=testdouble4==0? true:false;
        System.out.println(modulus0);
        if(!modulus0){
            System.out.println("Got some remainder it is "+testdouble4);
        }
        else{
            System.out.println("got no remainder");
        }
    }
}
