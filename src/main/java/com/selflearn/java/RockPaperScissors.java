package com.selflearn.java;
import java.util.Scanner;
public class RockPaperScissors {
    public static void validation(String playerChoice){
        playerChoice=playerChoice.toLowerCase();
        String[] choices= new String[]{"rock","paper","scissors"};
        for(int i=0;i<choices.length;i++){
            if(playerChoice.equals(choices[i])){
                break;
            }
        }
        System.out.println("Invalid Input");
    }
    public static void gameplay(){
        Scanner scanner=new Scanner(System.in);
        String playerChoice=scanner.nextLine();
        validation(playerChoice);
        String[] choices= new String[]{"rock","paper","scissors"};
        String computerChoice=choices[(int)(Math.random()*2)];
        if((computerChoice.equals(choices[0]) && playerChoice.equals(choices[1])) || (computerChoice.equals(choices[1]) && playerChoice.equals(choices[0])) || computerChoice.equals(choices[0]) && playerChoice.equals(choices[2])){
            System.out.println("You chose "+playerChoice);
            System.out.println("The computer chose "+computerChoice);
            System.out.println("You win");
        }
        else if(playerChoice.equals(computerChoice)){
            System.out.println("You chose "+playerChoice);
            System.out.println("The computer chose "+computerChoice);
            System.out.println("It is a tie");
        }
        else{
            System.out.println("You chose "+playerChoice);
            System.out.println("The computer chose "+computerChoice);
            System.out.println("The computer wins");
        }
    }
}
