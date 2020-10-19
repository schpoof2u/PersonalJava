package com.udemy.java.shikhar.section3;

public class Lecture1 {
    public static void main(String[] args)
    {
        byte mycurrentage=14;
        System.out.println("my age in 2020 is "+mycurrentage);
        // ++ means adding 1 to the value and reassgining it currentage can be written as currentage=currentage+1 or currentage++
        mycurrentage++;
        System.out.println("my age in 2021 is "+mycurrentage);

        byte numofcakes=12;
        System.out.println("their are "+numofcakes+" cakes. Johnny takes 1. \n how many do you have left?");
        // is the subtracting form of ++
        numofcakes--;
        System.out.println("you have "+numofcakes+" cakes left");

        byte breadloaves=11;
        System.out.println("you have "+breadloaves+" loaves of bread at home");
        // adding a value by an amount greater than 1 and reassigning it
        breadloaves+=3;
        System.out.println("you go out and buy 3 more loaves of bread.\n you now have "+breadloaves+" loaves of bread");

        byte cookiejar=100;
        System.out.println("their are "+cookiejar+" cookies in a cookie jar");
        //subtracting a value by an amount greater than 1 and reassigning it
        cookiejar-=4;
        System.out.println("you take 4 cookies out of the cookie jar \n their are now "+cookiejar+" cookies in the cookie jar");

        byte tenten=10;
        System.out.println("what is "+tenten+" squared?");
        //mutiplying a value by an amount greater than 1 and reassigning it
        tenten*=10;
        System.out.println("10 squared is "+tenten);

        byte six=6;
        System.out.println("what is "+six+" divided by 2");
        //dividing a value by an amount greater than 1 and reassigning it
        six/=2;
        System.out.println("6 divided by 2 is "+six);
    }
}
