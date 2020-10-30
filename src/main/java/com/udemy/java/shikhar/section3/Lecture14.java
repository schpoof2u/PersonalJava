package com.udemy.java.shikhar.section3;

public class Lecture14 {
    public static void main(String[]args){
        /*Primative types recap*/
        //byte datatype
        byte bytevalueMIN=Byte.MIN_VALUE;
        byte bytevalueMAX=Byte.MAX_VALUE;
        byte numofbites=12;
        System.out.println("The min value of a byte is "+bytevalueMIN);
        System.out.println("The max value of a byte is "+bytevalueMAX);
        System.out.println("The number bites in the cookie is "+numofbites);
        //short datatype
        short shortvalueMIN=Short.MIN_VALUE;
        short shortvalueMAX=Short.MAX_VALUE;
        short numofshortcakes=5000;
        System.out.println("The min value of a short is "+shortvalueMIN);
        System.out.println("The max value of a short is "+shortvalueMAX);
        System.out.println("The number of shortcakes is "+numofshortcakes);
        //int datatype
        int intvalueMIN=Integer.MIN_VALUE;
        int intvalueMAX=Integer.MAX_VALUE;
        int myage=14;
        System.out.println("The min value of an int is "+intvalueMIN);
        System.out.println("The max value of an int is "+intvalueMAX);
        System.out.println(" I am "+myage+" years old in 2020");
        //long datatype
        long mylongMIN=Long.MIN_VALUE;
        long mylongMAX=Long.MAX_VALUE;
        long longnumber=2948674836593759386l;
        System.out.println("The min value of a long is "+mylongMIN);
        System.out.println("The max value of a long is "+mylongMAX);
        System.out.println("This long number is "+longnumber);
        //float datatype
        float floatvalueMIN=Float.MIN_VALUE;
        float floatvalueMAX=Float.MAX_VALUE;
        float pi=3.14f;
        System.out.println("The min value of a float is "+floatvalueMIN);
        System.out.println("The max value of a float is "+floatvalueMAX);
        System.out.println("the base value of pi is "+pi);
        //double datatype
        double doublevalueMIN=Double.MIN_VALUE;
        double doublevalueMAX=Double.MAX_VALUE;
        double MoonCircumference=6.786d;
        System.out.println("The min value of a double is "+doublevalueMIN);
        System.out.println("The min value of a double is "+doublevalueMAX);
        System.out.println("The circumference of The Moon is "+MoonCircumference+" Kilometers");
        //char datatype
        char englishchar='A';
        char unicodechar='\u0295';
        System.out.println("this is a capital letter from the English Alphabet: "+englishchar);
        System.out.println("This is a character using unicode: "+unicodechar);
        //boolean datatype
        Boolean drinkingage=true;
        Boolean CovidVaccine=false;
        System.out.println("Is the drinking age in america 21: \n"+drinkingage);
        System.out.println("Has a vaccince for COVID-19 been released: \n"+CovidVaccine);

        /*Datatype string section*/
        //String datatype
        String myname="Shikhar Verma";
        String isname="My name is ";
        //shows that a String can have a unicode value
        String unicodestr=" I will show an unicode character in a string: \u0298";
        System.out.println("The value of the String variables isname and myname is: \n"+isname+myname);
        System.out.println(unicodestr);
        int int5=5;
        String numstr="50";
        //seeing what happens when an int and string a concatenated
        System.out.println(numstr+int5);
    }
}
