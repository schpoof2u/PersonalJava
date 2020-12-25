package com.selflearn.java;

public class PopulationLab {
    //Start with 100 paperclips/beans/popcorn(or anything else you can find).
    //Count out 5 beans to represent the beginning of the population.
    //Find 20% of the population, round to the nearest whole number.
    //Every year 20% of the population have two offspring.
    //Record data in chart.
    //Add the correct amount of beans to your population.
    //Every year 20% of the population dies.
    //Record data in chart.
    //Subtract the correct amount of beans from your population,
    //Count the remaining beans in your population.
    //Record data in chart.
    //Continue for 20 years.
    public static void main(String[]args){
        System.out.println("This a program I wrote to help me do my Population lab for science");
        System.out.println();
        calcPopulation();
    }
    public static void calcPopulation(){
        double beanNum=5;
        for(int i=1; i<=20; i++){
            double birth=(beanNum*0.2)*2;
            double death=beanNum*0.2;
            double populationGrowth=birth-death;
            beanNum+=populationGrowth;
            System.out.println("Year "+i+" has "+Math.round(birth)+" births"+" and "+Math.round(death)+" deaths");
            System.out.println("Year "+i+" has a population growth of  "+Math.round(populationGrowth));
            System.out.println("Year "+i+" has a population of "+Math.round(beanNum)+" beans");
            System.out.println();
        }
    }
}
