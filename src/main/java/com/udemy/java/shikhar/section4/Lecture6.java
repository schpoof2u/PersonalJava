package com.udemy.java.shikhar.section4;

public class Lecture6 {
    public static void main(String[]args){
//        calculateScore("Koolaidman1",32);
//        calculateScore(35);// if the parameter variable name is the same as the one with the other identical method intellij will not show the variable name
//        // NOTE: when no specific configuration of the method is selected an error will show up saying cannot resolve method because it has no info on it
//        calculateScore();
        calcFeetAndInchesToCentimeters(27);
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player named "+playerName+" scored "+score+" points");
        return 1;
    }
    public static int calculateScore( int score){
        System.out.println("Unnamed player scored "+score+" points");
        return 1;
    }
    public static void calculateScore(){
        System.out.println("no score is available");
    }
    //NOTE: the reason multiple methods can have the same name and work is because of the signature, the signature all the parameters in the ()

    //Challenge code:
    public static int calcFeetAndInchesToCentimeters( int feet, int inches){
        if(feet>=0 && inches>=0){
            double feetToCentimeters=30.48;
            double inchesToCentimeters=2.54;
            double centimeters= (feet*feetToCentimeters)+(inches*inchesToCentimeters);
            return (int)centimeters;
        }
        else{
            return -1;
        }
    }
    public static int calcFeetAndInchesToCentimeters(int inches){
        if(inches>=0){
            int feet=inches/12;
            int centimeters= calcFeetAndInchesToCentimeters(feet,inches);
            System.out.println(inches+" inches equals "+centimeters+" centimeters");
            return centimeters;
        }
        else{
            System.out.println("number is invalid");
            return -1;
        }
    }
}
