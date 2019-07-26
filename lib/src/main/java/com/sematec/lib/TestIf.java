package com.sematec.lib;

public class TestIf {

    static int c = 5;

    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        if (c > b) {
            System.out.println("2 is greater than 3");
        }

        if (c > a) {
            System.out.println("3 is greater than 2");
        }


        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a == b) {
            System.out.println("a equals b");
        } else {
            System.out.println("b is greater than a");
        }




    }


    //      >=
    //      <=
    //      ==
    //      !=


}
