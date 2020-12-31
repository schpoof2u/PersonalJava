package com.udemyjava.shikhar.section4;

public class CodingChallenge10 {
    //challenge directions:
    //Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
    //If one of the parameters is less than 0, print text "Invalid Value".
    //If all numbers are equal print text "All numbers are equal"
    //If all numbers are different print text "All numbers are different".
    //Otherwise, print "Neither all are equal or different".
    //EXAMPLES OF INPUT/OUTPUT:
    //* printEqual(1, 1, 1); should print text All numbers are equal
    //* printEqual(1, 1, 2); should print text Neither all are equal or different
    //* printEqual(-1, -1, -1); should print text Invalid Value
    //* printEqual(1, 2, 3); should print text All numbers are different
    //TIP: Be extremely careful about spaces in the printed message.
    //NOTES
    //* The solution will not be accepted if there are extra spaces.
    //* The method printEqual needs to be defined as public static like we have been doing so far in the course.
    //* Do not add main method to solution code.
    public static void main(String[]args){
    printEqual(2,2,2);
    }
    public static void printEqual(int number1,int number2,int number3){
        if(number1<0 || number2<0 || number3<0){
            String invalidValue="Invalid Value";
            System.out.println(invalidValue);
        }
        else{
            if(number1==number2 && number2==number3 && number1==number3){
                String numEqual="All numbers are equal";
                System.out.println(numEqual);
            }
            else if(number1!=number2 && number2!=number3 && number1!=number3){
                String numDifferent="All numbers are different";
                System.out.println(numDifferent);
            }
            else{
                String numNeither="Neither all are equal or different";
                System.out.println(numNeither);
            }
        }
    }
}
