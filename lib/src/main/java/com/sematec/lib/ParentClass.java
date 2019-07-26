package com.sematec.lib;

public class ParentClass {

    static String name;
    static String family;
    static String pCode;

    public static String getName() {
        return name;
    }

    public void printName() {
        System.out.println(name);
    }

    public void printFamily() {
        System.out.println(family);
    }
}
