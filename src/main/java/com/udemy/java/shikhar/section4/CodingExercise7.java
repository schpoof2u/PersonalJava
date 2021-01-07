package com.udemy.java.shikhar.section4;

public class CodingExercise7 {
    //challenge directions:
    //We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
    //Write a method named hasTeen with 3 parameters of type int.
    //The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
    //EXAMPLES OF INPUT/OUTPUT:
    //* hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19
    //* hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19
    //* hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19
    //Write another method named isTeen with 1 parameter of type int.
    //The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
    //EXAMPLES OF INPUT/OUTPUT:
    //* isTeen(9);  should return false since 9 is in not range 13 - 19
    //* isTeen(13);  should return true since 13 is in range 13 - 19
    //NOTE: All methods need to be defined as public static like we have been doing so far in the course.
    //NOTE: Do not add a  main method to solution code.
    public static void main(String[]args){
        hasTeen(21,34,16);
        isTeen(12);
    }
    public static boolean hasTeen(int age1, int age2, int age3){
        if((age1>=13 && age1<=19) || (age2>=13 && age2<=19) || (age3>=13 && age3<=19) ){
            System.out.println("Their is a teen within the group");
            return true;
        }
        else{
            System.out.println("their is no teen within the group");
            return false;
        }
    }
    public static boolean isTeen(int age){
        if(age>=13 && age<=19){
            System.out.println(age+" is a teen age");
            return true;
        }
        else{
            System.out.println(age+" is not a teen age");
            return false;
        }
    }
}
