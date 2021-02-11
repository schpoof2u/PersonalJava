package com.udemy.java.shikhar.section5;

public class Lecture8 {
    public static void main(String[]args){
        System.out.println("sum is "+digitSums(12345));
    }
    public static int digitSums(int number){
        if (number>=10){
            //how to find a way to split up the numbers and then add
            // video says to use n%10 to find the least value number in the number
            int sum=0;
            while(number>0){
                int leastDigit=number%10;
                sum+=leastDigit;
                number/=10;
            }
            return sum;
        } else{
            return -1;
        }
    }
}
