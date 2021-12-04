package com.udemy.java.shikhar.section6;

import java.math.BigInteger;

public class Lecture2 {
    //Part 1 is a challenge which is stored in the class named BankAccount
    public static void main(String[]args){
        BankAccount verma= new BankAccount();
        verma.setAccountNumber(1978678950);
        verma.setBalance(2000.80);
        verma.setEmailAddress("JohnDoe@gmail.com");
        verma.setPhoneNumber("7326888269");
        verma.deposit(200);


    }
}
