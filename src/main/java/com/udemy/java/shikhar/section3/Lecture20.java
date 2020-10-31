package com.udemy.java.shikhar.section3;

public class Lecture20 {
    public static void main(String[]args){
        boolean amDaksh=false;
        //learing about Logical OR operator
        //the data in the parentheses is called a condition and it determines what condition needs to be met to run the code block below
        if(amDaksh==false)
        {
            System.out.println("User is not Daksh.");
            System.out.println("this is good because Daksh likes  marshmallow pie");
        }
        int topScore=100;
        //<= means less than or equal too, => greater than or equal to
        if(topScore<=100) {
            System.out.println("My high score in pac man is "+topScore);
        }
        int secondTopScore=50;
        if ((topScore>secondTopScore) && (topScore<150)){// && means and, it checks to see if all statements/conditions are true or false
            System.out.println("The top score is greater than the second score and is less than 150");
        }
        int numPie=6;
        String applePie="Apple Pie";
        if ((numPie==6) || (applePie=="Apple Pie")){// || means or and it checks to see one of the multiple statements are true
            System.out.println("Their are "+numPie+" "+applePie);
        }
    }
}
