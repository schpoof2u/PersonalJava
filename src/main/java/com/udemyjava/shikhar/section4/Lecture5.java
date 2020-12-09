package com.udemyjava.shikhar.section4;

public class Lecture5 {
    public static void main(String[]args){
        //using code from lecture 4
        int replacement_int=900;
        int highScore=calculateScore(true,800,5,800);// you can assign a method to a variable of the same datatype
        System.out.println("your highscore is "+highScore);
      //calculateScore(true,800,replacement_int,800);
        calculateScore(false,200,6,900);
        //challenge
        displayHighScorePosition("Shikhar",900);
        calculateHighScorePosition(790);
    }
    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){
        int finalScore=score+(levelCompleted*bonus);
        if(gameOver){
            return finalScore;//return is what tells the method to stop running
        }
        else{
            System.out.println("gameOver equals false, keep on playing!");
            return -1;//return is what tells the method to stop running
            //the void method type returns no value so it doesn't sop running until the its code block is executed
        }
    }
    //challenge code
    public static void displayHighScorePosition(String playerName, int position){
        String finalMessage=playerName+"\n Managed to get into position"+"\n Position is "+position;
        System.out.println(finalMessage);
    }
    public static int calculateHighScorePosition( int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {//removed the and operator/condition because intellij said it was always true no matter the input
            return 2;
        }
        else if (playerScore >= 100) {//removed the and operator/condition because intellij said it was always true no matter the input
            return 3;
        }
        else{
            return 4;
        }

    }

}
