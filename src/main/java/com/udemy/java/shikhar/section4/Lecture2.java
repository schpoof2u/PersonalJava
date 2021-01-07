package com.udemy.java.shikhar.section4;

public class Lecture2 {
    public static void main(String[]args){
        String Statement=("What is a Statement in Java?\n A statement is code that ends with a semicolon or ;");
        //Java is smart enough to know that since their is no semicolon it will automatically concatenate
        System.out.println("this" +
                " is" +
                " a " +
                "String" +
                " ,Hello");
        //As long as their is a semicolon java will not care if two variables are declared or changed in the same line
        int myAge=14;int dakshAge=10;
        System.out.println(myAge);System.out.println(dakshAge);
    }
}
