    package com.selflearn.java;
    public class MoneyIdentifier {
        public static void main(String[] args) {
            // input for method to work
            MoneyIdentifer("XXZ200950B");
            MoneyIdentifer("XYZ2009500G");
            MoneyIdentifer("XYZ180010B");
            MoneyIdentifer("XYZ2021100B");
            MoneyIdentifer("XYZ20095009");
            MoneyIdentifer("ABC200250X");
            MoneyIdentifer("ADK20031000x");
        }

        public static int MoneyIdentifer(String moneyCode) {// moneyCode is the input/parameter given by the user, who has access to the code.
            System.out.println("Bill code being tested for validation is " + moneyCode);
            // Code length check
            if (moneyCode.length() >= 9 && moneyCode.length() <= 12) {//checks the length of the  money code and runs it through parameters to see if the code is valid
                System.out.println("Code length check complete");
            } else {// money code is not valid
                System.out.println("Bill is invalid");
                System.out.println();
                return 0;
            }

            String mcodeSubstring = moneyCode.substring(0, 3);
            char firstCodeChar = mcodeSubstring.charAt(0);
            char secondCodeChar = mcodeSubstring.charAt(1);
            char thirdCodeChar = mcodeSubstring.charAt(2);
            // ABC check
            if (firstCodeChar == secondCodeChar || firstCodeChar == thirdCodeChar || secondCodeChar == firstCodeChar || secondCodeChar == thirdCodeChar) {// .equals() is the == operator but for strings.
                System.out.println("Bill is invalid");
                System.out.println();
                return 0;
            } else {
                System.out.println("ABC check complete");
            }

            String yearValue;
            // year test
            if (moneyCode.length() == 9) {
                yearValue = moneyCode.substring(3,6);
                if (Integer.parseInt(yearValue) >= 1990 && Integer.parseInt(yearValue) <= 2020) {
                    System.out.println("Year test passed");
                } else {
                    System.out.println("Bill is invalid");
                    System.out.println();
                    return 0;
                }
            } else if (moneyCode.length() == 10) {
                yearValue = moneyCode.substring(3,7);
                if (Integer.parseInt(yearValue) >= 1990 && Integer.parseInt(yearValue) <= 2020) {
                    System.out.println("Year test passed");
                }else {
                    System.out.println("Bill is invalid");
                    System.out.println();
                    return 0;
                }

            } else if (moneyCode.length() == 11) {
                yearValue = moneyCode.substring(3,7);
                if (Integer.parseInt(yearValue) >= 1990 && Integer.parseInt(yearValue) <= 2020) {
                    System.out.println("Year test passed");
                } else {
                    System.out.println("Bill is invalid");
                    System.out.println();
                    return 0;
                }
            } else if (moneyCode.length() == 12) {
                yearValue = moneyCode.substring(3,7);
                if (Integer.parseInt(yearValue) >= 1990 && Integer.parseInt(yearValue) <= 2020) {
                    System.out.println("Year test passed");
                } else {
                    System.out.println("Bill is invalid");
                    System.out.println();
                    return 0;
                }
            }
            // last char check
            String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
            if (moneyCode.length() == 9) {
                 String lastCharCheck = moneyCode.substring(8);
                char numero1=(lastCharCheck).charAt(0);
                if(Character.isDigit(numero1)){
                    System.out.println("Bill is invalid");
                    System.out.println();
                    return 0;
                }
                else{
                    for (int i = 0; i < alphabet.length; i++) {
                        if (lastCharCheck.equals(alphabet[i])) {
                            System.out.println("Last char test complete");
                            break;
                        }
                    }
                }

            } else if (moneyCode.length() == 10) {
               String lastCharCheck = moneyCode.substring(9);
                char numero1=(lastCharCheck).charAt(0);
                if(Character.isDigit(numero1)){
                    System.out.println("Bill is invalid");
                    System.out.println();
                    return 0;
                }
                else{
                    for (int i = 0; i < alphabet.length; i++) {
                        if (lastCharCheck.equals(alphabet[i])) {
                            System.out.println("Last char test complete");
                            break;
                        }
                    }
                }
            } else if (moneyCode.length() == 11) {
                String lastCharCheck = moneyCode.substring(10);
                char numero1=(lastCharCheck).charAt(0);
                if(Character.isDigit(numero1)){
                    System.out.println("Bill is invalid");
                    System.out.println();
                    return 0;
                }
                else{
                    for (int x = 0; x < alphabet.length; x++) {
                        if (lastCharCheck.equals(alphabet[x])) {
                            System.out.println("Last char test complete");
                            break;
                        }
                    }
                }

            } else if (moneyCode.length() == 12) {
                 String lastCharCheck = moneyCode.substring(11);
                char numero1=(lastCharCheck).charAt(0);
                if(Character.isDigit(numero1)){
                    System.out.println("Bill is invalid");
                    System.out.println();
                    return 0;
                }
                else{
                    for (int w = 0; w < alphabet.length; w++) {
                        if (lastCharCheck.equals(alphabet[w])) {
                            System.out.println("Last char test complete");
                            break;
                        }
                    }
                }
                }
            else {
                System.out.println("Bill is invalid");
                return 0;
            }
            String dollarValue;
            int billValue;
            int[] billType1 = {1, 5};
            int[] billType2 = {10, 20, 50};
            int[] billType3 = {100, 500};
            int billType4 = 1000;
            // 1,5,10,20,50 does not work
           // bill type test
            if (moneyCode.length() == 9) {// to give value of thee bill you print the value of it right then and now.
                dollarValue = moneyCode.substring(7, 8);
                if (Integer.parseInt(dollarValue) == billType1[0] || Integer.parseInt(dollarValue) == billType1[1]) {
                    System.out.println("bill type test complete");
                    billValue = Integer.parseInt(moneyCode.substring(7, 8));
                    System.out.println( "The Value of Code "+moneyCode+" is "+billValue);
                }
            } else if (moneyCode.length() == 10) {
                dollarValue = moneyCode.substring(7, 9);
                if (Integer.parseInt(dollarValue) == billType2[0] || Integer.parseInt(dollarValue) == billType2[1] || Integer.parseInt(dollarValue) == billType2[2]) {
                    System.out.println("bill type test complete");
                    billValue = Integer.parseInt(moneyCode.substring(7, 9));
                    System.out.println( "The Value of Code "+moneyCode+" is "+billValue);
                }
            } else if (moneyCode.length() == 11) {
                dollarValue = moneyCode.substring(7, 10);
                if (Integer.parseInt(dollarValue) == billType3[0] || Integer.parseInt(dollarValue) == billType3[1]) {
                    System.out.println("bill type test complete");
                    billValue = Integer.parseInt(moneyCode.substring(7, 10));
                    System.out.println( "The Value of Code "+moneyCode+" is "+billValue);
                }

            } else if (moneyCode.length() == 12) {
                dollarValue = moneyCode.substring(7, 11);
                if (Integer.parseInt(dollarValue) == billType4) {
                    System.out.println("bill type test complete");
                    billValue = Integer.parseInt(moneyCode.substring(7, 11));
                    System.out.println( "The Value of Code "+moneyCode+" is "+billValue);
                }
            }
            else {
                System.out.println("Bill is invalid");
                System.out.println();
                return 0;
            }
            System.out.println();
            return 1;
        }
    }
