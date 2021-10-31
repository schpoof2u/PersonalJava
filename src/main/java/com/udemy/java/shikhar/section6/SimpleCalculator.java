package com.udemy.java.shikhar.section6;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public void setfirstNumber(double firstNumber){
        this.firstNumber=firstNumber;// is used so that the value can be defined in a different class instead of being hard coded in the SimpleCalculator class
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber=secondNumber;
    }

    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public double getAdditionResult(){
        return (firstNumber+secondNumber);
    }
    public double getSubtractionResult(){
        return (secondNumber-firstNumber);
    }
    public double getMultiplicationResult(){
        return (firstNumber*secondNumber);
    }
    public double getDivisionResult(){
        if(secondNumber==0){
            return 0;
        }
        else{
            return (firstNumber/secondNumber);
        }
    }
}
