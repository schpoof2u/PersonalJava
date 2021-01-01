package com.selflearn.java;

public class WingdingsTranslator {
    public static void main(String[]args){
        Wingdings_English("Hello");
    }
    public static String Wingdings_English(String phrase){
        for(int i=0;i<phrase.length();i++){
            if(Character.isDigit(phrase.charAt(i))==true){
                System.out.println("Invalid Input");
                return "Invalid Input";
            }
        }
        // depending on the character in the phrase it will give the proper wingdings characters
        String[] alphabet={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] Wingdings={"✌","\uD83D\uDC4C","\uD83D\uDC4D","\uD83D\uDC4E","☜","☞","☝","☟","✋","☺","\uD83D\uDE10","☹","\uD83D\uDCA3","☠","⚐","\uD83C\uDFF1","✈","☼","\uD83D\uDCA7","❄","\uD83D\uDD46","✞","\uD83D\uDD48","✠","✡","☪"};
        String upperPhrase=phrase.toUpperCase();
        return phrase;
    }
}
