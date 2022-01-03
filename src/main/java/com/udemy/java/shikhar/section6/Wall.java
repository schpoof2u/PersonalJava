package com.udemy.java.shikhar.section6;

public class Wall {
    private double height;
    private double width;
    public Wall(){}
    public Wall(double width, double height){
        this.height=height;
        this.width=width;
        if(height<0){
            this.height=0;
        }
        if(width<0){
            this.width=0;
        }
    }

    public void setHeight(double height) {
        this.height = height;
        if(height<0){
            this.height=0;
        }
    }

    public void setWidth(double width) {
        this.width = width;
        if( width<0){
            this.width=0;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    public double getArea(){
        return (height*width);
    }
}
