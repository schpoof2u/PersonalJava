package com.selflearn.java;
public class MoneyIdentifier {
    public static void main(String[] args) {
        int money = MoneyIdentifer("XXZ200950B");
        money += MoneyIdentifer("XYZ2009500G");
        money += MoneyIdentifer("XYZ180010B");
        money += MoneyIdentifer("XYZ2021100B");
        money += MoneyIdentifer("XYZ20095009");
    }

    public static int MoneyIdentifer(String moneyCode) {
        String startingChars = "ABC";
        int moneyInput = 5;
        int moneyYear = 2019;
        int billValue = 0;
        boolean truebill = true;
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
        String fake = "fake";
        String real = "real";
        System.out.println("Bill code being tested for validation is " + moneyCode);
        //the length of the money code can only be 9,10,11
        // might use substring
        // might use equals

        if (moneyCode.length() >= 9 && moneyCode.length() <= 12) {//checks the length of the  money code and runs it through parameters to see if the code is valid
            System.out.println("Code length check complete");
        } else {// money code is not valid
            System.out.println("Code length check failed");
            truebill = false;
        }

        String mcodeSubstring = moneyCode.substring(0, 3);
        char firstCodeChar = mcodeSubstring.charAt(0);
        char secondCodeChar = mcodeSubstring.charAt(1);
        char thirdCodeChar = mcodeSubstring.charAt(2);
        if (firstCodeChar == secondCodeChar || firstCodeChar == thirdCodeChar || secondCodeChar == firstCodeChar || secondCodeChar == thirdCodeChar) {// .equals() is the == operator but for strings.
            System.out.println("ABC check failed");
            truebill = false;

        } else {
            System.out.println("ABC check complete");
        }

        //ABC52019X
        String yearValue;
        if (moneyCode.length() == 9) {
            yearValue = moneyCode.substring(3, 7);
            if (Integer.parseInt(yearValue) <= 2020 && Integer.parseInt(yearValue) >= 1990) {
                System.out.println("Year test passed");
            }
        } else if (moneyCode.length() == 10) {
            yearValue = moneyCode.substring(3, 8);
            if (Integer.parseInt(yearValue) <= 2020 && Integer.parseInt(yearValue) >= 1990) {
                System.out.println("Year test passed");
            }
        } else if (moneyCode.length() == 11) {
            yearValue = moneyCode.substring(3, 9);
            if (Integer.parseInt(yearValue) <= 2020 && Integer.parseInt(yearValue) >= 1990) {
                System.out.println("Year test passed");
            }
        } else if (moneyCode.length() == 12) {
            yearValue = moneyCode.substring(3, 10);
            if (Integer.parseInt(yearValue) <= 2020 && Integer.parseInt(yearValue) >= 1990) {
                System.out.println("Year test passed");
            }

        } else {
            System.out.println("year test failed");
        }
        //ABC52019X
        //ABC102019X
        //ABC1002019X
        String lastCharCheck;
        boolean firstPass = false;
        boolean secondPass = false;
        boolean thirdPass = false;
        boolean fourthPass = false;
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        if (moneyCode.length() == 9) {
            lastCharCheck = moneyCode.substring(8);
            for (int i = 0; i < alphabet.length; i++) {
                if (firstPass == false) {
                    if (lastCharCheck.equals(alphabet[i])) {
                        System.out.println("Last char test complete");
                        firstPass = true;
                        break;
                    }
                }
            }
        } else if (moneyCode.length() == 10) {
            lastCharCheck = moneyCode.substring(9);
            for (int i = 0; i < alphabet.length; i++) {
                if (secondPass == false) {
                    if (lastCharCheck.equals(alphabet[i])) {
                        System.out.println("Last char test complete");
                        secondPass = true;
                        break;
                    }
                }
            }
        } else if (moneyCode.length() == 11) {
            lastCharCheck = moneyCode.substring(10);
            for (int x = 0; x < alphabet.length; x++) {
                if (thirdPass == false) {
                    if (lastCharCheck.equals(alphabet[x])) {
                        System.out.println("Last char test complete");
                        thirdPass = true;
                        break;
                    }
                }
            }
        } else if (moneyCode.length() == 12) {
            lastCharCheck = moneyCode.substring(11);
            for (int w = 0; w < alphabet.length; w++) {
                if (fourthPass == false) {
                    if (lastCharCheck.equals(alphabet[w])) {
                        System.out.println("Last char test complete");
                        fourthPass = true;
                        break;
                    }
                }
            }
            lastCharCheck = moneyCode.substring(11);
        } else {
            System.out.println("Last char test failed");
        }
        String dollarValue;
        int[] billType1 = {1, 5};
        int[] billType2 = {10, 20, 50};
        int[] billType3 = {100, 500};
        int billType4 = 1000;
        // 1,5,10,20,50 does not work
        if (moneyCode.length() == 9) {// to give value of thee bill you print the value of it right then and now.
            dollarValue = moneyCode.substring(7, 8);
            if (Integer.parseInt(dollarValue) == billType1[0] || Integer.parseInt(dollarValue) == billType1[1]) {
                System.out.println("bill type test complete");
                billValue = Integer.parseInt(moneyCode.substring(7, 8));
            }
        } else if (moneyCode.length() == 10) {
            dollarValue = moneyCode.substring(7, 9);
            if (Integer.parseInt(dollarValue) == billType2[0] || Integer.parseInt(dollarValue) == billType2[1] || Integer.parseInt(dollarValue) == billType2[2]) {
                System.out.println("bill type test complete");
                billValue = Integer.parseInt(moneyCode.substring(7, 9));
            }
        } else if (moneyCode.length() == 11) {
            dollarValue = moneyCode.substring(7, 10);
            if (Integer.parseInt(dollarValue) == billType3[0] || Integer.parseInt(dollarValue) == billType3[1]) {
                System.out.println(" bill type test complete");
                billValue = Integer.parseInt(moneyCode.substring(7, 10));
            }

        } else if (moneyCode.length() == 12) {
            dollarValue = moneyCode.substring(7, 11);
            if (Integer.parseInt(dollarValue) == billType4) {
                System.out.println(" bill type test complete");
                billValue = Integer.parseInt(moneyCode.substring(7, 11));
            }
        } else {
            System.out.println("Dollar value test failed");
        }


    }
}
