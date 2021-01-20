package com.udemy.java.shikhar.section5;

public class Lecture5 {
    public static void main(String[]args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;//Remember += stores an instance of i and then adds the next value of i to the previous value of i
                System.out.println(i);
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println(sum);
    }
//        for (int i = 1; i <= 1000; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                count++;
//                sum += i;
//                System.out.println(i);
//            }
//            if(count == 5) {
//                break;
//            }
//        }

    }
