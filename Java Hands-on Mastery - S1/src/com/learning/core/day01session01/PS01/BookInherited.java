package com.learning.core.day01session01.PS01;

import com.learning.core.day01session01.PS01.Book;

public class BookInherited extends Book {

    public void createBooks(String title, int price)
    {
        this.setBook_title(title);
        this.setBook_price(price);
    }

    public void showBooks()
    {
        System.out.println("Book Title: "+this.getBook_title()+" and price: "+this.getBook_price());
    }
}
