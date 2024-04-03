package com.learning.core.day01session01;

import com.learning.core.day01session01.PS03.ControlStructure;

public class D01P03 {

    public static void main(String[] args) {

        ControlStructure c1 = new ControlStructure();
        String[] arr = c1.PrintMonths(1,2,3,-2);
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println("*****************");
        String[] arr1 = c1.printDays(1,2,-3,5);
        for(String s : arr1)
        {
            System.out.println(s);
        }
        System.out.println("*****************");
        System.out.println(c1.printGrades(85));
        System.out.println("*****************");
        c1.printPattern(8);
        System.out.println("*****************");
        c1.printFactorial(5);
    }
}
