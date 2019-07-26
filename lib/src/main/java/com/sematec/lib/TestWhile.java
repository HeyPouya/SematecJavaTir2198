package com.sematec.lib;

public class TestWhile {


    public static void main(String[] args) {

        int a = 10;

        while (a < 20) {
            System.out.println("A is less than 20");
            a = a + 1;
        }

        do {
            System.out.println("A is less than 20");
            a++;
        } while (a < 30);



    }
}
