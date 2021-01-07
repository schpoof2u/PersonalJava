package com.selflearn.java;

public class WingdingsTranslator {
    public static void main(String[]args){
        Wingdings_English("I own a husky, and his name is Simba"+"123");
    }
    public static String Wingdings_English(String phrase){//this method converts english text to wingdings
        // arrays holding the english alphabet/punctuation and their wingding equivalent
        Character[] english={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',',','.',';','{','}','[',']','(',')','/','|','=','+','-','_','*','&','^','%','$','#','@','!','~','`','1','2','3','4','5','6','7','8','9','0','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','"','?','<','>',':'};
        String[] Wingdings={"✌","\uD83D\uDC4C","\uD83D\uDC4D","\uD83D\uDC4E","☜","☞","☝","☟","✋","☺","\uD83D\uDE10","☹","\uD83D\uDCA3","☠","⚐","\uD83C\uDFF1","✈","☼","\uD83D\uDCA7","❄","\uD83D\uDD46","✞","\uD83D\uDD48","✠","✡","☪","\uD83D\uDCEA","\uD83D\uDCEC","\uD83D\uDDB4","❀","❝","☯","☸","\uD83D\uDD7F","✆","\uD83D\uDCED","✿","\uD83D\uDDAC","\uD83D\uDD83","\uD83D\uDCEB","♉","\uD83D\uDD82","\uD83D\uDD6E","♈","\uD83D\uDD6D","\uD83D\uDC53","✁","@","✏","❞","♊","\uD83D\uDCC2","\uD83D\uDCC4","\uD83D\uDDCF","\uD83D\uDDD0","\uD83D\uDDC4","⌛","\uD83D\uDDAE","\uD83D\uDDB0","\uD83D\uDDB2","\uD83D\uDCC1","♋","♌","♍","♎","♏","♐","♑","♒","♓","\uD83D\uDE70","\uD83D\uDE75","●","❍","■","□","◻","❑","❒","⬧","⧫","◆","❖","⬥","⌧","⍓","⌘","✂","✍","\uD83D\uDDAB","✇","\uD83D\uDDB3"};

        // depending on the character in the phrase it will give the proper wingdings characters
        for(int r=0;r<phrase.length();r++){// this works because it allows the characters in the phrase to be processed and given their wingding equivalent, it won't increase until the condition in the second loop is complete
            for(int i=0;i<english.length;i++){
                if(phrase.charAt(r)==english[i]){
                    System.out.print(Wingdings[i]);// prints each character translated so it looks like a sentence
                }
            }
        }
        return phrase;
    }
}
