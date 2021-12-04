package com.udemy.java.shikhar.section6;

import java.math.BigInteger;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;
    // Constructor
//    public BankAccount(int accountNumber, double balance){
//        this.accountNumber=accountNumber;
//        this.balance=balance;
//    }
    //Setters
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress=emailAddress;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    //Getters
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    //Functionality Methods
    public  void deposit(double depositValue){
        balance+=depositValue;
        System.out.println(" Your new balance is "+ balance);
    }
    public void withdrawal(double withdrawalValue){
        if(withdrawalValue>balance){
            System.out.println("Insufficient Funds");
        }
        balance-=withdrawalValue;
        System.out.println(" Your new balance is "+ balance);
    }
}
