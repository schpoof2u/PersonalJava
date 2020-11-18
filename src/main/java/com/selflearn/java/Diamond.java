package com.selflearn.java;

public class Diamond {
    public static void main(String[] args) {
        // the number sequence telling how many '*' are needed to to build the first half of the diamond
        int[] startNumberSequence=new int[]{1, 2, 3, 5};
        // what dictates the position of the star,whitespace
        //print the whitespace/whitespaces then the stars
        //the number sequence needed to put in the amount of " " from the left and between the '*'
        int[] startNumOfWhitespace= new int[]{4, 3, 2, 1};
        String space = " ";
        String asterisk = "*";
        //Starting space needed to put the first '*' in the the proper position
        System.out.print(space);
        for (int i = 0; i < startNumberSequence.length; i++) {//tells when to stop by telling it the size of the array
            for (int j = 1; j <= startNumberSequence[i]; j++) {// prints the asterisks and spaces by comparing j to the value of array using i and if a condition is not met to the fullest capability then it will keep on printing.
                // the spaces are going to be looped
                // the incrementation will decrease
                // the number of spaces must be greater than the amount of i
                for (int w = 1; w <= startNumOfWhitespace[i]; w++) {// prints the spaces by comparing j to the value of array using i and if a condition is not met to the fullest capability then it will keep on printing.
                    System.out.print(space);
                }
                System.out.print(asterisk);
            }
            //acts as the enter key to make an new line
            System.out.println();

        }
        // made new number sequences to show the bottom of the diamond
        int[] endNumberSequence = new int[]{3,2,1};// how many asterisks need to be printed as show by Number Sequence
        int[] endNumOfWhitespace= new int[]{2,3,5};// how many spaces need to be printed as shown by Number Sequence
        for (int i = 0; i < endNumberSequence.length; i++) {//same as top
            for (int j = 1; j <= endNumberSequence[i]; j++) {//same as top
                for(int w=1;w<=endNumOfWhitespace[i]; w++){//same as top
                    System.out.print(space);
                }
                System.out.print(asterisk);
            }
            System.out.println();
        }
    }
}
