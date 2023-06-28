package com.udemy.java.shikhar.section6;

public class Lecture2 {
    // is a challenge which uses the Account class
    /*
    * Requirements:
    * must have fields which contain:f
    *   account number
    *   account balance
    *   customer name
    *   email
    *   phone number
    * getters and setters for each field
    * a method for withdrawing money from the account
    * a method for depositing money into the account
    * withdrawal's cannot be greater than the balance of the account
    *  once either method is called, the balance must be printed to the console
    * the class must be encapsulated
    *
    * */
    public static void main(String[]args){
        Account account = new Account();
        account.setBalance(10000.89);
        account.withdrawal();
        account.deposit();
    }
}
