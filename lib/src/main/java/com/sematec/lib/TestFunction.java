package com.sematec.lib;


public class TestFunction {




    public static void main(String[] args) {
        printPouya();
        printName("Qoli");

        int result = sum(15, 30);
        System.out.println(result);

        int age = calculateAge(1985);
        System.out.println(age);

    }

    public static int calculateAge(int year) {
        int result = 2019 - year;
        return result;
    }

    public static int sum(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    public static int getYear() {
        return 2019;
    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public static void printPouya() {
        System.out.println("Pouya");
    }

}

