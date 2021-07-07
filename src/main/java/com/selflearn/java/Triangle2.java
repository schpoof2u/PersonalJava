package com.selflearn.java;

public class Triangle2 {
    public static void main(String[]args){
        Triangle(9);
        Triangle(5);
    }
    public static void Triangle(int number){
        if(number%2==0){
            System.out.println("Number is invalid");
        }
        else{
            for(int i=0; i<=number;i++){
                for(int j=0; j<=i;j++){
                    for(int s=0;s<=number-i;s++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}