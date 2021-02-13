package com.udemy.java.shikhar.section5;

public class CodingExercise15 {
    //Challenge description:
    //Write a method called isPalindrome with one int parameter called number.
    //
    //The method needs to return a boolean.
    //
    //It should return true if the number is a palindrome number otherwise it should return false.
    //
    //Check the tips below for more info about palindromes.
    //
    //Example Input/Output
    //
    //isPalindrome(-1221); → should return true
    //
    //isPalindrome(707); → should return true
    //
    //isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.
    //
    //Tip: What is a Palindrome number?  A palindrome number is a number which when reversed is equal to the original number. For example: 121, 12321, 1001 etc.
    //
    //Tip: Logic to check a palindrome number
    //
    //Find the the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse.
    //
    //If both are the the same then the number is a palindrome otherwise it is not.
    //
    //Tip: Logic to reverse a number
    //
    //Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
    //
    //Extract the last digit of the given number by performing the modulo division (remainder).
    //Store the last digit to some variable say lastDigit = num % 10.
    //Increase the place value of reverse by one.
    //To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
    //Add lastDigit to reverse.
    //Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10.
    //Repeat steps until number is not equal to (or greater than) zero.
    //
    //A while loop would be good for this coding exercise.
    //
    //
    //Tip: Be careful with negative numbers. They can also be palindrome numbers.
    //
    //Tip: Be careful with reversing a number, you will need a parameter for comparing a reversed number with the starting number (parameter).
    //
    //NOTE: The method isPalindrome needs to be defined as public static like we have been doing
    public static void main(String[]args){
        //System.out.println("is 1221 a palindrome..... "+isPalindrome(1221,false));
        //System.out.println(" is 707 a palindrome..... "+isPalindrome(707,false));
        //System.out.println("is -1221 a palindrome..... "+isPalindrome(-1221));
        //System.out.println("is 10 a palindrome..... "+isPalindrome(10));
        //System.out.println("is 101 a palindrome..... "+isPalindrome(101));
        //System.out.println("is -222 a palindrome..... "+isPalindrome(-222));
        //System.out.println("is 11 a palindrome..... "+isPalindrome(11));
    }
    //version 1 error list:
    // numbers like 10 should return false but return true
    public static boolean isPalindrome(int number){
        if(number<0){
            number*=-1;
        }
        int reverseNumber=0;
        int lastDigit;
            int newNumber=number;
            while (newNumber>0){
                lastDigit=newNumber%10;
                System.out.println("last digit equals "+lastDigit);
                if(lastDigit==0 && reverseNumber<=0){
                    break;
                }
                reverseNumber+=lastDigit;
                System.out.println(reverseNumber);
                if(reverseNumber==number){
                    break;
                }
                else{
                    reverseNumber*=10;
                }
                System.out.println("reverse number is "+reverseNumber);
                newNumber/=10;
            }
            System.out.println(" value of reverse number= "+reverseNumber);

        if(number==reverseNumber){
            return true;
        }
        else{
            return false;
        }
    }
}
