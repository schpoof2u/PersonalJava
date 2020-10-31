package com.udemy.java.shikhar.section3;

public class Lecture9 {
    public static void main(String[]args){
        //learning about casting lecture 8 is a prerequisite for lecture 9
        //shows the the least amount of data int can store
        int Myminintvalue=Integer.MIN_VALUE;
        //shows the max amount of data int can store
        int Mymaxintvalue=Integer.MAX_VALUE;
        System.out.println("the min value for an integer to contain is "+ Myminintvalue);
        System.out.println("the max value for an integer to contain is "+ Mymaxintvalue);

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

        //Casting
        //Casting the 2 in the expression to datatype
        int mynewintvalue=( Myminintvalue/2);
        byte mynewbytevalue=((byte)(Myminbyte/2));
        short mynewshortvalue=((short)(Myminshort/2));
        long mynewlongvalue=((long)(Myminlong/2));
    }
}
