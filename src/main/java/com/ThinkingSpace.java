package com;
import java.util.Scanner;
public class ThinkingSpace {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your name:");
        String name=scanner.nextLine();
        System.out.println("your name is "+name);

        System.out.println("What is the current year:");
        boolean hasNextInt=  scanner.hasNextInt();
        int currentYear= scanner.nextInt();
        if(hasNextInt) {
            System.out.println("the year is " + currentYear);
        }
        else{
            System.out.println("Unable to parse currentYear");
        }
        System.out.println("What is your birth year:");
        boolean hasNextInt2=scanner.hasNextInt();
        int birthYear=scanner.nextInt();
        if(birthYear<0 || birthYear>currentYear || !hasNextInt2){
            System.out.println("Invalid");
        }
        else {
            System.out.println("your birth year is " + birthYear);
        }
        int age=currentYear-birthYear;
        System.out.println();
        System.out.println("User Profile ("+currentYear+")");
        System.out.println("Name: "+name);
        System.out.println("Birth Year: "+birthYear);
        System.out.println("Age: "+age);

    }
}
