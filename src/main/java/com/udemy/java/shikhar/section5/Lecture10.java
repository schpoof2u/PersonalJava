package com.udemy.java.shikhar.section5;

import java.util.Scanner;

public class Lecture10 {
    public static void main(String[]args){
       //asks user for their name
        //Scanner scans for primitive datatype and strings(use methods such as parseInt internally. allows the program to read user input
        Scanner scanner = new Scanner(System.in);//System.in allows the user to type in input, new creates a new object/instance of type Scanner
        System.out.println("Enter your name: ");
        String name=scanner.nextLine();//returns input that the user typed in the console, scans for a string
        System.out.println("Your name is "+name);//displays what what returned

        //asks user for their year of birth
        System.out.println("Enter your year of birth:");
        int yearOfBirth= scanner.nextInt();
        System.out.println("Your year of birth is "+yearOfBirth);//scans for an int
        //scanner.close();//closes scanner as to release the memory used by scanner
        int age=2021-yearOfBirth;
        //Line below is a solution for when taking integer/primitive type input
        scanner.nextLine();//handles the next line issue,user presses enter key and line ends
        System.out.println(name+" you are "+age+" years old");
        System.out.println("Enter a character on your keyboard:");
        String character=scanner.nextLine();
        if(character.length()>1){
            System.out.println("Invalid");
        }
        else{
            System.out.println("You entered "+character);
        }
        scanner.close();
    }
}
