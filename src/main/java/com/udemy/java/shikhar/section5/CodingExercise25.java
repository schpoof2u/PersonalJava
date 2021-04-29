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
        System.out.println(getLargestPrime(21));//should return 7 but instead returns -1
        System.out.println(getLargestPrime(25));//should return 5 but instead returns -1
        System.out.println(getLargestPrime(31));//verifies that the loop that checks if number is a prime number works
        System.out.println(getLargestPrime(79));
        System.out.println(getLargestPrime(923));
        //////////////////////////////////////////////////////////////

        //*start section, gets the factors of a number
        //tests
        // 27 should return 3
        //25 should return 25
        //49 should return 7
        //21 should return 7
        //100 should return 5
    }
    public static int getLargestPrime(int number){
        if(number<=1){
            return -1;
        }
        long primeFactor=0;
        long factor;
        for (int i=1;i<=number;i++){
            int count=0;
            if(number%i==0){// checks if i is a factor of number
                factor=number/i;
                //System.out.println("factors are "+factor);
                for(int o=1;o<=factor;o++){
                    if(factor%o==0){
                        count++;
                    }
                }
                if(count==2){
                    if(factor>primeFactor) {
                        primeFactor=factor;
                    }
                }
            }
        }
        //System.out.println(primeFactor);
        return (int)(primeFactor);
    }
}
