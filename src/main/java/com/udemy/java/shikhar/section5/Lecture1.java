package com.udemy.java.shikhar.section5;

public class Lecture1 {
    public static void main(String[]args){
        int value=1;
        if(value==1){
            System.out.println("Value is 1");
        }
        else if(value==2){
            System.out.println("Value is 2");
        }
        else{
            System.out.println("Value is not 1 or 2");
        }
        int switchValue=3;
        switch(switchValue){// the parentheses you put the value you want to check
            case 1:// the first case is the if statement in a switch statement
                System.out.println("Switch Value is 1");
                break;//means to exit the code block
            case 2:// the case/cases after the first case are the else if in a switch statement
                System.out.println("Switch Value is 2");
                break;//means to exit the code block
            case 3: case 4: case 5:// you can do multiple cases together if they have a similar message/output
                System.out.println("Switch is value is a 3,4 or a 5");
                break;
            default:// is the else in a switch statement
                System.out.println("Switch Value is not 1 or 2");
                break;//means to exit the code block
        }
        String name="Daksh";
        switch (name){
            case "Daksh":
                System.out.println("name is "+name);
                break;
            case "Durgesh":
                System.out.println("name is "+name);
                break;
            case "Shefali":
                System.out.println("name is "+name);
                break;
            case "Shikhar":
                System.out.println("name is "+name);
                break;
            default:
                System.out.println("Hello Jon Doe");
                break;
        }
        //Switch statements don't work with booleans
//        boolean ateCandy=true;
//        switch(ateCandy){
//            case true:
//                System.out.println("Johnny ate candy");
//                break;
//            case false:
//                System.out.println("Johnny didn't eat candy");
//                break;
//            default:
//                System.out.println("Johnny is asleep");
//        }
        // the difference between the switch statement and if statement:
        // the switch statement is good with single values
        // the if statement can check multiple and different values

        //Challenge Directions:
        //Create a switch statement using char
        // make it search for A,B,C,D,E
        //default will display message not found
        char alphabet='C';
        switch (alphabet){
            case 'A':
                System.out.println("Letter is A");
                break;
            case 'B':
                System.out.println("Letter is B");
                break;
            case 'C':
                System.out.println("Letter is C");
                break;
            case 'D':
                System.out.println("Letter is D");
                break;
            case 'E':
                System.out.println("Letter is E");
                break;
            default:
                System.out.println("Not Found");
        }
        }
}
