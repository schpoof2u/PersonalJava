package com.udemy.java.shikhar.section6;

public class VipCustomer {
    // is class meant to show different constructors in short this is a constructor practice
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(String name, double creditLimit, String emailAddress){
        this.name=name;
        this.creditLimit=creditLimit;
        this.emailAddress=emailAddress;
    }
    public VipCustomer(){
        this("Bob",99.99,"Bob@gmail.com");
    }
    public VipCustomer(String name, double creditLimit){
        this(name,creditLimit,"Jeremy@gmail.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
