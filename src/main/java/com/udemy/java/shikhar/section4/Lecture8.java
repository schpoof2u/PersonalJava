package com.udemy.java.shikhar.section4;

public class Lecture8 {
    public static void main(String[]args){
    getDurationString(125,25);
    getDurationString(146);
    }
    public static String getDurationString(int minutes, int seconds){
        if(minutes>=0 && seconds>=0 && seconds<=59){
            int hours=minutes/60;
            minutes=minutes%60;
            if(seconds<60){
                seconds=seconds;
            }
            else{
                seconds=(minutes*60)-seconds;
            }
            String timePassed= hours+" hours, "+minutes+" minutes, and "+seconds+" seconds have passed";
            System.out.println(timePassed);
            return timePassed;
        }
        else{
            String invalidValue="Invalid Value";
            System.out.println(invalidValue);
            return invalidValue;
        }
    }
    public static String getDurationString(int seconds){
        if(seconds>=0){
            int minutes=seconds/60;
            seconds%=60;
//            getDurationString(minutes,seconds);
            // you can return methods
            return  getDurationString(minutes,seconds);
        }
        else{
            String invalidValue="Invalid Value";
            return invalidValue;
        }
    }
}
