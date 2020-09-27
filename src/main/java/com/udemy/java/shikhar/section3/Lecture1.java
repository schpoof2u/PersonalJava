package com.udemy.java.shikhar.section3;

public class Lecture1 {
    public static void main(String[] args)
    {
        int MinIntValue=Integer.MIN_VALUE;
        int MaxIntValue=Integer.MAX_VALUE;
        System.out.println("the min value for an integer to contain is "+MinIntValue);
        System.out.println("the max value for an integer to contain is "+MaxIntValue);
        System.out.println("Busted MAX value(Overflow) "+(MaxIntValue+1));
        System.out.println("Busted MIN value(Underflow) "+ (MinIntValue-1));

    }
}
