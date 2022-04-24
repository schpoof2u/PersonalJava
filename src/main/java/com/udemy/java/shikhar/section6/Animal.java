package com.udemy.java.shikhar.section6;

public class Animal {
    private int brain;
    private int size;
    private int weight;
    private int body;
    private String name;
    public Animal(int brain, int size, int weight,int body, String name){
        this.brain=brain;
        this.size=size;
        this.weight=weight;
        this.body=body;
        this.name=name;
    }
    public void eat(){
        System.out.println("Animal.eat() has been called");
    }
    public void move(int speed){
        System.out.println("Animal is moving at "+speed+" speed");
    }
    public void sleep(){}
    public int getBrain(){
        return this.brain;
    }
    public int getSize(){
        return this.size;
    }
    public int getWeight(){
        return this.weight;
    }
    public int getBody(){
        return this.body;
    }
    public String getName(){
        return this.name;
    }
}
