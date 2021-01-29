package com.udemy.java.shikhar.section5;

public class Lecture6 {
    public static void main(String[] args) {
//        //helpMeUnderstandWhileLoops(200,true);
        int count = 0;
//        // regular while loop
//        while(count!=6){// NOTE: you can use a pre-existing variable/value as a condition for a while loop instead of declaring a new one in a for loop
//            count++;
//            System.out.println("Count equals "+count);
//        }
//        //for loop 1
//        for(int i=0;i<7;i++){//traditional for loop printing the same thing but will print 5 seven times
//            System.out.println("for loop count equals "+count);
//        }
//        //for loop 2
//        for (count=1;count!=6;count++){// for loop equivalent to first while loop
//            System.out.println(" second for loop count equals "+count);
//        }
//        //while loop 2
//        count=1;
//        while(true){
//            count++;
//            if(count==6){
//                System.out.println("count equals six");
//                break;
//            }
//        }
        // do while loop
//        count=1;//count equals 6 but the do statement is executed first but the while condition evaluates to true because the value is 6 at first but is incremented to 7 at the end causing an infinite loop
//        do{
//            //count++; if on to or bottom loop will still be infinite
//            System.out.println("Count value was "+count);
//            count++;
//        }while(count!=6);//while(count<=6); does not cause an infinite loop

        //Challenge 1 execution:
        int startNumber = 0;
        int endNumber = 22230485;
        while (startNumber <= endNumber) {
            startNumber++;
            if (!isEvenNumber(startNumber)) {
                continue;//tells the loop to continue looping
            }
            System.out.println(startNumber + " is an even number");//if the condition in the if statement is true/executed then this becomes the else statement
            //second challenge:
            int start_Number = 0;
            int end_Number = 22230485;
            int evenNum = 0;
            while (start_Number <= end_Number) {
                start_Number++;
                if (!isEvenNumber(start_Number)) {
                    continue;//tells the loop to continue looping
                }
                evenNum++;
                if (evenNum == 5) {
                    break;
                }
                System.out.println(start_Number + " is an even number");
                System.out.println("total amount of even numbers found is " + evenNum);

            }
        }

    }
    public static void helpMeUnderstandWhileLoops ( int year, boolean summer){
        while (summer = true) {
            System.out.println("It is summer");
            break;
        }
        while (summer = false) {
            System.out.println("It is not summer");
            break;
        }
    }

    //Challenge Code:
    public static boolean isEvenNumber ( int number){
        if (number % 2 == 0) {
            //System.out.println(number+" is an even number");
            return true;
        } else {
            //System.out.println(number+" is not an even number");
            return false;
        }
    }
}
