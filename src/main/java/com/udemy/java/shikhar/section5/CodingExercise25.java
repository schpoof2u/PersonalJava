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
    public static void main(String[]args){}
    public static long getLargestPrime(int number){
        if(number<=0 || number==1){
            return -1;
        }
        else{
            long squareRoot=Math.round(Math.sqrt(number));//max limit of factors
            long primeFactor=0;
            int count=0;

            for(int k=1;k<=number;k++){//checks to see if the number is a prime number
                if(number%k==0){
                    count++;
                }
            }
            if(count==2){
                return number;
            }

            /////////////////////////////////////////////////////

            for(int i=2;i<=squareRoot;i++){// is the loop that divides number/i
                if(i>number/i){//checks to see if i is greater then number/i
                    for(int o=1;o<=i;o++){//divides i by o
                        if(i%o==0){
                            count++;
                        }
                    }
                    if(count==2){// if count equals 2 that means the number is prime since it is only divisible by itself and 1
                        primeFactor=i;
                    }
                }
                else if(i<number/i){
                    for(int o=1;o<=(number/i);o++){
                        if((number/i)%o==0){
                            count++;
                        }
                    }
                    if(count==2){
                        primeFactor=(number/i);
                    }
                }
            }
        }
        return -1;
    }
}
