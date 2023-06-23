package com.udemy.java.shikhar.section6;
import java.util.Scanner;
public class Account {
    private int accountNumber;
    private int balance;
    private String name;
    private String email;
    private int phoneNumber;
    Scanner scanner= new Scanner(System.in);
    public void setAccountNumber(int accountNumber){
        accountNumber=this.accountNumber;
    }
    public void setBalance(int balance){
        balance=this.balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public int getBalance(){
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
        System.out.println("Type STOP to exit");
        String amount = scanner.nextLine();
        if(amount.equals("STOP")){
            System.out.println("the balance is "+getBalance());
        }
        else if(Integer.parseInt(amount)>getBalance()){
            System.out.println("the amount is in valid");
            System.out.println("the balance is "+getBalance());
        }
        else{
            int newBalance=getBalance()-Integer.parseInt(amount);
            setBalance(newBalance);
            System.out.println("the balance is "+getBalance());  
        }
    }
}
