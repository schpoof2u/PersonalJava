package com.udemy.java.shikhar.section5;
import java.util.Scanner;
public class Lecture12 {
    public static void main(String[]args){
        //Challenge Description
        //Read numbers from the console entered by the user and print the minimum and maximum number the user has entered
        //Before the user enters the number, print the message "Enter number:"
        //if the user enters and invalid number, break out of the loop and print the minimum and maximum number
        //use and endless while loop
        challenge();
    }
    public static void challenge(){
        Scanner scanner= new Scanner(System.in);
        int maximum=0;
        int minimum=0;
        int count=0;
        while(true) {
            System.out.println("Enter number:");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int number = scanner.nextInt();
                if(number>maximum){
                    maximum=number;
                }
                if(number<maximum && count==0){
                    minimum=number;
                    count++;
                }
                else if(number<minimum){
                    minimum=number;
                }
            } else {
                System.out.println("The Minimum number is "+minimum);
                System.out.println("The maximum number is "+maximum);
                break;
            }
        }
    }
}
