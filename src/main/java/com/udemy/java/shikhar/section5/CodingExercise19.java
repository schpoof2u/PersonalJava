package com.udemy.java.shikhar.section5;

public class CodingExercise19 {
    //Challenge Description:
    //Write a method named hasSameLastDigit with three parameters of type int.
    //
    //Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
    //
    //The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.
    //
    //
    //EXAMPLE INPUT/OUTPUT:
    //
    //* hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
    //
    //* hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
    //
    //* hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000
    //
    //
    //Write another method named isValid with one parameter of type int.
    //
    //The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.
    //
    //EXAMPLE INPUT/OUTPUT
    //
    //* isValid(10); → should return true since 10 is within the range of 10-1000
    //
    //* isValid(468); → should return true since 468 is within the range of 10-1000
    //
    //* isValid(1051); → should return false since 1051 is not within the range of 10-1000
    //
    //
    //NOTE: All methods need to be defined as public static as we have been doing so far in the course.
    //
    //NOTE: Do not add a main method to the solution code.
    public static void main(String[]args){
        System.out.println("do at least two of the numbers(123,943,and 12) have the same last digits..... "+hasSameLastDigit(123,943,12));
//        System.out.println(123%10);
//        System.out.println(1543%10);
//        System.out.println(12%10);
        //hasSameLastDigit(12,123,923);
    }
    public static boolean hasSameLastDigit(int num1,int num2,int num3){
        int lastDigit1=num1%10;
        int lastDigit2=num2%10;
        int lastDigit3=num3%10;
        int count=0;
        int timer=0;
        if((num1<10 || num1>1000) || (num2<10 || num2>1000) || (num3<10 || num3>1000)){
            //System.out.println("invalid value");
            return false;
        }
        else{
         while (count<=2){
             if((lastDigit1==lastDigit2) || (lastDigit1==lastDigit3) || (lastDigit2==lastDigit3)){
                 if(count==2){
                     //System.out.println("count equals 2");
                     return true;
                 }
                 count++;
             }
             else{
                 if(timer==3){
                     //System.out.println("timer equals 3");
                     return false;
                 }
                 timer++;
             }
         }
         if(count!=2 && timer==3){
             //System.out.println("false");
             return false;
         }
         else{
             //System.out.println("true");
             return true;
         }
        }
    }
    public static boolean isValid(int num){
        if(num<10 || num>1000){
            return false;
        }
        else{
            return true;
        }
    }
}
