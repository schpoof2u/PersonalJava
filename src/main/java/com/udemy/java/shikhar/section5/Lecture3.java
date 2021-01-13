package com.udemy.java.shikhar.section5;

public class Lecture3 {
    public static void main(String[]args){
        for (int i=1;i<=8;i++)// you start by declaring a number/int that starts your cycles, then the limit of when it should end,and how much it will increment by
        {//what you want to loop
            System.out.println("1000 at "+i+"%"+" interest rate is "+calculateInterest(1000,i));
        }
        System.out.println();
        for(int i=8;i>=1;i--){
            System.out.println("1000 at "+i+"%"+" interest rate is "+calculateInterest(1000,i));
        }
    }
    public static double calculateInterest(double amount,double interestRate){
        return amount*(interestRate/100);
    }
}
