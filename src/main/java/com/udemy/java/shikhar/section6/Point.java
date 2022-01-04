package com.udemy.java.shikhar.section6;

public class Point {
    private int x;
    private int y;
    public Point(){}
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public double distance(){
        double distance=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return distance;
    }
    public double distance(int x, int y){
        double x2=(double)(x);
        double y2=(double)(y);
        //double distance=Math.sqrt(((getX()-x)^2+(getY()-y)^2));
        double xDifference= getX()-x2;
        double yDifference= getY()-y2;
        double distance=Math.sqrt((Math.pow(xDifference,2)+Math.pow(yDifference,2)));
        return distance;
    }
    public double distance(Point point1, Point point2){
        point1=new Point();
        point2=new Point();
        double xDifference=(double)(point1.getX()-point2.getX());
        double yDifference=(double)(point1.getY()-point2.getY());
        double distance=Math.sqrt((Math.pow(xDifference,2)+Math.pow(yDifference,2)));
        return distance;

    }
}
