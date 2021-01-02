package com.udemyjava.shikhar.section4;

public class CodingExercise5 {
    //Challenge Directions:
    //Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
    //The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
    //EXAMPLES OF INPUT/OUTPUT:
    //* areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
    //* areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
    //* areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
    //* areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.
    //TIP: Use paper and pencil.
    //TIP: Use casting.
    //NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static like we have been doing so far in the course.
    //NOTE: Do not add a  main method to solution code.
    public static void main(String[]args){
        areEqualByThreeDecimalPlaces(3.14,3.140);
    }
    public static boolean areEqualByThreeDecimalPlaces(double numero1, double numero2){
        int Numero1=(int)(numero1*1000);
        int Numero2=(int)(numero2*1000);
        if(Numero1==Numero2){
            System.out.println(numero1+" is equal to "+numero2+" by three decimal spaces");
            return true;
        }
        else{
            System.out.println(numero1+" doesn't equal "+numero2+" by three decimal spaces");
            return false;
        }
    }
}
