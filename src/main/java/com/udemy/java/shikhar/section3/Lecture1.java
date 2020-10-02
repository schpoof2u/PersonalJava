package com.udemy.java.shikhar.section3;

public class Lecture1 {
    public static void main(String[] args)
    {
        //E means to the power of or the ^
        //the range of data a float can store
        float myminfloat=Float.MIN_VALUE;
        float mymaxfloat=Float.MAX_VALUE;
        System.out.println("the min data a float can handle is "+myminfloat);
        System.out.println("the max amount of data a float can handle is "+mymaxfloat);

        //the range of data a double can store
        double mymindouble=Double.MIN_VALUE;
        double mymaxdouble=Double.MAX_VALUE;
        System.out.println("the min data a double can handle is "+mymindouble);
        System.out.println("the max amount of data a double can handle is "+mymaxdouble);

        //float value ends in f
        float myNewfloatvalue=14.5f;
        // double value ends in d
        double myNewdoublevalue=14.5d;
        int myintvalue=14;
        //challenge to the video
        float castingfloat=(float)(5.25);

        int eightgrade0=13;
        float eightgrade1=13;
        double eightgrade2=13;
        //how each datatype is displayed
        System.out.println(eightgrade0);
        System.out.println(eightgrade1);
        System.out.println(eightgrade2);
        //how each datatype reacts to an imperfect split
        int Neweightgrade0=13/2;
        float Neweightgrade1=13/2f;
        double Neweightgrade2=13/2d;
        System.out.println(Neweightgrade0);
        System.out.println(Neweightgrade1);
        System.out.println(Neweightgrade2);
    }
}
