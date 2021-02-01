package com.selflearn.java;

public class WingdingsTranslator {
    public static void main(String[] args) {
        //Wingdings("I own a husky, and his name is Simba");
        //System.out.println("Mo nkey".substring(2,3));
        //System.out.println("☟♏●●□❍⍓■♋❍♏ ♓⬧\uD83D\uDCA7♒♓\uD83D\uDE75♒♋❒".length());
        Wingdings("✌👌👍👎",false);
        String s = "✌👌👍👎";
        //System.out.println(s.length());
        //Wingdings("hola",false);
        System.out.println(s.toCharArray());
    }

    public static String Wingdings(String phrase, boolean isEnglish) {
        if (isEnglish == true) {
            Character[] english = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ',', '.', ';', '{', '}', '[', ']', '(', ')', '/', '|', '=', '+', '-', '_', '*', '&', '^', '%', '$', '#', '@', '!', '~', '`', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '"', '?', '<', '>', ':'};
            String[] wingdings = {"✌", "👌", "👍", "👎", "☜", "☞", "☝", "☟", "✋", "☺", "😐", "☹", "💣", "☠", "⚐", "🏱", "✈", "☼", "💧", "❄", "🕆", "✞", "🕈", "✠", "✡", "☪", "📪", "📬", "🖴", "❀", "❝", "☯", "☸", "🕿", "✆", "📭", "✿", "🖬", "🖃", "📫", "♉", "🖂", "🕮", "♈", "🕭", "👓", "✁", "@", "✏", "❞", "♊", "📂", "📄", "🗏", "🗐", "🗄", "⌛", "🖮", "🖰", "🖲", "📁", "♋", "♌", "♍", "♎", "♏", "♐", "♑", "♒", "♓", "🙰", "🙵", "●", "❍", "■", "□", "◻", "❑", "❒", "⬧", "⧫", "◆", "❖", "⬥", "⌧", "⍓", "⌘", "✂", "✍", "🖫", "✇", "🖳"};
            // depending on the character in the phrase it will give the proper wingdings characters
            for (int r = 0; r < phrase.length(); r++) {
                for (int i = 0; i < english.length; i++) {
                    if (phrase.charAt(r) == english[i]) {
                        System.out.print(wingdings[i]);
                    }
                }
            }
        } else {
            Character[] english = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ',', '.', ';', '{', '}', '[', ']', '(', ')', '/', '|', '=', '+', '-', '_', '*', '&', '^', '%', '$', '#', '@', '!', '~', '`', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '"', '?', '<', '>', ':'};
            String wingdings =("✌👌👍👎☜☞☝☟✋☺😐☹💣☠⚐🏱✈☼💧❄🕆✞🕈✠✡☪📪📬🖴❀❝☯☸🕿✆📭✿🖬🖃📫♉🖂🕮♈🕭👓✁@✏❞♊📂📄🗏🗐🗄⌛🖮🖰🖲📁♋♌♍♎♏♐♑♒♓🙰🙵●❍■□◻❑❒⬧⧫◆❖⬥⌧⍓⌘✂✍🖫✇🖳");
            char[] phraseArray=phrase.toCharArray();
            char[] wingdingsArray=wingdings.toCharArray();
//            for (int i = 0; i < wingdings.length; i++) {
//                System.out.println(wingdings[i] + "length is " + wingdings[i].length());
//            }
//            //TO DO List:
//            // make the the wingdings char array and find the ascii code of those that too long in literal character
//            //else find another way
            // NOTE: Java will display a longer substring when using emojis but it will be wrongfully placed, so getting a substring is nearly impossible for my beginner mind
            System.out.println("phrase length is " + phrase.length());//phrase length is wrong for wingdings, should be five but is seventeen
            for(int r=0;r<phraseArray.length;r++){
                int limit=0;
                for (int i = 0; i < wingdingsArray.length; i++) {
                    if(phraseArray[r]==wingdingsArray[i]){
                        System.out.print(english[i]);
                        limit++;
                        if(limit==phrase.length()){
                            break;
                        }
                    }
                }
            }
        }
        return phrase;
    }
}

