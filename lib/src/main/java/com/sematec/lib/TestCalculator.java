package com.sematec.lib;

public class TestCalculator {


    public static void main(String[] args) {
        sum(10, 20);
    }


    public static void sum(int a, int b) {

        int result = a + b;
        System.out.println("The result is :" + result);
        checkIsOdd(result);

    }

    public static void checkIsOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
    }
}
