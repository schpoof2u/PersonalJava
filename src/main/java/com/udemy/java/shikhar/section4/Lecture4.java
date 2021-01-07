package com.udemy.java.shikhar.section4;

public class Lecture4 {
    public static void main(String[]args){
        int replacement_int=900;
        calculateScore(true,800,5,800); //you can call a method more than once,with the same parameters
        calculateScore(true,800,replacement_int,800);// you can use a variable as a parameter as long as the datatype is accepted
        calculateScore(false,200,6,900);//you cannot define a method with the same signature/parameter as another
        }
//
public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){

    if(gameOver==true){
        int finalScore=score+(levelCompleted*bonus);
        String finalMessage="Your final score is "+finalScore;
        System.out.println(finalMessage);
        return finalScore;
    }
    else{
        System.out.println("gameOver equals false, keep on playing!");
        return -1;
    }
}

}