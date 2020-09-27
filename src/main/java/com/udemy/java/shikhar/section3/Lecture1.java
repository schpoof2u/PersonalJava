package com.udemy.java.shikhar.section3;

public class Lecture1 {
    public static void main(String[] args)
    {
        //shows the least amount of data byte can store
        byte Myminbyte=Byte.MIN_VALUE;
        //shows the max amount of data byte can store
        byte Mymaxbyte=Byte.MAX_VALUE;
        System.out.println("the least amount of data byte can store is "+Myminbyte);
        System.out.println("the max amount of data byte can store is "+Mymaxbyte);

        //shows the least amount of data short can store
        short Myminshort=Short.MIN_VALUE;
        //shows the max amount of data short can store
        short Mymaxshort=Short.MAX_VALUE;
        System.out.println("the least amount of data Short can store is "+Myminshort);
        System.out.println("the max amount of data Short can store is "+Mymaxshort);

        //shows the least amount of data long can store
        long Myminlong=Long.MIN_VALUE;
        //shows the max amount of data long can store
        long Mymaxlong=Long.MAX_VALUE;
        System.out.println("the least amount of data Short can store is "+Myminlong);
        System.out.println("the max amount of data Short can store is "+Mymaxlong);
        long mylong=12l;
        System.out.println("mylong equals "+mylong+" and the value ends in a lowercase l");
    }
}
