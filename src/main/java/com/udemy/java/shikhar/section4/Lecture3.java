package com.udemy.java.shikhar.section4;

public class Lecture3 {
    public static void main(String[]args){
        int myScore=500;
        int sequel=2;
        boolean isShikhar= myScore<600? true:false;
        boolean gameOver=true;
        // you can assign different equalities in an if statement, <,>,==(means equals), <=(less than or equal to), >=(greater than or equal to)
        // the way this section works is that if one if statement works then it stops and ignores all the other if else and else statements, vice versa
        if(myScore<=500 && sequel<1){// code blocks,{} let you run multiple lines of code in an if statement
            System.out.println("My Score in Alto's Adventure is "+myScore);
        }
        else if(isShikhar) {
            System.out.println("Shikhar likes to play Alto's Adventure");
        } else{
            System.out.println("You don't have a score in Alto's Adventure");
        }
        if(gameOver==true)
        {
            //variables declraded in a code block/if statement will stay in the if statement and is not accessible outside of it
            int finalScore=2500;
            String finalMessage="Your final score in Alto's Adventure is "+finalScore;
            System.out.println(finalMessage);
        }
        //challenge
         int Score=10000;
        byte levelCompleted=8;
        short bonus=200;
        boolean newGameOver=true;
        if(newGameOver==true){
            int newScore=Score+levelCompleted+bonus;
            String deathMessage=("You died at level "+levelCompleted+" your score is "+newScore);
            System.out.println(deathMessage);
        }
    }
}
