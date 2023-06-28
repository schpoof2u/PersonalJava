package com.udemy.java.shikhar.section6;
import java.util.Scanner;
public class Account {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phoneNumber;
    Scanner scanner= new Scanner(System.in);
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }

    public void setBalance(double balance) {this.balance = balance;}

    public void setName(String name) {this.name=name;}

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void withdrawal(){
        System.out.println("How much would you like to withdraw?");
        double amount = scanner.nextDouble();
        if(amount>balance){
            System.out.println("the amount is invalid");
            System.out.println("the balance is "+balance);
        }
        else{
            balance-=amount;
            System.out.println("the balance is "+balance);
        }
    }
    public void deposit(){
        System.out.println("How much would you like to deposit?");
        double amount = scanner.nextDouble();
        if(amount<0){
            System.out.println("the amount is in valid");
            System.out.println("the balance is "+balance);
        }
        else{
            balance+=amount;
            System.out.println("the balance is "+balance);
        }
    }
}
