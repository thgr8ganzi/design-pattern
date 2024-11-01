package org.example.designpattern._02_structural.decorator._03_java;

import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponseWrapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecoratorInJava {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Book());

        List books = Collections.checkedList(list, Book.class);
        list.add(new Item());
        books.add(new Item());

        HttpServletRequestWrapper requestWrapper;
        HttpServletResponseWrapper responseWrapper;
    }

    private static class Book {
    }
    private static class Item {
    }
}
