package com.udemy.java.shikhar.section5;

public class CodingExercise18 {
    //Challenge Directions:
    //Write a method named hasSharedDigit with two parameters of type int.
    //
    //Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
    //
    //The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
    //
    //
    //EXAMPLE INPUT/OUTPUT:
    //
    //* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
    //
    //* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
    //
    //* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
    //
    //
    //NOTE: The method hasSharedDigit should be defined as public static like we have been doing so far in the course.
    //
    //NOTE: Do not add a main method to the solution code.
    public static void main(String[]args){
        //System.out.println("is the shared digit between 15 and 55, 5..... "+hasSharedDigit(15,55));
        System.out.println("is the shared digit between 12 and 23, 2..... "+hasSharedDigit(12,23));
        //int num=(int)(12*0.1);
        //System.out.println(num);
    }
    public static boolean hasSharedDigit(int num1,int num2){
        if((num1<10||num1>99)||(num2<10||num2>99)){
            return false;
        }
        else{
            int num1Remain1=(int)(num1*0.1);
            int num1Remain2=num1%10;
            int num2Remain1=(int)(num2*0.1);
            int num2Remain2=num2%10;
            if((num1Remain1==num2Remain1) || (num1Remain1==num2Remain2) || (num1Remain2==num2Remain1) || (num1Remain2==num2Remain2)){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
