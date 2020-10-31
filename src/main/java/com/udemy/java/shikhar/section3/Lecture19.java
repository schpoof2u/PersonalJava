package com.udemy.java.shikhar.section3;

public class Lecture19 {
    public static void main(String[]args){
        //learning about inequalities and logical AND operator
        int topScore=100;
        //<= means less than or equal too, => greater than or equal to
        if(topScore<=100) {
            System.out.println("My high score in pac man is "+topScore);
        }
        int secondTopScore=50;
        if (topScore>secondTopScore && topScore<150){
            System.out.println("The top score is greater than the second score and is less than 150");
        }
    }
}
