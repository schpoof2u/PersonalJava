package com.udemy.java.shikhar.section5;
import java.util.Scanner;
public class Lecture11 {
    public static void main(String[]args){
        //was written on July 29, ran out of internet connection
        //reading user input challenge
        //read 10 numbers from the console entered by the user and print the sum of those numbers
        //create a Scanner
        //use hasNextInt() method from the scanner to check if the user has entered an int value
        //if hasNextInt() returns false, print the message "Invalid Number", continue reading until 10 numbers have been read
        //use the nextInt() method to get the number and add it to the sum
        //before the user enters each number print the message "Enter number #x" where x represents the count
        //use a while loop
        //use a counter variable for counting valid numbers
        //close the Scanner after you don't need it
        Scanner scanner=new Scanner(System.in);
        int counter=1;
        int sum=0;
        while(counter<=10){
            System.out.println("Enter #"+counter+":");
            boolean hasNextInt= scanner.hasNextInt();
            if(hasNextInt){
                int number=scanner.nextInt();
                sum+=number;
                counter++;
            }
            else{
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("the sum of the 10 numbers you entered is "+sum);
        scanner.close();
    }
}
