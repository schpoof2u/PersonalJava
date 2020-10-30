package com.selflearn.java;

public class PNF {
    /*
     steps of execution:
     User gives a number from one through hundred
     User's number goes through repeated test of being divided by number 1-10
     if the user's number equals itself or one then it is a prime number
     else it is a composite number
      */
    public static void main(String[]args)
    {
        //part 2
        for (int i = 1; i <= 100; i++) {
            if (isNumberPrime(i, 1, 100)) {
                System.out.println(i + " is prime number");
            }
        }
    }

    //part 1
    private static boolean isNumberPrime(int userNumber, int min, int max) {// this is a private method of type boolean with variables defined for arguments
        //the values aren't hardcoded in which allows them to be any number
        if( userNumber>max || userNumber<min) {//check if input is valid
            System.out.println("Number is out of test range. My range is between " + min + " and " + max + ".");
            return false; // what does return false mean
        } else if (userNumber == 1) {
            return false;
        } else if(userNumber%2==0) {//if input is even number
            if (userNumber == 2) {
                return true;
            } else {
                //System.out.println( userNumber+" is a composite number");
                return false;
            }
        } else {//check all odd numbers
            //as per mathematician, the max loop can go upto sqrt of userNumber
            int loopMax = (int)Math.sqrt(userNumber); //what does this math do?
            for (int i=3; i<=loopMax; i+=2) {
                if (userNumber%i == 0) {
                    //System.out.println( userNumber+" is a composite number");
                    return false;
                }
            }
        }
        return true; //what is return true
    }
}
