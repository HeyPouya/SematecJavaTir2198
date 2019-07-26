package com.sematec.lib;

public class ChildClass extends ParentClass {

    public static void main(String[] args) {
        name = "Pouya";
        String userName = getName(); //1
        System.out.println(userName);
    }


    //2
    @Override
    public void printName() {
        System.out.println("hello Mr. ");
        super.printName();
        System.out.println("Welcome!");
    }


    //3
    @Override
    public void printFamily() {
       System.out.println("QoliPour");
    }
}
