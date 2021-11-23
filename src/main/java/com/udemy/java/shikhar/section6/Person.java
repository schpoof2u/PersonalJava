package com.udemy.java.shikhar.section6;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName){

        this.firstName=firstName;
    }
    public void setLastName(String lastName){

        this.lastName=lastName;
    }
    public void setAge(int age){
        if(age<0 || age>100){
            age=0;
        }
        else{
            this.age=age;
        }
    }
    public String getFirstName(){

        return this.firstName;
    }
    public String getLastName(){

        return this.lastName;
    }
    public int getAge(){

        return this.age;
    }
    public boolean isTeen(){
        if(age > 12 && age<20){
            return true;
        }
        else{
            return false;
        }
    }
    public String getFullName(){
        String fullName= firstName + " " + lastName;
        return fullName;
    }

}
