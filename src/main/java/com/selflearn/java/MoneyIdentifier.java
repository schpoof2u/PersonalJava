package com.selflearn.java;
public class MoneyIdentifier {
    public static void main(String[] args) {
    MoneyIdentifer();
    }
    public static void MoneyIdentifer(){
        String startingChars = "ABC";
        int moneyInput = 5;
        int moneyYear = 2019;
        String endChar = "X";
        // right codes:
        //ABC200250X
        //TUF20071000P
        //Wrong codes:
        //DEG1993100G
        //ABC200260X
        //AAB200250X
        //XYZ19951000Z
        //XYZ20095009
        String moneyCode = "XYZ19951000Z";
        String fake = "fake";
        String real = "real";
        System.out.println("Bill code being tested for validation is "+moneyCode);
        //the length of the money code can only be 9,10,11
        // might use substring
        // might use equals

            if (moneyCode.length() >= 9 && moneyCode.length() <= 11) {//checks the length of the  money code and runs it through parameters to see if the code is valid
                System.out.println("Code length check complete");
            } else {// money code is not valid
                System.out.println("Code length check failed");
            }

            if (moneyCode.substring(0, 3).equals("ABC")) {// .equals() is the == operator but for strings.
                System.out.println("ABC check complete");
            } else {
                System.out.println("ABC check failed");
            }
            //ABC52019X single digit form
            //ABC102019X double digit form
            //ABC1002019X triple digit form
            String singleDollarValue = moneyCode.substring(7, 8);
            String doubleDollarValue = moneyCode.substring(7, 9);
            String tripleDollarValue = moneyCode.substring(7, 10);
            int[] billType = {1, 5, 10, 20, 100};
            if (Integer.parseInt(singleDollarValue) == billType[0] || Integer.parseInt(singleDollarValue) == billType[1]) {
                System.out.println("bill type test complete");
            } else if (Integer.parseInt(doubleDollarValue) == billType[2] || Integer.parseInt(doubleDollarValue) == billType[3]) {
                System.out.println("bill type test complete");
            } else if (Integer.parseInt(singleDollarValue) == billType[4]) {
                System.out.println(" bill type test complete");
            } else {
                System.out.println("Dollar value test failed");
            }
            //ABC52019X
            String firstYear = moneyCode.substring(3, 7);
            String secondYear = moneyCode.substring(3, 8);
            String thirdYear = moneyCode.substring(3, 9);
            if (Integer.parseInt(firstYear) <= 2020 && Integer.parseInt(firstYear) >= 1990 ) {
                System.out.println("Year test passed");
            }
            else if (Integer.parseInt(secondYear) <= 2020 && Integer.parseInt(secondYear) >= 1990 ) {
                System.out.println("Year test passed");
            }
            else if (Integer.parseInt(thirdYear) <= 2020 && Integer.parseInt(thirdYear) >= 1990) {
                System.out.println("Year test passed");
            } else {
                System.out.println("year test failed");

            }
            //ABC52019X
            //ABC102019X
            //ABC1002019X
            String firstLastCharCheck = moneyCode.substring(8);
            String secondLastCharCheck = moneyCode.substring(9);
            String thirdLastCharCheck = moneyCode.substring(10);
            String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
            boolean firstPass = false;
            boolean secondPass = false;
            boolean thirdPass = false;
            for (int i = 0; i < alphabet.length; i++) {
                if (firstPass == false) {
                    if (firstLastCharCheck.equals(alphabet[i])) {
                        System.out.println("Last char test complete");
                        firstPass = true;
                        break;
                    }
                } else {
                    System.out.println("Last char test failed");
                }

            }
            for (int i = 0; i < alphabet.length; i++) {
                if (secondPass == false) {
                    if (secondLastCharCheck.equals(alphabet[i])) {
                        System.out.println("Last char test complete");
                        secondPass = true;
                        break;
                    }
                } else {
                    System.out.println("Last char test failed");

                }
            }
            for (int i = 0; i < alphabet.length; i++) {
                if (thirdPass == false) {
                    if (thirdLastCharCheck.equals(alphabet[i])) {
                        System.out.println("Last char test complete");
                        thirdPass = true;
                        break;
                    }
                } else {
                    System.out.println("Last char test failed");
                }
            }

        }

    }