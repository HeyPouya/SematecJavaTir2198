package com.sematec.lib;

public class CalculateSalary {

    public static void main(String[] args) {
        PrivateTeacher pt = new PrivateTeacher();
        pt.name = "qoli";
        pt.family = "QpliPour";
        int ptSalary = pt.getSalary();
        System.out.println("The salary of the private teacher is :" + ptSalary);

        GovernmentalTeacher gt = new GovernmentalTeacher();
        gt.name = "Ali";
        gt.family = "Alipour";
        int gtSalary = gt.getSalary();
        System.out.println("The salary og the gt is " + gtSalary);


    }
}
