package com.udemy.java.shikhar.section6;

public class Dog extends Animal {
    private int tail;
    private int ears;
    private int eyes;
    private int legs;
    private String coat;
    public Dog(int size,int weight, String name, int tail, int ears, int legs, String coat){
        super(1, size, weight, 1, name);
        this.tail=tail;
        this.ears=ears;
        this.legs=legs;
        this.coat=coat;
    }
    private void chew(){
        System.out.println("Dog.chew() has been called");
    }
    public void walk(){
        System.out.println("Dog.walk() has been called");
        move(5);
    }
    public void run(){
        System.out.println("Dog.run() has been called");
        move(10);
    }
@Override
public void eat(){
    System.out.println("Dog.eat() has been called");
        chew();
        super.eat();
}
    public int getTail(){
        return this.tail;
    }
    public int getEyes(){
        return this.eyes;
    }
    public int getLegs(){
        return this.legs;
    }
    public String getCoat(){
        return this.coat;
    }
}
