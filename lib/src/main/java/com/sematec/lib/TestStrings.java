package com.sematec.lib;

public class TestStrings {

    public static void main(String[] args) {
        String name = "ali";

        if (name.equals("Qoli")) {
            System.out.println("The name is Qoli");
        } else {
            System.out.println("The name is not Qoli");
        }

        if (name.equalsIgnoreCase("pouya")) {
            System.out.println("They are equals");
        } else {
            System.out.println("They are not equals");
        }

        if (name.contains("ou")) {
            System.out.println("Contains ou");
        } else {
            System.out.println("it doesnt have ou");
        }


        if (name.contains("o") || name.contains("O")) {
            System.out.println("This name contains o");
        }

        if (name.contains("a") && name.contains("P")){
            System.out.println("This name contains a and P");
        }

    }
}
