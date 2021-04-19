package com.udemy.java.shikhar.section5;

public class CodingExercise25 {
    //Challenge Description:
    //Write a method named getLargestPrime with one parameter of type int named number.
    //
    //If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
    //
    //
    //The method should calculate the largest prime factor of a given number and return it.
    //
    //
    //EXAMPLE INPUT/OUTPUT:
    //
    //* getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
    //
    //* getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
    //
    //* getLargestPrime (0); should return -1 since 0 does not have any prime numbers
    //
    //* getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
    //
    //* getLargestPrime (-1); should return -1 since the parameter is negative
    //
    //
    //HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.
    //
    //NOTE: The method getLargestPrime should be defined as public static like we have been doing so far in the course.
    //
    //NOTE: Do not add a main method to the solution code.
    public static void main(String[] args) {
//        System.out.println(getLargestPrime(21));//should return 7 but instead returns -1
//        System.out.println(getLargestPrime(25));//should return 5 but instead returns -1
//        System.out.println(getLargestPrime(31));//verifies that the loop that checks if number is a prime number works
//        System.out.println(getLargestPrime(79));
        //////////////////////////////////////////////////////////////

        //*start section, gets the factors of a number
        int number=27;
        long squareCounter=0;
        int c=0;
        long squareRoot=Math.round(Math.sqrt(number));
        for (int i=1;i<=number;i++){
            if(number%i==0){
                c++;

                System.out.println(number/i);
                squareCounter++;
            }
            if(squareCounter==squareRoot){
                break;
            }
        }
        System.out.println(c);
        //* end section
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        } else {
            int count = 0;
            for (int k = 1; k <= number; k++) {//checks to see if the number is a prime number
                if (number % k == 0) {
                    count++;
                }
            }
            if (count == 2) {
                return number;
            }

            /////////////////////////////////////////////////////
            count = 0;


            //Logic:
            // run a for loop that divides  number by i to print out its factors
        }
        return -1;
    }
}
