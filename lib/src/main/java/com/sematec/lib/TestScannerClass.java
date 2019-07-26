package com.sematec.lib;

import java.util.Scanner;

public class TestScannerClass {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the first number :");
        int a = s.nextInt();
        System.out.println("Please enter the second number :");
        int b = s.nextInt();

        sum(a, b);

    }


    public static void sum(int a, int b) {
        int result = a + b;
        System.out.println("The result is " + result);
    }

}
