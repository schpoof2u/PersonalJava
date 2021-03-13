package com.udemy.java.shikhar.section5;

public class Lecture9 {
    public static void main(String[]args){
        String numberAsString="2018";
        System.out.println("numberAsString="+numberAsString);
        //the function parseInt converts a string into a number if the string only has a numerical value
        int number=Integer.parseInt(numberAsString);
        System.out.println("Parsed numberAsString is "+number);
        numberAsString+=1; // turns the 1 into a string value and then concatenates it with the original string value
        number+=1;// adds one to the numerical value of the int, since the string was parsed into an integer
        System.out.println(numberAsString);
        System.out.println(number);

        //what happens if a letter is part of a number sequence in a string and is parsed
        //String userBirthday="2001r";
        //int userB_Day=Integer.parseInt(userBirthday);
        //System.out.println(userB_Day);
        //TLDR: it will not parse successfully and you will get error

        //parsing with other numerical primitive datatype
        String grades="93.50";
        double myGrades=Double.parseDouble(grades);
        System.out.println(myGrades);
        String table="23";
        long tableLength=Long.parseLong(table);
        System.out.println("my table length is "+tableLength);
    }
}
