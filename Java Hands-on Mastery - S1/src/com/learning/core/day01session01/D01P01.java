package com.learning.core.day01session01;

import com.learning.core.day01session01.PS01.BookInherited;

import java.util.Scanner;

public class D01P01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        int price = sc.nextInt();
        BookInherited b1 = new BookInherited();
        b1.createBooks(title,price);
        b1.showBooks();
    }
}