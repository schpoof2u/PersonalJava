package com.udemy.java.shikhar.section3;

public class Lecture21 {
    public static void main(String[]args){
        // learning about the Ternary Operator
        boolean isCar=false;
        //! means not or false
        if(isCar)
        {
            System.out.println("This is a car");
        }
        //what is a ternary operator, it is a shortcut to assign a value to a variable based on a condition that executes to being true or false, basically an if statement condition
        // isCar? stands for what you are testing, the condition
        //true:false is what the value should be if the condition is true or false, in this case if isCar is true, then the value of Wascar will be true vice versa
        //doing isCar by itself means your checking if its value stayed the same,doing == allows to give something a bit more percise to check for
        boolean wasCar= isCar==false? true:false;

        //better example of a ternary operator
        int k=16;
        // if k is greater than 10 the value will be 12 because that is the first value, if k was less than 10 then it would be 30 since the first value wasn't true(applying the same inequality
        //to put the ternary operator in an if statement only works with type boolean
        int j= (k>10)? 12:30;
        if(wasCar){
            System.out.println(wasCar);
        }
    }
}
