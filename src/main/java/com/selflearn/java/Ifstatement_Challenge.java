package com.selflearn.java;

public class Ifstatement_Challenge {
    public static void main(String[] args) {
        //Hacker rank if statement challenge
        int n = 55;
        String weird = "weird";
        String notWeird = "not weird";
       if(n%2==1) {//odd check
           System.out.println(weird);
       }
       else //even
       {
           System.out.println(notWeird);
           if(2 <=n || n<=5 ){
               System.out.println(notWeird);
           }
           else if(6<=n || n<=20){
               System.out.println(weird);
           }
           else if (n>20){
               System.out.println(notWeird);
           }

       }
        }
    }
