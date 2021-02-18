package com.selflearn.java;

public class WingdingsTranslator {
    public static void main(String[] args) {
        //Wingdings("I own a husky, and his name is Simba");
        //System.out.println("Mo nkey".substring(2,3));
        //System.out.println("☟♏●●□❍⍓■♋❍♏ ♓⬧\uD83D\uDCA7♒♓\uD83D\uDE75♒♋❒".length());
        //Wingdings("✌👌👍👎",false);
        //String s = "✌👌👍👎";
        //System.out.println(s.length());
        //Wingdings("hola",false);
        //System.out.println(s.toCharArray());
        //System.out.println("\uD83D\uDC4C");
        Wingdings("✌\uD83D\uDC4C\uD83D\uDC4D\uD83D\uDC4E", false);
//        System.out.println();
//        Wingdings("✌\uD83D\uDC4C\uD83D\uDC4D",false);
//        System.out.println();
//        Wingdings("✌\uD83D\uDC4C",false);
//        System.out.println();
//        Wingdings("✌",false);
//        System.out.println();
//        Wingdings("✌",false);
//        System.out.println();
//        Wingdings("\uD83D\uDC4C",false);
//        System.out.println();
//        Wingdings("\uD83D\uDC4D",false);
//        System.out.println();
//        Wingdings("\uD83D\uDC4E",false);
//        System.out.println();
//        System.out.println();
//        Wingdings("👌",false);

//        System.out.println("\uD83D");//first char in wingdings "D" prints ?
//        System.out.println("\uDC4E");//second char in wingdings "D" prints ?
    }

    public static void Wingdings(String phrase, boolean isEnglish) {
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
//        } else {
//            Character[] english = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ',', '.', ';', '{', '}', '[', ']', '(', ')', '/', '|', '=', '+', '-', '_', '*', '&', '^', '%', '$', '#', '@', '!', '~', '`', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '"', '?', '<', '>', ':'};
//            String wingdings =("✌👌👍👎☜☞☝☟✋☺😐☹💣☠⚐🏱✈☼💧❄🕆✞🕈✠✡☪📪📬🖴❀❝☯☸🕿✆📭✿🖬🖃📫♉🖂🕮♈🕭👓✁@✏❞♊📂📄🗏🗐🗄⌛🖮🖰🖲📁♋♌♍♎♏♐♑♒♓🙰🙵●❍■□◻❑❒⬧⧫◆❖⬥⌧⍓⌘✂✍🖫✇🖳");
//            char[] phraseArray=phrase.toCharArray();
//            char[] wingdingsArray=wingdings.toCharArray();
//            //for loop to check which symbols have two unicode's and will manually override them
//            String[] newWingdings = {"✌", "👌", "👍", "👎", "☜", "☞", "☝", "☟", "✋", "☺", "😐", "☹", "💣", "☠", "⚐", "🏱", "✈", "☼", "💧", "❄", "🕆", "✞", "🕈", "✠", "✡", "☪", "📪", "📬", "🖴", "❀", "❝", "☯", "☸", "🕿", "✆", "📭", "✿", "🖬", "🖃", "📫", "♉", "🖂", "🕮", "♈", "🕭", "👓", "✁", "@", "✏", "❞", "♊", "📂", "📄", "🗏", "🗐", "🗄", "⌛", "🖮", "🖰", "🖲", "📁", "♋", "♌", "♍", "♎", "♏", "♐", "♑", "♒", "♓", "🙰", "🙵", "●", "❍", "■", "□", "◻", "❑", "❒", "⬧", "⧫", "◆", "❖", "⬥", "⌧", "⍓", "⌘", "✂", "✍", "🖫", "✇", "🖳"};
////            for(int x=0;x<newWingdings.length;x++){
////                System.out.println(newWingdings[x]+" has "+newWingdings[x].length()+" characters");
////            }
////            for (int i = 0; i < wingdings.length; i++) {
////                System.out.println(wingdings[i] + "length is " + wingdings[i].length());
////            }
////            //TO DO List:
////            // make the the wingdings char array and find the ascii code of those that too long in literal character
////            //else find another way
//            // NOTE: Java will display a longer substring when using emojis but it will be wrongfully placed, so getting a substring is nearly impossible for my beginner mind
//            for(int r=0;r<phraseArray.length;r++){
//                int limit=0;
//                for(int i = 0; i < wingdingsArray.length; i++) {
//                    if(phraseArray[r]==wingdingsArray[i]){
//                        if(newWingdings[i].length()==2){
//                            if(newWingdings[i].equals("\uD83D\uDC4C")){
//                                System.out.print("B");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDC4D")){
//                                System.out.print("C");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDC4E")){
//                                System.out.print("D");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDE10")){
//                                System.out.print("K");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDCA3")){
//                                System.out.print("M");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDFF1")){
//                                System.out.print("P");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDCA7")){
//                                System.out.print("S");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDD46")){
//                                System.out.print("U");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDD48")){
//                                System.out.print("W");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDCEA")){
//                                System.out.print(",");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDCEC")){
//                                System.out.print(".");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDDB4")){
//                                System.out.print(";");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDD7F")){
//                                System.out.print("(");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDCED")){
//                                System.out.print("/");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDDAC")){
//                                System.out.print("=");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDD83")){
//                                System.out.print("+");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDCEB")){
//                                System.out.print("-");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDD82")){
//                                System.out.print("*");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDD6E")){
//                                System.out.print("&");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDD6D")){
//                                System.out.print("%");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDC53")){
//                                System.out.print("$");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDCC2")){
//                                System.out.print("1");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDCC4")){
//                                System.out.print("2");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDDCF")){
//                                System.out.print("3");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDDD0")){
//                                System.out.print("4");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDDC4")){
//                                System.out.print("5");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDDAE")){
//                                System.out.print("7");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDDB0")){
//                                System.out.print("8");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDDB2")){
//                                System.out.print("9");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDCC1")){
//                                System.out.print("0");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDE70")){
//                                System.out.print("j");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDE75")){
//                                System.out.print("k");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDDAB")){
//                                System.out.print("<");
//                                break;
//                            }
//                            else if(newWingdings[i].equals("\uDDB3")){
//                                System.out.print(":");
//                                break;
//                            }
//                        }
//                        else{
//                            System.out.print(english[i]);
//                            limit++;
//                            if(limit==phrase.length()){
//                                break;
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        }
        }
    }
}