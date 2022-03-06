package com.JamieChenJava.Chapter4;

import java.util.Locale;

public class lesson1 {
    public static void main(String[]args){
        // this lesson focuses on the String datatype
        String name="Dan";// how to declare a String variable
        String greeting="guten tag";
        System.out.println(name+greeting);// this is concatenation, the combining of Strings
        int nameLength=name.length();// the .length() function gets the amount of characters in a String
        String abc="abc";
        System.out.println(abc.toUpperCase(Locale.ROOT));// .toUpperCase() function makes a String in all caps
        String def="DEF";
        System.out.println(def.toLowerCase(Locale.ROOT));// .toLowerCase() function makes a string in all lowercase
        String firstStatement="Hello World";
        System.out.println(firstStatement.substring(1,8));// .substring() function works by starting at the index of 1 for the string, since java starts counting at 0, and ends before the 8th position
        System.out.println(firstStatement.substring(6));// the function starts the string at index of 6 and prints everything after the index
        System.out.println(firstStatement.charAt(0));// the .charAt() function gets a character from the string at the specified index
        String secondStatement="Hello, World";
        boolean isItEqual=firstStatement.equals(secondStatement);// the .equals() function checks to see if a String matches with another String
        String[]words=secondStatement.split(", "); // the .split function splits the String into multiple substrings and places them into an array based on what input is given for it ot be split
        System.out.println(words[0]);
        System.out.println(words[1]);
    }
}
